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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;

import org.jboss.shrinkwrap.descriptor.metadata.dom.DomWriter;
import org.jboss.shrinkwrap.descriptor.metadata.dtd.MetadataDtdEventListener;
import org.jboss.shrinkwrap.descriptor.metadata.filter.AttributeFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.AttributeGroupFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ComplexTypeFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ElementFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.EnumFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ExtensionFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.Filter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.GroupFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.RestrictionFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.SimpleContentFilter;
import org.jboss.shrinkwrap.descriptor.metadata.xslt.XsltTransformer;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.TreeWalker;
import org.xml.sax.InputSource;

import com.sun.xml.dtdparser.DTDParser;


/**
 * This class is the entry point for parsing either xsd or dtd files, and based on the extracted metadata information,
 * the class is also able to produce Shrinkdesc API and implementation source code.
 * is parsed.
 * <p>
 * The class will start a DTD parsing when the files are ending with '.dtd'. Otherwise, the files are considered as XSD's. 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataParser
{
    private final List<Filter> filterList = new ArrayList<Filter>();
    private final Metadata metadata = new Metadata();
    private final String pathToXsd;
    private final String pathToMetadata;
    private final String nameSpace;
    private final String packageApi;
    private final String packageImpl;
    private final String descriptorName;
    private final String rootElementName;
    private final String rootElementType;
    private final String pathToApi;
    private final String pathToImpl; 
    private final String pathToTest;
    private final String pathToServices;
    private final boolean verbose;

    /**
     * Creates a new instance of the parser.
     * @param pathToXsd Full path to the xsd or dtd file.
     * @param nameSpace Defines the default namespace.
     * @param packageApi Defines the package name for the API classes.
     * @param packageImpl Defines the package name for the implementation classes.
     * @param descriptorName Defines the descriptor name
     * @param rootElementName Defines the root element name used by the to be created descriptor
     * @param rootElementType Defines the type of the root element.
     * @param pathToApi Path to the API folder. All API classes are created here.
     * @param pathToImpl Path to the implementation folder. All implementation classes are created here.
     * @param pathToTest Path to the test folder. All test classes are created here.If this is an empty string, then no classes are produced.
     * @param pathToServices Path to the service folder. All service files are created here.If this is an empty string, then no service files are produced.
     * @param verbose If true, the detailed parsing information are printed out.
     * @throws IOException Thrown if a temporary file can not be created.
     */
    public MetadataParser(final String pathToXsd,
            final String nameSpace, 
            final String packageApi,
            final String packageImpl, 
            final String descriptorName,
            final String rootElementName, 
            final String rootElementType, 
            final String pathToApi, 
            final String pathToImpl, 
            final String pathToTest, 
            final String pathToServices, 
            final boolean verbose) throws IOException
    {
        this.pathToXsd = pathToXsd;
        this.pathToMetadata = createTempFile();
        this.nameSpace = nameSpace;
        this.packageApi = packageApi;
        this.packageImpl = packageImpl;
        this.descriptorName = descriptorName;
        this.rootElementName = rootElementName;
        this.rootElementType = rootElementType;
        this.pathToApi = pathToApi;
        this.pathToImpl = pathToImpl;
        this.pathToTest = pathToTest;
        this.pathToServices = pathToServices;
        this.verbose = verbose;
        System.out.println("Path to temporary metadata file: " + pathToMetadata);
    }

    public Metadata getMetadata()
    {
        return metadata;
    }
    
    /**
     * Parses the specified schema and produces the <code>metadata</code> object.
     * @throws Exception 
     */
    public void parse() throws Exception
    {
    	metadata.setCurrentNamespace(nameSpace);
        metadata.setCurrentSchmema(pathToXsd);
        metadata.setCurrentPackageApi(packageApi);
        metadata.setCurrentPackageImpl(packageImpl);
        
        final MetadataDescriptor metadataDescriptor = new MetadataDescriptor(descriptorName);
        metadataDescriptor.setRootElementName(rootElementName);
        metadataDescriptor.setRootElementType(rootElementType);
        metadataDescriptor.setSchemaName(pathToXsd);
        metadataDescriptor.setPackageApi(packageApi);
        metadataDescriptor.setPackageImpl(packageImpl);
        metadataDescriptor.setNamespace(nameSpace);
        metadata.setMetadataDescriptor(metadataDescriptor);
        
    	if (pathToXsd.endsWith(".dtd"))
    	{
    		final InputSource in = new InputSource(new FileReader(pathToXsd));
    		final MetadataDtdEventListener dtdEventListener = new MetadataDtdEventListener(metadata, verbose);
    		final DTDParser parser = new DTDParser();
    		parser.setDtdHandler(dtdEventListener);
    		parser.parse(in);
    	}
    	else 
    	{
	        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        final DocumentBuilder loader = factory.newDocumentBuilder();
	        final Document document = loader.parse(pathToXsd);
	
	        filterList.add(new GroupFilter());
	        filterList.add(new ElementFilter());
	        filterList.add(new EnumFilter());
	        filterList.add(new AttributeFilter());
	        filterList.add(new AttributeGroupFilter());
	        filterList.add(new RestrictionFilter());
	        filterList.add(new ComplexTypeFilter());
	        filterList.add(new SimpleContentFilter());
	        filterList.add(new ExtensionFilter());
	
	        final DocumentTraversal traversal = (DocumentTraversal) document;
	        final TreeWalker walker = traversal.createTreeWalker(document.getDocumentElement(), NodeFilter.SHOW_ELEMENT, null, true);	
	        traverseLevel(walker);
    	}
    	
    	/**
    	 * Analyze the data types defined in the elements. If an element data types points to a type defined in the data type
    	 * section, and the data type is simple type like xsd:string then change the element data type directly here.
    	 */
        metadata.preResolveDataTypes();
        
        if (pathToMetadata != null) {
            new DomWriter().write(metadata, pathToMetadata);
        }

        if (verbose) {
            new MetadataUtil().print(metadata);
        }
        
        if (pathToApi != null && pathToImpl != null)
        {
        	generateCode();
        }
    }

    /**
     * Traverses the DOM and applies the filters for each visited node.
     * @param walker
     * @param indent 
     */
    private void traverseLevel(final TreeWalker walker)
    {
        final Node parend = walker.getCurrentNode();
        
        for (final Filter filter : filterList) {
            if (filter.filter(metadata, walker)) {
                break;
            }
        }

        for (Node n = walker.firstChild(); n != null; n = walker.nextSibling()) {
            traverseLevel(walker);
        }
        
        walker.setCurrentNode(parend);
    }
    
    /**
     * Generates source code by applying the <code>ddJavaAll.xsl</code> XSLT extracted from the resource stream.
     * @throws TransformerException
     */
    public void generateCode() throws TransformerException
    {
    	/** initialize the map which will overwrite global parameters as defined in metadata.xsl/ddJava.xsl */
        final Map<String, String> xsltParameters = new HashMap<String, String>();
        xsltParameters.put("gOutputFolder", pathToImpl);
        xsltParameters.put("gOutputFolderApi", pathToApi);
        xsltParameters.put("gOutputFolderTest", pathToTest);
        xsltParameters.put("gOutputFolderService", pathToServices);
        
        final InputStream is = MetadataParser.class.getResourceAsStream("/META-INF/ddJavaAll.xsl");
        System.out.println("Stream resource: " + is);
        
        XsltTransformer.simpleTransform(pathToMetadata, is, new File("./tempddJava.xml"), xsltParameters);      
    }
    
    /**
     * Creates a temporary file.
     * @return
     * @throws IOException
     */
	private String createTempFile() throws IOException 
	{
		File tempFile = File.createTempFile("tempMetadata", ".xml");
		return tempFile.getAbsolutePath();
	}
}
