package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataType;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

/**
 * The simpleContent element contains extensions or restrictions on a text-only complex type or on a simple type as content and contains no elements.
 * 
 * <simpleContent
 *    id=ID
 *   any attributes
 *   >
 *   (annotation?,(restriction|extension))
 *
 *  </simpleContent> 
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
	             final MetadataElement classElement = new MetadataElement();
	             classElement.setName(groupOrClassName);
	             classElement.setType("text");
	             classElement.setIsRef(false);
	             classElement.setIsAttribute(false);
	             metadata.addClassElement(groupOrClassName, classElement);
             }
          }
      }
      return false;
   }
   
   
}

