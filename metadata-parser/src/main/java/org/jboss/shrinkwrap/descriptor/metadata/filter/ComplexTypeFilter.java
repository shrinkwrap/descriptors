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
 * This filter class analyzes <code>ComplexType</code> w3c elements.
 * <p>
 * According the specification, possible content can be:
 * 
 * <code>
 * Content: (annotation?, (simpleContent | complexContent | ((group | all | choice | sequence)?, ((attribute | attributeGroup)*, anyAttribute?))))
 * </code>
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class ComplexTypeFilter implements Filter
{
   @Override
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;
      
      if (XsdElementEnum.complexType.isTagNameEqual(element.getTagName())) 
      {
    	  final String typeStr = MetadataUtil.getAttributeValue(element, "type"); 
    	  final String mixedStr = MetadataUtil.getAttributeValue(element, "mixed"); 
    	  final String abstractStr = MetadataUtil.getAttributeValue(element, "abstract");
    	  if (typeStr == null  && (!element.hasChildNodes()))
		  {
			  final String dataTypeName = MetadataUtil.getAttributeValue(element, "name");
			  final MetadataItem dataType = new MetadataItem(dataTypeName);
              dataType.setMappedTo("javaee:emptyType");
              dataType.setNamespace(metadata.getCurrentNamespace());
              dataType.setSchemaName(metadata.getCurrentSchmema());
              metadata.getDataTypeList().add(dataType);              
              return true;
    	  }    
    	  else if (mixedStr != null && mixedStr.equals("true"))
    	  {
    	     final String complexTypeName = MetadataUtil.getAttributeValue(element, "name");
    	     final MetadataElement classElement = new MetadataElement();
             classElement.setName(complexTypeName);
             classElement.setType("text");
             classElement.setIsRef(false);
             classElement.setIsAttribute(false);
             metadata.addClassElement(complexTypeName, classElement);
    	  }
    	  else if (abstractStr != null && abstractStr.equals("true"))
          {
             final String complexTypeName = MetadataUtil.getAttributeValue(element, "name");
             final MetadataElement classElement = new MetadataElement();
             classElement.setName(complexTypeName);
             classElement.setType(metadata.getCurrentNamespace() + ":" + complexTypeName);
             classElement.setIsRef(false);
             classElement.setIsAttribute(false);
             metadata.addClassElement(complexTypeName, classElement);
          }
    	  else if (
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.simpleContent) &&
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.complexContent) &&
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.group) &&
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.all) &&
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.choice) &&
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.sequence) &&
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.attribute) &&
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.attributeGroup) &&
    	        !MetadataUtil.hasChildOf(element, XsdElementEnum.anyAttribute))
    	  {
    	     final String dataTypeName = MetadataUtil.getAttributeValue(element, "name");
             final MetadataItem dataType = new MetadataItem(dataTypeName);
             dataType.setMappedTo("javaee:emptyType");
             dataType.setNamespace(metadata.getCurrentNamespace());
             dataType.setSchemaName(metadata.getCurrentSchmema());
             metadata.getDataTypeList().add(dataType);
             return true;
    	  }
      }
      return false;
   }
}

