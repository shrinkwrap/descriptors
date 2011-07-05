package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The cmr-field-type element specifies the class of a
 * collection-valued logical relationship field in the entity
 * bean class. The value of an element using cmr-field-typeType
 * must be either: java.util.Collection or java.util.Set.
 *
 *
 *
 */
public enum CmrFieldTypeType
{
   _JAVA_UTIL_COLLECTION("java.util.Collection"),
   _JAVA_UTIL_SET("java.util.Set");

   private String value;

   CmrFieldTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static CmrFieldTypeType getFromStringValue(String value)
   {
      for(CmrFieldTypeType type: CmrFieldTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

