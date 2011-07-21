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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * This interface defines the contract for the <code> servletType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The servletType is used to declare a servlet. <br> 
 * It contains the declarative data of a <br> 
 * servlet. If a jsp-file is specified and the load-on-startup <br> 
 * element is present, then the JSP should be precompiled and <br> 
 * loaded. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface ServletType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllDescription();

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
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllDisplayName();

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
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ServletType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServletType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-name</code> element with the given value will be created.
    * Otherwise, the existing <code>servlet-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setServletName(String servletName);

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeServletName();

   /**
    * Returns the <code>servlet-name</code> element
    * @return the node defined for the element <code>servlet-name</code> 
    */
   public String getServletName();

   // -------------------------------------------------------------------------------------||
   // Element type : init-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllInitParam();

   /**
    * Returns the <code>init-param</code> element
    * @return the node defined for the element <code>init-param</code> 
    */
   public ParamValueType<ServletType<T>> initParam();

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<ServletType<T>>> getInitParamList();

   // -------------------------------------------------------------------------------------||
   // Element type : load-on-startup
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>load-on-startup</code> element with the given value will be created.
    * Otherwise, the existing <code>load-on-startup</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setLoadOnStartup(Integer loadOnStartup);

   /**
    * Removes the <code>load-on-startup</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeLoadOnStartup();

   /**
    * Returns the <code>load-on-startup</code> element
    * @return the node defined for the element <code>load-on-startup</code> 
    */
   public Integer getLoadOnStartup();

   // -------------------------------------------------------------------------------------||
   // Element type : enabled
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>enabled</code> element with the given value will be created.
    * Otherwise, the existing <code>enabled</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setEnabled(Boolean enabled);

   /**
    * Removes the <code>enabled</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeEnabled();

   /**
    * Returns the <code>enabled</code> element
    * @return the node defined for the element <code>enabled</code> 
    */
   public Boolean isEnabled();

   // -------------------------------------------------------------------------------------||
   // Element type : async-supported
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>async-supported</code> element with the given value will be created.
    * Otherwise, the existing <code>async-supported</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setAsyncSupported(Boolean asyncSupported);

   /**
    * Removes the <code>async-supported</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAsyncSupported();

   /**
    * Returns the <code>async-supported</code> element
    * @return the node defined for the element <code>async-supported</code> 
    */
   public Boolean isAsyncSupported();

   // -------------------------------------------------------------------------------------||
   // Element type : run-as
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>run-as</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeRunAs();

   /**
    * If not already created, a new <code>run-as</code> element will be created and returned.
    * Otherwise, the existing <code>run-as</code> element will be returned.
    * @return the node defined for the element <code>run-as</code> 
    */
   public RunAsType<ServletType<T>> runAs();

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllSecurityRoleRef();

   /**
    * Returns the <code>security-role-ref</code> element
    * @return the node defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<ServletType<T>> securityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<ServletType<T>>> getSecurityRoleRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : multipart-config
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>multipart-config</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeMultipartConfig();

   /**
    * If not already created, a new <code>multipart-config</code> element will be created and returned.
    * Otherwise, the existing <code>multipart-config</code> element will be returned.
    * @return the node defined for the element <code>multipart-config</code> 
    */
   public MultipartConfigType<ServletType<T>> multipartConfig();

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-class</code> element with the given value will be created.
    * Otherwise, the existing <code>servlet-class</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setServletClass(String servletClass);

   /**
    * Removes the <code>servlet-class</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeServletClass();

   /**
    * Returns the <code>servlet-class</code> element
    * @return the node defined for the element <code>servlet-class</code> 
    */
   public String getServletClass();

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-file
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-file</code> element with the given value will be created.
    * Otherwise, the existing <code>jsp-file</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setJspFile(String jspFile);

   /**
    * Removes the <code>jsp-file</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeJspFile();

   /**
    * Returns the <code>jsp-file</code> element
    * @return the node defined for the element <code>jsp-file</code> 
    */
   public String getJspFile();

}
