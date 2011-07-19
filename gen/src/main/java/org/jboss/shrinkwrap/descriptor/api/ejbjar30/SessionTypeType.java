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
package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

/**
 * This class implements the <code> session-typeType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The session-typeType describes whether the session bean is a <br> 
 * stateful session or stateless session. It is used by <br> 
 * session-type elements. <br> 
 *<br>
 * The value must be one of the two following: <br> 
 *<br>
 * Stateful <br> 
 * Stateless <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public enum SessionTypeType {
   _STATEFUL("Stateful"), _STATELESS("Stateless");

   private String value;

   SessionTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static SessionTypeType getFromStringValue(String value)
   {
      for (SessionTypeType type : SessionTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
