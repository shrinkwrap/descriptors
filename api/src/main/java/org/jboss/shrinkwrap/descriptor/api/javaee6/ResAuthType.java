package org.jboss.shrinkwrap.descriptor.api.javaee6;

public enum ResAuthType {
   _APPLICATION("Application"), _CONTAINER("Container");

   private String value;

   ResAuthType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
