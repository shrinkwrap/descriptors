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
 * This class implements the <code> persistence-typeType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The persistence-typeType specifies an entity bean's persistence <br> 
 * management type. <br> 
 *<br>
 * The persistence-type element must be one of the two following: <br> 
 *<br>
 * Bean <br> 
 * Container <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public enum PersistenceTypeType {
   _BEAN("Bean"), _CONTAINER("Container");

   private String value;

   PersistenceTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static PersistenceTypeType getFromStringValue(String value)
   {
      for (PersistenceTypeType type : PersistenceTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
