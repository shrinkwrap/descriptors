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
package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class implements the <code> concurrent-lock-typeType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The concurrent-lock-typeType specifies how the container must <br> 
 * manage concurrent access to a method of a Singleton bean <br> 
 * with container-managed concurrency. <br> 
 *<br>
 * The container managed concurrency lock type must be one <br> 
 * of the following : <br> 
 *<br>
 * Read <br> 
 * Write <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public enum ConcurrentLockTypeType {
   _READ("Read"), _WRITE("Write");

   private String value;

   ConcurrentLockTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static ConcurrentLockTypeType getFromStringValue(String value)
   {
      for (ConcurrentLockTypeType type : ConcurrentLockTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
