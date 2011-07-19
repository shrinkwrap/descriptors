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
package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.RunAsTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> servletType </code> xsd type 
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
public class ServletTypeImpl<T> implements Child<T>, ServletType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServletTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ServletTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllDescription()
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
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllDisplayName()
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
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ServletType<T>> icon()
   {
      return new IconTypeImpl<ServletType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServletType<T>>> getIconList()
   {
      List<IconType<ServletType<T>>> list = new ArrayList<IconType<ServletType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<ServletType<T>> type = new IconTypeImpl<ServletType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-name</code> element with the given value will be created.
    * Otherwise, the existing <code>servlet-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setServletName(String servletName)
   {
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeServletName()
   {
      childNode.remove("servlet-name");
      return this;
   }

   /**
    * Returns the <code>servlet-name</code> element
    * @return the node defined for the element <code>servlet-name</code> 
    */
   public String getServletName()
   {
      return childNode.textValue("servlet-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : init-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllInitParam()
   {
      childNode.remove("init-param");
      return this;
   }

   /**
    * Returns the <code>init-param</code> element
    * @return the node defined for the element <code>init-param</code> 
    */
   public ParamValueType<ServletType<T>> initParam()
   {
      return new ParamValueTypeImpl<ServletType<T>>(this, "init-param", childNode);
   }

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<ServletType<T>>> getInitParamList()
   {
      List<ParamValueType<ServletType<T>>> list = new ArrayList<ParamValueType<ServletType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for (Node node : nodeList)
      {
         ParamValueType<ServletType<T>> type = new ParamValueTypeImpl<ServletType<T>>(this, "init-param", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : load-on-startup
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>load-on-startup</code> element with the given value will be created.
    * Otherwise, the existing <code>load-on-startup</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setLoadOnStartup(Integer loadOnStartup)
   {
      childNode.getOrCreate("load-on-startup").text(loadOnStartup);
      return this;
   }

   /**
    * Removes the <code>load-on-startup</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeLoadOnStartup()
   {
      childNode.remove("load-on-startup");
      return this;
   }

   /**
    * Returns the <code>load-on-startup</code> element
    * @return the node defined for the element <code>load-on-startup</code> 
    */
   public Integer getLoadOnStartup()
   {
      if (childNode.textValue("load-on-startup") != null && !childNode.textValue("load-on-startup").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("load-on-startup"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : enabled
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>enabled</code> element with the given value will be created.
    * Otherwise, the existing <code>enabled</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setEnabled(Boolean enabled)
   {
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   /**
    * Removes the <code>enabled</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeEnabled()
   {
      childNode.remove("enabled");
      return this;
   }

   /**
    * Returns the <code>enabled</code> element
    * @return the node defined for the element <code>enabled</code> 
    */
   public Boolean isEnabled()
   {
      return Strings.isTrue(childNode.textValue("enabled"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : async-supported
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>async-supported</code> element with the given value will be created.
    * Otherwise, the existing <code>async-supported</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setAsyncSupported(Boolean asyncSupported)
   {
      childNode.getOrCreate("async-supported").text(asyncSupported);
      return this;
   }

   /**
    * Removes the <code>async-supported</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAsyncSupported()
   {
      childNode.remove("async-supported");
      return this;
   }

   /**
    * Returns the <code>async-supported</code> element
    * @return the node defined for the element <code>async-supported</code> 
    */
   public Boolean isAsyncSupported()
   {
      return Strings.isTrue(childNode.textValue("async-supported"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : run-as
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>run-as</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeRunAs()
   {
      childNode.remove("run-as");
      return this;
   }

   /**
    * If not already created, a new <code>run-as</code> element will be created and returned.
    * Otherwise, the existing <code>run-as</code> element will be returned.
    * @return the node defined for the element <code>run-as</code> 
    */
   public RunAsType<ServletType<T>> runAs()
   {
      Node node = childNode.getOrCreate("run-as");
      RunAsType<ServletType<T>> runAs = new RunAsTypeImpl<ServletType<T>>(this, "run-as", childNode, node);
      return runAs;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeAllSecurityRoleRef()
   {
      childNode.remove("security-role-ref");
      return this;
   }

   /**
    * Returns the <code>security-role-ref</code> element
    * @return the node defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<ServletType<T>> securityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<ServletType<T>>(this, "security-role-ref", childNode);
   }

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<ServletType<T>>> getSecurityRoleRefList()
   {
      List<SecurityRoleRefType<ServletType<T>>> list = new ArrayList<SecurityRoleRefType<ServletType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for (Node node : nodeList)
      {
         SecurityRoleRefType<ServletType<T>> type = new SecurityRoleRefTypeImpl<ServletType<T>>(this,
               "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : multipart-config
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>multipart-config</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeMultipartConfig()
   {
      childNode.remove("multipart-config");
      return this;
   }

   /**
    * If not already created, a new <code>multipart-config</code> element will be created and returned.
    * Otherwise, the existing <code>multipart-config</code> element will be returned.
    * @return the node defined for the element <code>multipart-config</code> 
    */
   public MultipartConfigType<ServletType<T>> multipartConfig()
   {
      Node node = childNode.getOrCreate("multipart-config");
      MultipartConfigType<ServletType<T>> multipartConfig = new MultipartConfigTypeImpl<ServletType<T>>(this,
            "multipart-config", childNode, node);
      return multipartConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-class</code> element with the given value will be created.
    * Otherwise, the existing <code>servlet-class</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setServletClass(String servletClass)
   {
      childNode.getOrCreate("servlet-class").text(servletClass);
      return this;
   }

   /**
    * Removes the <code>servlet-class</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeServletClass()
   {
      childNode.remove("servlet-class");
      return this;
   }

   /**
    * Returns the <code>servlet-class</code> element
    * @return the node defined for the element <code>servlet-class</code> 
    */
   public String getServletClass()
   {
      return childNode.textValue("servlet-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-file
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-file</code> element with the given value will be created.
    * Otherwise, the existing <code>jsp-file</code> element will be updated with the given value.
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> setJspFile(String jspFile)
   {
      childNode.getOrCreate("jsp-file").text(jspFile);
      return this;
   }

   /**
    * Removes the <code>jsp-file</code> element 
    * @return the current instance of {@link ServletType<T>} 
    */
   public ServletType<T> removeJspFile()
   {
      childNode.remove("jsp-file");
      return this;
   }

   /**
    * Returns the <code>jsp-file</code> element
    * @return the node defined for the element <code>jsp-file</code> 
    */
   public String getJspFile()
   {
      return childNode.textValue("jsp-file");
   }

}
