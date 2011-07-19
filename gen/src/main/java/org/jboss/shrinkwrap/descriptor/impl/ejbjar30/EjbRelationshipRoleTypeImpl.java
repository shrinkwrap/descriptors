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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.CmrFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MultiplicityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RelationshipRoleSourceType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> ejb-relationship-roleType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 *<br>
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
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class EjbRelationshipRoleTypeImpl<T> implements Child<T>, EjbRelationshipRoleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbRelationshipRoleTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public EjbRelationshipRoleTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-relationship-role-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-relationship-role-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-relationship-role-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName)
   {
      childNode.getOrCreate("ejb-relationship-role-name").text(ejbRelationshipRoleName);
      return this;
   }

   /**
    * Removes the <code>ejb-relationship-role-name</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> removeEjbRelationshipRoleName()
   {
      childNode.remove("ejb-relationship-role-name");
      return this;
   }

   /**
    * Returns the <code>ejb-relationship-role-name</code> element
    * @return the node defined for the element <code>ejb-relationship-role-name</code> 
    */
   public String getEjbRelationshipRoleName()
   {
      return childNode.textValue("ejb-relationship-role-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : multiplicity
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>multiplicity</code> element with the given value will be created.
    * Otherwise, the existing <code>multiplicity</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setMultiplicity(MultiplicityType multiplicity)
   {
      childNode.getOrCreate("multiplicity").text(multiplicity);
      return this;
   }

   /**
    * If not already created, a new <code>multiplicity</code> element with the given value will be created.
    * Otherwise, the existing <code>multiplicity</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> setMultiplicity(String multiplicity)
   {
      childNode.getOrCreate("multiplicity").text(multiplicity);
      return this;
   }

   /**
    * Returns the <code>multiplicity</code> element
    * @return the node defined for the element <code>multiplicity</code> 
    */
   public MultiplicityType getMultiplicity()
   {
      return MultiplicityType.getFromStringValue(childNode.textValue("multiplicity"));
   }

   /**
    * Returns the <code>multiplicity</code> element
    * @return the node defined for the element <code>multiplicity</code> 
    */
   public String getMultiplicityAsString()
   {
      return childNode.textValue("multiplicity");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cascade-delete
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRelationshipRoleType<T> cascadeDelete()
   {
      childNode.getOrCreate("cascade-delete");
      return this;
   }

   public Boolean isCascadeDelete()
   {
      return childNode.getSingle("cascade-delete") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : relationship-role-source
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>relationship-role-source</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> removeRelationshipRoleSource()
   {
      childNode.remove("relationship-role-source");
      return this;
   }

   /**
    * If not already created, a new <code>relationship-role-source</code> element will be created and returned.
    * Otherwise, the existing <code>relationship-role-source</code> element will be returned.
    * @return the node defined for the element <code>relationship-role-source</code> 
    */
   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource()
   {
      Node node = childNode.getOrCreate("relationship-role-source");
      RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource = new RelationshipRoleSourceTypeImpl<EjbRelationshipRoleType<T>>(
            this, "relationship-role-source", childNode, node);
      return relationshipRoleSource;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cmr-field
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>cmr-field</code> element 
    * @return the current instance of {@link EjbRelationshipRoleType<T>} 
    */
   public EjbRelationshipRoleType<T> removeCmrField()
   {
      childNode.remove("cmr-field");
      return this;
   }

   /**
    * If not already created, a new <code>cmr-field</code> element will be created and returned.
    * Otherwise, the existing <code>cmr-field</code> element will be returned.
    * @return the node defined for the element <code>cmr-field</code> 
    */
   public CmrFieldType<EjbRelationshipRoleType<T>> cmrField()
   {
      Node node = childNode.getOrCreate("cmr-field");
      CmrFieldType<EjbRelationshipRoleType<T>> cmrField = new CmrFieldTypeImpl<EjbRelationshipRoleType<T>>(this,
            "cmr-field", childNode, node);
      return cmrField;
   }

}
