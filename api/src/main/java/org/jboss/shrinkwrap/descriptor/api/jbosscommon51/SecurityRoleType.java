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
package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> security-roleType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The security-role element contains the definition of a security role. <br> 
 * The definition consists of an the security role name and principal name element(s). <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface SecurityRoleType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link SecurityRoleType<T>} 
    */
   public SecurityRoleType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link SecurityRoleType<T>} 
    */
   public SecurityRoleType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link SecurityRoleType<T>} 
    */
   public SecurityRoleType<T> removeAllDescription();

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
    * @return the current instance of {@link SecurityRoleType<T>} 
    */
   public SecurityRoleType<T> setRoleName(String roleName);

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of {@link SecurityRoleType<T>} 
    */
   public SecurityRoleType<T> removeRoleName();

   /**
    * Returns the <code>role-name</code> element
    * @return the node defined for the element <code>role-name</code> 
    */
   public String getRoleName();

   // -------------------------------------------------------------------------------------||
   // Element type : principal-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>principal-name</code> element 
    * @return the current instance of {@link SecurityRoleType<T>} 
    */
   public SecurityRoleType<T> setPrincipalName(String principalName);

   /**
    * Creates for all String objects representing <code>principal-name</code> elements, 
    * a new <code>principal-name</code> element 
    * @param list of <code>principal-name</code> objects 
    * @return the current instance of {@link SecurityRoleType<T>} 
    */
   public SecurityRoleType<T> setPrincipalNameList(String... values);

   /**
    * Removes the <code>principal-name</code> element 
    * @return the current instance of {@link SecurityRoleType<T>} 
    */
   public SecurityRoleType<T> removeAllPrincipalName();

   /**
    * Returns all <code>principal-name</code> elements
    * @return list of <code>principal-name</code> 
    */
   public List<String> getPrincipalNameList();

}
