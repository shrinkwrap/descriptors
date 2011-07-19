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
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> method-paramsType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The method-paramsType defines a list of the <br> 
 * fully-qualified Java type names of the method parameters. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MethodParamsTypeImpl<T> implements Child<T>, MethodParamsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MethodParamsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MethodParamsTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-param
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>method-param</code> element 
    * @return the current instance of {@link MethodParamsType<T>} 
    */
   public MethodParamsType<T> setMethodParam(String methodParam)
   {
      childNode.create("method-param").text(methodParam);
      return this;
   }

   /**
    * Creates for all String objects representing <code>method-param</code> elements, 
    * a new <code>method-param</code> element 
    * @param list of <code>method-param</code> objects 
    * @return the current instance of {@link MethodParamsType<T>} 
    */
   public MethodParamsType<T> setMethodParamList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setMethodParam(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>method-param</code> element 
    * @return the current instance of {@link MethodParamsType<T>} 
    */
   public MethodParamsType<T> removeAllMethodParam()
   {
      childNode.remove("method-param");
      return this;
   }

   /**
    * Returns all <code>method-param</code> elements
    * @return list of <code>method-param</code> 
    */
   public List<String> getMethodParamList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("method-param");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
