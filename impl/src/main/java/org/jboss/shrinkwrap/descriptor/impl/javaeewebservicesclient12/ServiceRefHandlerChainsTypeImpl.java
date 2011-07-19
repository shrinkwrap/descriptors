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
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> service-ref_handler-chainsType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The handler-chains element defines the handlerchains associated with this <br> 
 * service or service endpoint. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ServiceRefHandlerChainsTypeImpl<T> implements Child<T>, ServiceRefHandlerChainsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServiceRefHandlerChainsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ServiceRefHandlerChainsTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler-chain
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>handler-chain</code> elements 
    * @return the current instance of {@link ServiceRefHandlerChainsType<T>} 
    */
   public ServiceRefHandlerChainsType<T> removeAllHandlerChain()
   {
      childNode.remove("handler-chain");
      return this;
   }

   /**
    * Returns the <code>handler-chain</code> element
    * @return the node defined for the element <code>handler-chain</code> 
    */
   public ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> handlerChain()
   {
      return new ServiceRefHandlerChainTypeImpl<ServiceRefHandlerChainsType<T>>(this, "handler-chain", childNode);
   }

   /**
    * Returns all <code>handler-chain</code> elements
    * @return list of <code>handler-chain</code> 
    */
   public List<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>> getHandlerChainList()
   {
      List<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>> list = new ArrayList<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>>();
      List<Node> nodeList = childNode.get("handler-chain");
      for (Node node : nodeList)
      {
         ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> type = new ServiceRefHandlerChainTypeImpl<ServiceRefHandlerChainsType<T>>(
               this, "handler-chain", childNode, node);
         list.add(type);
      }
      return list;
   }

}
