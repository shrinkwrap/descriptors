package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The trans-attributeType specifies how the container must
 * manage the transaction boundaries when delegating a method
 * invocation to an enterprise bean's business method.
 *
 * The value must be one of the following:
 *
 * NotSupported
 * Supports
 * Required
 * RequiresNew
 * Mandatory
 * Never
 *
 *
 *
 */
public enum TransAttributeType {
   _NOTSUPPORTED("NotSupported"), _SUPPORTS("Supports"), _REQUIRED("Required"), _REQUIRESNEW("RequiresNew"), _MANDATORY(
         "Mandatory"), _NEVER("Never");

   private String value;

   TransAttributeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static TransAttributeType getFromStringValue(String value)
   {
      for (TransAttributeType type : TransAttributeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
