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
 * This class implements the <code> res-authType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The res-authType specifies whether the Deployment Component <br> 
 * code signs on programmatically to the resource manager, or <br> 
 * whether the Container will sign on to the resource manager <br> 
 * on behalf of the Deployment Component. In the latter case, <br> 
 * the Container uses information that is supplied by the <br> 
 * Deployer. <br> 
 *<br>
 * The value must be one of the two following: <br> 
 *<br>
 * Application <br> 
 * Container <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public enum ResAuthType {
   _APPLICATION("Application"), _CONTAINER("Container");

   private String value;

   ResAuthType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static ResAuthType getFromStringValue(String value)
   {
      for (ResAuthType type : ResAuthType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
