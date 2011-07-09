package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The persistence-typeType specifies an entity bean's persistence
 * management type.
 *
 * The persistence-type element must be one of the two following:
 *
 * Bean
 * Container
 *
 *
 *
 */
public enum PersistenceTypeType {
   _BEAN("Bean"), _CONTAINER("Container");

   private String value;

   PersistenceTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static PersistenceTypeType getFromStringValue(String value)
   {
      for (PersistenceTypeType type : PersistenceTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
