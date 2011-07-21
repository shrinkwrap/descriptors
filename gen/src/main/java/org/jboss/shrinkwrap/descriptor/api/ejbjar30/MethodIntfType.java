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
 * This class implements the <code> method-intfType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The method-intf element allows a method element to <br> 
 * differentiate between the methods with the same name and <br> 
 * signature that are multiply defined across the home and <br> 
 * component interfaces (e.g, in both an enterprise bean's <br> 
 * remote and local interfaces or in both an enterprise bean's <br> 
 * home and remote interfaces, etc.); the component and web <br> 
 * service endpoint interfaces, and so on. The Local applies to <br> 
 * both local component interface and local business interface. <br> 
 * Similarly, Remote applies to both remote component interface <br> 
 * and the remote business interface. <br> 
 *<br>
 * The method-intf element must be one of the following: <br> 
 *<br>
 * Home <br> 
 * Remote <br> 
 * LocalHome <br> 
 * Local <br> 
 * ServiceEndpoint <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public enum MethodIntfType {
   _HOME("Home"), _REMOTE("Remote"), _LOCALHOME("LocalHome"), _LOCAL("Local"), _SERVICEENDPOINT("ServiceEndpoint");

   private String value;

   MethodIntfType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static MethodIntfType getFromStringValue(String value)
   {
      for (MethodIntfType type : MethodIntfType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
