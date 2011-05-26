package org.jboss.shrinkwrap.descriptor.api.webcommon30;

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
