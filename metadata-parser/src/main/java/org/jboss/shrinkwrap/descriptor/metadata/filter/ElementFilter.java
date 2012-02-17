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
import org.jboss.shrinkwrap.descriptor.metadata.MetadataItem;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;


/**
 * This class analyzes <code>Element</code> w3c elements.
 * <p>
 * Definition:
 * <p>
 * <code>
 *   <element
 *      abstract = boolean : false
 *      block = (#all | List of (extension | restriction | substitution))
 *      default = string
 *      final = (#all | List of (extension | restriction))
 *      fixed = string
 *      form = (qualified | unqualified)
 *      id = ID
 *      maxOccurs = (nonNegativeInteger | unbounded)  : 1
 *      minOccurs = nonNegativeInteger : 1
 *      name = NCName
 *      nillable = boolean : false
 *      ref = QName
 *      substitutionGroup = QName
 *      type = QName
 *      {any attributes with non-schema namespace . . .}>
 *      Content: (annotation?, ((simpleType | complexType)?, (unique | key | keyref)*))
 *   </element>
 * </code>
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class ElementFilter implements Filter
{
   @Override
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;

      if (XsdElementEnum.element.isTagNameEqual(element.getTagName()))
      {
         final String refStr = MetadataUtil.getAttributeValue(element, "ref");
         if (refStr != null)
         {
            final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
            if (parentNodeWithName != null)
            {
               final Element parentElementWithName = (Element)parentNodeWithName;
               final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
               if (XsdElementEnum.group.isTagNameEqual(parentElementWithName.getTagName()))
               {
                  final MetadataElement refElement = new MetadataElement(element);  
                  refElement.setIsRef(true);
                  metadata.addGroupReference(groupOrClassName, refElement);
                  return true;
               }
               else if(XsdElementEnum.attributeGroup.isTagNameEqual(parentElementWithName.getTagName()))
               {
                  final MetadataElement refElement = new MetadataElement(element);  
                  refElement.setIsRef(true);
                  metadata.addGroupReference(groupOrClassName, refElement);
                  return true;
               }
               else if(XsdElementEnum.element.isTagNameEqual(parentElementWithName.getTagName()))
               {
                  final MetadataElement refElement = new MetadataElement(element);                   
                  final Node parentNodeWithMaxOccurs = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "maxOccurs");
                  final Element p = (Element) parentNodeWithMaxOccurs;
                  final String maxOccurs = MetadataUtil.getAttributeValue(p, "maxOccurs");
                  if (maxOccurs != null && !maxOccurs.equals("1"))
                  {
                     refElement.setMaxOccurs("unbounded");
                  }
                  
                  final String[] items = refStr.split(":", -1);
                  if (items.length == 2)
                  {
                     refElement.setName(items[1]);
                  }
                  else
                  {
                     refElement.setName(refStr);
                  }
                  refElement.setType(refStr);
                  metadata.addClassElement(groupOrClassName, refElement);
                  return true;
               }
            }
         }
         
         final String typeStr = MetadataUtil.getAttributeValue(element, "type");
         if (XsdDatatypeEnum.integer.isDataType(typeStr))
         {
            final String dataTypeName = MetadataUtil.getAttributeValue(element, "name");
            if (dataTypeName != null)
            {
               final MetadataItem dataType = new MetadataItem(dataTypeName);
               dataType.setMappedTo(typeStr);
               dataType.setNamespace(metadata.getCurrentNamespace());
               dataType.setSchemaName(metadata.getCurrentSchmema());
               metadata.getDataTypeList().add(dataType);
            }
         }

         if (typeStr == null)
         {
            if (!element.hasChildNodes())
            {
               // may an unconstrained element of anyType, declare it as a string
               final String dataTypeName = MetadataUtil.getAttributeValue(element, "name");
               final MetadataItem dataType = new MetadataItem(dataTypeName);
               dataType.setMappedTo("xs:string");
               dataType.setNamespace(metadata.getCurrentNamespace());
               dataType.setSchemaName(metadata.getCurrentSchmema());
               metadata.getDataTypeList().add(dataType);
               return true;
            }
         }

         final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
         if (parentNodeWithName != null)
         {
            final Element parentElementWithName = (Element) parentNodeWithName;
            final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");

            boolean isUnbounded = false;
            final Element p = (Element) parent.getParentNode();
            if (p != null && XsdElementEnum.choice.isTagNameEqual(p.getTagName()))
            {
               final String maxOccurs = MetadataUtil.getAttributeValue(p, "maxOccurs");
               if (maxOccurs != null && !maxOccurs.equals("1"))
               {
                  isUnbounded = true;
               }
            }

            if (groupOrClassName != null)
            {
               if (XsdElementEnum.group.isTagNameEqual(parentElementWithName.getTagName()))
               {
                  final MetadataElement groupElement = new MetadataElement(element);
                  if (isUnbounded)
                  {
                     groupElement.setMaxOccurs("unbounded");
                  }
                  metadata.addGroupElement(groupOrClassName, groupElement);
                  return true;
               }
               else
               {
                  final MetadataElement classElement = new MetadataElement(element);
                  if (isUnbounded)
                  {
                     classElement.setMaxOccurs("unbounded");
                  }
                  metadata.addClassElement(groupOrClassName, classElement);
                  return true;
               }
            }

         }
      }
      return false;
   }

}
