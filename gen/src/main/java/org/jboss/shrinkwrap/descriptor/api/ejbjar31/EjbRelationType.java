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
 * This interface defines the contract for the <code> ejb-relationType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The ejb-relationType describes a relationship between two <br> 
 * entity beans with container-managed persistence. It is used <br> 
 * by ejb-relation elements. It contains a description; an <br> 
 * optional ejb-relation-name element; and exactly two <br> 
 * relationship role declarations, defined by the <br> 
 * ejb-relationship-role elements. The name of the <br> 
 * relationship, if specified, is unique within the ejb-jar <br> 
 * file. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface EjbRelationType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-relation-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-relation-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-relation-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> setEjbRelationName(String ejbRelationName);

   /**
    * Removes the <code>ejb-relation-name</code> element 
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> removeEjbRelationName();

   /**
    * Returns the <code>ejb-relation-name</code> element
    * @return the node defined for the element <code>ejb-relation-name</code> 
    */
   public String getEjbRelationName();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-relationship-role
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ejb-relationship-role</code> element 
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> removeEjbRelationshipRole();

   /**
    * If not already created, a new <code>ejb-relationship-role</code> element will be created and returned.
    * Otherwise, the existing <code>ejb-relationship-role</code> element will be returned.
    * @return the node defined for the element <code>ejb-relationship-role</code> 
    */
   public EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole();

}
