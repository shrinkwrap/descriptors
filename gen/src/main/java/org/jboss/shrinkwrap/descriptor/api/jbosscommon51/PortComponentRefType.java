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
package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> port-component-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface PortComponentRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : service-endpoint-interface
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-endpoint-interface</code> element with the given value will be created.
    * Otherwise, the existing <code>service-endpoint-interface</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setServiceEndpointInterface(String serviceEndpointInterface);

   /**
    * Removes the <code>service-endpoint-interface</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeServiceEndpointInterface();

   /**
    * Returns the <code>service-endpoint-interface</code> element
    * @return the node defined for the element <code>service-endpoint-interface</code> 
    */
   public String getServiceEndpointInterface();

   // -------------------------------------------------------------------------------------||
   // Element type : port-qname
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-qname</code> element with the given value will be created.
    * Otherwise, the existing <code>port-qname</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setPortQname(String portQname);

   /**
    * Removes the <code>port-qname</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removePortQname();

   /**
    * Returns the <code>port-qname</code> element
    * @return the node defined for the element <code>port-qname</code> 
    */
   public String getPortQname();

   // -------------------------------------------------------------------------------------||
   // Element type : config-name
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-name</code> element with the given value will be created.
    * Otherwise, the existing <code>config-name</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setConfigName(String configName);

   /**
    * Removes the <code>config-name</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeConfigName();

   /**
    * Returns the <code>config-name</code> element
    * @return the node defined for the element <code>config-name</code> 
    */
   public String getConfigName();

   // -------------------------------------------------------------------------------------||
   // Element type : config-file
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-file</code> element with the given value will be created.
    * Otherwise, the existing <code>config-file</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setConfigFile(String configFile);

   /**
    * Removes the <code>config-file</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeConfigFile();

   /**
    * Returns the <code>config-file</code> element
    * @return the node defined for the element <code>config-file</code> 
    */
   public String getConfigFile();

   // -------------------------------------------------------------------------------------||
   // Element type : stub-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>stub-property</code> elements 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeAllStubProperty();

   /**
    * Returns the <code>stub-property</code> element
    * @return the node defined for the element <code>stub-property</code> 
    */
   public StubPropertyType<PortComponentRefType<T>> stubProperty();

   /**
    * Returns all <code>stub-property</code> elements
    * @return list of <code>stub-property</code> 
    */
   public List<StubPropertyType<PortComponentRefType<T>>> getStubPropertyList();

   // -------------------------------------------------------------------------------------||
   // Element type : call-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>call-property</code> elements 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeAllCallProperty();

   /**
    * Returns the <code>call-property</code> element
    * @return the node defined for the element <code>call-property</code> 
    */
   public CallPropertyType<PortComponentRefType<T>> callProperty();

   /**
    * Returns all <code>call-property</code> elements
    * @return list of <code>call-property</code> 
    */
   public List<CallPropertyType<PortComponentRefType<T>>> getCallPropertyList();

}
