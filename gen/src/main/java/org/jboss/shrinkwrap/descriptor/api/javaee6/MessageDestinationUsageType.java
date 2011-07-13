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
package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class implements the <code> message-destination-usageType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The message-destination-usageType specifies the use of the <br> 
 * message destination indicated by the reference. The value <br> 
 * indicates whether messages are consumed from the message <br> 
 * destination, produced for the destination, or both. The <br> 
 * Assembler makes use of this information in linking producers <br> 
 * of a destination with its consumers. <br> 
 *<br>
 * The value of the message-destination-usage element must be <br> 
 * one of the following: <br> 
 * Consumes <br> 
 * Produces <br> 
 * ConsumesProduces <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public enum MessageDestinationUsageType {
   _CONSUMES("Consumes"), _PRODUCES("Produces"), _CONSUMESPRODUCES("ConsumesProduces");

   private String value;

   MessageDestinationUsageType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static MessageDestinationUsageType getFromStringValue(String value)
   {
      for (MessageDestinationUsageType type : MessageDestinationUsageType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
