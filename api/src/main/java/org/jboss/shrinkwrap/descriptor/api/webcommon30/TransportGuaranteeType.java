package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:26:42.686-04:00
 *
 * Original Documentation:
 *
 *
 * The transport-guaranteeType specifies that the communication
 * between client and server should be NONE, INTEGRAL, or
 * CONFIDENTIAL. NONE means that the application does not
 * require any transport guarantees. A value of INTEGRAL means
 * that the application requires that the data sent between the
 * client and server be sent in such a way that it can't be
 * changed in transit. CONFIDENTIAL means that the application
 * requires that the data be transmitted in a fashion that
 * prevents other entities from observing the contents of the
 * transmission. In most cases, the presence of the INTEGRAL or
 * CONFIDENTIAL flag will indicate that the use of SSL is
 * required.
 *
 * Used in: user-data-constraint
 *
 *
 *
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

   public static TransportGuaranteeType getFromStringValue(String value)
   {
      for (TransportGuaranteeType type : TransportGuaranteeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
