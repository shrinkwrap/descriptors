package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum TransAttributeType {
   _NOTSUPPORTED("NotSupported"), _SUPPORTS("Supports"), _REQUIRED("Required"), _REQUIRESNEW("RequiresNew"), _MANDATORY(
         "Mandatory"), _NEVER("Never");

   private String value;

   TransAttributeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
