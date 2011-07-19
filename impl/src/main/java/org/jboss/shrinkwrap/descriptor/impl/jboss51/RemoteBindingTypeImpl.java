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
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.RemoteBindingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> remote-bindingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * Element for specifying the remote jndi binding for a bean as well <br> 
 * as the client interceptor stack <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class RemoteBindingTypeImpl<T> implements Child<T>, RemoteBindingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public RemoteBindingTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public RemoteBindingTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeAllDescription()
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
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setJndiName(String jndiName)
   {
      childNode.getOrCreate("jndi-name").text(jndiName);
      return this;
   }

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeJndiName()
   {
      childNode.remove("jndi-name");
      return this;
   }

   /**
    * Returns the <code>jndi-name</code> element
    * @return the node defined for the element <code>jndi-name</code> 
    */
   public String getJndiName()
   {
      return childNode.textValue("jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : client-bind-url
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>client-bind-url</code> element with the given value will be created.
    * Otherwise, the existing <code>client-bind-url</code> element will be updated with the given value.
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setClientBindUrl(String clientBindUrl)
   {
      childNode.getOrCreate("client-bind-url").text(clientBindUrl);
      return this;
   }

   /**
    * Removes the <code>client-bind-url</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeClientBindUrl()
   {
      childNode.remove("client-bind-url");
      return this;
   }

   /**
    * Returns the <code>client-bind-url</code> element
    * @return the node defined for the element <code>client-bind-url</code> 
    */
   public String getClientBindUrl()
   {
      return childNode.textValue("client-bind-url");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-stack
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor-stack</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptor-stack</code> element will be updated with the given value.
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setInterceptorStack(String interceptorStack)
   {
      childNode.getOrCreate("interceptor-stack").text(interceptorStack);
      return this;
   }

   /**
    * Removes the <code>interceptor-stack</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeInterceptorStack()
   {
      childNode.remove("interceptor-stack");
      return this;
   }

   /**
    * Returns the <code>interceptor-stack</code> element
    * @return the node defined for the element <code>interceptor-stack</code> 
    */
   public String getInterceptorStack()
   {
      return childNode.textValue("interceptor-stack");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : invoker-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>invoker-name</code> element with the given value will be created.
    * Otherwise, the existing <code>invoker-name</code> element will be updated with the given value.
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setInvokerName(String invokerName)
   {
      childNode.getOrCreate("invoker-name").text(invokerName);
      return this;
   }

   /**
    * Removes the <code>invoker-name</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeInvokerName()
   {
      childNode.remove("invoker-name");
      return this;
   }

   /**
    * Returns the <code>invoker-name</code> element
    * @return the node defined for the element <code>invoker-name</code> 
    */
   public String getInvokerName()
   {
      return childNode.textValue("invoker-name");
   }

}
