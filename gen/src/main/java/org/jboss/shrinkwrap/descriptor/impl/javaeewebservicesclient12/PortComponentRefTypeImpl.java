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

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> port-component-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The port-component-ref element declares a client dependency <br> 
 * on the container for resolving a Service Endpoint Interface <br> 
 * to a WSDL port. It optionally associates the Service Endpoint <br> 
 * Interface with a particular port-component. This is only used <br> 
 * by the container for a Service.getPort(Class) method call. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class PortComponentRefTypeImpl<T> implements Child<T>, PortComponentRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortComponentRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public PortComponentRefTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-endpoint-interface
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-endpoint-interface</code> element with the given value will be created.
    * Otherwise, the existing <code>service-endpoint-interface</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setServiceEndpointInterface(String serviceEndpointInterface)
   {
      childNode.getOrCreate("service-endpoint-interface").text(serviceEndpointInterface);
      return this;
   }

   /**
    * Removes the <code>service-endpoint-interface</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeServiceEndpointInterface()
   {
      childNode.remove("service-endpoint-interface");
      return this;
   }

   /**
    * Returns the <code>service-endpoint-interface</code> element
    * @return the node defined for the element <code>service-endpoint-interface</code> 
    */
   public String getServiceEndpointInterface()
   {
      return childNode.textValue("service-endpoint-interface");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : enable-mtom
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>enable-mtom</code> element with the given value will be created.
    * Otherwise, the existing <code>enable-mtom</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setEnableMtom(Boolean enableMtom)
   {
      childNode.getOrCreate("enable-mtom").text(enableMtom);
      return this;
   }

   /**
    * Removes the <code>enable-mtom</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeEnableMtom()
   {
      childNode.remove("enable-mtom");
      return this;
   }

   /**
    * Returns the <code>enable-mtom</code> element
    * @return the node defined for the element <code>enable-mtom</code> 
    */
   public Boolean isEnableMtom()
   {
      return Strings.isTrue(childNode.textValue("enable-mtom"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-link
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-component-link</code> element with the given value will be created.
    * Otherwise, the existing <code>port-component-link</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setPortComponentLink(String portComponentLink)
   {
      childNode.getOrCreate("port-component-link").text(portComponentLink);
      return this;
   }

   /**
    * Removes the <code>port-component-link</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removePortComponentLink()
   {
      childNode.remove("port-component-link");
      return this;
   }

   /**
    * Returns the <code>port-component-link</code> element
    * @return the node defined for the element <code>port-component-link</code> 
    */
   public String getPortComponentLink()
   {
      return childNode.textValue("port-component-link");
   }

}
