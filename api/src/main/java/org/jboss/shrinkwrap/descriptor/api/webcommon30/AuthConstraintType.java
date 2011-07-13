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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> auth-constraintType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The auth-constraintType indicates the user roles that <br> 
 * should be permitted access to this resource <br> 
 * collection. The role-name used here must either correspond <br> 
 * to the role-name of one of the security-role elements <br> 
 * defined for this web application, or be the specially <br> 
 * reserved role-name "*" that is a compact syntax for <br> 
 * indicating all roles in the web application. If both "*" <br> 
 * and rolenames appear, the container interprets this as all <br> 
 * roles. If no roles are defined, no user is allowed access <br> 
 * to the portion of the web application described by the <br> 
 * containing security-constraint. The container matches <br> 
 * role names case sensitively when determining access. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface AuthConstraintType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : role-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>role-name</code> element 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> setRoleName(String roleName);

   /**
    * Creates for all String objects representing <code>role-name</code> elements, 
    * a new <code>role-name</code> element 
    * @param list of <code>role-name</code> objects 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> setRoleNameList(String... values);

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> removeAllRoleName();

   /**
    * Returns all <code>role-name</code> elements
    * @return list of <code>role-name</code> 
    */
   public List<String> getRoleNameList();

}
