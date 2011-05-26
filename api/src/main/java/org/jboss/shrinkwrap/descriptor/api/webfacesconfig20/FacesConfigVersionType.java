package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

public enum FacesConfigVersionType {
   _2_0("2.0");

   private String value;

   FacesConfigVersionType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
