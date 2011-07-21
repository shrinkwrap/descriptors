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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> security-role-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The security-role-refType contains the declaration of a <br> 
 * security role reference in a component's or a <br> 
 * Deployment Component's code. The declaration consists of an <br> 
 * optional description, the security role name used in the <br> 
 * code, and an optional link to a security role. If the <br> 
 * security role is not specified, the Deployer must choose an <br> 
 * appropriate security role. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface SecurityRoleRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : role-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>role-name</code> element with the given value will be created.
    * Otherwise, the existing <code>role-name</code> element will be updated with the given value.
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> setRoleName(String roleName);

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> removeRoleName();

   /**
    * Returns the <code>role-name</code> element
    * @return the node defined for the element <code>role-name</code> 
    */
   public String getRoleName();

   // -------------------------------------------------------------------------------------||
   // Element type : role-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>role-link</code> element with the given value will be created.
    * Otherwise, the existing <code>role-link</code> element will be updated with the given value.
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> setRoleLink(String roleLink);

   /**
    * Removes the <code>role-link</code> element 
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> removeRoleLink();

   /**
    * Returns the <code>role-link</code> element
    * @return the node defined for the element <code>role-link</code> 
    */
   public String getRoleLink();

}
