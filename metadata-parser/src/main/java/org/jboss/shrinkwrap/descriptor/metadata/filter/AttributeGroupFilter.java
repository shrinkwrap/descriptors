package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;


/**
 Definition:
 <group
   id = ID
   maxOccurs = (nonNegativeInteger | unbounded)  : 1
   minOccurs = nonNegativeInteger : 1
   name = NCName
   ref = QName
   {any attributes with non-schema namespace . . .}>
   Content: (annotation?, (all | choice | sequence)?)
 </group>
 */

/**
 * Class which is responsible for handling group tags.
 */
public class AttributeGroupFilter implements Filter
{
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;
      
      if (XsdElementEnum.attributeGroup.isTagNameEqual(element.getTagName())) 
      {
         final Node refNode  = element.getAttributes().getNamedItem("ref");
     
         if (refNode != null)
         {
            final MetadataElement refElement = new MetadataElement(element);  
            refElement.setIsRef(true);
            
            final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
            if (parentNodeWithName != null)
            {
               final Element parentElementWithName = (Element) parentNodeWithName;
               final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
               if (XsdElementEnum.attributeGroup.isTagNameEqual(parentElementWithName.getTagName())) 
               {                  
                  metadata.addGroupReference(groupOrClassName, refElement);
                  return true;
               }
               else
               {
                  metadata.addClassReference(groupOrClassName, refElement);
                  return true;
               }
            }
         }         
      }
      
      return false;
   }
}

