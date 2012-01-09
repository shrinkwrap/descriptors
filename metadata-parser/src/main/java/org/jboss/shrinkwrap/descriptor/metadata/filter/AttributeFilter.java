package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

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

