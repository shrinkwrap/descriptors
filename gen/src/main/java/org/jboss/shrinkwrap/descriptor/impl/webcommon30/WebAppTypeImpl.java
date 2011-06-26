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
public class WebAppTypeImpl<T> implements Child<T>, WebAppType<T>
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

   public WebAppTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public WebAppTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
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
   public WebAppType<T> distributable()
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
   public WebAppType<T> removeContextParam()
   {
      childNode.remove("context-param");
      return this;
   }

   public ParamValueType<WebAppType<T>> contextParam()
   {
      Node node = childNode.getOrCreate(ParamValueTypeImpl.nodeName);
      ParamValueType<WebAppType<T>> contextParam = new ParamValueTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return contextParam;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeFilter()
   {
      childNode.remove("filter");
      return this;
   }

   public FilterType<WebAppType<T>> filter()
   {
      Node node = childNode.getOrCreate(FilterTypeImpl.nodeName);
      FilterType<WebAppType<T>> filter = new FilterTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return filter;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeFilterMapping()
   {
      childNode.remove("filter-mapping");
      return this;
   }

   public FilterMappingType<WebAppType<T>> filterMapping()
   {
      Node node = childNode.getOrCreate(FilterMappingTypeImpl.nodeName);
      FilterMappingType<WebAppType<T>> filterMapping = new FilterMappingTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return filterMapping;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeListener()
   {
      childNode.remove("listener");
      return this;
   }

   public ListenerType<WebAppType<T>> listener()
   {
      Node node = childNode.getOrCreate(ListenerTypeImpl.nodeName);
      ListenerType<WebAppType<T>> listener = new ListenerTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return listener;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeServlet()
   {
      childNode.remove("servlet");
      return this;
   }

   public ServletType<WebAppType<T>> servlet()
   {
      Node node = childNode.getOrCreate(ServletTypeImpl.nodeName);
      ServletType<WebAppType<T>> servlet = new ServletTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return servlet;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeServletMapping()
   {
      childNode.remove("servlet-mapping");
      return this;
   }

   public ServletMappingType<WebAppType<T>> servletMapping()
   {
      Node node = childNode.getOrCreate(ServletMappingTypeImpl.nodeName);
      ServletMappingType<WebAppType<T>> servletMapping = new ServletMappingTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return servletMapping;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeSessionConfig()
   {
      childNode.remove("session-config");
      return this;
   }

   public SessionConfigType<WebAppType<T>> sessionConfig()
   {
      Node node = childNode.getOrCreate(SessionConfigTypeImpl.nodeName);
      SessionConfigType<WebAppType<T>> sessionConfig = new SessionConfigTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return sessionConfig;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeMimeMapping()
   {
      childNode.remove("mime-mapping");
      return this;
   }

   public MimeMappingType<WebAppType<T>> mimeMapping()
   {
      Node node = childNode.getOrCreate(MimeMappingTypeImpl.nodeName);
      MimeMappingType<WebAppType<T>> mimeMapping = new MimeMappingTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return mimeMapping;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeWelcomeFileList()
   {
      childNode.remove("welcome-file-list");
      return this;
   }

   public WelcomeFileListType<WebAppType<T>> welcomeFileList()
   {
      Node node = childNode.getOrCreate(WelcomeFileListTypeImpl.nodeName);
      WelcomeFileListType<WebAppType<T>> welcomeFileList = new WelcomeFileListTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return welcomeFileList;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeErrorPage()
   {
      childNode.remove("error-page");
      return this;
   }

   public ErrorPageType<WebAppType<T>> errorPage()
   {
      Node node = childNode.getOrCreate(ErrorPageTypeImpl.nodeName);
      ErrorPageType<WebAppType<T>> errorPage = new ErrorPageTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return errorPage;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeJspConfig()
   {
      childNode.remove("jsp-config");
      return this;
   }

   public JspConfigType<WebAppType<T>> jspConfig()
   {
      Node node = childNode.getOrCreate(JspConfigTypeImpl.nodeName);
      JspConfigType<WebAppType<T>> jspConfig = new JspConfigTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return jspConfig;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeSecurityConstraint()
   {
      childNode.remove("security-constraint");
      return this;
   }

   public SecurityConstraintType<WebAppType<T>> securityConstraint()
   {
      Node node = childNode.getOrCreate(SecurityConstraintTypeImpl.nodeName);
      SecurityConstraintType<WebAppType<T>> securityConstraint = new SecurityConstraintTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return securityConstraint;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeLoginConfig()
   {
      childNode.remove("login-config");
      return this;
   }

   public LoginConfigType<WebAppType<T>> loginConfig()
   {
      Node node = childNode.getOrCreate(LoginConfigTypeImpl.nodeName);
      LoginConfigType<WebAppType<T>> loginConfig = new LoginConfigTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return loginConfig;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeSecurityRole()
   {
      childNode.remove("security-role");
      return this;
   }

   public SecurityRoleType<WebAppType<T>> securityRole()
   {
      Node node = childNode.getOrCreate(SecurityRoleTypeImpl.nodeName);
      SecurityRoleType<WebAppType<T>> securityRole = new SecurityRoleTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return securityRole;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeMessageDestination()
   {
      childNode.remove("message-destination");
      return this;
   }

   public MessageDestinationType<WebAppType<T>> messageDestination()
   {
      Node node = childNode.getOrCreate(MessageDestinationTypeImpl.nodeName);
      MessageDestinationType<WebAppType<T>> messageDestination = new MessageDestinationTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return messageDestination;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeLocaleEncodingMappingList()
   {
      childNode.remove("locale-encoding-mapping-list");
      return this;
   }

   public LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList()
   {
      Node node = childNode.getOrCreate(LocaleEncodingMappingListTypeImpl.nodeName);
      LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList = new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return localeEncodingMappingList;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public WebAppType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public WebAppType<T> removeAllDescription()
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
   public WebAppType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }
   public WebAppType<T> setDisplayNameList(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(name);
      }
      return this;
   }
   public WebAppType<T> removeAllDisplayName()
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
   public WebAppType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<WebAppType<T>> icon()
   {
      return new IconTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<IconType<WebAppType<T>>> getIconList()
   {
      List<IconType<WebAppType<T>>> list = new ArrayList<IconType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<WebAppType<T>>  type = new IconTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   public EnvEntryType<WebAppType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<EnvEntryType<WebAppType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<WebAppType<T>>> list = new ArrayList<EnvEntryType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(EnvEntryTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EnvEntryType<WebAppType<T>>  type = new EnvEntryTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   public EjbRefType<WebAppType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<EjbRefType<WebAppType<T>>> getEjbRefList()
   {
      List<EjbRefType<WebAppType<T>>> list = new ArrayList<EjbRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(EjbRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EjbRefType<WebAppType<T>>  type = new EjbRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<WebAppType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<EjbLocalRefType<WebAppType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<WebAppType<T>>> list = new ArrayList<EjbLocalRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(EjbLocalRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EjbLocalRefType<WebAppType<T>>  type = new EjbLocalRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   public ResourceRefType<WebAppType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<ResourceRefType<WebAppType<T>>> getResourceRefList()
   {
      List<ResourceRefType<WebAppType<T>>> list = new ArrayList<ResourceRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(ResourceRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ResourceRefType<WebAppType<T>>  type = new ResourceRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<WebAppType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<ResourceEnvRefType<WebAppType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<WebAppType<T>>> list = new ArrayList<ResourceEnvRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(ResourceEnvRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ResourceEnvRefType<WebAppType<T>>  type = new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<WebAppType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<MessageDestinationRefType<WebAppType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<WebAppType<T>>> list = new ArrayList<MessageDestinationRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         MessageDestinationRefType<WebAppType<T>>  type = new MessageDestinationRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<WebAppType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<PersistenceContextRefType<WebAppType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<WebAppType<T>>> list = new ArrayList<PersistenceContextRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceContextRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PersistenceContextRefType<WebAppType<T>>  type = new PersistenceContextRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<PersistenceUnitRefType<WebAppType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<WebAppType<T>>> list = new ArrayList<PersistenceUnitRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceUnitRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<WebAppType<T>>  type = new PersistenceUnitRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   public LifecycleCallbackType<WebAppType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<LifecycleCallbackType<WebAppType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<WebAppType<T>>> list = new ArrayList<LifecycleCallbackType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(LifecycleCallbackTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebAppType<T>>  type = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   public LifecycleCallbackType<WebAppType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<LifecycleCallbackType<WebAppType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<WebAppType<T>>> list = new ArrayList<LifecycleCallbackType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(LifecycleCallbackTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebAppType<T>>  type = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   public DataSourceType<WebAppType<T>> dataSource()
   {
      return new DataSourceTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<DataSourceType<WebAppType<T>>> getDataSourceList()
   {
      List<DataSourceType<WebAppType<T>>> list = new ArrayList<DataSourceType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(DataSourceTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         DataSourceType<WebAppType<T>>  type = new DataSourceTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> setVersion(WebAppVersionType version)
   {
      childNode.attribute("version", version);
      return this;
   }
   public WebAppType<T> setVersion(String version)
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
   public WebAppType<T> setMetadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.textValue("metadata-complete"));
   }


   // -------------------------------------------------------------------------------------||
   // Element type : module-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> setModuleName(String moduleName)
   {
      childNode.getOrCreate("module-name").text(moduleName);
      return this;
   }
   public WebAppType<T> removeModuleName()
   {
      childNode.remove("module-name");
      return this;
   }

   public String getModuleName()
   {
      return childNode.textValue("module-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : absolute-ordering
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAbsoluteOrdering()
   {
      childNode.remove("absolute-ordering");
      return this;
   }

   public AbsoluteOrderingType<WebAppType<T>> absoluteOrdering()
   {
      Node node = childNode.getOrCreate(AbsoluteOrderingTypeImpl.nodeName);
      AbsoluteOrderingType<WebAppType<T>> absoluteOrdering = new AbsoluteOrderingTypeImpl<WebAppType<T>>(this, "", childNode, node);
      return absoluteOrdering;
   }


}
