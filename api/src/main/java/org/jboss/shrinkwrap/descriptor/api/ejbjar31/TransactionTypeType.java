package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum TransactionTypeType {
   _BEAN("Bean"), _CONTAINER("Container");

   private String value;

   TransactionTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
