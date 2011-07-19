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
 * This interface defines the contract for the <code> security-constraintType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The security-constraintType is used to associate <br> 
 * security constraints with one or more web resource <br> 
 * collections <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface SecurityConstraintType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link SecurityConstraintType<T>} 
    */
   public SecurityConstraintType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link SecurityConstraintType<T>} 
    */
   public SecurityConstraintType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link SecurityConstraintType<T>} 
    */
   public SecurityConstraintType<T> removeAllDisplayName();

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList();

   // -------------------------------------------------------------------------------------||
   // Element type : web-resource-collection
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>web-resource-collection</code> elements 
    * @return the current instance of {@link SecurityConstraintType<T>} 
    */
   public SecurityConstraintType<T> removeAllWebResourceCollection();

   /**
    * Returns the <code>web-resource-collection</code> element
    * @return the node defined for the element <code>web-resource-collection</code> 
    */
   public WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection();

   /**
    * Returns all <code>web-resource-collection</code> elements
    * @return list of <code>web-resource-collection</code> 
    */
   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getWebResourceCollectionList();

   // -------------------------------------------------------------------------------------||
   // Element type : auth-constraint
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>auth-constraint</code> element 
    * @return the current instance of {@link SecurityConstraintType<T>} 
    */
   public SecurityConstraintType<T> removeAuthConstraint();

   /**
    * If not already created, a new <code>auth-constraint</code> element will be created and returned.
    * Otherwise, the existing <code>auth-constraint</code> element will be returned.
    * @return the node defined for the element <code>auth-constraint</code> 
    */
   public AuthConstraintType<SecurityConstraintType<T>> authConstraint();

   // -------------------------------------------------------------------------------------||
   // Element type : user-data-constraint
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>user-data-constraint</code> element 
    * @return the current instance of {@link SecurityConstraintType<T>} 
    */
   public SecurityConstraintType<T> removeUserDataConstraint();

   /**
    * If not already created, a new <code>user-data-constraint</code> element will be created and returned.
    * Otherwise, the existing <code>user-data-constraint</code> element will be returned.
    * @return the node defined for the element <code>user-data-constraint</code> 
    */
   public UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint();

}
