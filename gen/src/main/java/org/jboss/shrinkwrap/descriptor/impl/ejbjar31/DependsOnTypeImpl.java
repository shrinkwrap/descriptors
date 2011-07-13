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
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.DependsOnType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> depends-onType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The depends-onType is used to express initialization <br> 
 * ordering dependencies between Singleton components. <br> 
 * The depends-onType specifies the names of one or more <br> 
 * Singleton beans in the same application as the referring <br> 
 * Singleton, each of which must be initialized before <br> 
 * the referring bean. <br> 
 *<br>
 * Each dependent bean is expressed using ejb-link syntax. <br> 
 * The order in which dependent beans are initialized at <br> 
 * runtime is not guaranteed to match the order in which <br> 
 * they are listed. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class DependsOnTypeImpl<T> implements Child<T>, DependsOnType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DependsOnTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public DependsOnTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>ejb-name</code> element 
    * @return the current instance of {@link DependsOnType<T>} 
    */
   public DependsOnType<T> setEjbName(String ejbName)
   {
      childNode.create("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>ejb-name</code> elements, 
    * a new <code>ejb-name</code> element 
    * @param list of <code>ejb-name</code> objects 
    * @return the current instance of {@link DependsOnType<T>} 
    */
   public DependsOnType<T> setEjbNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setEjbName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link DependsOnType<T>} 
    */
   public DependsOnType<T> removeAllEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   /**
    * Returns all <code>ejb-name</code> elements
    * @return list of <code>ejb-name</code> 
    */
   public List<String> getEjbNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("ejb-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
