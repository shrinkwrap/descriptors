package org.jboss.shrinkwrap.descriptor.api.javaee6;

public enum PersistenceContextTypeType {
   _TRANSACTION("Transaction"), _EXTENDED("Extended");

   private String value;

   PersistenceContextTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
