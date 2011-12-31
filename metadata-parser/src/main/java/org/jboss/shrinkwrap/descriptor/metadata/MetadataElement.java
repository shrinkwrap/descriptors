package org.jboss.shrinkwrap.descriptor.metadata;

import org.w3c.dom.Element;

public class MetadataElement
{
   private String name; 
   private String type;
   private String ref;
   private boolean isAttribute;
   private boolean isRef;
   private String minOccurs;
   private String maxOccurs;
   private String mappedTo;
      
   public MetadataElement()
   {      
   }
   
   public MetadataElement(final Element element)
   {
      name = MetadataUtil.getAttributeValue(element, "name");
      type = MetadataUtil.getAttributeValue(element, "type");
      ref = MetadataUtil.getAttributeValue(element, "ref");
      minOccurs = MetadataUtil.getAttributeValue(element, "minOccurs");
      maxOccurs = MetadataUtil.getAttributeValue(element, "maxOccurs");
      
      if (type == null)
      {
         type=name;  // TODO with namespace
      }
      
      if (type != null)
      {
    	  type = type.replace("xs:", "xsd:");
      }
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setName(final String name)
   {
      this.name = name;
   }
   
   public String getType()
   {
      return type;
   }
   
   public void setType(final String type)
   {
      this.type = type;
   }
   
   public boolean getIsAttribute()
   {
      return isAttribute;
   }
   
   public void setIsAttribute(final boolean isAttribute)
   {
      this.isAttribute = isAttribute;
   }
   
   public String getMinOccurs()
   {
      return minOccurs;
   }
   
   public void setMinOccurs(final String minOccurs)
   {
      this.minOccurs = minOccurs;
   }
   
   public String getMaxOccurs()
   {
      return maxOccurs;
   }
   
   public void setMaxOccurs(final String maxOccurs)
   {
      this.maxOccurs = maxOccurs;
   }

   public String getRef()
   {
      return ref;
   }

   public void setRef(final String ref)
   {
      this.ref = ref;
      this.isRef = true;
   }

   public boolean isRef()
   {
      return isRef;
   }

   public void setIsRef(final boolean isRef)
   {
      this.isRef = isRef;
   }

   public String getMappedTo()
   {
      return mappedTo;
   }

   public void setMappedTo(final String mappedTo)
   {
      this.mappedTo = mappedTo;
   }
   
   
}
