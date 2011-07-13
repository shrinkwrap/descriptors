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
package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> remote-bindingType </code> xsd type 
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
public interface RemoteBindingType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setJndiName(String jndiName);

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeJndiName();

   /**
    * Returns the <code>jndi-name</code> element
    * @return the node defined for the element <code>jndi-name</code> 
    */
   public String getJndiName();

   // -------------------------------------------------------------------------------------||
   // Element type : client-bind-url
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>client-bind-url</code> element with the given value will be created.
    * Otherwise, the existing <code>client-bind-url</code> element will be updated with the given value.
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setClientBindUrl(String clientBindUrl);

   /**
    * Removes the <code>client-bind-url</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeClientBindUrl();

   /**
    * Returns the <code>client-bind-url</code> element
    * @return the node defined for the element <code>client-bind-url</code> 
    */
   public String getClientBindUrl();

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-stack
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor-stack</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptor-stack</code> element will be updated with the given value.
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setInterceptorStack(String interceptorStack);

   /**
    * Removes the <code>interceptor-stack</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeInterceptorStack();

   /**
    * Returns the <code>interceptor-stack</code> element
    * @return the node defined for the element <code>interceptor-stack</code> 
    */
   public String getInterceptorStack();

   // -------------------------------------------------------------------------------------||
   // Element type : invoker-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>invoker-name</code> element with the given value will be created.
    * Otherwise, the existing <code>invoker-name</code> element will be updated with the given value.
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> setInvokerName(String invokerName);

   /**
    * Removes the <code>invoker-name</code> element 
    * @return the current instance of {@link RemoteBindingType<T>} 
    */
   public RemoteBindingType<T> removeInvokerName();

   /**
    * Returns the <code>invoker-name</code> element
    * @return the node defined for the element <code>invoker-name</code> 
    */
   public String getInvokerName();

}
