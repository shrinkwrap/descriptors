package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetadataEnum
{
   final private List<String> valueList = new ArrayList<String>();
   private String name;
   private String namespace;
   private String schemaName;
   private String packageApi;
   private String documentation;
   
   public MetadataEnum(final String name)
   {
      this.name = name;
   }
   
   public void addValue(String value)
   {
      valueList.add(value);
   }

   public List<String> getValueList()
   {
      return valueList;
   }

   public String getName()
   {
      return name;
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

   public String getPackageApi()
   {
      return packageApi;
   }

   public void setPackageApi(String packageApi)
   {
      this.packageApi = packageApi;
   }

   public String getDocumentation()
   {
      return documentation;
   }

   public void setDocumentation(String documentation)
   {
      this.documentation = documentation;
   }
   
} 
