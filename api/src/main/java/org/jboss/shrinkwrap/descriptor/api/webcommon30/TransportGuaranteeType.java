/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class implements the <code> transport-guaranteeType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The transport-guaranteeType specifies that the communication <br> 
 * between client and server should be NONE, INTEGRAL, or <br> 
 * CONFIDENTIAL. NONE means that the application does not <br> 
 * require any transport guarantees. A value of INTEGRAL means <br> 
 * that the application requires that the data sent between the <br> 
 * client and server be sent in such a way that it can't be <br> 
 * changed in transit. CONFIDENTIAL means that the application <br> 
 * requires that the data be transmitted in a fashion that <br> 
 * prevents other entities from observing the contents of the <br> 
 * transmission. In most cases, the presence of the INTEGRAL or <br> 
 * CONFIDENTIAL flag will indicate that the use of SSL is <br> 
 * required. <br> 
 *<br>
 * Used in: user-data-constraint <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
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
