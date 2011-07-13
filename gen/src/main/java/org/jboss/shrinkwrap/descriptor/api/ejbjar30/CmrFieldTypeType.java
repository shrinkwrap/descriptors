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
 * This class implements the <code> cmr-field-typeType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The cmr-field-type element specifies the class of a <br> 
 * collection-valued logical relationship field in the entity <br> 
 * bean class. The value of an element using cmr-field-typeType <br> 
 * must be either: java.util.Collection or java.util.Set. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public enum CmrFieldTypeType {
   _JAVA_UTIL_COLLECTION("java.util.Collection"), _JAVA_UTIL_SET("java.util.Set");

   private String value;

   CmrFieldTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static CmrFieldTypeType getFromStringValue(String value)
   {
      for (CmrFieldTypeType type : CmrFieldTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
