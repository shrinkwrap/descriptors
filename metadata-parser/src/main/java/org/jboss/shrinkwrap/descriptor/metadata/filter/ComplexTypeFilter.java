package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataType;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

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
    	  
    	  if (typeStr == null  && !element.hasChildNodes())
		  {
			  // may an unconstrained element of anyType, declare it as a string
			  final String dataTypeName = MetadataUtil.getAttributeValue(element, "name");
			  final MetadataType dataType = new MetadataType();
              dataType.setName(dataTypeName);
              dataType.setMappedTo("xs:string");
              dataType.setNamespace(metadata.getCurrentNamespace());
              dataType.setSchemaName(metadata.getCurrentSchmema());
              metadata.getDataTypeList().add(dataType);
              
              if (dataTypeName.toLowerCase().contains("boolean"))
              {
                 dataType.setMappedTo("javaee:emptyType");
              }
              
              return true;
    	  }    	  
      }
      return false;
   }
   
   
}

