package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

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
