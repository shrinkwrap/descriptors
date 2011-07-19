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
package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.CallPropertyType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.StubPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> port-component-refType </code> xsd type 
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
   // isComplexType: false   maxOccurs: -1   isAttribute: false
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
   // Element type : port-qname
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-qname</code> element with the given value will be created.
    * Otherwise, the existing <code>port-qname</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setPortQname(String portQname)
   {
      childNode.getOrCreate("port-qname").text(portQname);
      return this;
   }

   /**
    * Removes the <code>port-qname</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removePortQname()
   {
      childNode.remove("port-qname");
      return this;
   }

   /**
    * Returns the <code>port-qname</code> element
    * @return the node defined for the element <code>port-qname</code> 
    */
   public String getPortQname()
   {
      return childNode.textValue("port-qname");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : config-name
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-name</code> element with the given value will be created.
    * Otherwise, the existing <code>config-name</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setConfigName(String configName)
   {
      childNode.getOrCreate("config-name").text(configName);
      return this;
   }

   /**
    * Removes the <code>config-name</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeConfigName()
   {
      childNode.remove("config-name");
      return this;
   }

   /**
    * Returns the <code>config-name</code> element
    * @return the node defined for the element <code>config-name</code> 
    */
   public String getConfigName()
   {
      return childNode.textValue("config-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : config-file
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-file</code> element with the given value will be created.
    * Otherwise, the existing <code>config-file</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> setConfigFile(String configFile)
   {
      childNode.getOrCreate("config-file").text(configFile);
      return this;
   }

   /**
    * Removes the <code>config-file</code> element 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeConfigFile()
   {
      childNode.remove("config-file");
      return this;
   }

   /**
    * Returns the <code>config-file</code> element
    * @return the node defined for the element <code>config-file</code> 
    */
   public String getConfigFile()
   {
      return childNode.textValue("config-file");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : stub-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>stub-property</code> elements 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeAllStubProperty()
   {
      childNode.remove("stub-property");
      return this;
   }

   /**
    * Returns the <code>stub-property</code> element
    * @return the node defined for the element <code>stub-property</code> 
    */
   public StubPropertyType<PortComponentRefType<T>> stubProperty()
   {
      return new StubPropertyTypeImpl<PortComponentRefType<T>>(this, "stub-property", childNode);
   }

   /**
    * Returns all <code>stub-property</code> elements
    * @return list of <code>stub-property</code> 
    */
   public List<StubPropertyType<PortComponentRefType<T>>> getStubPropertyList()
   {
      List<StubPropertyType<PortComponentRefType<T>>> list = new ArrayList<StubPropertyType<PortComponentRefType<T>>>();
      List<Node> nodeList = childNode.get("stub-property");
      for (Node node : nodeList)
      {
         StubPropertyType<PortComponentRefType<T>> type = new StubPropertyTypeImpl<PortComponentRefType<T>>(this,
               "stub-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : call-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>call-property</code> elements 
    * @return the current instance of {@link PortComponentRefType<T>} 
    */
   public PortComponentRefType<T> removeAllCallProperty()
   {
      childNode.remove("call-property");
      return this;
   }

   /**
    * Returns the <code>call-property</code> element
    * @return the node defined for the element <code>call-property</code> 
    */
   public CallPropertyType<PortComponentRefType<T>> callProperty()
   {
      return new CallPropertyTypeImpl<PortComponentRefType<T>>(this, "call-property", childNode);
   }

   /**
    * Returns all <code>call-property</code> elements
    * @return list of <code>call-property</code> 
    */
   public List<CallPropertyType<PortComponentRefType<T>>> getCallPropertyList()
   {
      List<CallPropertyType<PortComponentRefType<T>>> list = new ArrayList<CallPropertyType<PortComponentRefType<T>>>();
      List<Node> nodeList = childNode.get("call-property");
      for (Node node : nodeList)
      {
         CallPropertyType<PortComponentRefType<T>> type = new CallPropertyTypeImpl<PortComponentRefType<T>>(this,
               "call-property", childNode, node);
         list.add(type);
      }
      return list;
   }

}
