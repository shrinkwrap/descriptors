package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T14:39:12.971-04:00
 *
 * Original Documentation:
 *
 *
 * The following transaction isolation levels are allowed
 * (see documentation for the java.sql.Connection interface):
 * TRANSACTION_READ_UNCOMMITTED
 * TRANSACTION_READ_COMMITTED
 * TRANSACTION_REPEATABLE_READ
 * TRANSACTION_SERIALIZABLE
 *
 *
 *
 */
public enum IsolationLevelType {
   _TRANSACTION_READ_UNCOMMITTED("TRANSACTION_READ_UNCOMMITTED"), _TRANSACTION_READ_COMMITTED(
         "TRANSACTION_READ_COMMITTED"), _TRANSACTION_REPEATABLE_READ("TRANSACTION_REPEATABLE_READ"), _TRANSACTION_SERIALIZABLE(
         "TRANSACTION_SERIALIZABLE");

   private String value;

   IsolationLevelType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
