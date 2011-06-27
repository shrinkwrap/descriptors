package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:26:42.686-04:00
 *
 * Original Documentation:
 *
 *
 * The res-sharing-scope type specifies whether connections
 * obtained through the given resource manager connection
 * factory reference can be shared. The value, if specified,
 * must be one of the two following:
 *
 * Shareable
 * Unshareable
 *
 * The default value is Shareable.
 *
 *
 *
 */
public enum ResSharingScopeType {
   _SHAREABLE("Shareable"), _UNSHAREABLE("Unshareable");

   private String value;

   ResSharingScopeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static ResSharingScopeType getFromStringValue(String value)
   {
      for (ResSharingScopeType type : ResSharingScopeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
