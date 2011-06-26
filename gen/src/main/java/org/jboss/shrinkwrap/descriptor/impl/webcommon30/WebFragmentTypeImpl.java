package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;

/**
 * This class is a generated class.
 * Generation date :2011-06-26T17:25:18.735-04:00
 */
public class WebFragmentTypeImpl<T> implements Child<T>, WebFragmentType<T>
{
   public final static String nodeName = "";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebFragmentTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public WebFragmentTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // -------------------------------------------------------------------------------------||
   // Element type : distributable
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> distributable()
   {
      childNode.getOrCreate("distributable");
      return this;
   }

   public Boolean isDistributable()
   {
      return childNode.attributes().get("distributable") != null;
   }


   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeContextParam()
   {
      childNode.remove("context-param");
      return this;
   }

   public ParamValueType<WebFragmentType<T>> contextParam()
   {
      Node node = childNode.getOrCreate(ParamValueTypeImpl.nodeName);
      ParamValueType<WebFragmentType<T>> contextParam = new ParamValueTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return contextParam;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeFilter()
   {
      childNode.remove("filter");
      return this;
   }

   public FilterType<WebFragmentType<T>> filter()
   {
      Node node = childNode.getOrCreate(FilterTypeImpl.nodeName);
      FilterType<WebFragmentType<T>> filter = new FilterTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return filter;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeFilterMapping()
   {
      childNode.remove("filter-mapping");
      return this;
   }

   public FilterMappingType<WebFragmentType<T>> filterMapping()
   {
      Node node = childNode.getOrCreate(FilterMappingTypeImpl.nodeName);
      FilterMappingType<WebFragmentType<T>> filterMapping = new FilterMappingTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return filterMapping;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeListener()
   {
      childNode.remove("listener");
      return this;
   }

   public ListenerType<WebFragmentType<T>> listener()
   {
      Node node = childNode.getOrCreate(ListenerTypeImpl.nodeName);
      ListenerType<WebFragmentType<T>> listener = new ListenerTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return listener;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeServlet()
   {
      childNode.remove("servlet");
      return this;
   }

   public ServletType<WebFragmentType<T>> servlet()
   {
      Node node = childNode.getOrCreate(ServletTypeImpl.nodeName);
      ServletType<WebFragmentType<T>> servlet = new ServletTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return servlet;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeServletMapping()
   {
      childNode.remove("servlet-mapping");
      return this;
   }

   public ServletMappingType<WebFragmentType<T>> servletMapping()
   {
      Node node = childNode.getOrCreate(ServletMappingTypeImpl.nodeName);
      ServletMappingType<WebFragmentType<T>> servletMapping = new ServletMappingTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return servletMapping;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeSessionConfig()
   {
      childNode.remove("session-config");
      return this;
   }

   public SessionConfigType<WebFragmentType<T>> sessionConfig()
   {
      Node node = childNode.getOrCreate(SessionConfigTypeImpl.nodeName);
      SessionConfigType<WebFragmentType<T>> sessionConfig = new SessionConfigTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return sessionConfig;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeMimeMapping()
   {
      childNode.remove("mime-mapping");
      return this;
   }

   public MimeMappingType<WebFragmentType<T>> mimeMapping()
   {
      Node node = childNode.getOrCreate(MimeMappingTypeImpl.nodeName);
      MimeMappingType<WebFragmentType<T>> mimeMapping = new MimeMappingTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return mimeMapping;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeWelcomeFileList()
   {
      childNode.remove("welcome-file-list");
      return this;
   }

   public WelcomeFileListType<WebFragmentType<T>> welcomeFileList()
   {
      Node node = childNode.getOrCreate(WelcomeFileListTypeImpl.nodeName);
      WelcomeFileListType<WebFragmentType<T>> welcomeFileList = new WelcomeFileListTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return welcomeFileList;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeErrorPage()
   {
      childNode.remove("error-page");
      return this;
   }

   public ErrorPageType<WebFragmentType<T>> errorPage()
   {
      Node node = childNode.getOrCreate(ErrorPageTypeImpl.nodeName);
      ErrorPageType<WebFragmentType<T>> errorPage = new ErrorPageTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return errorPage;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeJspConfig()
   {
      childNode.remove("jsp-config");
      return this;
   }

   public JspConfigType<WebFragmentType<T>> jspConfig()
   {
      Node node = childNode.getOrCreate(JspConfigTypeImpl.nodeName);
      JspConfigType<WebFragmentType<T>> jspConfig = new JspConfigTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return jspConfig;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeSecurityConstraint()
   {
      childNode.remove("security-constraint");
      return this;
   }

   public SecurityConstraintType<WebFragmentType<T>> securityConstraint()
   {
      Node node = childNode.getOrCreate(SecurityConstraintTypeImpl.nodeName);
      SecurityConstraintType<WebFragmentType<T>> securityConstraint = new SecurityConstraintTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return securityConstraint;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeLoginConfig()
   {
      childNode.remove("login-config");
      return this;
   }

   public LoginConfigType<WebFragmentType<T>> loginConfig()
   {
      Node node = childNode.getOrCreate(LoginConfigTypeImpl.nodeName);
      LoginConfigType<WebFragmentType<T>> loginConfig = new LoginConfigTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return loginConfig;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeSecurityRole()
   {
      childNode.remove("security-role");
      return this;
   }

   public SecurityRoleType<WebFragmentType<T>> securityRole()
   {
      Node node = childNode.getOrCreate(SecurityRoleTypeImpl.nodeName);
      SecurityRoleType<WebFragmentType<T>> securityRole = new SecurityRoleTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return securityRole;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeMessageDestination()
   {
      childNode.remove("message-destination");
      return this;
   }

   public MessageDestinationType<WebFragmentType<T>> messageDestination()
   {
      Node node = childNode.getOrCreate(MessageDestinationTypeImpl.nodeName);
      MessageDestinationType<WebFragmentType<T>> messageDestination = new MessageDestinationTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return messageDestination;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeLocaleEncodingMappingList()
   {
      childNode.remove("locale-encoding-mapping-list");
      return this;
   }

   public LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList()
   {
      Node node = childNode.getOrCreate(LocaleEncodingMappingListTypeImpl.nodeName);
      LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList = new LocaleEncodingMappingListTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return localeEncodingMappingList;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public WebFragmentType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public WebFragmentType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

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
   public WebFragmentType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }
   public WebFragmentType<T> setDisplayNameList(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(name);
      }
      return this;
   }
   public WebFragmentType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

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
   public WebFragmentType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<WebFragmentType<T>> icon()
   {
      return new IconTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<IconType<WebFragmentType<T>>> getIconList()
   {
      List<IconType<WebFragmentType<T>>> list = new ArrayList<IconType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<WebFragmentType<T>>  type = new IconTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   public EnvEntryType<WebFragmentType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<EnvEntryType<WebFragmentType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<WebFragmentType<T>>> list = new ArrayList<EnvEntryType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(EnvEntryTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EnvEntryType<WebFragmentType<T>>  type = new EnvEntryTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   public EjbRefType<WebFragmentType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<EjbRefType<WebFragmentType<T>>> getEjbRefList()
   {
      List<EjbRefType<WebFragmentType<T>>> list = new ArrayList<EjbRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(EjbRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EjbRefType<WebFragmentType<T>>  type = new EjbRefTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<WebFragmentType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<EjbLocalRefType<WebFragmentType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<WebFragmentType<T>>> list = new ArrayList<EjbLocalRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(EjbLocalRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EjbLocalRefType<WebFragmentType<T>>  type = new EjbLocalRefTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   public ResourceRefType<WebFragmentType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ResourceRefType<WebFragmentType<T>>> getResourceRefList()
   {
      List<ResourceRefType<WebFragmentType<T>>> list = new ArrayList<ResourceRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ResourceRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ResourceRefType<WebFragmentType<T>>  type = new ResourceRefTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ResourceEnvRefType<WebFragmentType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<WebFragmentType<T>>> list = new ArrayList<ResourceEnvRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ResourceEnvRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ResourceEnvRefType<WebFragmentType<T>>  type = new ResourceEnvRefTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<MessageDestinationRefType<WebFragmentType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<WebFragmentType<T>>> list = new ArrayList<MessageDestinationRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         MessageDestinationRefType<WebFragmentType<T>>  type = new MessageDestinationRefTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<PersistenceContextRefType<WebFragmentType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<WebFragmentType<T>>> list = new ArrayList<PersistenceContextRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceContextRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PersistenceContextRefType<WebFragmentType<T>>  type = new PersistenceContextRefTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<PersistenceUnitRefType<WebFragmentType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<WebFragmentType<T>>> list = new ArrayList<PersistenceUnitRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceUnitRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<WebFragmentType<T>>  type = new PersistenceUnitRefTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   public LifecycleCallbackType<WebFragmentType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<LifecycleCallbackType<WebFragmentType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<WebFragmentType<T>>> list = new ArrayList<LifecycleCallbackType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(LifecycleCallbackTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebFragmentType<T>>  type = new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   public LifecycleCallbackType<WebFragmentType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<LifecycleCallbackType<WebFragmentType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<WebFragmentType<T>>> list = new ArrayList<LifecycleCallbackType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(LifecycleCallbackTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebFragmentType<T>>  type = new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   public DataSourceType<WebFragmentType<T>> dataSource()
   {
      return new DataSourceTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<DataSourceType<WebFragmentType<T>>> getDataSourceList()
   {
      List<DataSourceType<WebFragmentType<T>>> list = new ArrayList<DataSourceType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(DataSourceTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         DataSourceType<WebFragmentType<T>>  type = new DataSourceTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> setVersion(WebAppVersionType version)
   {
      childNode.attribute("version", version);
      return this;
   }
   public WebFragmentType<T> setVersion(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   public WebAppVersionType getVersion()
   {
      return WebAppVersionType.getFromStringValue(childNode.textValue("version"));
   }

   public String  getVersionAsString()
   {
      return childNode.textValue("version");
   }


   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.textValue("metadata-complete"));
   }


   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> setName(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }
   public WebFragmentType<T> removeName()
   {
      childNode.remove("name");
      return this;
   }

   public String getName()
   {
      return childNode.textValue("name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : ordering
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeOrdering()
   {
      childNode.remove("ordering");
      return this;
   }

   public OrderingType<WebFragmentType<T>> ordering()
   {
      Node node = childNode.getOrCreate(OrderingTypeImpl.nodeName);
      OrderingType<WebFragmentType<T>> ordering = new OrderingTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
      return ordering;
   }


}
