package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The cmp-versionType specifies the version of an entity bean
 * with container-managed persistence. It is used by
 * cmp-version elements.
 *
 * The value must be one of the two following:
 *
 * 1.x
 * 2.x
 *
 *
 *
 */
public enum CmpVersionType {
   _1_X("1.x"), _2_X("2.x");

   private String value;

   CmpVersionType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static CmpVersionType getFromStringValue(String value)
   {
      for (CmpVersionType type : CmpVersionType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
