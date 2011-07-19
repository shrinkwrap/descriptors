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
 * This interface defines the contract for the <code> form-login-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The form-login-configType specifies the login and error <br> 
 * pages that should be used in form based login. If form based <br> 
 * authentication is not used, these elements are ignored. <br> 
 *<br>
 * Used in: login-config <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface FormLoginConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : form-login-page
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>form-login-page</code> element with the given value will be created.
    * Otherwise, the existing <code>form-login-page</code> element will be updated with the given value.
    * @return the current instance of {@link FormLoginConfigType<T>} 
    */
   public FormLoginConfigType<T> setFormLoginPage(String formLoginPage);

   /**
    * Removes the <code>form-login-page</code> element 
    * @return the current instance of {@link FormLoginConfigType<T>} 
    */
   public FormLoginConfigType<T> removeFormLoginPage();

   /**
    * Returns the <code>form-login-page</code> element
    * @return the node defined for the element <code>form-login-page</code> 
    */
   public String getFormLoginPage();

   // -------------------------------------------------------------------------------------||
   // Element type : form-error-page
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>form-error-page</code> element with the given value will be created.
    * Otherwise, the existing <code>form-error-page</code> element will be updated with the given value.
    * @return the current instance of {@link FormLoginConfigType<T>} 
    */
   public FormLoginConfigType<T> setFormErrorPage(String formErrorPage);

   /**
    * Removes the <code>form-error-page</code> element 
    * @return the current instance of {@link FormLoginConfigType<T>} 
    */
   public FormLoginConfigType<T> removeFormErrorPage();

   /**
    * Returns the <code>form-error-page</code> element
    * @return the node defined for the element <code>form-error-page</code> 
    */
   public String getFormErrorPage();

}
