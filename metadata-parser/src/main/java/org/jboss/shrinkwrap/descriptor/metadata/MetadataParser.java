package org.jboss.shrinkwrap.descriptor.metadata;

import java.io.File;
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
import org.jboss.shrinkwrap.descriptor.metadata.filter.AttributeFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.AttributeGroupFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ComplexTypeFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ElementFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.EnumFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.Filter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.GroupFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.RestrictionFilter;
import org.jboss.shrinkwrap.descriptor.metadata.xslt.XsltTransformer;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.TreeWalker;

public class MetadataParser
{
    private final List<Filter> filterList = new ArrayList<Filter>();
    private final Metadata metadata = new Metadata();
    private final String pathToXsd;
    private final String pathToMetadata;
    private final String nameSpace;
    private final String packageApi;
    private final String packageImpl;
    private final String rootElementName;
    private final String rootElementType;
    private final String pathToApi;
    private final String pathToImpl; 
    private final String pathToTest;
    private final String pathToServices;
    private final boolean verbose;

    public MetadataParser(final String pathToXsd,
            final String nameSpace, final String packageApi,
            final String packageImpl, final String rootElementName, final String rootElementType, 
            final String pathToApi, final String pathToImpl, final String pathToTest, final String pathToServices, final boolean verbose) throws IOException
    {
        this.pathToXsd = pathToXsd;
        this.pathToMetadata = createTempFile();
        this.nameSpace = nameSpace;
        this.packageApi = packageApi;
        this.packageImpl = packageImpl;
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

        metadata.setCurrentNamespace(nameSpace);
        metadata.setCurrentSchmema(pathToXsd);
        metadata.setCurrentPackageApi(packageApi);
        metadata.setCurrentPackageImpl(packageImpl);
        
        MetadataDescriptor metadataDescriptor = new MetadataDescriptor();
        metadataDescriptor.setName(rootElementName);
        metadataDescriptor.setType(rootElementType);
        metadataDescriptor.setSchemaName(pathToXsd);
        metadataDescriptor.setPackageApi(packageApi);
        metadataDescriptor.setPackageImpl(packageImpl);
        metadataDescriptor.setNamespace(nameSpace);
        metadata.setMetadataDescriptor(metadataDescriptor);

        final DocumentTraversal traversal = (DocumentTraversal) document;
        final TreeWalker walker = traversal.createTreeWalker(document.getDocumentElement(), NodeFilter.SHOW_ELEMENT, null, true);

        traverseLevel(walker);

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
        
    	/** generate java classes based on metadata.xml */
//        XsltTransformer.simpleTransform(pathToMetadata, 
//              "src/main/resources/META-INF/ddJavaAll.xsl", 
//              "./tempddJava.xml", 
//              xsltParameters);      
        
        XsltTransformer.simpleTransform(pathToMetadata, 
        		is, 
                new File("./tempddJava.xml"), 
                xsltParameters);      
    }
    
	private String createTempFile() throws IOException 
	{
		File tempFile = File.createTempFile("tempMetadata", ".xml");
		return tempFile.getAbsolutePath();
	}
}
