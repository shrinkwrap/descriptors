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
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> interceptorsType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The interceptorsType element declares one or more interceptor <br> 
 * classes used by components within this ejb-jar. The declaration <br> 
 * consists of : <br> 
 *<br>
 * - An optional description. <br> 
 * - One or more interceptor elements. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class InterceptorsTypeImpl<T> implements Child<T>, InterceptorsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public InterceptorsTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link InterceptorsType<T>} 
    */
   public InterceptorsType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link InterceptorsType<T>} 
    */
   public InterceptorsType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link InterceptorsType<T>} 
    */
   public InterceptorsType<T> removeAllDescription()
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
   // Element type : interceptor
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>interceptor</code> elements 
    * @return the current instance of {@link InterceptorsType<T>} 
    */
   public InterceptorsType<T> removeAllInterceptor()
   {
      childNode.remove("interceptor");
      return this;
   }

   /**
    * Returns the <code>interceptor</code> element
    * @return the node defined for the element <code>interceptor</code> 
    */
   public InterceptorType<InterceptorsType<T>> interceptor()
   {
      return new InterceptorTypeImpl<InterceptorsType<T>>(this, "interceptor", childNode);
   }

   /**
    * Returns all <code>interceptor</code> elements
    * @return list of <code>interceptor</code> 
    */
   public List<InterceptorType<InterceptorsType<T>>> getInterceptorList()
   {
      List<InterceptorType<InterceptorsType<T>>> list = new ArrayList<InterceptorType<InterceptorsType<T>>>();
      List<Node> nodeList = childNode.get("interceptor");
      for (Node node : nodeList)
      {
         InterceptorType<InterceptorsType<T>> type = new InterceptorTypeImpl<InterceptorsType<T>>(this, "interceptor",
               childNode, node);
         list.add(type);
      }
      return list;
   }

}
