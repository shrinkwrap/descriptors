package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * The transaction-typeType specifies an enterprise bean's
 * transaction management type.
 *
 * The transaction-type must be one of the two following:
 *
 * Bean
 * Container
 *
 *
 *
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

   public static TransactionTypeType getFromStringValue(String value)
   {
      for (TransactionTypeType type : TransactionTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
