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

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.metadata.filter.XsdElementEnum;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Utility class serving useful methods for extracting node and element information.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataUtil
{
    private static final Logger log = Logger.getLogger(MetadataUtil.class.getName());
    private static final char NEWLINE = '\n';
    private static final String LINE = "--------------------------------------------";
    
   /**
    * Returns the attribute value for the given attribute name.
    * @param element the w3c dom element.
    * @param name the attribute name
    * @return if present, the the extracted attribute value, otherwise null.
    */
   public static String getAttributeValue(final Element element, final String name)
   {
      final Node node = element.getAttributes().getNamedItem(name);
      if (node != null)
      {
         return node.getNodeValue();
      }

      return null;
   }

   /**
    * Returns the next parent node which has the specific attribute name defined.
    * @param parent the w3c node from which the search will start.
    * @param attrName the attribute name which is searched for.
    * @return a parent node, if the attribute is found, otherwise null.
    */
   public static Node getNextParentNodeWithAttr(final Node parent, final String attrName)
   {
      Node parentNode = parent;
      Element parendElement = (Element) parentNode;
      Node valueNode = parendElement.getAttributes().getNamedItem(attrName);
      while (valueNode == null)
      {
         parentNode = parentNode.getParentNode();
         if (parentNode != null)
         {
            if (parentNode.getNodeType() == Node.ELEMENT_NODE)
            {
               parendElement = (Element) parentNode;
               valueNode = parendElement.getAttributes().getNamedItem(attrName);
            }
         }
         else
         {
            break;
         }
      }

      return parendElement;
   }

   /**
    * Checks the existence of a w3c child element.
    * @param parentElement the element from which the search starts.
    * @param child the <code>XsdElementEnum</code> specifying the child element.
    * @return true, if found, otherwise false.
    */
   public static boolean hasChildOf(final Element parentElement, XsdElementEnum child )
   {
      NodeList nodeList = parentElement.getChildNodes();   
      for (int i=0; i<nodeList.getLength(); i++)
      {
         final Node childNode = nodeList.item(i);
         if (childNode.getNodeType() == Node.ELEMENT_NODE)
         {
            final Element childElement = (Element) childNode;
            if (child.isTagNameEqual(childElement.getTagName())) 
            {
               return true;
            }
         }
      }
      return false;      
   }
   
   /**
    * Logs out metadata information.
    * @param metadata
    */
   public void log(final Metadata metadata)
   {
      final StringBuilder sb = new StringBuilder();
       
      for (final MetadataItem item : metadata.getGroupList())
      {   
         sb.append(LINE);
         sb.append(NEWLINE);
         sb.append(LINE);
         sb.append("Group: " + item.getName());
         sb.append(NEWLINE);
         for (MetadataElement element : item.getElements())
         {
            sb.append("  Element  : " + element.getName());
            sb.append(NEWLINE);
            sb.append("  Type     : " + element.getType());
            sb.append(NEWLINE);
            sb.append("  MinOccurs: " + element.getMinOccurs());
            sb.append(NEWLINE);
            sb.append("  MaxOccurs: " + element.getMaxOccurs());
            sb.append(NEWLINE);
            sb.append("  IsAttr   : " + element.getIsAttribute());
            sb.append(NEWLINE);
         }

         for (MetadataElement element : item.getReferences())
         {
           sb.append("  Ref      : " + element.getRef());
           sb.append(NEWLINE);
         }
         sb.append(NEWLINE);
         
      }

      for (MetadataEnum enumItem : metadata.getEnumList())
      {
         sb.append(LINE);
         sb.append(NEWLINE);
         sb.append("Enum: " + enumItem.getName());
         sb.append(NEWLINE);
         for (String enumValue : enumItem.getValueList())
         {
             sb.append("  Value    : " + enumValue);
             sb.append(NEWLINE);
         }
         sb.append(NEWLINE);
      }

      for (MetadataItem item : metadata.getClassList())
      {
         sb.append(LINE);
         sb.append(NEWLINE);
         sb.append("Class: " + item.getName());
         sb.append(NEWLINE);
         for (MetadataElement element : item.getElements())
         {
            sb.append("  Element  : " + element.getName());
            sb.append(NEWLINE);
            sb.append("  Type     : " + element.getType());
            sb.append(NEWLINE);
            sb.append("  MinOccurs: " + element.getMinOccurs());
            sb.append(NEWLINE);
            sb.append("  MaxOccurs: " + element.getMaxOccurs());
            sb.append(NEWLINE);
            sb.append("  IsAttr   : " + element.getIsAttribute());
            sb.append(NEWLINE);
         }

         for (MetadataElement element : item.getReferences())
         {
             sb.append("  Ref      : " + element.getRef());
             sb.append(NEWLINE);
         }
         sb.append(NEWLINE);
      }

      for (MetadataItem dataType : metadata.getDataTypeList())
      {
         sb.append(LINE);
         sb.append(NEWLINE);
         sb.append("Name    : " + dataType.getName());
         sb.append(NEWLINE);
         sb.append("MappedTo: " + dataType.getMappedTo());
         sb.append(NEWLINE);
      }
      
      // Log
      log.info(sb.toString());
   }
}
