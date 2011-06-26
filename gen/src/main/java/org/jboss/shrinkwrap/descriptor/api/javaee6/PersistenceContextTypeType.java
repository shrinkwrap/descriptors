package org.jboss.shrinkwrap.descriptor.api.javaee6; 

/**
 * This class is a generated class.
 * Generation date :2011-06-26T17:25:18.735-04:00
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
public enum PersistenceContextTypeType
{
   _TRANSACTION("Transaction"),
   _EXTENDED("Extended");

   private String value;

   PersistenceContextTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static PersistenceContextTypeType getFromStringValue(String value)
   {
      for(PersistenceContextTypeType type: PersistenceContextTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

