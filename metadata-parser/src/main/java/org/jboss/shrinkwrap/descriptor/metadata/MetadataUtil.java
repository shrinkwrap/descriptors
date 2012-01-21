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

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Utility class serving useful methods for extracting node and element information.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataUtil
{
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
    * Prints on the stdio out metadata information.
    * @param metadata
    */
   public void print(final Metadata metadata)
   {
      for (MetadataItem item : metadata.getGroupList())
      {
         System.out.println("--------------------------------------------");
         System.out.println("Group: " + item.getName());
         for (MetadataElement element : item.getElements())
         {
            System.out.println("  Element  : " + element.getName());
            System.out.println("  Type     : " + element.getType());
            System.out.println("  MinOccurs: " + element.getMinOccurs());
            System.out.println("  MaxOccurs: " + element.getMaxOccurs());
            System.out.println("  IsAttr   : " + element.getIsAttribute());
            System.out.println("");
         }

         for (MetadataElement element : item.getReferences())
         {
            System.out.println("  Ref      : " + element.getRef());
         }
         System.out.println("");
      }

      for (MetadataEnum enumItem : metadata.getEnumList())
      {
         System.out.println("--------------------------------------------");
         System.out.println("Enum: " + enumItem.getName());
         for (String enumValue : enumItem.getValueList())
         {
            System.out.println("  Value    : " + enumValue);
         }
         System.out.println("");
      }

      for (MetadataItem item : metadata.getClassList())
      {
         System.out.println("--------------------------------------------");
         System.out.println("Class: " + item.getName());
         for (MetadataElement element : item.getElements())
         {
            System.out.println("  Element  : " + element.getName());
            System.out.println("  Type     : " + element.getType());
            System.out.println("  MinOccurs: " + element.getMinOccurs());
            System.out.println("  MaxOccurs: " + element.getMaxOccurs());
            System.out.println("  IsAttr   : " + element.getIsAttribute());
            System.out.println("");
         }

         for (MetadataElement element : item.getReferences())
         {
            System.out.println("  Ref      : " + element.getRef());
         }
         System.out.println("");
      }

      for (MetadataItem dataType : metadata.getDataTypeList())
      {
         System.out.println("--------------------------------------------");
         System.out.println("Name    : " + dataType.getName());
         System.out.println("MappedTo: " + dataType.getMappedTo());
         System.out.println("");
      }
   }
}
