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
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;

/**
 * This interface defines the contract for the <code> service-ref_handlerType </code> xsd type 
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
public interface ServiceRefHandlerType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllDescription();

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
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllDisplayName();

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
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ServiceRefHandlerType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServiceRefHandlerType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : handler-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-name</code> element with the given value will be created.
    * Otherwise, the existing <code>handler-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setHandlerName(String handlerName);

   /**
    * Removes the <code>handler-name</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeHandlerName();

   /**
    * Returns the <code>handler-name</code> element
    * @return the node defined for the element <code>handler-name</code> 
    */
   public String getHandlerName();

   // -------------------------------------------------------------------------------------||
   // Element type : handler-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-class</code> element with the given value will be created.
    * Otherwise, the existing <code>handler-class</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setHandlerClass(String handlerClass);

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeHandlerClass();

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass();

   // -------------------------------------------------------------------------------------||
   // Element type : init-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllInitParam();

   /**
    * Returns the <code>init-param</code> element
    * @return the node defined for the element <code>init-param</code> 
    */
   public ParamValueType<ServiceRefHandlerType<T>> initParam();

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<ServiceRefHandlerType<T>>> getInitParamList();

   // -------------------------------------------------------------------------------------||
   // Element type : soap-header
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>soap-header</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setSoapHeader(String soapHeader);

   /**
    * Creates for all String objects representing <code>soap-header</code> elements, 
    * a new <code>soap-header</code> element 
    * @param list of <code>soap-header</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setSoapHeaderList(String... values);

   /**
    * Removes the <code>soap-header</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllSoapHeader();

   /**
    * Returns all <code>soap-header</code> elements
    * @return list of <code>soap-header</code> 
    */
   public List<String> getSoapHeaderList();

   // -------------------------------------------------------------------------------------||
   // Element type : soap-role
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>soap-role</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setSoapRole(String soapRole);

   /**
    * Creates for all String objects representing <code>soap-role</code> elements, 
    * a new <code>soap-role</code> element 
    * @param list of <code>soap-role</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setSoapRoleList(String... values);

   /**
    * Removes the <code>soap-role</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllSoapRole();

   /**
    * Returns all <code>soap-role</code> elements
    * @return list of <code>soap-role</code> 
    */
   public List<String> getSoapRoleList();

   // -------------------------------------------------------------------------------------||
   // Element type : port-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>port-name</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setPortName(String portName);

   /**
    * Creates for all String objects representing <code>port-name</code> elements, 
    * a new <code>port-name</code> element 
    * @param list of <code>port-name</code> objects 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> setPortNameList(String... values);

   /**
    * Removes the <code>port-name</code> element 
    * @return the current instance of {@link ServiceRefHandlerType<T>} 
    */
   public ServiceRefHandlerType<T> removeAllPortName();

   /**
    * Returns all <code>port-name</code> elements
    * @return list of <code>port-name</code> 
    */
   public List<String> getPortNameList();

}
