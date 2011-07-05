package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The result-type-mappingType is used in the query element to
 * specify whether an abstract schema type returned by a query
 * for a select method is to be mapped to an EJBLocalObject or
 * EJBObject type.
 *
 * The value must be one of the following:
 *
 * Local
 * Remote
 *
 *
 *
 */
public enum ResultTypeMappingType
{
   _LOCAL("Local"),
   _REMOTE("Remote");

   private String value;

   ResultTypeMappingType (String value) { this.value = value; }

   public String toString() {return value;}

   public static ResultTypeMappingType getFromStringValue(String value)
   {
      for(ResultTypeMappingType type: ResultTypeMappingType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

