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
package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;

/**
 * This interface defines the contract for the <code> service-refType </code> xsd type 
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
public interface ServiceRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllDisplayName();

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList();

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ServiceRefType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServiceRefType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllInjectionTarget();

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ServiceRefType<T>> injectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ServiceRefType<T>>> getInjectionTargetList();

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>service-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceRefName(String serviceRefName);

   /**
    * Removes the <code>service-ref-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceRefName();

   /**
    * Returns the <code>service-ref-name</code> element
    * @return the node defined for the element <code>service-ref-name</code> 
    */
   public String getServiceRefName();

   // -------------------------------------------------------------------------------------||
   // Element type : service-interface
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-interface</code> element with the given value will be created.
    * Otherwise, the existing <code>service-interface</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceInterface(String serviceInterface);

   /**
    * Removes the <code>service-interface</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceInterface();

   /**
    * Returns the <code>service-interface</code> element
    * @return the node defined for the element <code>service-interface</code> 
    */
   public String getServiceInterface();

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref-type
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref-type</code> element with the given value will be created.
    * Otherwise, the existing <code>service-ref-type</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceRefType(String serviceRefType);

   /**
    * Removes the <code>service-ref-type</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceRefType();

   /**
    * Returns the <code>service-ref-type</code> element
    * @return the node defined for the element <code>service-ref-type</code> 
    */
   public String getServiceRefType();

   // -------------------------------------------------------------------------------------||
   // Element type : wsdl-file
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>wsdl-file</code> element with the given value will be created.
    * Otherwise, the existing <code>wsdl-file</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setWsdlFile(String wsdlFile);

   /**
    * Removes the <code>wsdl-file</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeWsdlFile();

   /**
    * Returns the <code>wsdl-file</code> element
    * @return the node defined for the element <code>wsdl-file</code> 
    */
   public String getWsdlFile();

   // -------------------------------------------------------------------------------------||
   // Element type : jaxrpc-mapping-file
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jaxrpc-mapping-file</code> element with the given value will be created.
    * Otherwise, the existing <code>jaxrpc-mapping-file</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setJaxrpcMappingFile(String jaxrpcMappingFile);

   /**
    * Removes the <code>jaxrpc-mapping-file</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeJaxrpcMappingFile();

   /**
    * Returns the <code>jaxrpc-mapping-file</code> element
    * @return the node defined for the element <code>jaxrpc-mapping-file</code> 
    */
   public String getJaxrpcMappingFile();

   // -------------------------------------------------------------------------------------||
   // Element type : service-qname
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-qname</code> element with the given value will be created.
    * Otherwise, the existing <code>service-qname</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceQname(String serviceQname);

   /**
    * Removes the <code>service-qname</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceQname();

   /**
    * Returns the <code>service-qname</code> element
    * @return the node defined for the element <code>service-qname</code> 
    */
   public String getServiceQname();

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>port-component-ref</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllPortComponentRef();

   /**
    * Returns the <code>port-component-ref</code> element
    * @return the node defined for the element <code>port-component-ref</code> 
    */
   public PortComponentRefType<ServiceRefType<T>> portComponentRef();

   /**
    * Returns all <code>port-component-ref</code> elements
    * @return list of <code>port-component-ref</code> 
    */
   public List<PortComponentRefType<ServiceRefType<T>>> getPortComponentRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : handler
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>handler</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllHandler();

   /**
    * Returns the <code>handler</code> element
    * @return the node defined for the element <code>handler</code> 
    */
   public ServiceRefHandlerType<ServiceRefType<T>> handler();

   /**
    * Returns all <code>handler</code> elements
    * @return list of <code>handler</code> 
    */
   public List<ServiceRefHandlerType<ServiceRefType<T>>> getHandlerList();

   // -------------------------------------------------------------------------------------||
   // Element type : handler-chains
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>handler-chains</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeHandlerChains();

   /**
    * If not already created, a new <code>handler-chains</code> element will be created and returned.
    * Otherwise, the existing <code>handler-chains</code> element will be returned.
    * @return the node defined for the element <code>handler-chains</code> 
    */
   public ServiceRefHandlerChainsType<ServiceRefType<T>> handlerChains();

}
