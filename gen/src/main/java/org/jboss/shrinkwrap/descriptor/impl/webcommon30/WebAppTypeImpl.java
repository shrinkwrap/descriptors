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
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.JspConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> web-appType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class WebAppTypeImpl<T> implements Child<T>, WebAppType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebAppTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public WebAppTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : distributable
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> distributable()
   {
      childNode.getOrCreate("distributable");
      return this;
   }

   public Boolean isDistributable()
   {
      return childNode.getSingle("distributable") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllContextParam()
   {
      childNode.remove("context-param");
      return this;
   }

   /**
    * Returns the <code>context-param</code> element
    * @return the node defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebAppType<T>> contextParam()
   {
      return new ParamValueTypeImpl<WebAppType<T>>(this, "context-param", childNode);
   }

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebAppType<T>>> getContextParamList()
   {
      List<ParamValueType<WebAppType<T>>> list = new ArrayList<ParamValueType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("context-param");
      for (Node node : nodeList)
      {
         ParamValueType<WebAppType<T>> type = new ParamValueTypeImpl<WebAppType<T>>(this, "context-param", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllFilter()
   {
      childNode.remove("filter");
      return this;
   }

   /**
    * Returns the <code>filter</code> element
    * @return the node defined for the element <code>filter</code> 
    */
   public FilterType<WebAppType<T>> filter()
   {
      return new FilterTypeImpl<WebAppType<T>>(this, "filter", childNode);
   }

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebAppType<T>>> getFilterList()
   {
      List<FilterType<WebAppType<T>>> list = new ArrayList<FilterType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("filter");
      for (Node node : nodeList)
      {
         FilterType<WebAppType<T>> type = new FilterTypeImpl<WebAppType<T>>(this, "filter", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllFilterMapping()
   {
      childNode.remove("filter-mapping");
      return this;
   }

   /**
    * Returns the <code>filter-mapping</code> element
    * @return the node defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebAppType<T>> filterMapping()
   {
      return new FilterMappingTypeImpl<WebAppType<T>>(this, "filter-mapping", childNode);
   }

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebAppType<T>>> getFilterMappingList()
   {
      List<FilterMappingType<WebAppType<T>>> list = new ArrayList<FilterMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("filter-mapping");
      for (Node node : nodeList)
      {
         FilterMappingType<WebAppType<T>> type = new FilterMappingTypeImpl<WebAppType<T>>(this, "filter-mapping",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllListener()
   {
      childNode.remove("listener");
      return this;
   }

   /**
    * Returns the <code>listener</code> element
    * @return the node defined for the element <code>listener</code> 
    */
   public ListenerType<WebAppType<T>> listener()
   {
      return new ListenerTypeImpl<WebAppType<T>>(this, "listener", childNode);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebAppType<T>>> getListenerList()
   {
      List<ListenerType<WebAppType<T>>> list = new ArrayList<ListenerType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("listener");
      for (Node node : nodeList)
      {
         ListenerType<WebAppType<T>> type = new ListenerTypeImpl<WebAppType<T>>(this, "listener", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllServlet()
   {
      childNode.remove("servlet");
      return this;
   }

   /**
    * Returns the <code>servlet</code> element
    * @return the node defined for the element <code>servlet</code> 
    */
   public ServletType<WebAppType<T>> servlet()
   {
      return new ServletTypeImpl<WebAppType<T>>(this, "servlet", childNode);
   }

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebAppType<T>>> getServletList()
   {
      List<ServletType<WebAppType<T>>> list = new ArrayList<ServletType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("servlet");
      for (Node node : nodeList)
      {
         ServletType<WebAppType<T>> type = new ServletTypeImpl<WebAppType<T>>(this, "servlet", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllServletMapping()
   {
      childNode.remove("servlet-mapping");
      return this;
   }

   /**
    * Returns the <code>servlet-mapping</code> element
    * @return the node defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebAppType<T>> servletMapping()
   {
      return new ServletMappingTypeImpl<WebAppType<T>>(this, "servlet-mapping", childNode);
   }

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebAppType<T>>> getServletMappingList()
   {
      List<ServletMappingType<WebAppType<T>>> list = new ArrayList<ServletMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("servlet-mapping");
      for (Node node : nodeList)
      {
         ServletMappingType<WebAppType<T>> type = new ServletMappingTypeImpl<WebAppType<T>>(this, "servlet-mapping",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllSessionConfig()
   {
      childNode.remove("session-config");
      return this;
   }

   /**
    * Returns the <code>session-config</code> element
    * @return the node defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebAppType<T>> sessionConfig()
   {
      return new SessionConfigTypeImpl<WebAppType<T>>(this, "session-config", childNode);
   }

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebAppType<T>>> getSessionConfigList()
   {
      List<SessionConfigType<WebAppType<T>>> list = new ArrayList<SessionConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("session-config");
      for (Node node : nodeList)
      {
         SessionConfigType<WebAppType<T>> type = new SessionConfigTypeImpl<WebAppType<T>>(this, "session-config",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllMimeMapping()
   {
      childNode.remove("mime-mapping");
      return this;
   }

   /**
    * Returns the <code>mime-mapping</code> element
    * @return the node defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebAppType<T>> mimeMapping()
   {
      return new MimeMappingTypeImpl<WebAppType<T>>(this, "mime-mapping", childNode);
   }

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebAppType<T>>> getMimeMappingList()
   {
      List<MimeMappingType<WebAppType<T>>> list = new ArrayList<MimeMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("mime-mapping");
      for (Node node : nodeList)
      {
         MimeMappingType<WebAppType<T>> type = new MimeMappingTypeImpl<WebAppType<T>>(this, "mime-mapping", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllWelcomeFileList()
   {
      childNode.remove("welcome-file-list");
      return this;
   }

   /**
    * Returns the <code>welcome-file-list</code> element
    * @return the node defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebAppType<T>> welcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebAppType<T>>(this, "welcome-file-list", childNode);
   }

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebAppType<T>>> getWelcomeFileListList()
   {
      List<WelcomeFileListType<WebAppType<T>>> list = new ArrayList<WelcomeFileListType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("welcome-file-list");
      for (Node node : nodeList)
      {
         WelcomeFileListType<WebAppType<T>> type = new WelcomeFileListTypeImpl<WebAppType<T>>(this,
               "welcome-file-list", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllErrorPage()
   {
      childNode.remove("error-page");
      return this;
   }

   /**
    * Returns the <code>error-page</code> element
    * @return the node defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebAppType<T>> errorPage()
   {
      return new ErrorPageTypeImpl<WebAppType<T>>(this, "error-page", childNode);
   }

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebAppType<T>>> getErrorPageList()
   {
      List<ErrorPageType<WebAppType<T>>> list = new ArrayList<ErrorPageType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("error-page");
      for (Node node : nodeList)
      {
         ErrorPageType<WebAppType<T>> type = new ErrorPageTypeImpl<WebAppType<T>>(this, "error-page", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllJspConfig()
   {
      childNode.remove("jsp-config");
      return this;
   }

   /**
    * Returns the <code>jsp-config</code> element
    * @return the node defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebAppType<T>> jspConfig()
   {
      return new JspConfigTypeImpl<WebAppType<T>>(this, "jsp-config", childNode);
   }

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebAppType<T>>> getJspConfigList()
   {
      List<JspConfigType<WebAppType<T>>> list = new ArrayList<JspConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("jsp-config");
      for (Node node : nodeList)
      {
         JspConfigType<WebAppType<T>> type = new JspConfigTypeImpl<WebAppType<T>>(this, "jsp-config", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllSecurityConstraint()
   {
      childNode.remove("security-constraint");
      return this;
   }

   /**
    * Returns the <code>security-constraint</code> element
    * @return the node defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebAppType<T>> securityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebAppType<T>>(this, "security-constraint", childNode);
   }

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebAppType<T>>> getSecurityConstraintList()
   {
      List<SecurityConstraintType<WebAppType<T>>> list = new ArrayList<SecurityConstraintType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("security-constraint");
      for (Node node : nodeList)
      {
         SecurityConstraintType<WebAppType<T>> type = new SecurityConstraintTypeImpl<WebAppType<T>>(this,
               "security-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllLoginConfig()
   {
      childNode.remove("login-config");
      return this;
   }

   /**
    * Returns the <code>login-config</code> element
    * @return the node defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebAppType<T>> loginConfig()
   {
      return new LoginConfigTypeImpl<WebAppType<T>>(this, "login-config", childNode);
   }

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebAppType<T>>> getLoginConfigList()
   {
      List<LoginConfigType<WebAppType<T>>> list = new ArrayList<LoginConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("login-config");
      for (Node node : nodeList)
      {
         LoginConfigType<WebAppType<T>> type = new LoginConfigTypeImpl<WebAppType<T>>(this, "login-config", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllSecurityRole()
   {
      childNode.remove("security-role");
      return this;
   }

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebAppType<T>> securityRole()
   {
      return new SecurityRoleTypeImpl<WebAppType<T>>(this, "security-role", childNode);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebAppType<T>>> getSecurityRoleList()
   {
      List<SecurityRoleType<WebAppType<T>>> list = new ArrayList<SecurityRoleType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("security-role");
      for (Node node : nodeList)
      {
         SecurityRoleType<WebAppType<T>> type = new SecurityRoleTypeImpl<WebAppType<T>>(this, "security-role",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllMessageDestination()
   {
      childNode.remove("message-destination");
      return this;
   }

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebAppType<T>> messageDestination()
   {
      return new MessageDestinationTypeImpl<WebAppType<T>>(this, "message-destination", childNode);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebAppType<T>>> getMessageDestinationList()
   {
      List<MessageDestinationType<WebAppType<T>>> list = new ArrayList<MessageDestinationType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("message-destination");
      for (Node node : nodeList)
      {
         MessageDestinationType<WebAppType<T>> type = new MessageDestinationTypeImpl<WebAppType<T>>(this,
               "message-destination", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllLocaleEncodingMappingList()
   {
      childNode.remove("locale-encoding-mapping-list");
      return this;
   }

   /**
    * Returns the <code>locale-encoding-mapping-list</code> element
    * @return the node defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this, "locale-encoding-mapping-list", childNode);
   }

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebAppType<T>>> getLocaleEncodingMappingListList()
   {
      List<LocaleEncodingMappingListType<WebAppType<T>>> list = new ArrayList<LocaleEncodingMappingListType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("locale-encoding-mapping-list");
      for (Node node : nodeList)
      {
         LocaleEncodingMappingListType<WebAppType<T>> type = new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this,
               "locale-encoding-mapping-list", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllDescription()
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
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllDisplayName()
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
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<WebAppType<T>> icon()
   {
      return new IconTypeImpl<WebAppType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebAppType<T>>> getIconList()
   {
      List<IconType<WebAppType<T>>> list = new ArrayList<IconType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<WebAppType<T>> type = new IconTypeImpl<WebAppType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebAppType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<WebAppType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebAppType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<WebAppType<T>>> list = new ArrayList<EnvEntryType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<WebAppType<T>> type = new EnvEntryTypeImpl<WebAppType<T>>(this, "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebAppType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<WebAppType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebAppType<T>>> getEjbRefList()
   {
      List<EjbRefType<WebAppType<T>>> list = new ArrayList<EjbRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<WebAppType<T>> type = new EjbRefTypeImpl<WebAppType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebAppType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebAppType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebAppType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<WebAppType<T>>> list = new ArrayList<EjbLocalRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<WebAppType<T>> type = new EjbLocalRefTypeImpl<WebAppType<T>>(this, "ejb-local-ref", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebAppType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<WebAppType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebAppType<T>>> getResourceRefList()
   {
      List<ResourceRefType<WebAppType<T>>> list = new ArrayList<ResourceRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<WebAppType<T>> type = new ResourceRefTypeImpl<WebAppType<T>>(this, "resource-ref", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebAppType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebAppType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<WebAppType<T>>> list = new ArrayList<ResourceEnvRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<WebAppType<T>> type = new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "resource-env-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebAppType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebAppType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebAppType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<WebAppType<T>>> list = new ArrayList<MessageDestinationRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<WebAppType<T>> type = new MessageDestinationRefTypeImpl<WebAppType<T>>(this,
               "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebAppType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebAppType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebAppType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<WebAppType<T>>> list = new ArrayList<PersistenceContextRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<WebAppType<T>> type = new PersistenceContextRefTypeImpl<WebAppType<T>>(this,
               "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebAppType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebAppType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<WebAppType<T>>> list = new ArrayList<PersistenceUnitRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<WebAppType<T>> type = new PersistenceUnitRefTypeImpl<WebAppType<T>>(this,
               "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebAppType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebAppType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<WebAppType<T>>> list = new ArrayList<LifecycleCallbackType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebAppType<T>> type = new LifecycleCallbackTypeImpl<WebAppType<T>>(this,
               "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebAppType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebAppType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<WebAppType<T>>> list = new ArrayList<LifecycleCallbackType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebAppType<T>> type = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "pre-destroy",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebAppType<T>> dataSource()
   {
      return new DataSourceTypeImpl<WebAppType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebAppType<T>>> getDataSourceList()
   {
      List<DataSourceType<WebAppType<T>>> list = new ArrayList<DataSourceType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<WebAppType<T>> type = new DataSourceTypeImpl<WebAppType<T>>(this, "data-source", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setVersion(WebAppVersionType version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setVersion(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeVersion()
   {
      childNode.attributes().remove("version");
      return this;
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public WebAppVersionType getVersion()
   {
      return WebAppVersionType.getFromStringValue(childNode.attribute("version"));
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersionAsString()
   {
      return childNode.attribute("version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setMetadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeMetadataComplete()
   {
      childNode.attributes().remove("metadata-complete");
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.attribute("metadata-complete"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>module-name</code> element 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setModuleName(String moduleName)
   {
      childNode.create("module-name").text(moduleName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>module-name</code> elements, 
    * a new <code>module-name</code> element 
    * @param list of <code>module-name</code> objects 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> setModuleNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setModuleName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllModuleName()
   {
      childNode.remove("module-name");
      return this;
   }

   /**
    * Returns all <code>module-name</code> elements
    * @return list of <code>module-name</code> 
    */
   public List<String> getModuleNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("module-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : absolute-ordering
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>absolute-ordering</code> elements 
    * @return the current instance of {@link WebAppType<T>} 
    */
   public WebAppType<T> removeAllAbsoluteOrdering()
   {
      childNode.remove("absolute-ordering");
      return this;
   }

   /**
    * Returns the <code>absolute-ordering</code> element
    * @return the node defined for the element <code>absolute-ordering</code> 
    */
   public AbsoluteOrderingType<WebAppType<T>> absoluteOrdering()
   {
      return new AbsoluteOrderingTypeImpl<WebAppType<T>>(this, "absolute-ordering", childNode);
   }

   /**
    * Returns all <code>absolute-ordering</code> elements
    * @return list of <code>absolute-ordering</code> 
    */
   public List<AbsoluteOrderingType<WebAppType<T>>> getAbsoluteOrderingList()
   {
      List<AbsoluteOrderingType<WebAppType<T>>> list = new ArrayList<AbsoluteOrderingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("absolute-ordering");
      for (Node node : nodeList)
      {
         AbsoluteOrderingType<WebAppType<T>> type = new AbsoluteOrderingTypeImpl<WebAppType<T>>(this,
               "absolute-ordering", childNode, node);
         list.add(type);
      }
      return list;
   }

}
