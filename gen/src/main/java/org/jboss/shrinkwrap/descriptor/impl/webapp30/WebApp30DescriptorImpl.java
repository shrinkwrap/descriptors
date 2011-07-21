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
package org.jboss.shrinkwrap.descriptor.impl.webapp30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
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
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
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
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.AbsoluteOrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ErrorPageTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LocaleEncodingMappingListTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LoginConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.MimeMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.SecurityConstraintTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ServletMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ServletTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.SessionConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.WelcomeFileListTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the web-app_3_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebApp30Descriptor descriptor = Descriptors.create(WebApp30Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class WebApp30DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<WebApp30Descriptor>,
         WebApp30Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebApp30DescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("web-app"));
   }

   public WebApp30DescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }

   protected DescriptorExporter getExporter()
   {
      return new XmlDomExporter();
   }

   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||

   public WebApp30Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd");
      return this;
   }

   public WebApp30Descriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   public WebApp30Descriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name : nameSpaceKeys)
      {
         model.attributes().remove(name);
      }
      return this;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>module-name</code> element 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setModuleName(String moduleName)
   {
      model.create("module-name").text(moduleName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>module-name</code> elements, 
    * a new <code>module-name</code> element 
    * @param list of <code>module-name</code> objects 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setModuleNameList(String... values)
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllModuleName()
   {
      model.remove("module-name");
      return this;
   }

   /**
    * Returns all <code>module-name</code> elements
    * @return list of <code>module-name</code> 
    */
   public List<String> getModuleNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("module-name");
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllAbsoluteOrdering()
   {
      model.remove("absolute-ordering");
      return this;
   }

   /**
    * Returns the <code>absolute-ordering</code> element
    * @return the node defined for the element <code>absolute-ordering</code> 
    */
   public AbsoluteOrderingType<WebApp30Descriptor> absoluteOrdering()
   {
      return new AbsoluteOrderingTypeImpl<WebApp30Descriptor>(this, "absolute-ordering", model);
   }

   /**
    * Returns all <code>absolute-ordering</code> elements
    * @return list of <code>absolute-ordering</code> 
    */
   public List<AbsoluteOrderingType<WebApp30Descriptor>> getAbsoluteOrderingList()
   {
      List<AbsoluteOrderingType<WebApp30Descriptor>> list = new ArrayList<AbsoluteOrderingType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("absolute-ordering");
      for (Node node : nodeList)
      {
         AbsoluteOrderingType<WebApp30Descriptor> type = new AbsoluteOrderingTypeImpl<WebApp30Descriptor>(this,
               "absolute-ordering", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : distributable
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor distributable()
   {
      model.getOrCreate("distributable");
      return this;
   }

   public Boolean isDistributable()
   {
      return model.getSingle("distributable") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllContextParam()
   {
      model.remove("context-param");
      return this;
   }

   /**
    * Returns the <code>context-param</code> element
    * @return the node defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebApp30Descriptor> contextParam()
   {
      return new ParamValueTypeImpl<WebApp30Descriptor>(this, "context-param", model);
   }

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebApp30Descriptor>> getContextParamList()
   {
      List<ParamValueType<WebApp30Descriptor>> list = new ArrayList<ParamValueType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("context-param");
      for (Node node : nodeList)
      {
         ParamValueType<WebApp30Descriptor> type = new ParamValueTypeImpl<WebApp30Descriptor>(this, "context-param",
               model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllFilter()
   {
      model.remove("filter");
      return this;
   }

   /**
    * Returns the <code>filter</code> element
    * @return the node defined for the element <code>filter</code> 
    */
   public FilterType<WebApp30Descriptor> filter()
   {
      return new FilterTypeImpl<WebApp30Descriptor>(this, "filter", model);
   }

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebApp30Descriptor>> getFilterList()
   {
      List<FilterType<WebApp30Descriptor>> list = new ArrayList<FilterType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("filter");
      for (Node node : nodeList)
      {
         FilterType<WebApp30Descriptor> type = new FilterTypeImpl<WebApp30Descriptor>(this, "filter", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllFilterMapping()
   {
      model.remove("filter-mapping");
      return this;
   }

   /**
    * Returns the <code>filter-mapping</code> element
    * @return the node defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebApp30Descriptor> filterMapping()
   {
      return new FilterMappingTypeImpl<WebApp30Descriptor>(this, "filter-mapping", model);
   }

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebApp30Descriptor>> getFilterMappingList()
   {
      List<FilterMappingType<WebApp30Descriptor>> list = new ArrayList<FilterMappingType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("filter-mapping");
      for (Node node : nodeList)
      {
         FilterMappingType<WebApp30Descriptor> type = new FilterMappingTypeImpl<WebApp30Descriptor>(this,
               "filter-mapping", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllListener()
   {
      model.remove("listener");
      return this;
   }

   /**
    * Returns the <code>listener</code> element
    * @return the node defined for the element <code>listener</code> 
    */
   public ListenerType<WebApp30Descriptor> listener()
   {
      return new ListenerTypeImpl<WebApp30Descriptor>(this, "listener", model);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebApp30Descriptor>> getListenerList()
   {
      List<ListenerType<WebApp30Descriptor>> list = new ArrayList<ListenerType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("listener");
      for (Node node : nodeList)
      {
         ListenerType<WebApp30Descriptor> type = new ListenerTypeImpl<WebApp30Descriptor>(this, "listener", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllServlet()
   {
      model.remove("servlet");
      return this;
   }

   /**
    * Returns the <code>servlet</code> element
    * @return the node defined for the element <code>servlet</code> 
    */
   public ServletType<WebApp30Descriptor> servlet()
   {
      return new ServletTypeImpl<WebApp30Descriptor>(this, "servlet", model);
   }

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebApp30Descriptor>> getServletList()
   {
      List<ServletType<WebApp30Descriptor>> list = new ArrayList<ServletType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("servlet");
      for (Node node : nodeList)
      {
         ServletType<WebApp30Descriptor> type = new ServletTypeImpl<WebApp30Descriptor>(this, "servlet", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllServletMapping()
   {
      model.remove("servlet-mapping");
      return this;
   }

   /**
    * Returns the <code>servlet-mapping</code> element
    * @return the node defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebApp30Descriptor> servletMapping()
   {
      return new ServletMappingTypeImpl<WebApp30Descriptor>(this, "servlet-mapping", model);
   }

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebApp30Descriptor>> getServletMappingList()
   {
      List<ServletMappingType<WebApp30Descriptor>> list = new ArrayList<ServletMappingType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("servlet-mapping");
      for (Node node : nodeList)
      {
         ServletMappingType<WebApp30Descriptor> type = new ServletMappingTypeImpl<WebApp30Descriptor>(this,
               "servlet-mapping", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllSessionConfig()
   {
      model.remove("session-config");
      return this;
   }

   /**
    * Returns the <code>session-config</code> element
    * @return the node defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebApp30Descriptor> sessionConfig()
   {
      return new SessionConfigTypeImpl<WebApp30Descriptor>(this, "session-config", model);
   }

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebApp30Descriptor>> getSessionConfigList()
   {
      List<SessionConfigType<WebApp30Descriptor>> list = new ArrayList<SessionConfigType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("session-config");
      for (Node node : nodeList)
      {
         SessionConfigType<WebApp30Descriptor> type = new SessionConfigTypeImpl<WebApp30Descriptor>(this,
               "session-config", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllMimeMapping()
   {
      model.remove("mime-mapping");
      return this;
   }

   /**
    * Returns the <code>mime-mapping</code> element
    * @return the node defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebApp30Descriptor> mimeMapping()
   {
      return new MimeMappingTypeImpl<WebApp30Descriptor>(this, "mime-mapping", model);
   }

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebApp30Descriptor>> getMimeMappingList()
   {
      List<MimeMappingType<WebApp30Descriptor>> list = new ArrayList<MimeMappingType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("mime-mapping");
      for (Node node : nodeList)
      {
         MimeMappingType<WebApp30Descriptor> type = new MimeMappingTypeImpl<WebApp30Descriptor>(this, "mime-mapping",
               model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllWelcomeFileList()
   {
      model.remove("welcome-file-list");
      return this;
   }

   /**
    * Returns the <code>welcome-file-list</code> element
    * @return the node defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebApp30Descriptor> welcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebApp30Descriptor>(this, "welcome-file-list", model);
   }

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebApp30Descriptor>> getWelcomeFileListList()
   {
      List<WelcomeFileListType<WebApp30Descriptor>> list = new ArrayList<WelcomeFileListType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("welcome-file-list");
      for (Node node : nodeList)
      {
         WelcomeFileListType<WebApp30Descriptor> type = new WelcomeFileListTypeImpl<WebApp30Descriptor>(this,
               "welcome-file-list", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllErrorPage()
   {
      model.remove("error-page");
      return this;
   }

   /**
    * Returns the <code>error-page</code> element
    * @return the node defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebApp30Descriptor> errorPage()
   {
      return new ErrorPageTypeImpl<WebApp30Descriptor>(this, "error-page", model);
   }

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebApp30Descriptor>> getErrorPageList()
   {
      List<ErrorPageType<WebApp30Descriptor>> list = new ArrayList<ErrorPageType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("error-page");
      for (Node node : nodeList)
      {
         ErrorPageType<WebApp30Descriptor> type = new ErrorPageTypeImpl<WebApp30Descriptor>(this, "error-page", model,
               node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllJspConfig()
   {
      model.remove("jsp-config");
      return this;
   }

   /**
    * Returns the <code>jsp-config</code> element
    * @return the node defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebApp30Descriptor> jspConfig()
   {
      return new JspConfigTypeImpl<WebApp30Descriptor>(this, "jsp-config", model);
   }

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebApp30Descriptor>> getJspConfigList()
   {
      List<JspConfigType<WebApp30Descriptor>> list = new ArrayList<JspConfigType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("jsp-config");
      for (Node node : nodeList)
      {
         JspConfigType<WebApp30Descriptor> type = new JspConfigTypeImpl<WebApp30Descriptor>(this, "jsp-config", model,
               node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllSecurityConstraint()
   {
      model.remove("security-constraint");
      return this;
   }

   /**
    * Returns the <code>security-constraint</code> element
    * @return the node defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebApp30Descriptor> securityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebApp30Descriptor>(this, "security-constraint", model);
   }

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebApp30Descriptor>> getSecurityConstraintList()
   {
      List<SecurityConstraintType<WebApp30Descriptor>> list = new ArrayList<SecurityConstraintType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("security-constraint");
      for (Node node : nodeList)
      {
         SecurityConstraintType<WebApp30Descriptor> type = new SecurityConstraintTypeImpl<WebApp30Descriptor>(this,
               "security-constraint", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllLoginConfig()
   {
      model.remove("login-config");
      return this;
   }

   /**
    * Returns the <code>login-config</code> element
    * @return the node defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebApp30Descriptor> loginConfig()
   {
      return new LoginConfigTypeImpl<WebApp30Descriptor>(this, "login-config", model);
   }

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebApp30Descriptor>> getLoginConfigList()
   {
      List<LoginConfigType<WebApp30Descriptor>> list = new ArrayList<LoginConfigType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("login-config");
      for (Node node : nodeList)
      {
         LoginConfigType<WebApp30Descriptor> type = new LoginConfigTypeImpl<WebApp30Descriptor>(this, "login-config",
               model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllSecurityRole()
   {
      model.remove("security-role");
      return this;
   }

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebApp30Descriptor> securityRole()
   {
      return new SecurityRoleTypeImpl<WebApp30Descriptor>(this, "security-role", model);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebApp30Descriptor>> getSecurityRoleList()
   {
      List<SecurityRoleType<WebApp30Descriptor>> list = new ArrayList<SecurityRoleType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("security-role");
      for (Node node : nodeList)
      {
         SecurityRoleType<WebApp30Descriptor> type = new SecurityRoleTypeImpl<WebApp30Descriptor>(this,
               "security-role", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllMessageDestination()
   {
      model.remove("message-destination");
      return this;
   }

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebApp30Descriptor> messageDestination()
   {
      return new MessageDestinationTypeImpl<WebApp30Descriptor>(this, "message-destination", model);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebApp30Descriptor>> getMessageDestinationList()
   {
      List<MessageDestinationType<WebApp30Descriptor>> list = new ArrayList<MessageDestinationType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("message-destination");
      for (Node node : nodeList)
      {
         MessageDestinationType<WebApp30Descriptor> type = new MessageDestinationTypeImpl<WebApp30Descriptor>(this,
               "message-destination", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllLocaleEncodingMappingList()
   {
      model.remove("locale-encoding-mapping-list");
      return this;
   }

   /**
    * Returns the <code>locale-encoding-mapping-list</code> element
    * @return the node defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebApp30Descriptor> localeEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebApp30Descriptor>(this, "locale-encoding-mapping-list", model);
   }

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebApp30Descriptor>> getLocaleEncodingMappingListList()
   {
      List<LocaleEncodingMappingListType<WebApp30Descriptor>> list = new ArrayList<LocaleEncodingMappingListType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("locale-encoding-mapping-list");
      for (Node node : nodeList)
      {
         LocaleEncodingMappingListType<WebApp30Descriptor> type = new LocaleEncodingMappingListTypeImpl<WebApp30Descriptor>(
               this, "locale-encoding-mapping-list", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setDescriptionList(String... values)
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllDescription()
   {
      model.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("description");
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setDisplayNameList(String... values)
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllDisplayName()
   {
      model.remove("display-name");
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("display-name");
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<WebApp30Descriptor> icon()
   {
      return new IconTypeImpl<WebApp30Descriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebApp30Descriptor>> getIconList()
   {
      List<IconType<WebApp30Descriptor>> list = new ArrayList<IconType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("icon");
      for (Node node : nodeList)
      {
         IconType<WebApp30Descriptor> type = new IconTypeImpl<WebApp30Descriptor>(this, "icon", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllEnvEntry()
   {
      model.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebApp30Descriptor> envEntry()
   {
      return new EnvEntryTypeImpl<WebApp30Descriptor>(this, "env-entry", model);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebApp30Descriptor>> getEnvEntryList()
   {
      List<EnvEntryType<WebApp30Descriptor>> list = new ArrayList<EnvEntryType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<WebApp30Descriptor> type = new EnvEntryTypeImpl<WebApp30Descriptor>(this, "env-entry", model,
               node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllEjbRef()
   {
      model.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebApp30Descriptor> ejbRef()
   {
      return new EjbRefTypeImpl<WebApp30Descriptor>(this, "ejb-ref", model);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebApp30Descriptor>> getEjbRefList()
   {
      List<EjbRefType<WebApp30Descriptor>> list = new ArrayList<EjbRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<WebApp30Descriptor> type = new EjbRefTypeImpl<WebApp30Descriptor>(this, "ejb-ref", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllEjbLocalRef()
   {
      model.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebApp30Descriptor> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebApp30Descriptor>(this, "ejb-local-ref", model);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebApp30Descriptor>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<WebApp30Descriptor>> list = new ArrayList<EjbLocalRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<WebApp30Descriptor> type = new EjbLocalRefTypeImpl<WebApp30Descriptor>(this, "ejb-local-ref",
               model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllResourceRef()
   {
      model.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebApp30Descriptor> resourceRef()
   {
      return new ResourceRefTypeImpl<WebApp30Descriptor>(this, "resource-ref", model);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebApp30Descriptor>> getResourceRefList()
   {
      List<ResourceRefType<WebApp30Descriptor>> list = new ArrayList<ResourceRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<WebApp30Descriptor> type = new ResourceRefTypeImpl<WebApp30Descriptor>(this, "resource-ref",
               model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllResourceEnvRef()
   {
      model.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebApp30Descriptor> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebApp30Descriptor>(this, "resource-env-ref", model);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebApp30Descriptor>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<WebApp30Descriptor>> list = new ArrayList<ResourceEnvRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<WebApp30Descriptor> type = new ResourceEnvRefTypeImpl<WebApp30Descriptor>(this,
               "resource-env-ref", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllMessageDestinationRef()
   {
      model.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebApp30Descriptor> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebApp30Descriptor>(this, "message-destination-ref", model);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebApp30Descriptor>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<WebApp30Descriptor>> list = new ArrayList<MessageDestinationRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<WebApp30Descriptor> type = new MessageDestinationRefTypeImpl<WebApp30Descriptor>(
               this, "message-destination-ref", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllPersistenceContextRef()
   {
      model.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebApp30Descriptor> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebApp30Descriptor>(this, "persistence-context-ref", model);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebApp30Descriptor>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<WebApp30Descriptor>> list = new ArrayList<PersistenceContextRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<WebApp30Descriptor> type = new PersistenceContextRefTypeImpl<WebApp30Descriptor>(
               this, "persistence-context-ref", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllPersistenceUnitRef()
   {
      model.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebApp30Descriptor> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebApp30Descriptor>(this, "persistence-unit-ref", model);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebApp30Descriptor>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<WebApp30Descriptor>> list = new ArrayList<PersistenceUnitRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<WebApp30Descriptor> type = new PersistenceUnitRefTypeImpl<WebApp30Descriptor>(this,
               "persistence-unit-ref", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllPostConstruct()
   {
      model.remove("post-construct");
      return this;
   }

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebApp30Descriptor> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this, "post-construct", model);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebApp30Descriptor>> getPostConstructList()
   {
      List<LifecycleCallbackType<WebApp30Descriptor>> list = new ArrayList<LifecycleCallbackType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebApp30Descriptor> type = new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this,
               "post-construct", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllPreDestroy()
   {
      model.remove("pre-destroy");
      return this;
   }

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebApp30Descriptor> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this, "pre-destroy", model);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebApp30Descriptor>> getPreDestroyList()
   {
      List<LifecycleCallbackType<WebApp30Descriptor>> list = new ArrayList<LifecycleCallbackType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebApp30Descriptor> type = new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this,
               "pre-destroy", model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeAllDataSource()
   {
      model.remove("data-source");
      return this;
   }

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebApp30Descriptor> dataSource()
   {
      return new DataSourceTypeImpl<WebApp30Descriptor>(this, "data-source", model);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebApp30Descriptor>> getDataSourceList()
   {
      List<DataSourceType<WebApp30Descriptor>> list = new ArrayList<DataSourceType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<WebApp30Descriptor> type = new DataSourceTypeImpl<WebApp30Descriptor>(this, "data-source",
               model, node);
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
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setVersion(WebAppVersionType version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeVersion()
   {
      model.attributes().remove("version");
      return this;
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public WebAppVersionType getVersion()
   {
      return WebAppVersionType.getFromStringValue(model.attribute("version"));
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersionAsString()
   {
      return model.attribute("version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor setMetadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link WebApp30Descriptor} 
    */
   public WebApp30Descriptor removeMetadataComplete()
   {
      model.attributes().remove("metadata-complete");
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(model.attribute("metadata-complete"));
   }

}
