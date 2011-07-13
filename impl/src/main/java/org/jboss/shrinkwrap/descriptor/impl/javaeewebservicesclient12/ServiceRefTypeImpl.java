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
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainsType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.InjectionTargetTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> service-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The service-ref element declares a reference to a Web <br> 
 * service. It contains optional description, display name and <br> 
 * icons, a declaration of the required Service interface, <br> 
 * an optional WSDL document location, an optional set <br> 
 * of JAX-RPC mappings, an optional QName for the service element, <br> 
 * an optional set of Service Endpoint Interfaces to be resolved <br> 
 * by the container to a WSDL port, and an optional set of handlers. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ServiceRefTypeImpl<T> implements Child<T>, ServiceRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServiceRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ServiceRefTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllDescription()
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
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setDisplayNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDisplayName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ServiceRefType<T>> icon()
   {
      return new IconTypeImpl<ServiceRefType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServiceRefType<T>>> getIconList()
   {
      List<IconType<ServiceRefType<T>>> list = new ArrayList<IconType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<ServiceRefType<T>> type = new IconTypeImpl<ServiceRefType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ServiceRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<ServiceRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ServiceRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<ServiceRefType<T>>> list = new ArrayList<InjectionTargetType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<ServiceRefType<T>> type = new InjectionTargetTypeImpl<ServiceRefType<T>>(this,
               "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>service-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceRefName(String serviceRefName)
   {
      childNode.getOrCreate("service-ref-name").text(serviceRefName);
      return this;
   }

   /**
    * Removes the <code>service-ref-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceRefName()
   {
      childNode.remove("service-ref-name");
      return this;
   }

   /**
    * Returns the <code>service-ref-name</code> element
    * @return the node defined for the element <code>service-ref-name</code> 
    */
   public String getServiceRefName()
   {
      return childNode.textValue("service-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-interface
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-interface</code> element with the given value will be created.
    * Otherwise, the existing <code>service-interface</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceInterface(String serviceInterface)
   {
      childNode.getOrCreate("service-interface").text(serviceInterface);
      return this;
   }

   /**
    * Removes the <code>service-interface</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceInterface()
   {
      childNode.remove("service-interface");
      return this;
   }

   /**
    * Returns the <code>service-interface</code> element
    * @return the node defined for the element <code>service-interface</code> 
    */
   public String getServiceInterface()
   {
      return childNode.textValue("service-interface");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref-type
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref-type</code> element with the given value will be created.
    * Otherwise, the existing <code>service-ref-type</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceRefType(String serviceRefType)
   {
      childNode.getOrCreate("service-ref-type").text(serviceRefType);
      return this;
   }

   /**
    * Removes the <code>service-ref-type</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceRefType()
   {
      childNode.remove("service-ref-type");
      return this;
   }

   /**
    * Returns the <code>service-ref-type</code> element
    * @return the node defined for the element <code>service-ref-type</code> 
    */
   public String getServiceRefType()
   {
      return childNode.textValue("service-ref-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : wsdl-file
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>wsdl-file</code> element with the given value will be created.
    * Otherwise, the existing <code>wsdl-file</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setWsdlFile(String wsdlFile)
   {
      childNode.getOrCreate("wsdl-file").text(wsdlFile);
      return this;
   }

   /**
    * Removes the <code>wsdl-file</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeWsdlFile()
   {
      childNode.remove("wsdl-file");
      return this;
   }

   /**
    * Returns the <code>wsdl-file</code> element
    * @return the node defined for the element <code>wsdl-file</code> 
    */
   public String getWsdlFile()
   {
      return childNode.textValue("wsdl-file");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jaxrpc-mapping-file
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jaxrpc-mapping-file</code> element with the given value will be created.
    * Otherwise, the existing <code>jaxrpc-mapping-file</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setJaxrpcMappingFile(String jaxrpcMappingFile)
   {
      childNode.getOrCreate("jaxrpc-mapping-file").text(jaxrpcMappingFile);
      return this;
   }

   /**
    * Removes the <code>jaxrpc-mapping-file</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeJaxrpcMappingFile()
   {
      childNode.remove("jaxrpc-mapping-file");
      return this;
   }

   /**
    * Returns the <code>jaxrpc-mapping-file</code> element
    * @return the node defined for the element <code>jaxrpc-mapping-file</code> 
    */
   public String getJaxrpcMappingFile()
   {
      return childNode.textValue("jaxrpc-mapping-file");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-qname
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-qname</code> element with the given value will be created.
    * Otherwise, the existing <code>service-qname</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceQname(String serviceQname)
   {
      childNode.getOrCreate("service-qname").text(serviceQname);
      return this;
   }

   /**
    * Removes the <code>service-qname</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceQname()
   {
      childNode.remove("service-qname");
      return this;
   }

   /**
    * Returns the <code>service-qname</code> element
    * @return the node defined for the element <code>service-qname</code> 
    */
   public String getServiceQname()
   {
      return childNode.textValue("service-qname");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>port-component-ref</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllPortComponentRef()
   {
      childNode.remove("port-component-ref");
      return this;
   }

   /**
    * Returns the <code>port-component-ref</code> element
    * @return the node defined for the element <code>port-component-ref</code> 
    */
   public PortComponentRefType<ServiceRefType<T>> portComponentRef()
   {
      return new PortComponentRefTypeImpl<ServiceRefType<T>>(this, "port-component-ref", childNode);
   }

   /**
    * Returns all <code>port-component-ref</code> elements
    * @return list of <code>port-component-ref</code> 
    */
   public List<PortComponentRefType<ServiceRefType<T>>> getPortComponentRefList()
   {
      List<PortComponentRefType<ServiceRefType<T>>> list = new ArrayList<PortComponentRefType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("port-component-ref");
      for (Node node : nodeList)
      {
         PortComponentRefType<ServiceRefType<T>> type = new PortComponentRefTypeImpl<ServiceRefType<T>>(this,
               "port-component-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>handler</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllHandler()
   {
      childNode.remove("handler");
      return this;
   }

   /**
    * Returns the <code>handler</code> element
    * @return the node defined for the element <code>handler</code> 
    */
   public ServiceRefHandlerType<ServiceRefType<T>> handler()
   {
      return new ServiceRefHandlerTypeImpl<ServiceRefType<T>>(this, "handler", childNode);
   }

   /**
    * Returns all <code>handler</code> elements
    * @return list of <code>handler</code> 
    */
   public List<ServiceRefHandlerType<ServiceRefType<T>>> getHandlerList()
   {
      List<ServiceRefHandlerType<ServiceRefType<T>>> list = new ArrayList<ServiceRefHandlerType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("handler");
      for (Node node : nodeList)
      {
         ServiceRefHandlerType<ServiceRefType<T>> type = new ServiceRefHandlerTypeImpl<ServiceRefType<T>>(this,
               "handler", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler-chains
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>handler-chains</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeHandlerChains()
   {
      childNode.remove("handler-chains");
      return this;
   }

   /**
    * If not already created, a new <code>handler-chains</code> element will be created and returned.
    * Otherwise, the existing <code>handler-chains</code> element will be returned.
    * @return the node defined for the element <code>handler-chains</code> 
    */
   public ServiceRefHandlerChainsType<ServiceRefType<T>> handlerChains()
   {
      Node node = childNode.getOrCreate("handler-chains");
      ServiceRefHandlerChainsType<ServiceRefType<T>> handlerChains = new ServiceRefHandlerChainsTypeImpl<ServiceRefType<T>>(
            this, "handler-chains", childNode, node);
      return handlerChains;
   }

}
