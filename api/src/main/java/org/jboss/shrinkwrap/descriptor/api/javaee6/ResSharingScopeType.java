package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T12:04:36.305-04:00
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
}
