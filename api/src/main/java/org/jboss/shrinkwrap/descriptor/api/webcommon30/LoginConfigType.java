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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> login-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The login-configType is used to configure the authentication <br> 
 * method that should be used, the realm name that should be <br> 
 * used for this application, and the attributes that are <br> 
 * needed by the form login mechanism. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface LoginConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : auth-method
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>auth-method</code> element with the given value will be created.
    * Otherwise, the existing <code>auth-method</code> element will be updated with the given value.
    * @return the current instance of {@link LoginConfigType<T>} 
    */
   public LoginConfigType<T> setAuthMethod(String authMethod);

   /**
    * Removes the <code>auth-method</code> element 
    * @return the current instance of {@link LoginConfigType<T>} 
    */
   public LoginConfigType<T> removeAuthMethod();

   /**
    * Returns the <code>auth-method</code> element
    * @return the node defined for the element <code>auth-method</code> 
    */
   public String getAuthMethod();

   // -------------------------------------------------------------------------------------||
   // Element type : realm-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>realm-name</code> element with the given value will be created.
    * Otherwise, the existing <code>realm-name</code> element will be updated with the given value.
    * @return the current instance of {@link LoginConfigType<T>} 
    */
   public LoginConfigType<T> setRealmName(String realmName);

   /**
    * Removes the <code>realm-name</code> element 
    * @return the current instance of {@link LoginConfigType<T>} 
    */
   public LoginConfigType<T> removeRealmName();

   /**
    * Returns the <code>realm-name</code> element
    * @return the node defined for the element <code>realm-name</code> 
    */
   public String getRealmName();

   // -------------------------------------------------------------------------------------||
   // Element type : form-login-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>form-login-config</code> element 
    * @return the current instance of {@link LoginConfigType<T>} 
    */
   public LoginConfigType<T> removeFormLoginConfig();

   /**
    * If not already created, a new <code>form-login-config</code> element will be created and returned.
    * Otherwise, the existing <code>form-login-config</code> element will be returned.
    * @return the node defined for the element <code>form-login-config</code> 
    */
   public FormLoginConfigType<LoginConfigType<T>> formLoginConfig();

}
