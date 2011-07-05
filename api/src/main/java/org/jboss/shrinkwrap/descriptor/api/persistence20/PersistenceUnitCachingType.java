package org.jboss.shrinkwrap.descriptor.api.persistence20;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * public enum SharedCacheMode { ALL, NONE, ENABLE_SELECTIVE, DISABLE_SELECTIVE, UNSPECIFIED};
 *
 *
 *
 */
public enum PersistenceUnitCachingType {
   _ALL("ALL"), _NONE("NONE"), _ENABLE_SELECTIVE("ENABLE_SELECTIVE"), _DISABLE_SELECTIVE("DISABLE_SELECTIVE"), _UNSPECIFIED(
         "UNSPECIFIED");

   private String value;

   PersistenceUnitCachingType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static PersistenceUnitCachingType getFromStringValue(String value)
   {
      for (PersistenceUnitCachingType type : PersistenceUnitCachingType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
