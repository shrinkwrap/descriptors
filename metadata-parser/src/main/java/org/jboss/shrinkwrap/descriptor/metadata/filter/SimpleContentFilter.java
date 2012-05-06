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
 * Class which is responsible for <code>SimpleContent</code> w3c elements.
 * <p>
 * The simpleContent element contains extensions or restrictions on a text-only complex type or on a simple type as content and contains no elements.
 * <p>
 * <simpleContent
 *    id=ID
 *   any attributes
 *   >
 *   (annotation?,(restriction|extension))
 *
 *  </simpleContent> 
 *  
 *  @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class SimpleContentFilter implements Filter
{
   @Override
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;
      
      if (XsdElementEnum.simpleContent.isTagNameEqual(element.getTagName())) 
      {
    	  final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
    	  
    	  if (parentNodeWithName != null)
          {
             final Element parentElementWithName = (Element) parentNodeWithName;
             final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
             
             if (groupOrClassName != null)
             {
            	 if (!element.hasChildNodes()  ||
            		(MetadataUtil.hasChildOf(element, XsdElementEnum.extension) || MetadataUtil.hasChildOf(element, XsdElementEnum.restriction))) 
            	 {
            		 if (!MetadataUtil.hasChildsOf(element, XsdElementEnum.enumeration))
            		 {
		                final MetadataElement classElement = new MetadataElement();
		                classElement.setName(groupOrClassName);
		                classElement.setType("text");
		                classElement.setIsRef(false);
		                classElement.setIsAttribute(false);
		                metadata.addClassElement(groupOrClassName, classElement);
		                return true;
            		 }
            	 }
              }
          }
      }
      return false;
   }
   
   
}

