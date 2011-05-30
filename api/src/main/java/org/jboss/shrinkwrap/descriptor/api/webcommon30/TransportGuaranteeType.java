package org.jboss.shrinkwrap.descriptor.api.webcommon30; 
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public enum TransportGuaranteeType
{
   _NONE("NONE"),
   _INTEGRAL("INTEGRAL"),
   _CONFIDENTIAL("CONFIDENTIAL");

   private String value;

   TransportGuaranteeType (String value) { this.value = value; }

   public String toString() {return value;}
}

