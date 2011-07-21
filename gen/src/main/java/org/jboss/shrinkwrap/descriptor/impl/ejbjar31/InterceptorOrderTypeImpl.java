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
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorOrderType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> interceptor-orderType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The interceptor-orderType element describes a total ordering <br> 
 * of interceptor classes. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class InterceptorOrderTypeImpl<T> implements Child<T>, InterceptorOrderType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorOrderTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public InterceptorOrderTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorOrderType<T>} 
    */
   public InterceptorOrderType<T> setInterceptorClass(String interceptorClass)
   {
      childNode.create("interceptor-class").text(interceptorClass);
      return this;
   }

   /**
    * Creates for all String objects representing <code>interceptor-class</code> elements, 
    * a new <code>interceptor-class</code> element 
    * @param list of <code>interceptor-class</code> objects 
    * @return the current instance of {@link InterceptorOrderType<T>} 
    */
   public InterceptorOrderType<T> setInterceptorClassList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setInterceptorClass(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorOrderType<T>} 
    */
   public InterceptorOrderType<T> removeAllInterceptorClass()
   {
      childNode.remove("interceptor-class");
      return this;
   }

   /**
    * Returns all <code>interceptor-class</code> elements
    * @return list of <code>interceptor-class</code> 
    */
   public List<String> getInterceptorClassList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("interceptor-class");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
