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

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> around-invokeType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The around-invoke type specifies a method on a <br> 
 * class to be called during the around invoke portion of an <br> 
 * ejb invocation. Note that each class may have only one <br> 
 * around invoke method and that the method may not be <br> 
 * overloaded. <br> 
 *<br>
 * If the class element is missing then <br> 
 * the class defining the callback is assumed to be the <br> 
 * interceptor class or component class in scope at the <br> 
 * location in the descriptor in which the around invoke <br> 
 * definition appears. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class AroundInvokeTypeImpl<T> implements Child<T>, AroundInvokeType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AroundInvokeTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public AroundInvokeTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class</code> element with the given value will be created.
    * Otherwise, the existing <code>class</code> element will be updated with the given value.
    * @return the current instance of {@link AroundInvokeType<T>} 
    */
   public AroundInvokeType<T> setClazz(String clazz)
   {
      childNode.getOrCreate("class").text(clazz);
      return this;
   }

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of {@link AroundInvokeType<T>} 
    */
   public AroundInvokeType<T> removeClazz()
   {
      childNode.remove("class");
      return this;
   }

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz()
   {
      return childNode.textValue("class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-name</code> element with the given value will be created.
    * Otherwise, the existing <code>method-name</code> element will be updated with the given value.
    * @return the current instance of {@link AroundInvokeType<T>} 
    */
   public AroundInvokeType<T> setMethodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of {@link AroundInvokeType<T>} 
    */
   public AroundInvokeType<T> removeMethodName()
   {
      childNode.remove("method-name");
      return this;
   }

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName()
   {
      return childNode.textValue("method-name");
   }

}
