package org.jboss.shrinkwrap.descriptor.metadata.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataClass;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataDescriptor;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataEnum;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataType;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DomWriter
{
   public void write(final Metadata metadata, final String pathToMetadata)
   {
      try
      {
         final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
         final DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

         // root elements
         final Document doc = docBuilder.newDocument();
         final Element rootElement = doc.createElement("metadata");
         doc.appendChild(rootElement);
                
         // add contributor
         final Element contributors = doc.createElement("contributors");
         rootElement.appendChild(contributors);
             
         final Element contributor = doc.createElement("contributor");
         final Attr contributorName = doc.createAttribute("name");
         contributorName.setValue("Ralf Battenfeld");
         contributor.setAttributeNode(contributorName);
         
         final Attr mailto = doc.createAttribute("mailto");
         mailto.setValue("ralf.battenfeld@bluewin.ch");
         contributor.setAttributeNode(mailto);
         contributors.appendChild(contributor);
         
         // add packages
         final Element packages = doc.createElement("packages");
         rootElement.appendChild(packages);
         
         final Element packageApi = doc.createElement("api");
         final Attr packageApiName = doc.createAttribute("name");
         packageApiName.setValue(metadata.getCurrentPackageApi());
         packageApi.setAttributeNode(packageApiName);
          
         final Attr schemaNameApi = doc.createAttribute("schema");
         schemaNameApi.setValue(metadata.getCurrentPackageApi());
         packageApi.setAttributeNode(schemaNameApi);
         
         final Attr generateClassApi = doc.createAttribute("generateClass");
         generateClassApi.setValue("true");
         packageApi.setAttributeNode(generateClassApi);
         
         final Element packageImpl = doc.createElement("impl");
         final Attr packageImplName = doc.createAttribute("name");         
         packageImplName.setValue(metadata.getCurrentPackageImpl());
         packageImpl.setAttributeNode(packageImplName);         
         
         final Attr schemaNameImpl = doc.createAttribute("schema");
         schemaNameImpl.setValue(metadata.getCurrentPackageImpl());
         packageImpl.setAttributeNode(schemaNameImpl);
         
         final Attr generateClassImpl = doc.createAttribute("generateClass");
         generateClassImpl.setValue("true");
         packageImpl.setAttributeNode(generateClassImpl);  
         
         packages.appendChild(packageApi);
         packages.appendChild(packageImpl);
         
         // add datatypes
         final Element datatypes = doc.createElement("datatypes");
         rootElement.appendChild(datatypes);
         for (MetadataType metadataType: metadata.getDataTypeList())
         {  
            final Element datatype = doc.createElement("datatype");
            final Attr attrName = doc.createAttribute("name");
            attrName.setValue(metadataType.getName());
            datatype.setAttributeNode(attrName);
            
            final Attr attrMappedTo = doc.createAttribute("mappedTo");
            attrMappedTo.setValue(metadataType.getMappedTo());
            datatype.setAttributeNode(attrMappedTo);
            
            final Attr attrNamespace = doc.createAttribute("namespace");
            attrNamespace.setValue(metadataType.getNamespace());
            datatype.setAttributeNode(attrNamespace);
            
            final Attr attrSchemaName = doc.createAttribute("schemaName");
            attrSchemaName.setValue(metadataType.getSchemaName());
            datatype.setAttributeNode(attrSchemaName);
            
            datatypes.appendChild(datatype);
         }
         
         final Element enums = doc.createElement("enums");
         rootElement.appendChild(enums);
         for (MetadataEnum metadataEnum: metadata.getEnumList())
         {  
            final Element enumElement = doc.createElement("enum");
            final Attr attrName = doc.createAttribute("name");
            attrName.setValue(metadataEnum.getName());
            enumElement.setAttributeNode(attrName);
                       
            final Attr attrNamespace = doc.createAttribute("namespace");
            attrNamespace.setValue(metadataEnum.getNamespace());
            enumElement.setAttributeNode(attrNamespace);
            
            final Attr attrSchemaName = doc.createAttribute("schemaName");
            attrSchemaName.setValue(metadataEnum.getSchemaName());
            enumElement.setAttributeNode(attrSchemaName);
            
            final Attr attrPackage = doc.createAttribute("package");
            attrPackage.setValue(metadataEnum.getPackageApi());
            enumElement.setAttributeNode(attrPackage);
            
            final Attr attrDocumentation = doc.createAttribute("documentation");
            attrDocumentation.setValue("");
            enumElement.setAttributeNode(attrDocumentation);
            
            for(String value: metadataEnum.getValueList())
            {
               final Element valueElement = doc.createElement("value");
               valueElement.setTextContent(value);
               enumElement.appendChild(valueElement);
            }
            
            enums.appendChild(enumElement);
         }
      
         final Element groups = doc.createElement("groups");
         rootElement.appendChild(groups);
         for (MetadataClass metadataClass: metadata.getGroupList())
         {  
            final Element classElement = doc.createElement("class");
            
            final Attr attrName = doc.createAttribute("name");
            attrName.setValue(metadataClass.getName());
            classElement.setAttributeNode(attrName);
            
            final Attr attrNamespace = doc.createAttribute("namespace");
            attrNamespace.setValue(metadataClass.getNamespace());
            classElement.setAttributeNode(attrNamespace);
            
            final Attr attrSchemaName = doc.createAttribute("schemaName");
            attrSchemaName.setValue(metadataClass.getSchemaName());
            classElement.setAttributeNode(attrSchemaName);
            
            final Attr attrPackageApi = doc.createAttribute("package");
            attrPackageApi.setValue(metadataClass.getPackageApi());
            classElement.setAttributeNode(attrPackageApi);
                        
            final Attr attrDocumentation = doc.createAttribute("documentation");
            attrDocumentation.setValue("");
            classElement.setAttributeNode(attrDocumentation);
            
            for(MetadataElement element: metadataClass.getElements())
            {
               final Element childElement = doc.createElement("element");
               
               final Attr elName = doc.createAttribute("name");
               elName.setValue(element.getName());
               childElement.setAttributeNode(elName);
               
               final Attr elType = doc.createAttribute("type");
               elType.setValue(element.getType());
               childElement.setAttributeNode(elType);
               
               final Attr elAttribute = doc.createAttribute("attribute");
               elAttribute.setValue(Boolean.toString(element.getIsAttribute()));
               childElement.setAttributeNode(elAttribute);
               
               if (element.getMaxOccurs() != null)
               {
                  final Attr elMaxOccurs = doc.createAttribute("maxOccurs");
                  elMaxOccurs.setValue(element.getMaxOccurs());
                  childElement.setAttributeNode(elMaxOccurs);
               }
               
               classElement.appendChild(childElement);
            }
            
            for(MetadataElement element: metadataClass.getIncludes())
            {
               final Element childElement = doc.createElement("include");
               
               final Attr elName = doc.createAttribute("name");
               elName.setValue(element.getRef());
               childElement.setAttributeNode(elName);
                              
               classElement.appendChild(childElement);
            }
            
            groups.appendChild(classElement);
         }
         
         final Element classes = doc.createElement("classes");
         rootElement.appendChild(classes);
         for (MetadataClass metadataClass: metadata.getClassList())
         {  
            final Element classElement = doc.createElement("class");
            
            final Attr attrName = doc.createAttribute("name");
            attrName.setValue(metadataClass.getName());
            classElement.setAttributeNode(attrName);
            
            final Attr attrNamespace = doc.createAttribute("namespace");
            attrNamespace.setValue(metadataClass.getNamespace());
            classElement.setAttributeNode(attrNamespace);
            
            final Attr attrSchemaName = doc.createAttribute("schemaName");
            attrSchemaName.setValue(metadataClass.getSchemaName());
            classElement.setAttributeNode(attrSchemaName);
            
            final Attr attrPackageApi = doc.createAttribute("packageApi");
            attrPackageApi.setValue(metadataClass.getPackageApi());
            classElement.setAttributeNode(attrPackageApi);
            
            final Attr attrPackageImpl = doc.createAttribute("packageImpl");
            attrPackageImpl.setValue(metadataClass.getPackageImpl());
            classElement.setAttributeNode(attrPackageImpl);
            
            final Attr attrDocumentation = doc.createAttribute("documentation");
            attrDocumentation.setValue("");
            classElement.setAttributeNode(attrDocumentation);
            
            for(MetadataElement element: metadataClass.getElements())
            {
               final Element childElement = doc.createElement("element");
               
               final Attr elName = doc.createAttribute("name");
               elName.setValue(element.getName());
               childElement.setAttributeNode(elName);
               
               final Attr elType = doc.createAttribute("type");
               elType.setValue(element.getType());
               childElement.setAttributeNode(elType);
               
               if (element.getMaxOccurs() != null)
               {
                  final Attr elMaxOccurs = doc.createAttribute("maxOccurs");
                  elMaxOccurs.setValue(element.getMaxOccurs());
                  childElement.setAttributeNode(elMaxOccurs);
               }
               
               classElement.appendChild(childElement);
            }
            
            for(MetadataElement element: metadataClass.getIncludes())
            {
               final Element childElement = doc.createElement("include");
               
               final Attr elName = doc.createAttribute("name");
               elName.setValue(element.getRef());
               childElement.setAttributeNode(elName);
                              
               classElement.appendChild(childElement);
            }
            
            classes.appendChild(classElement);
         }
         
//         <descriptor schemaName="../xsd/beans_1_0.xsd" namespace="javaee" packageApi="org.jboss.shrinkwrap.descriptor.api.beans10" packageImpl="org.jboss.shrinkwrap.descriptor.impl.beans10">
//			<namespace name="xmlns" value="http://java.sun.com/xml/ns/javaee" />
//			<namespace name="xmlns:xsi" value="http://www.w3.org/2001/XMLSchema-instance" />
//			<namespace name="xsi:schemaLocation" value="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/beans_1_0.xsd" />
//			<element name="beans" type="javaee:beans" defaultNamespaces="" />
//		</descriptor>
         
         final Element descriptors = doc.createElement("descriptors");
         rootElement.appendChild(descriptors);
         
         final MetadataDescriptor metadataDescriptor = metadata.getMetadataDescriptor();         
         final Element descriptorElement = doc.createElement("descriptor");
         descriptors.appendChild(descriptorElement);
         
         final Attr attrSchemaName = doc.createAttribute("schemaName");
         attrSchemaName.setValue(metadataDescriptor.getSchemaName());
         descriptorElement.setAttributeNode(attrSchemaName);
         
         final Attr attrPackageApi = doc.createAttribute("packageApi");
         attrPackageApi.setValue(metadataDescriptor.getPackageApi());
         descriptorElement.setAttributeNode(attrPackageApi);
         
         final Attr attrPackageImpl = doc.createAttribute("packageImpl");
         attrPackageImpl.setValue(metadataDescriptor.getPackageImpl());
         descriptorElement.setAttributeNode(attrPackageImpl);
         
         final Element element = doc.createElement("element");
         descriptorElement.appendChild(element);
         
         final Attr attElementName = doc.createAttribute("name");
         attElementName.setValue(metadataDescriptor.getName());
         element.setAttributeNode(attElementName);
         
         final Attr attElementType = doc.createAttribute("type");
         attElementType.setValue(metadataDescriptor.getType());
         element.setAttributeNode(attElementType);
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(new File(pathToMetadata));

         // Output to console for testing
         // StreamResult result = new StreamResult(System.out);

         transformer.transform(source, result);

         System.out.println("File saved!");

      }
      catch (ParserConfigurationException pce)
      {
         pce.printStackTrace();
      }
      catch (TransformerException tfe)
      {
         tfe.printStackTrace();
      }
   }
}
