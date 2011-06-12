package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
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

