package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public enum TransportGuaranteeType {
   _NONE("NONE"), _INTEGRAL("INTEGRAL"), _CONFIDENTIAL("CONFIDENTIAL");

   private String value;

   TransportGuaranteeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
