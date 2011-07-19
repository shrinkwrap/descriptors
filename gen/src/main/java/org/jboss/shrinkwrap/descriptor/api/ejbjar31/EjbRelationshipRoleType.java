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
 * This interface defines the contract for the <code> ejb-relationship-roleType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * [ <br> 
 * The ejb-relationship-roleType describes a role within a <br> 
 * relationship. There are two roles in each relationship. <br> 
 *<br>
 * The ejb-relationship-roleType contains an optional <br> 
 * description; an optional name for the relationship role; a <br> 
 * specification of the multiplicity of the role; an optional <br> 
 * specification of cascade-delete functionality for the role; <br> 
 * the role source; and a declaration of the cmr-field, if any, <br> 
 * by means of which the other side of the relationship is <br> 
 * accessed from the perspective of the role source. <br> 
 *<br>
 * The multiplicity and role-source element are mandatory. <br> 
 *<br>
 * The relationship-role-source element designates an entity <br> 
 * bean by means of an ejb-name element. For bidirectional <br> 
 * relationships, both roles of a relationship must declare a <br> 
 * relationship-role-source element that specifies a cmr-field <br> 
 * in terms of which the relationship is accessed. The lack of <br> 
 * a cmr-field element in an ejb-relationship-role specifies <br> 
 * that the relationship is unidirectional in navigability and <br> 
 * the entity bean that participates in the relationship is <br> 
 * "not aware" of the relationship. <br> 
 *<br>
 * Example: <br> 
 *<br>
 * <ejb-relation> <br> 
 * <ejb-relation-name>Product-LineItem</ejb-relation-name> <br> 
 * <ejb-relationship-role> <br> 
 * <ejb-relationship-role-name>product-has-lineitems <br> 
 * </ejb-relationship-role-name> <br> 
 * <multiplicity>One</multiplicity> <br> 
 * <relationship-role-source> <br> 
 * <ejb-name>ProductEJB</ejb-name> <br> 
 * </relationship-role-source> <br> 
 * </ejb-relationship-role> <br> 
 * </ejb-relation> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface EjbRelationshipRoleType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-relationship-role-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-relationship-role-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-relationship-role-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName);

   /**
    * Removes the <code>ejb-relationship-role-name</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> removeEjbRelationshipRoleName();

   /**
    * Returns the <code>ejb-relationship-role-name</code> element
    * @return the node defined for the element <code>ejb-relationship-role-name</code> 
    */
   public String getEjbRelationshipRoleName();

   // -------------------------------------------------------------------------------------||
   // Element type : multiplicity
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>multiplicity</code> element with the given value will be created.
    * Otherwise, the existing <code>multiplicity</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setMultiplicity(MultiplicityType multiplicity);

   /**
    * If not already created, a new <code>multiplicity</code> element with the given value will be created.
    * Otherwise, the existing <code>multiplicity</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setMultiplicity(String multiplicity);

   /**
    * Returns the <code>multiplicity</code> element
    * @return the node defined for the element <code>multiplicity</code> 
    */
   public MultiplicityType getMultiplicity();

   /**
    * Returns the <code>multiplicity</code> element
    * @return the node defined for the element <code>multiplicity</code> 
    */
   public String getMultiplicityAsString();

   public EjbRelationshipRoleType<T> cascadeDelete();

   public Boolean isCascadeDelete();

   // -------------------------------------------------------------------------------------||
   // Element type : relationship-role-source
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>relationship-role-source</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> removeRelationshipRoleSource();

   /**
    * If not already created, a new <code>relationship-role-source</code> element will be created and returned.
    * Otherwise, the existing <code>relationship-role-source</code> element will be returned.
    * @return the node defined for the element <code>relationship-role-source</code> 
    */
   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource();

   // -------------------------------------------------------------------------------------||
   // Element type : cmr-field
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>cmr-field</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> removeCmrField();

   /**
    * If not already created, a new <code>cmr-field</code> element will be created and returned.
    * Otherwise, the existing <code>cmr-field</code> element will be returned.
    * @return the node defined for the element <code>cmr-field</code> 
    */
   public CmrFieldType<EjbRelationshipRoleType<T>> cmrField();

}
