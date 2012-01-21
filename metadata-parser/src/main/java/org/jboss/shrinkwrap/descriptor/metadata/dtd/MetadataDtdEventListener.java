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

package org.jboss.shrinkwrap.descriptor.metadata.dtd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataItem;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import com.sun.xml.dtdparser.DTDEventListener;
import com.sun.xml.dtdparser.InputEntity;

/**
 * This class is able to produce <code>metadata</code> information when a dtd file
 * is parsed.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataDtdEventListener implements DTDEventListener
{
   /** Contains the metadata infos as fired by the <code>DTDParser</code> */
   private final Metadata metadata;

   /** If true, then the dtd events are printed on the standard out */
   private final boolean isVerbose;

   /** Defines the current content model context, e.g. the current element name */
   private String currentContentModel = "";

//   private Map<String, Short> childElements = new HashMap<String, Short>();
   private List<Map<String, Short>> modelGroupStack;
   
   /**
    * Creates a new instance.
    */
   public MetadataDtdEventListener(final Metadata metadata, final boolean isVerbose)
   {
      this.metadata = metadata;
      this.isVerbose = isVerbose;
   }

   public Metadata getMetadata()
   {
      return metadata;
   }

   @Override
   public void setDocumentLocator(Locator loc)
   {
      if (isVerbose)
      {
         System.out.println("setDocumentLocator:" + loc);
      }
   }

   @Override
   public void processingInstruction(String target, String data) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("processingInstruction: Target" + target + "  Data:" + data);
      }
   }

   @Override
   public void notationDecl(String name, String publicId, String systemId) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("notationDecl: name" + name + "  publicId:" + publicId);	
      }
   }

   @Override
   public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName)
         throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("unparsedEntityDecl: name" + name + "  publicId:" + publicId);
      }
   }

   @Override
   public void internalGeneralEntityDecl(String name, String value) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("internalGeneralEntityDecl: name" + name + "  value:" + value);
      }
   }

   @Override
   public void externalGeneralEntityDecl(String name, String publicId, String systemId) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("externalGeneralEntityDecl: name" + name + "  publicId:" + publicId);
      }
   }

   @Override
   public void internalParameterEntityDecl(String name, String value) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("internalParameterEntityDecl: name" + name + "  value:" + value);
      }
   }

   @Override
   public void externalParameterEntityDecl(String name, String publicId, String systemId) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("externalParameterEntityDecl: name" + name + "  publicId:" + publicId);
      }
   }

   @Override
   public void startDTD(InputEntity in) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("startDTD: InputEntity" + in);
      }
   }

   @Override
   public void endDTD() throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("endDTD: InputEntity");
      }
   }

   @Override
   public void comment(String text) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("comment:" + text);
      }
   }

   @Override
   public void characters(char[] ch, int start, int length) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("characters:");
      }
   }

   @Override
   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("ignorableWhitespace:");
      }
   }

   @Override
   public void startCDATA() throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("startCDATA:");
      }
   }

   @Override
   public void endCDATA() throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("endCDATA:");
      }
   }

   @Override
   public void fatalError(SAXParseException e) throws SAXException
   {
      throw e;
   }

   @Override
   public void error(SAXParseException e) throws SAXException
   {
      throw e;
   }

   @Override
   public void warning(SAXParseException err) throws SAXException
   {
      if (isVerbose)
      {
         err.printStackTrace();
      }
      else
      {
         System.out.println("warning:" + err.getMessage());
      }
   }

   @Override
   public void startContentModel(String elementName, short contentModelType) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("startContentModel: elementName: " + elementName + " contentModelType: " + contentModelType);
      }
     
      currentContentModel = elementName;      
      modelGroupStack = new ArrayList<Map<String, Short>>();
      
      /** 
       * It is a mixed model, that means body text and perhaps child elements are defined for this element.
       * When endContentModel is called we have to analyze if there really child elements defined.
       */
      if (contentModelType == DTDEventListener.CONTENT_MODEL_MIXED)
      {
         final MetadataElement element = new MetadataElement();
         element.setName(elementName);
         element.setType("text"); // body text
         metadata.addClassElement(elementName, element);
      }
   }

   @Override
   public void endContentModel(String elementName, short contentModelType) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("endContentModel: elementName: " + elementName + " contentModelType: " + contentModelType);
      }
      
      /** 
       * Look for the number of the child elements for this element.
       */
      int childElementCounter = 0;
      MetadataItem foundClass = null;
      for (final MetadataItem metadataClass: metadata.getClassList())
      {
         if (metadataClass.getName().equals(currentContentModel))
         {
            childElementCounter = metadataClass.getElements().size();
            foundClass = metadataClass;
            break;
         }
      }
      
      boolean isJustPCDATA = false;
      
      /**
       * Check, the element count, if no elements,
       * then create a data type element of type xsd:string
       */
      if (childElementCounter == 0)
      {
         isJustPCDATA = true;
      }
      else if (childElementCounter == 1)
      {
         if (foundClass.getName().equals(currentContentModel) && contentModelType == DTDEventListener.CONTENT_MODEL_MIXED) 
         {
            isJustPCDATA = true;
         }
      }
      
      if (isJustPCDATA)
      {
         final MetadataItem type = new MetadataItem(currentContentModel);
         type.setMappedTo("xsd:string");
         type.setNamespace(metadata.getCurrentNamespace());
         metadata.getDataTypeList().add(type);
         
         if (foundClass != null)
         {
            metadata.getClassList().remove(foundClass);
         }
      }
      
      currentContentModel = "";
      modelGroupStack = null;
   }

   @Override
   public void attributeDecl(String elementName, String attributeName, String attributeType, String[] enumeration,
         short attributeUse, String defaultValue) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("attributeDecl: elementName: " + elementName + " attributeName: " + attributeName
            + " attributeType: " + attributeType + " enumeration: " + enumeration + " attributeUse: " + attributeUse);
      }
      
      /**
       * Don't add the system attribute id otherwise we have problems with the mixed content.
       */
      if (!attributeType.equals("ID"))
      {
         final MetadataElement element = new MetadataElement();
         element.setName(attributeName);
         element.setIsAttribute(true);
         element.setType("xsd:string");
         metadata.addClassElement(elementName, element);
      }
   }

   @Override
   public void childElement(String elementName, short occurence) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("childElement: elementName: " + elementName + " occurence: " + occurence);
      }
      
      final Map<String, Short> modelGroupElements = modelGroupStack.get(modelGroupStack.size() - 1);
      modelGroupElements.put(elementName, occurence);
   }

   @Override
   public void mixedElement(String elementName) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("mixedElement: elementName: " + elementName);
      }
      
      final MetadataElement element = new MetadataElement();
      element.setName(elementName);
      element.setType(elementName);
      
      metadata.addClassElement(currentContentModel, element);
   }

   @Override
   public void startModelGroup() throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("startModelGroup:");
      }
      
      modelGroupStack.add(new HashMap<String, Short>());
   }

   @Override
   public void endModelGroup(short occurence) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("endModelGroup: occurence: " + occurence);
      }
      
      final Map<String, Short> modelGroupElements = modelGroupStack.get(modelGroupStack.size() - 1);
      
      for (Iterator it=modelGroupElements.entrySet().iterator(); it.hasNext(); ) 
      {
         Map.Entry entry = (Map.Entry)it.next();
         String elementName = (String)entry.getKey();
         Short elementOccurence = (Short)entry.getValue();
         
         boolean isUnbounded = false;
         if (occurence == DTDEventListener.OCCURENCE_ZERO_OR_MORE || 
             occurence == DTDEventListener.OCCURENCE_ONE_OR_MORE ||
             elementOccurence == DTDEventListener.OCCURENCE_ZERO_OR_MORE || 
             elementOccurence == DTDEventListener.OCCURENCE_ONE_OR_MORE)
         {
            isUnbounded = true;
         }
         
         final MetadataElement element = new MetadataElement();
         element.setName(elementName);
         element.setType(elementName);

         if (isUnbounded)
         {
            element.setMaxOccurs("unbounded");
         }

         metadata.addClassElement(currentContentModel, element);         
     }
      
      modelGroupStack.remove(modelGroupElements);
   }

   @Override
   public void connector(short connectorType) throws SAXException
   {
      if (isVerbose)
      {
         System.out.println("connector: connectorType: " + connectorType);
      }
   }

}
