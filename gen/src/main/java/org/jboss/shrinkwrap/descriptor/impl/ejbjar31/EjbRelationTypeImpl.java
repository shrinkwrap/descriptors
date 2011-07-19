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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> ejb-relationType </code> xsd type 
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
public class EjbRelationTypeImpl<T> implements Child<T>, EjbRelationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbRelationTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public EjbRelationTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> removeAllDescription()
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
   // Element type : ejb-relation-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-relation-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-relation-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> setEjbRelationName(String ejbRelationName)
   {
      childNode.getOrCreate("ejb-relation-name").text(ejbRelationName);
      return this;
   }

   /**
    * Removes the <code>ejb-relation-name</code> element 
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> removeEjbRelationName()
   {
      childNode.remove("ejb-relation-name");
      return this;
   }

   /**
    * Returns the <code>ejb-relation-name</code> element
    * @return the node defined for the element <code>ejb-relation-name</code> 
    */
   public String getEjbRelationName()
   {
      return childNode.textValue("ejb-relation-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-relationship-role
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ejb-relationship-role</code> element 
    * @return the current instance of {@link EjbRelationType<T>} 
    */
   public EjbRelationType<T> removeEjbRelationshipRole()
   {
      childNode.remove("ejb-relationship-role");
      return this;
   }

   /**
    * If not already created, a new <code>ejb-relationship-role</code> element will be created and returned.
    * Otherwise, the existing <code>ejb-relationship-role</code> element will be returned.
    * @return the node defined for the element <code>ejb-relationship-role</code> 
    */
   public EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole()
   {
      Node node = childNode.getOrCreate("ejb-relationship-role");
      EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole = new EjbRelationshipRoleTypeImpl<EjbRelationType<T>>(
            this, "ejb-relationship-role", childNode, node);
      return ejbRelationshipRole;
   }

}
