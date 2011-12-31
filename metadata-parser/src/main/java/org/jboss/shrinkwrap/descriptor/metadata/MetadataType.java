package org.jboss.shrinkwrap.descriptor.metadata;


public class MetadataType
{
   private String name; 
   private String mappedTo;
   private String namespace;
   private String schemaName;
   
   public MetadataType()
   {      
   }
   
   public MetadataType(final String name, final String mappedTo, final String namespace, final String schemaName)
   {
      this.name = name;
      this.mappedTo = mappedTo;
      this.namespace = namespace;
      this.schemaName = schemaName;
          
      if (mappedTo != null)
      {
    	  this.mappedTo = mappedTo.replace("xs:", "xsd:");
      }
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getMappedTo()
   {
      return mappedTo;
   }
   
   public void setMappedTo(String mappedTo)
   {
	   this.mappedTo = mappedTo.replace("xs:", "xsd:");
   }
   
   public String getNamespace()
   {
      return namespace;
   }
   
   public void setNamespace(String namespace)
   {
      this.namespace = namespace;
   }
   
   public String getSchemaName()
   {
      return schemaName;
   }
   
   public void setSchemaName(String schemaName)
   {
      this.schemaName = schemaName;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   
}
