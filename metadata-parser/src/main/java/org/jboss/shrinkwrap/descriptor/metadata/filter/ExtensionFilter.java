package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataType;
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
      
      if (XsdElementEnum.restriction.isTagNameEqual(element.getTagName())) 
      {
         if(!hasNestedElement(parent, XsdElementEnum.enumeration))
         {         
            final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
            if (parentNodeWithName != null)
            {
               final Element parentElementWithName = (Element) parentNodeWithName;
               final String dataTypeName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
               if(dataTypeName != null)
               {
                  final String type = MetadataUtil.getAttributeValue(element, "base");
                  
                  if (type != null) 
                  {
                     final MetadataType dataType = new MetadataType();
                     dataType.setName(dataTypeName);
                     dataType.setMappedTo(type);
                     dataType.setNamespace(metadata.getCurrentNamespace());
                     dataType.setSchemaName(metadata.getCurrentSchmema());
                     metadata.getDataTypeList().add(dataType);
                     return true;
                  }                
               }
            }
         }
      }
      return false;
   }
   
   
   private boolean hasNestedElement(final Node parent, final XsdElementEnum elementType)
   {
      if (parent.hasChildNodes())
      {
         for (int i=0; i<parent.getChildNodes().getLength(); i++)    
         {
            final Node childNode = parent.getChildNodes().item(i);
            if (childNode.getNodeType() == Node.ELEMENT_NODE)
            {
               final Element childElement = (Element) childNode;
               if (elementType.isTagNameEqual(childElement.getTagName())) 
               {
                  return true;
               }
            }
         }
      }
      return false;
   }
}

