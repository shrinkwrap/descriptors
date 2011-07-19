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
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> service-ref_handlerType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * Declares the handler for a port-component. Handlers can access the <br> 
 * init-param name/value pairs using the HandlerInfo interface. If <br> 
 * port-name is not specified, the handler is assumed to be associated <br> 
 * with all ports of the service. <br> 
 *<br>
 * Used in: service-ref <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ServiceRefHandlerTypeImpl<T> implements Child<T>, ServiceRefHandlerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServiceRefHandlerTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ServiceRefHandlerTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllDescription()
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
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllDisplayName()
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
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ServiceRefHandlerType<T>> icon()
   {
      return new IconTypeImpl<ServiceRefHandlerType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServiceRefHandlerType<T>>> getIconList()
   {
      List<IconType<ServiceRefHandlerType<T>>> list = new ArrayList<IconType<ServiceRefHandlerType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<ServiceRefHandlerType<T>> type = new IconTypeImpl<ServiceRefHandlerType<T>>(this, "icon", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-name</code> element with the given value will be created.
    * Otherwise, the existing <code>handler-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setHandlerName(String handlerName)
   {
      childNode.getOrCreate("handler-name").text(handlerName);
      return this;
   }

   /**
    * Removes the <code>handler-name</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeHandlerName()
   {
      childNode.remove("handler-name");
      return this;
   }

   /**
    * Returns the <code>handler-name</code> element
    * @return the node defined for the element <code>handler-name</code> 
    */
   public String getHandlerName()
   {
      return childNode.textValue("handler-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-class</code> element with the given value will be created.
    * Otherwise, the existing <code>handler-class</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setHandlerClass(String handlerClass)
   {
      childNode.getOrCreate("handler-class").text(handlerClass);
      return this;
   }

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeHandlerClass()
   {
      childNode.remove("handler-class");
      return this;
   }

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass()
   {
      return childNode.textValue("handler-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : init-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllInitParam()
   {
      childNode.remove("init-param");
      return this;
   }

   /**
    * Returns the <code>init-param</code> element
    * @return the node defined for the element <code>init-param</code> 
    */
   public ParamValueType<ServiceRefHandlerType<T>> initParam()
   {
      return new ParamValueTypeImpl<ServiceRefHandlerType<T>>(this, "init-param", childNode);
   }

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<ServiceRefHandlerType<T>>> getInitParamList()
   {
      List<ParamValueType<ServiceRefHandlerType<T>>> list = new ArrayList<ParamValueType<ServiceRefHandlerType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for (Node node : nodeList)
      {
         ParamValueType<ServiceRefHandlerType<T>> type = new ParamValueTypeImpl<ServiceRefHandlerType<T>>(this,
               "init-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : soap-header
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>soap-header</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setSoapHeader(String soapHeader)
   {
      childNode.create("soap-header").text(soapHeader);
      return this;
   }

   /**
    * Creates for all String objects representing <code>soap-header</code> elements, 
    * a new <code>soap-header</code> element 
    * @param list of <code>soap-header</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setSoapHeaderList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setSoapHeader(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>soap-header</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllSoapHeader()
   {
      childNode.remove("soap-header");
      return this;
   }

   /**
    * Returns all <code>soap-header</code> elements
    * @return list of <code>soap-header</code> 
    */
   public List<String> getSoapHeaderList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("soap-header");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : soap-role
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>soap-role</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setSoapRole(String soapRole)
   {
      childNode.create("soap-role").text(soapRole);
      return this;
   }

   /**
    * Creates for all String objects representing <code>soap-role</code> elements, 
    * a new <code>soap-role</code> element 
    * @param list of <code>soap-role</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setSoapRoleList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setSoapRole(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>soap-role</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllSoapRole()
   {
      childNode.remove("soap-role");
      return this;
   }

   /**
    * Returns all <code>soap-role</code> elements
    * @return list of <code>soap-role</code> 
    */
   public List<String> getSoapRoleList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("soap-role");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>port-name</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setPortName(String portName)
   {
      childNode.create("port-name").text(portName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>port-name</code> elements, 
    * a new <code>port-name</code> element 
    * @param list of <code>port-name</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setPortNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setPortName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>port-name</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllPortName()
   {
      childNode.remove("port-name");
      return this;
   }

   /**
    * Returns all <code>port-name</code> elements
    * @return list of <code>port-name</code> 
    */
   public List<String> getPortNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("port-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
