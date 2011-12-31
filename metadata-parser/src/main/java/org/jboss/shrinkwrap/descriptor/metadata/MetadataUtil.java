package org.jboss.shrinkwrap.descriptor.metadata;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class MetadataUtil
{
   public static String getAttributeValue(final Element element, final String name)
   {
      final Node node = element.getAttributes().getNamedItem(name);
      if (node != null)
      {
         return node.getNodeValue();
      }
      
      return null;
   }
   
   public static Node getNextParentNodeWithAttr(final Node parent, final String attrName)
   {
      Node parentNode = parent;
      Element parendElement = (Element) parentNode;
      Node valueNode = parendElement.getAttributes().getNamedItem(attrName);
      while(valueNode == null)
      {
         parentNode = parentNode.getParentNode();
         if (parentNode != null)
         {
            if (parentNode.getNodeType() == Node.ELEMENT_NODE) 
            {
               parendElement = (Element) parentNode;
               valueNode = parendElement.getAttributes().getNamedItem(attrName);
            }
         }
         else
         {
            break;
         }
      }
      
      return parendElement;
   }
   
   public void print(final Metadata metadata)
   {
	   for (MetadataClass item: metadata.getGroupList())
	      {
	         System.out.println("--------------------------------------------");
	         System.out.println("Group: " + item.getName());         
	         for (MetadataElement element : item.getElements())
	         {
	            System.out.println("  Element  : " + element.getName());
	            System.out.println("  Type     : " + element.getType());
	            System.out.println("  MinOccurs: " + element.getMinOccurs());
	            System.out.println("  MaxOccurs: " + element.getMaxOccurs());
	            System.out.println("  IsAttr   : " + element.getIsAttribute());
	            System.out.println("");
	         }

	         for (MetadataElement element : item.getIncludes())
	         {
	            System.out.println("  Ref      : " + element.getRef());
	         }
	         System.out.println("");
	      }
	      
	      for (MetadataEnum enumItem: metadata.getEnumList())
	      {
	         System.out.println("--------------------------------------------");
	         System.out.println("Enum: " + enumItem.getName());         
	         for (String enumValue : enumItem.getValueList())
	         {
	            System.out.println("  Value    : " + enumValue);
	         }
	         System.out.println("");
	      }
	      
	      for (MetadataClass item: metadata.getClassList())
	      {
	         System.out.println("--------------------------------------------");
	         System.out.println("Class: " + item.getName());         
	         for (MetadataElement element : item.getElements())
	         {
	            System.out.println("  Element  : " + element.getName());
	            System.out.println("  Type     : " + element.getType());
	            System.out.println("  MinOccurs: " + element.getMinOccurs());
	            System.out.println("  MaxOccurs: " + element.getMaxOccurs());
	            System.out.println("  IsAttr   : " + element.getIsAttribute());
	            System.out.println("");
	         }

	         for (MetadataElement element : item.getIncludes())
	         {
	            System.out.println("  Ref      : " + element.getRef());
	         }
	         System.out.println("");
	      }
	      
	      for (MetadataType dataType: metadata.getDataTypeList())
	      {
	         System.out.println("--------------------------------------------");
	         System.out.println("Name    : " + dataType.getName());         
	         System.out.println("MappedTo: " + dataType.getMappedTo());    
	         System.out.println("");
	      }
   }
}
