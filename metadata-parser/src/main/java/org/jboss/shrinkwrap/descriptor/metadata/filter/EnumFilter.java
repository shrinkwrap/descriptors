package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;


/**
 * Class which is responsible for handling group tags.
 */
public class EnumFilter implements Filter
{
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;
      
      if (XsdElementEnum.enumeration.isTagNameEqual(element.getTagName())) 
      {
         final Node valueNode = element.getAttributes().getNamedItem("value");         
         if (valueNode != null)
         { 
            final String enumValue = valueNode.getNodeValue();
            final Node simpleTypeNode = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
            if (simpleTypeNode != null)
            {
               final Element parentElementWithName = (Element) simpleTypeNode;
               final String enumName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
               metadata.addEnumValue(enumName, enumValue);
               return true;
            }
         }         
      }
      
      return false;
   }
   
}

