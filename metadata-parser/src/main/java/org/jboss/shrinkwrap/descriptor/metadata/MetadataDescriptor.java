package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetadataDescriptor
{
   private String name;

   private String type;
   
   private String namespace;

   private String schemaName;

   private String packageApi;

   private String packageImpl;

   private final List<DescriptorNamespace> descrNamespaces = new ArrayList<DescriptorNamespace>();

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
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

   public String getPackageImpl()
   {
      return packageImpl;
   }

   public void setPackageImpl(final String packageImpl)
   {
      this.packageImpl = packageImpl;
   }

   public List<DescriptorNamespace> getDescrNamespaces()
   {
      return descrNamespaces;
   }

   public class DescriptorNamespace
   {
      private String name;

      private String value;

      public String getName()
      {
         return name;
      }

      public void setName(final String name)
      {
         this.name = name;
      }

      public String getValue()
      {
         return value;
      }

      public void setValue(final String value)
      {
         this.value = value;
      }

   }

//   public class DescriptorElement
//   {
//      private String name;
//
//      private String type;
//
//      private String defaultNamespaces;
//
//      public String getName()
//      {
//         return name;
//      }
//
//      public void setName(final String name)
//      {
//         this.name = name;
//      }
//
//      public String getType()
//      {
//         return type;
//      }
//
//      public void setType(final String type)
//      {
//         this.type = type;
//      }
//
//      public String getDefaultNamespaces()
//      {
//         return defaultNamespaces;
//      }
//
//      public void setDefaultNamespaces(final String defaultNamespaces)
//      {
//         this.defaultNamespaces = defaultNamespaces;
//      }
//
//   }
}
