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
package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Persistence;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> persistence </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class PersistenceImpl<T> implements Child<T>, Persistence<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public PersistenceImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit</code> elements 
    * @return the current instance of {@link Persistence<T>} 
    */
   public Persistence<T> removeAllPersistenceUnit()
   {
      childNode.remove("persistence-unit");
      return this;
   }

   /**
    * Returns the <code>persistence-unit</code> element
    * @return the node defined for the element <code>persistence-unit</code> 
    */
   public PersistenceUnit<Persistence<T>> persistenceUnit()
   {
      return new PersistenceUnitImpl<Persistence<T>>(this, "persistence-unit", childNode);
   }

   /**
    * Returns all <code>persistence-unit</code> elements
    * @return list of <code>persistence-unit</code> 
    */
   public List<PersistenceUnit<Persistence<T>>> getPersistenceUnitList()
   {
      List<PersistenceUnit<Persistence<T>>> list = new ArrayList<PersistenceUnit<Persistence<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit");
      for (Node node : nodeList)
      {
         PersistenceUnit<Persistence<T>> type = new PersistenceUnitImpl<Persistence<T>>(this, "persistence-unit",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link Persistence<T>} 
    */
   public Persistence<T> setVersion(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link Persistence<T>} 
    */
   public Persistence<T> removeVersion()
   {
      childNode.attributes().remove("version");
      return this;
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion()
   {
      return childNode.attributes().get("version");
   }

}
