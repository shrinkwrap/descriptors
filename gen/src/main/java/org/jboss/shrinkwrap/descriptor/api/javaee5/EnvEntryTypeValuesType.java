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
package org.jboss.shrinkwrap.descriptor.api.javaee5;

/**
 * This class implements the <code> env-entry-type-valuesType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 *<br>
 * This type contains the fully-qualified Java type of the <br> 
 * environment entry value that is expected by the <br> 
 * application's code. <br> 
 *<br>
 * The following are the legal values of env-entry-type-valuesType: <br> 
 *<br>
 * java.lang.Boolean <br> 
 * java.lang.Byte <br> 
 * java.lang.Character <br> 
 * java.lang.String <br> 
 * java.lang.Short <br> 
 * java.lang.Integer <br> 
 * java.lang.Long <br> 
 * java.lang.Float <br> 
 * java.lang.Double <br> 
 *<br>
 * Example: <br> 
 *<br>
 * <env-entry-type>java.lang.Boolean</env-entry-type> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public enum EnvEntryTypeValuesType {
   _JAVA_LANG_BOOLEAN("java.lang.Boolean"), _JAVA_LANG_BYTE("java.lang.Byte"), _JAVA_LANG_CHARACTER(
         "java.lang.Character"), _JAVA_LANG_STRING("java.lang.String"), _JAVA_LANG_SHORT("java.lang.Short"), _JAVA_LANG_INTEGER(
         "java.lang.Integer"), _JAVA_LANG_LONG("java.lang.Long"), _JAVA_LANG_FLOAT("java.lang.Float"), _JAVA_LANG_DOUBLE(
         "java.lang.Double");

   private String value;

   EnvEntryTypeValuesType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static EnvEntryTypeValuesType getFromStringValue(String value)
   {
      for (EnvEntryTypeValuesType type : EnvEntryTypeValuesType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
