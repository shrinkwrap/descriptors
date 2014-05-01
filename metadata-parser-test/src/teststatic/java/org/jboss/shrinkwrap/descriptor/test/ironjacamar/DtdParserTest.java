package org.jboss.shrinkwrap.descriptor.test.ironjacamar;

import java.io.FileReader;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataDescriptor;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataParserPath;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.jboss.shrinkwrap.descriptor.metadata.dom.DomWriter;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import com.sun.xml.dtdparser.DTDEventListener;
import com.sun.xml.dtdparser.DTDParser;
import com.sun.xml.dtdparser.InputEntity;

@Ignore
public class DtdParserTest
{

   @Test
   public void testJettyDtd() throws Exception
   {
      final String dtdFile = "src/test/resources/dtd/jetty_7_configure.dtd";
      
//      final MetadataParser metadataParser = new MetadataParser(
//            dtdFile, 
//            "jetty7", 
//            "org.jboss.shrinkdesc,jetty7.api", "org.jboss.shrinkdesc,jetty7.impl", 
//            "JettyDescriptor",
//            "Configure", 
//            "jetty7:Configure", 
//            "src/main/java", 
//            "src/main/java",
//            "src/test/java",
//            null,
//            true);

//      final MetadataParser metadataParser = new MetadataParser(
//            "src/test/resources/xsd/orm_1_0.xsd", 
//            "orm", 
//            "org.jboss.shrinkdesc,orm10.api", "org.jboss.shrinkdesc,orm10.impl", 
//            "OrmDescriptor",
//            "entity-mappings", 
//            "orm:entity-mappings", 
//            "src/main/java", 
//            "src/main/java",
//            null,
//            null,
//            true);
//      
//      metadataParser.parse();
      
      
//      final InputSource in = new InputSource(new FileReader(dtdFile));
//      final TestDtdEventListener dtdEventListener = new TestDtdEventListener("jetty7",
//            "org.jboss.shrinkdesc,jetty7.api", "org.jboss.shrinkdesc,jetty7.impl", dtdFile);
//      final DTDParser parser = new DTDParser();
//      parser.setDtdHandler(dtdEventListener);
//      parser.parse(in);
//
//      final Metadata metadata = dtdEventListener.getMetadata();
//      MetadataDescriptor metadataDescriptor = new MetadataDescriptor();
//      metadataDescriptor.setName("JettyDescriptor");
//      metadataDescriptor.setRootElementName("Configure");
//      metadataDescriptor.setRootElementType("jetty7:Configure");
//      metadataDescriptor.setSchemaName(dtdFile);
//      metadataDescriptor.setPackageApi("org.jboss.shrinkdesc,jetty7.api");
//      metadataDescriptor.setPackageImpl("org.jboss.shrinkdesc,jetty7.impl");
//      metadataDescriptor.setNamespace("jetty7");
//
//      metadata.setMetadataDescriptor(metadataDescriptor);
//      metadata.preResolveDataTypes();
//      new MetadataUtil().print(metadata);
//      new DomWriter().write(metadata, "/tmp/jetty7.xml");
      //
      // if (verbose) {
      // new MetadataUtil().print(metadata);
      // }
   }

   @Test
   public void testConnector() throws Exception
   {
      final String dtdFile = "src/test/resources/dtd/connector_1_0.dtd";
      final InputSource in = new InputSource(new FileReader(dtdFile));
      final TestDtdEventListener dtdEventListener = new TestDtdEventListener("j2ee",
            "org.jboss.shrinkwrap.descriptor.test.api.connector10",
            "org.jboss.shrinkwrap.descriptor.test.impl.connector10", dtdFile);
      final DTDParser parser = new DTDParser();
      parser.setDtdHandler(dtdEventListener);
      parser.parse(in);

      final Metadata metadata = dtdEventListener.getMetadata();
      MetadataDescriptor metadataDescriptor = new MetadataDescriptor("ConnectorDescriptor");
      metadataDescriptor.setRootElementName("connector");
      metadataDescriptor.setRootElementType("j2ee:connector");
      metadataDescriptor.setSchemaName(dtdFile);
      metadataDescriptor.setPackageApi("org.jboss.shrinkwrap.descriptor.test.api.connector10");
      metadataDescriptor.setPackageImpl("org.jboss.shrinkwrap.descriptor.test.impl.connector10");
      metadataDescriptor.setNamespace("j2ee");

      final MetadataParserPath path = new MetadataParserPath();
      path.setPathToApi("");
      path.setPathToImpl("");
      path.setPathToServices("");
      path.setPathToTest("");
      
      metadata.getMetadataDescriptorList().add(metadataDescriptor);
      metadata.preResolveDataTypes();
      new MetadataUtil().log(metadata);
      new DomWriter().write(metadata, "/tmp/connector_1_0.xml", null, path);
      //
      // if (verbose) {
      // new MetadataUtil().print(metadata);
      // }
   }

   private class TestDtdEventListener implements DTDEventListener
   {
      final Metadata metadata = new Metadata();

      String currentContentModel = "";

      public TestDtdEventListener(final String namespace, final String packageApi, final String packageImpl,
            final String schema)
      {
         metadata.setCurrentNamespace(namespace);
         metadata.setCurrentPackageApi(packageApi);
         metadata.setCurrentPackageImpl(packageImpl);
         metadata.setCurrentSchmema(schema);
      }

      public Metadata getMetadata()
      {
         return metadata;
      }

      @Override
      public void setDocumentLocator(Locator loc)
      {
         System.out.println("setDocumentLocator:" + loc);

      }

      @Override
      public void processingInstruction(String target, String data) throws SAXException
      {
         System.out.println("processingInstruction: Target" + target + "  Data:" + data);

      }

      @Override
      public void notationDecl(String name, String publicId, String systemId) throws SAXException
      {
         System.out.println("notationDecl: name" + name + "  publicId:" + publicId);

      }

      @Override
      public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName)
            throws SAXException
      {
         System.out.println("unparsedEntityDecl: name" + name + "  publicId:" + publicId);

      }

      @Override
      public void internalGeneralEntityDecl(String name, String value) throws SAXException
      {
         System.out.println("internalGeneralEntityDecl: name" + name + "  value:" + value);

      }

      @Override
      public void externalGeneralEntityDecl(String name, String publicId, String systemId) throws SAXException
      {
         System.out.println("externalGeneralEntityDecl: name" + name + "  publicId:" + publicId);

      }

      @Override
      public void internalParameterEntityDecl(String name, String value) throws SAXException
      {
         System.out.println("internalParameterEntityDecl: name" + name + "  value:" + value);

      }

      @Override
      public void externalParameterEntityDecl(String name, String publicId, String systemId) throws SAXException
      {
         System.out.println("externalParameterEntityDecl: name" + name + "  publicId:" + publicId);

      }

      @Override
      public void startDTD(InputEntity in) throws SAXException
      {
         System.out.println("startDTD: InputEntity" + in);

      }

      @Override
      public void endDTD() throws SAXException
      {
         System.out.println("endDTD: InputEntity");

      }

      @Override
      public void comment(String text) throws SAXException
      {
         System.out.println("comment:" + text);

      }

      @Override
      public void characters(char[] ch, int start, int length) throws SAXException
      {
         System.out.println("characters:");

      }

      @Override
      public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException
      {
         System.out.println("ignorableWhitespace:");

      }

      @Override
      public void startCDATA() throws SAXException
      {
         System.out.println("startCDATA:");

      }

      @Override
      public void endCDATA() throws SAXException
      {
         System.out.println("endCDATA:");

      }

      @Override
      public void fatalError(SAXParseException e) throws SAXException
      {
         System.out.println("fatalError:" + e.getMessage());

      }

      @Override
      public void error(SAXParseException e) throws SAXException
      {
         System.out.println("error:" + e.getMessage());

      }

      @Override
      public void warning(SAXParseException err) throws SAXException
      {
         System.out.println("warning:" + err);

      }

      @Override
      public void startContentModel(String elementName, short contentModelType) throws SAXException
      {
         System.out
               .println("startContentModel: elementName: " + elementName + " contentModelType: " + contentModelType);
         // MetadataElement element = new MetadataElement();
         // element.setName(elementName);
         // metadata.addClassElement(elementName, element);
         currentContentModel = elementName;
      }

      @Override
      public void endContentModel(String elementName, short contentModelType) throws SAXException
      {
         System.out.println("endContentModel: elementName: " + elementName + " contentModelType: " + contentModelType);
         currentContentModel = "";
      }

      @Override
      public void attributeDecl(String elementName, String attributeName, String attributeType, String[] enumeration,
            short attributeUse, String defaultValue) throws SAXException
      {
         System.out
               .println("attributeDecl: elementName: " + elementName + " attributeName: " + attributeName
                     + " attributeType: " + attributeType + " enumeration: " + enumeration + " attributeUse: "
                     + attributeUse);
         MetadataElement element = new MetadataElement();
         element.setName(attributeName);
         element.setIsAttribute(true);
         element.setType("xsd:string");
         metadata.addClassElement(elementName, element);
      }

      @Override
      public void childElement(String elementName, short occurence) throws SAXException
      {
         System.out.println("childElement: elementName: " + elementName + " occurence: " + occurence);
         MetadataElement element = new MetadataElement();
         element.setName(elementName);
         element.setType(elementName);
         metadata.addClassElement(currentContentModel, element);
      }

      @Override
      public void mixedElement(String elementName) throws SAXException
      {
         System.out.println("mixedElement: elementName: " + elementName);

      }

      @Override
      public void startModelGroup() throws SAXException
      {
         System.out.println("startModelGroup:");

      }

      @Override
      public void endModelGroup(short occurence) throws SAXException
      {
         System.out.println("endModelGroup: occurence: " + occurence);

      }

      @Override
      public void connector(short connectorType) throws SAXException
      {
         System.out.println("connector: connectorType: " + connectorType);

      }

   }
}
