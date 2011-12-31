package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetadataItem
{
   private String name;
   private String namespace;
   private String schemaName;
   private String packageApi;
   private String packageName;
   private String documentation;
   
   private final List<MetadataElement> elements = new ArrayList<MetadataElement>();
   private final List<MetadataElement> references = new ArrayList<MetadataElement>();
   
   public MetadataItem(final String name)
   {
      this.name = name;
   }
   
   public List<MetadataElement> getElements()
   {
      return elements;
   }
   
   public List<MetadataElement> getReferences()
   {
      return references;
   }

   public String getName()
   {
      return name;
   }
   
   public void setName(final String name)
   {
      this.name = name;
   }
   
   public String getNamespace()
   {
      return namespace;
   }
   
   public void setNamespace(final String namespace)
   {
      this.namespace = namespace;
   }
   
   public String getSchemaName()
   {
      return schemaName;
   }
   
   public void setSchemaName(final String schemaName)
   {
      this.schemaName = schemaName;
   }
   
   public String getPackageApi()
   {
      return packageApi;
   }
   
   public void setPackageApi(final String packageApi)
   {
      this.packageApi = packageApi;
   }
   
   public String getPackageName()
   {
      return packageName;
   }
   
   public void setPackageName(final String packageName)
   {
      this.packageName = packageName;
   }
   
   public String getDocumentation()
   {
      return documentation;
   }
   
   public void setDocumentation(final String documentation)
   {
      this.documentation = documentation;
   }
   
   
}
