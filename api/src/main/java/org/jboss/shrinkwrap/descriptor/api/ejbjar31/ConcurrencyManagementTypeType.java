package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The concurrency-management-typeType specifies the way concurrency
 * is managed for a singleton or stateful session bean.
 *
 * The concurrency management type must be one of the following:
 *
 * Bean
 * Container
 *
 * Bean managed concurrency can only be specified for a singleton bean.
 *
 *
 *
 */
public enum ConcurrencyManagementTypeType {
   _BEAN("Bean"), _CONTAINER("Container");

   private String value;

   ConcurrencyManagementTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static ConcurrencyManagementTypeType getFromStringValue(String value)
   {
      for (ConcurrencyManagementTypeType type : ConcurrencyManagementTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
