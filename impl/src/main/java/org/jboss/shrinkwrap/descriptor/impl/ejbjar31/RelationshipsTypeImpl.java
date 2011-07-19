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
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> relationshipsType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The relationshipsType describes the relationships in <br> 
 * which entity beans with container-managed persistence <br> 
 * participate. The relationshipsType contains an optional <br> 
 * description; and a list of ejb-relation elements, which <br> 
 * specify the container managed relationships. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class RelationshipsTypeImpl<T> implements Child<T>, RelationshipsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public RelationshipsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public RelationshipsTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link RelationshipsType<T>} 
    */
   public RelationshipsType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link RelationshipsType<T>} 
    */
   public RelationshipsType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link RelationshipsType<T>} 
    */
   public RelationshipsType<T> removeAllDescription()
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
   // Element type : ejb-relation
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-relation</code> elements 
    * @return the current instance of {@link RelationshipsType<T>} 
    */
   public RelationshipsType<T> removeAllEjbRelation()
   {
      childNode.remove("ejb-relation");
      return this;
   }

   /**
    * Returns the <code>ejb-relation</code> element
    * @return the node defined for the element <code>ejb-relation</code> 
    */
   public EjbRelationType<RelationshipsType<T>> ejbRelation()
   {
      return new EjbRelationTypeImpl<RelationshipsType<T>>(this, "ejb-relation", childNode);
   }

   /**
    * Returns all <code>ejb-relation</code> elements
    * @return list of <code>ejb-relation</code> 
    */
   public List<EjbRelationType<RelationshipsType<T>>> getEjbRelationList()
   {
      List<EjbRelationType<RelationshipsType<T>>> list = new ArrayList<EjbRelationType<RelationshipsType<T>>>();
      List<Node> nodeList = childNode.get("ejb-relation");
      for (Node node : nodeList)
      {
         EjbRelationType<RelationshipsType<T>> type = new EjbRelationTypeImpl<RelationshipsType<T>>(this,
               "ejb-relation", childNode, node);
         list.add(type);
      }
      return list;
   }

}
