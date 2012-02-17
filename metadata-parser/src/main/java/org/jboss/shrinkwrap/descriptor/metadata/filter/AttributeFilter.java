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

package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;


/**
 * This class analyzes <code>Attribute</code> w3c elements.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class AttributeFilter implements Filter
{
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;
      
      if (XsdElementEnum.attribute.isTagNameEqual(element.getTagName())) 
      {
         final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
         if (parentNodeWithName != null)
         {
            final Element parentElementWithName = (Element) parentNodeWithName;
            final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
            if(groupOrClassName != null)
            {
               if (XsdElementEnum.group.isTagNameEqual(parentElementWithName.getTagName())) 
               {
                  final MetadataElement groupElement = new MetadataElement(element);
                  String type = MetadataUtil.getAttributeValue(element, "type");
                  if (type == null)
                  {
                     groupElement.setType("xsd:string");
                  }
                  groupElement.setIsAttribute(true);
                  metadata.addGroupElement(groupOrClassName, groupElement);
                  return true;
               }
               else if (XsdElementEnum.attributeGroup.isTagNameEqual(parentElementWithName.getTagName())) 
               {
                  final MetadataElement groupElement = new MetadataElement(element);
                  String type = MetadataUtil.getAttributeValue(element, "type");
                  if (type == null)
                  {
                     groupElement.setType("xsd:string");
                  }
                  groupElement.setIsAttribute(true);
                  metadata.addGroupElement(groupOrClassName, groupElement);
                  return true;
               }
               else
               {
                  final Node node = element.getAttributes().getNamedItem("type");
                  if(node != null)
                  {
                     if(node.getNodeValue().endsWith(":ID"))
                     {
                        return false;
                     }
                  
                     final MetadataElement classElement = new MetadataElement(element);
                     String type = MetadataUtil.getAttributeValue(element, "type");
                     if (type == null)
                     {
                        classElement.setType("xsd:string");
                     }
                     classElement.setIsAttribute(true);
                     metadata.addClassElement(groupOrClassName, classElement);
                     return true;
                  }
               }
            }
         }
      }
      return false;
   }
   
   
   private boolean hasNestedComplexType(final Node parent)
   {
      if (parent.hasChildNodes())
      {
         for (int i=0; i<parent.getChildNodes().getLength(); i++)    
         {
            final Node childNode = parent.getChildNodes().item(i);
            if (childNode.getNodeType() == Node.ELEMENT_NODE)
            {
               final Element childElement = (Element) childNode;
               if (XsdElementEnum.complexType.isTagNameEqual(childElement.getTagName())) 
               {
                  return true;
               }
            }
         }
      }
      return false;
   }
}

