package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20;

public enum FaceletTaglibVersionType {
   _2_0("2.0");

   private String value;

   FaceletTaglibVersionType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
