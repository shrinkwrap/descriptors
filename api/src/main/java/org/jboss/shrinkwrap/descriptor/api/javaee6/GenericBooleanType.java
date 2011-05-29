package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public enum GenericBooleanType {
   _TRUE("true"), _FALSE("false"), _YES("yes"), _NO("no");

   private String value;

   GenericBooleanType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
