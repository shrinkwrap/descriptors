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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> method-permissionType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The method-permissionType specifies that one or more <br> 
 * security roles are allowed to invoke one or more enterprise <br> 
 * bean methods. The method-permissionType consists of an <br> 
 * optional description, a list of security role names or an <br> 
 * indicator to state that the method is unchecked for <br> 
 * authorization, and a list of method elements. <br> 
 *<br>
 * The security roles used in the method-permissionType <br> 
 * must be defined in the security-role elements of the <br> 
 * deployment descriptor, and the methods must be methods <br> 
 * defined in the enterprise bean's business, home, component <br> 
 * and/or web service endpoint interfaces. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface MethodPermissionType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> removeAllMethod();

   /**
    * Returns the <code>method</code> element
    * @return the node defined for the element <code>method</code> 
    */
   public MethodType<MethodPermissionType<T>> method();

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<MethodPermissionType<T>>> getMethodList();

   // -------------------------------------------------------------------------------------||
   // Element type : role-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>role-name</code> element 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> setRoleName(String roleName);

   /**
    * Creates for all String objects representing <code>role-name</code> elements, 
    * a new <code>role-name</code> element 
    * @param list of <code>role-name</code> objects 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> setRoleNameList(String... values);

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> removeAllRoleName();

   /**
    * Returns all <code>role-name</code> elements
    * @return list of <code>role-name</code> 
    */
   public List<String> getRoleNameList();

   public MethodPermissionType<T> unchecked();

   public Boolean isUnchecked();
}
