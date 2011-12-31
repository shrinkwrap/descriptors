package org.jboss.shrinkwrap.descriptor.metadata;


public class MetadataPackage
{
   private String api;
   private String impl;
   private String schema;
   
   public String getApi()
   {
      return api;
   }
   
   public void setApi(final String api)
   {
      this.api = api;
   }
   
   public String getImpl()
   {
      return impl;
   }
   
   public void setImpl(final String impl)
   {
      this.impl = impl;
   }

   public String getSchema()
   {
      return schema;
   }

   public void setSchema(final String schema)
   {
      this.schema = schema;
   }
   
   
}
