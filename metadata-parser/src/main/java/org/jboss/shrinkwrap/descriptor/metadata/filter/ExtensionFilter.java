package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataClass;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

public class ExtensionFilter implements Filter
{
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;
      
      if (XsdElementEnum.extension.isTagNameEqual(element.getTagName())) 
      {
         final String baseStr = MetadataUtil.getAttributeValue(element, "base");
         if (baseStr != null)
         {
            for (MetadataClass metadataClass: metadata.getClassList())
            {
               if (metadataClass.getName().equals(baseStr))
               {
                  final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
                  if (parentNodeWithName != null)
                  {
                     final Element parentElementWithName = (Element) parentNodeWithName;
                     final String className = MetadataUtil.getAttributeValue(parentElementWithName, "name");
                     if (className != null)
                     {
                        for (MetadataElement metadataElement: metadataClass.getElements())
                        {                     
                           metadata.addClassElement(className, metadataElement);
                        }
                     }
                  }
                  
                  return true;
               }
            }
         }  
      }
      
      return false;
   }
   
}

