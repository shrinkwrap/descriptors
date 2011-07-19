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
 * This class implements the <code> cmp-versionType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The cmp-versionType specifies the version of an entity bean <br> 
 * with container-managed persistence. It is used by <br> 
 * cmp-version elements. <br> 
 *<br>
 * The value must be one of the two following: <br> 
 *<br>
 * 1.x <br> 
 * 2.x <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public enum CmpVersionType {
   _1_X("1.x"), _2_X("2.x");

   private String value;

   CmpVersionType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static CmpVersionType getFromStringValue(String value)
   {
      for (CmpVersionType type : CmpVersionType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
