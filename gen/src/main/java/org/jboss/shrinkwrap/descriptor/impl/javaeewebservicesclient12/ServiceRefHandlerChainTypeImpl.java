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
package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefProtocolBindingListType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> service-ref_handler-chainType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The handler-chain element defines the handlerchain. <br> 
 * Handlerchain can be defined such that the handlers in the <br> 
 * handlerchain operate,all ports of a service, on a specific <br> 
 * port or on a list of protocol-bindings. The choice of elements <br> 
 * service-name-pattern, port-name-pattern and protocol-bindings <br> 
 * are used to specify whether the handlers in handler-chain are <br> 
 * for a service, port or protocol binding. If none of these <br> 
 * choices are specified with the handler-chain element then the <br> 
 * handlers specified in the handler-chain will be applied on <br> 
 * everything. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ServiceRefHandlerChainTypeImpl<T> implements Child<T>, ServiceRefHandlerChainType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServiceRefHandlerChainTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ServiceRefHandlerChainTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>handler</code> elements 
    * @return the current instance of {@link ServiceRefHandlerChainType<T>} 
    */
   public ServiceRefHandlerChainType<T> removeAllHandler()
   {
      childNode.remove("handler");
      return this;
   }

   /**
    * Returns the <code>handler</code> element
    * @return the node defined for the element <code>handler</code> 
    */
   public ServiceRefHandlerType<ServiceRefHandlerChainType<T>> handler()
   {
      return new ServiceRefHandlerTypeImpl<ServiceRefHandlerChainType<T>>(this, "handler", childNode);
   }

   /**
    * Returns all <code>handler</code> elements
    * @return list of <code>handler</code> 
    */
   public List<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>> getHandlerList()
   {
      List<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>> list = new ArrayList<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>>();
      List<Node> nodeList = childNode.get("handler");
      for (Node node : nodeList)
      {
         ServiceRefHandlerType<ServiceRefHandlerChainType<T>> type = new ServiceRefHandlerTypeImpl<ServiceRefHandlerChainType<T>>(
               this, "handler", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-name-pattern
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-name-pattern</code> element with the given value will be created.
    * Otherwise, the existing <code>service-name-pattern</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefHandlerChainType<T>} 
    */
   public ServiceRefHandlerChainType<T> setServiceNamePattern(String serviceNamePattern)
   {
      childNode.getOrCreate("service-name-pattern").text(serviceNamePattern);
      return this;
   }

   /**
    * Removes the <code>service-name-pattern</code> element 
    * @return the current instance of {@link ServiceRefHandlerChainType<T>} 
    */
   public ServiceRefHandlerChainType<T> removeServiceNamePattern()
   {
      childNode.remove("service-name-pattern");
      return this;
   }

   /**
    * Returns the <code>service-name-pattern</code> element
    * @return the node defined for the element <code>service-name-pattern</code> 
    */
   public String getServiceNamePattern()
   {
      return childNode.textValue("service-name-pattern");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-name-pattern
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-name-pattern</code> element with the given value will be created.
    * Otherwise, the existing <code>port-name-pattern</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefHandlerChainType<T>} 
    */
   public ServiceRefHandlerChainType<T> setPortNamePattern(String portNamePattern)
   {
      childNode.getOrCreate("port-name-pattern").text(portNamePattern);
      return this;
   }

   /**
    * Removes the <code>port-name-pattern</code> element 
    * @return the current instance of {@link ServiceRefHandlerChainType<T>} 
    */
   public ServiceRefHandlerChainType<T> removePortNamePattern()
   {
      childNode.remove("port-name-pattern");
      return this;
   }

   /**
    * Returns the <code>port-name-pattern</code> element
    * @return the node defined for the element <code>port-name-pattern</code> 
    */
   public String getPortNamePattern()
   {
      return childNode.textValue("port-name-pattern");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : protocol-bindings
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>protocol-bindings</code> element 
    * @return the current instance of {@link ServiceRefHandlerChainType<T>} 
    */
   public ServiceRefHandlerChainType<T> removeProtocolBindings()
   {
      childNode.remove("protocol-bindings");
      return this;
   }

   /**
    * If not already created, a new <code>protocol-bindings</code> element will be created and returned.
    * Otherwise, the existing <code>protocol-bindings</code> element will be returned.
    * @return the node defined for the element <code>protocol-bindings</code> 
    */
   public ServiceRefProtocolBindingListType<ServiceRefHandlerChainType<T>> protocolBindings()
   {
      Node node = childNode.getOrCreate("protocol-bindings");
      ServiceRefProtocolBindingListType<ServiceRefHandlerChainType<T>> protocolBindings = new ServiceRefProtocolBindingListTypeImpl<ServiceRefHandlerChainType<T>>(
            this, "protocol-bindings", childNode, node);
      return protocolBindings;
   }

}
