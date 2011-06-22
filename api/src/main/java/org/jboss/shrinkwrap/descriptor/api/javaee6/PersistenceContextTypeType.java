package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T12:04:36.305-04:00
 *
 * Original Documentation:
 *
 *
 * The persistence-context-typeType specifies the transactional
 * nature of a persistence context reference.
 *
 * The value of the persistence-context-type element must be
 * one of the following:
 * Transaction
 * Extended
 *
 *
 *
 */
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
