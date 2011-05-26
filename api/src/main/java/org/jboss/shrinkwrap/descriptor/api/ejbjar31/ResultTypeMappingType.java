package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum ResultTypeMappingType {
   _LOCAL("Local"), _REMOTE("Remote");

   private String value;

   ResultTypeMappingType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
