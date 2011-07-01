package org.jboss.shrinkwrap.descriptor.api.persistence20;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * public enum ValidationMode { AUTO, CALLBACK, NONE};
 *
 *
 *
 */
public enum PersistenceUnitValidationModeType {
   _AUTO("AUTO"), _CALLBACK("CALLBACK"), _NONE("NONE");

   private String value;

   PersistenceUnitValidationModeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static PersistenceUnitValidationModeType getFromStringValue(String value)
   {
      for (PersistenceUnitValidationModeType type : PersistenceUnitValidationModeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
