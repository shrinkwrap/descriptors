/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shrinkwrap.descriptor.metadata;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;

import org.apache.commons.io.FileUtils;
import org.jboss.shrinkwrap.descriptor.metadata.dom.DomWriter;
import org.jboss.shrinkwrap.descriptor.metadata.dtd.MetadataDtdEventListener;
import org.jboss.shrinkwrap.descriptor.metadata.xslt.XsltTransformer;
import org.w3c.dom.Document;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.TreeWalker;
import org.xml.sax.InputSource;

import com.sun.xml.dtdparser.DTDParser;

/**
 * This class is the entry point for parsing either xsd or dtd files, and based on the extracted metadata information,
 * the class is also able to produce Shrinkdesc API and implementation source code. is parsed.
 * <p>
 * The class will start a DTD parsing when the files are ending with '.dtd'. Otherwise, the files are considered as
 * XSD's.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataParser {
    private static final Logger log = Logger.getLogger(MetadataParser.class.getName());

    private final FilterChain filterChain = new FilterChain();

    private final Metadata metadata = new Metadata();

    private String pathToMetadata;

    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Parses one or more XSD schemas or DTD and produces java classes based on the parsing results.
     *
     * @param path
     *            specifies where to create the interface, implementation and test case java classes.
     * @param confList
     *            list <code>MetadataParserConfiguration</code> objects.
     * @param verbose
     *            if true, additional parsing information are printed out, otherwise not.
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public void parse(final MetadataParserPath path, final List<?> confList, final List<?> javadocTags,
        final boolean verbose) throws Exception {
        checkArguments(path, confList);

        pathToMetadata = createTempFile(verbose);

        if (log.isLoggable(Level.FINE)) {
            log.fine("Path to temporary metadata file: " + pathToMetadata);
        }

        for (int i = 0; i < confList.size(); i++) {
            final MetadataParserConfiguration metadataConf = (MetadataParserConfiguration) confList.get(i);

            metadata.setCurrentNamespace(metadataConf.getNameSpace());
            metadata.setCurrentSchmema(metadataConf.getPathToXsd());
            metadata.setCurrentPackageApi(metadataConf.getPackageApi());
            metadata.setCurrentPackageImpl(metadataConf.getPackageImpl());

            final MetadataDescriptor metadataDescriptor = new MetadataDescriptor(metadataConf.getDescriptorName());
            metadataDescriptor.setRootElementName(metadataConf.getElementName());
            metadataDescriptor.setRootElementType(metadataConf.getElementType());
            metadataDescriptor.setSchemaName(metadataConf.getPathToXsd());
            metadataDescriptor.setPackageApi(metadataConf.getPackageApi());
            metadataDescriptor.setPackageImpl(metadataConf.getPackageImpl());
            metadataDescriptor.setNamespace(metadataConf.getNameSpace());
            metadataDescriptor.setNamespaces(metadataConf.getNamespaces());
            metadataDescriptor.setGenerateClasses(metadataConf.generateClasses);
            metadataDescriptor.setPathToPackageInfoApi(metadataConf.getPathToPackageInfoApi());
            metadataDescriptor.setPathToPackageInfoImpl(metadataConf.getPathToPackageInfoImpl());

            metadata.getMetadataDescriptorList().add(metadataDescriptor);

            if (log.isLoggable(Level.FINE)) {
                log.fine(metadataConf.getPathToXsd());
            }

            if (metadataConf.getPathToXsd().endsWith(".dtd")) {
                final InputSource in = new InputSource(new FileReader(metadataConf.getPathToXsd()));
                final MetadataDtdEventListener dtdEventListener = new MetadataDtdEventListener(metadata, verbose);
                final DTDParser parser = new DTDParser();
                parser.setDtdHandler(dtdEventListener);
                parser.parse(in);
            } else {
                final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                final DocumentBuilder loader = factory.newDocumentBuilder();
                final Document document = loader.parse(metadataConf.getPathToXsd());

                if (log.isLoggable(Level.FINE)) {
                    log.fine(document.getDocumentURI());
                }

                final DocumentTraversal traversal = (DocumentTraversal) document;
                final TreeWalker walker = traversal.createTreeWalker(document.getDocumentElement(),
                    NodeFilter.SHOW_ELEMENT, null, true);

                final StringBuilder sb = verbose ? new StringBuilder() : null;

                filterChain.traverseAndFilter(walker, "", metadata, sb);

                if (sb != null) {
                    log.info(sb.toString());
                }
            }
        }

        /**
         * Analyze the data types defined in the elements. If an element data types points to a type defined in the data
         * type section, and the data type is simple type like xsd:string then change the element data type directly
         * here.
         */
        metadata.preResolveDataTypes();

        if (pathToMetadata != null) {
            new DomWriter().write(metadata, pathToMetadata, (List<MetadataJavaDoc>) javadocTags);
        }

        if (verbose) {
            new MetadataUtil().log(metadata);
        }

        if (path.getPathToApi() != null && path.getPathToImpl() != null) {
            generateCode(path, verbose);
            PackageInfo.copyPackageInfo(path, metadata, verbose);
        }
    }

    /**
     * Generates source code by applying the <code>ddJavaAll.xsl</code> XSLT extracted from the resource stream.
     *
     * @throws TransformerException
     */
    public void generateCode(final MetadataParserPath path, final boolean verbose) throws TransformerException {
        /** initialize the map which will overwrite global parameters as defined in metadata.xsl/ddJava.xsl */
        final Map<String, String> xsltParameters = new HashMap<String, String>();
        xsltParameters.put("gOutputFolder", getURIPath(path.getPathToImpl()));
        xsltParameters.put("gOutputFolderApi", getURIPath(path.getPathToApi()));
        xsltParameters.put("gOutputFolderTest", getURIPath(path.getPathToTest()));
        xsltParameters.put("gOutputFolderService", getURIPath(path.getPathToServices()));
        xsltParameters.put("gVerbose", Boolean.toString(verbose));

        final InputStream is = MetadataParser.class.getResourceAsStream("/META-INF/ddJavaAll.xsl");
        if (log.isLoggable(Level.FINE)) {
            log.fine("Stream resource: " + is);
        }

        XsltTransformer.simpleTransform(pathToMetadata, is, new File("./tempddJava.xml"), xsltParameters);
    }

    private String getURIPath(final String path) {
        if (path != null) {
            return new File(path).toURI().getPath();
        } else {
            return "";
        }
    }

    /**
     * Returns the path and name of the generated metadata xml file, if configured to produce it and the
     * <code>parse</code> method is executed successfully.
     *
     * @return full path of the generated metadata XML file.
     */
    public String getPathToMetadataFile() {
        return pathToMetadata;
    }

    // -------------------------------------------------------------------------------------------------||
    // -- Private Methods ------------------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------------------||

    /**
     * Creates a temporary file.
     *
     * @return absolute path of the temporary file.
     * @throws IOException
     */
    private String createTempFile(final boolean verbose) throws IOException {
        final File tempFile = File.createTempFile("tempMetadata", ".xml");

        if (!verbose) {
            tempFile.deleteOnExit();
        }

        return tempFile.getAbsolutePath();
    }

    /**
     * Validates the given arguments.
     *
     * @param path
     * @param confList
     */
    private void checkArguments(final MetadataParserPath path, final List<?> confList) {
        if (path == null) {
            throw new IllegalArgumentException("Invalid configuration. The 'path' element missing!");
        } else if (confList == null) {
            throw new IllegalArgumentException(
                "Invalid configuration. At least one 'descriptor' element has to be defined!");
        } else if (confList.isEmpty()) {
            throw new IllegalArgumentException(
                "Invalid configuration. At least one 'descriptor' element has to be defined!");
        }

    }
}
