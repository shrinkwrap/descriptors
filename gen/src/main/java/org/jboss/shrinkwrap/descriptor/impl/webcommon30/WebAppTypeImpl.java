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
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String moduleName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private AbsoluteOrderingType<WebAppType<T>> absoluteOrdering;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean distributable;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ParamValueType<WebAppType<T>> contextParam;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private FilterType<WebAppType<T>> filter;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private FilterMappingType<WebAppType<T>> filterMapping;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ListenerType<WebAppType<T>> listener;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ServletType<WebAppType<T>> servlet;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ServletMappingType<WebAppType<T>> servletMapping;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private SessionConfigType<WebAppType<T>> sessionConfig;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private MimeMappingType<WebAppType<T>> mimeMapping;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private WelcomeFileListType<WebAppType<T>> welcomeFileList;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ErrorPageType<WebAppType<T>> errorPage;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private JspConfigType<WebAppType<T>> jspConfig;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private SecurityConstraintType<WebAppType<T>> securityConstraint;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private LoginConfigType<WebAppType<T>> loginConfig;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private SecurityRoleType<WebAppType<T>> securityRole;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private MessageDestinationType<WebAppType<T>> messageDestination;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private IconType<WebAppType<T>> icon;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private EnvEntryType<WebAppType<T>> envEntry;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private EjbRefType<WebAppType<T>> ejbRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private EjbLocalRefType<WebAppType<T>> ejbLocalRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private ResourceRefType<WebAppType<T>> resourceRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private ResourceEnvRefType<WebAppType<T>> resourceEnvRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private MessageDestinationRefType<WebAppType<T>> messageDestinationRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private PersistenceContextRefType<WebAppType<T>> persistenceContextRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private LifecycleCallbackType<WebAppType<T>> postConstruct;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private LifecycleCallbackType<WebAppType<T>> preDestroy;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private DataSourceType<WebAppType<T>> dataSource;
   private String version;
   private Boolean metadataComplete;
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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setDistributable(Boolean distributable)   {
      this.distributable = distributable;
      childNode.getOrCreate("distributable").text(distributable);
      return this;
   }

   public Boolean getDistributable()
   {
      return Strings.isTrue(childNode.textValue("distributable"));
   }

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setContextParam(ParamValueType<WebAppType<T>> contextParam)   {
      this.contextParam = contextParam;
      childNode.getOrCreate("context-param").text(contextParam);
      return this;
   }

   public ParamValueType<WebAppType<T>> getContextParam()
   {
      if( contextParam == null)
      {
          contextParam = new ParamValueTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return contextParam;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setFilter(FilterType<WebAppType<T>> filter)   {
      this.filter = filter;
      childNode.getOrCreate("filter").text(filter);
      return this;
   }

   public FilterType<WebAppType<T>> getFilter()
   {
      if( filter == null)
      {
          filter = new FilterTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return filter;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setFilterMapping(FilterMappingType<WebAppType<T>> filterMapping)   {
      this.filterMapping = filterMapping;
      childNode.getOrCreate("filter-mapping").text(filterMapping);
      return this;
   }

   public FilterMappingType<WebAppType<T>> getFilterMapping()
   {
      if( filterMapping == null)
      {
          filterMapping = new FilterMappingTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return filterMapping;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setListener(ListenerType<WebAppType<T>> listener)   {
      this.listener = listener;
      childNode.getOrCreate("listener").text(listener);
      return this;
   }

   public ListenerType<WebAppType<T>> getListener()
   {
      if( listener == null)
      {
          listener = new ListenerTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return listener;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setServlet(ServletType<WebAppType<T>> servlet)   {
      this.servlet = servlet;
      childNode.getOrCreate("servlet").text(servlet);
      return this;
   }

   public ServletType<WebAppType<T>> getServlet()
   {
      if( servlet == null)
      {
          servlet = new ServletTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return servlet;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setServletMapping(ServletMappingType<WebAppType<T>> servletMapping)   {
      this.servletMapping = servletMapping;
      childNode.getOrCreate("servlet-mapping").text(servletMapping);
      return this;
   }

   public ServletMappingType<WebAppType<T>> getServletMapping()
   {
      if( servletMapping == null)
      {
          servletMapping = new ServletMappingTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return servletMapping;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setSessionConfig(SessionConfigType<WebAppType<T>> sessionConfig)   {
      this.sessionConfig = sessionConfig;
      childNode.getOrCreate("session-config").text(sessionConfig);
      return this;
   }

   public SessionConfigType<WebAppType<T>> getSessionConfig()
   {
      if( sessionConfig == null)
      {
          sessionConfig = new SessionConfigTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return sessionConfig;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setMimeMapping(MimeMappingType<WebAppType<T>> mimeMapping)   {
      this.mimeMapping = mimeMapping;
      childNode.getOrCreate("mime-mapping").text(mimeMapping);
      return this;
   }

   public MimeMappingType<WebAppType<T>> getMimeMapping()
   {
      if( mimeMapping == null)
      {
          mimeMapping = new MimeMappingTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return mimeMapping;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setWelcomeFileList(WelcomeFileListType<WebAppType<T>> welcomeFileList)   {
      this.welcomeFileList = welcomeFileList;
      childNode.getOrCreate("welcome-file-list").text(welcomeFileList);
      return this;
   }

   public WelcomeFileListType<WebAppType<T>> getWelcomeFileList()
   {
      if( welcomeFileList == null)
      {
          welcomeFileList = new WelcomeFileListTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return welcomeFileList;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setErrorPage(ErrorPageType<WebAppType<T>> errorPage)   {
      this.errorPage = errorPage;
      childNode.getOrCreate("error-page").text(errorPage);
      return this;
   }

   public ErrorPageType<WebAppType<T>> getErrorPage()
   {
      if( errorPage == null)
      {
          errorPage = new ErrorPageTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return errorPage;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setJspConfig(JspConfigType<WebAppType<T>> jspConfig)   {
      this.jspConfig = jspConfig;
      childNode.getOrCreate("jsp-config").text(jspConfig);
      return this;
   }

   public JspConfigType<WebAppType<T>> getJspConfig()
   {
      if( jspConfig == null)
      {
          jspConfig = new JspConfigTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return jspConfig;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setSecurityConstraint(SecurityConstraintType<WebAppType<T>> securityConstraint)   {
      this.securityConstraint = securityConstraint;
      childNode.getOrCreate("security-constraint").text(securityConstraint);
      return this;
   }

   public SecurityConstraintType<WebAppType<T>> getSecurityConstraint()
   {
      if( securityConstraint == null)
      {
          securityConstraint = new SecurityConstraintTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return securityConstraint;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setLoginConfig(LoginConfigType<WebAppType<T>> loginConfig)   {
      this.loginConfig = loginConfig;
      childNode.getOrCreate("login-config").text(loginConfig);
      return this;
   }

   public LoginConfigType<WebAppType<T>> getLoginConfig()
   {
      if( loginConfig == null)
      {
          loginConfig = new LoginConfigTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return loginConfig;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setSecurityRole(SecurityRoleType<WebAppType<T>> securityRole)   {
      this.securityRole = securityRole;
      childNode.getOrCreate("security-role").text(securityRole);
      return this;
   }

   public SecurityRoleType<WebAppType<T>> getSecurityRole()
   {
      if( securityRole == null)
      {
          securityRole = new SecurityRoleTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return securityRole;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setMessageDestination(MessageDestinationType<WebAppType<T>> messageDestination)   {
      this.messageDestination = messageDestination;
      childNode.getOrCreate("message-destination").text(messageDestination);
      return this;
   }

   public MessageDestinationType<WebAppType<T>> getMessageDestination()
   {
      if( messageDestination == null)
      {
          messageDestination = new MessageDestinationTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return messageDestination;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList)   {
      this.localeEncodingMappingList = localeEncodingMappingList;
      childNode.getOrCreate("locale-encoding-mapping-list").text(localeEncodingMappingList);
      return this;
   }

   public LocaleEncodingMappingListType<WebAppType<T>> getLocaleEncodingMappingList()
   {
      if( localeEncodingMappingList == null)
      {
          localeEncodingMappingList = new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return localeEncodingMappingList;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public WebAppType<T> setDescription(String ... values)
   {
      for(String name: values)
      {
         setDescription(description);
      }
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

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public WebAppType<T> setDisplayName(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(displayName);
      }
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

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setIcon(IconType<WebAppType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<WebAppType<T>> getIcon()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setEnvEntry(EnvEntryType<WebAppType<T>> envEntry)
   {
      childNode.create("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<WebAppType<T>> getEnvEntry()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setEjbRef(EjbRefType<WebAppType<T>> ejbRef)
   {
      childNode.create("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<WebAppType<T>> getEjbRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setEjbLocalRef(EjbLocalRefType<WebAppType<T>> ejbLocalRef)
   {
      childNode.create("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<WebAppType<T>> getEjbLocalRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setResourceRef(ResourceRefType<WebAppType<T>> resourceRef)
   {
      childNode.create("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<WebAppType<T>> getResourceRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setResourceEnvRef(ResourceEnvRefType<WebAppType<T>> resourceEnvRef)
   {
      childNode.create("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<WebAppType<T>> getResourceEnvRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setMessageDestinationRef(MessageDestinationRefType<WebAppType<T>> messageDestinationRef)
   {
      childNode.create("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<WebAppType<T>> getMessageDestinationRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setPersistenceContextRef(PersistenceContextRefType<WebAppType<T>> persistenceContextRef)
   {
      childNode.create("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<WebAppType<T>> getPersistenceContextRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setPersistenceUnitRef(PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef)
   {
      childNode.create("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<WebAppType<T>> getPersistenceUnitRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setPostConstruct(LifecycleCallbackType<WebAppType<T>> postConstruct)
   {
      childNode.create("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<WebAppType<T>> getPostConstruct()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setPreDestroy(LifecycleCallbackType<WebAppType<T>> preDestroy)
   {
      childNode.create("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<WebAppType<T>> getPreDestroy()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setDataSource(DataSourceType<WebAppType<T>> dataSource)
   {
      childNode.create("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<WebAppType<T>> getDataSource()
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



   public WebAppType<T> setVersion(String version)
   {
      this.version = version;
      childNode.attribute("version", version);
      return this;
   }

   public String getVersion()
   {
      return childNode.textValue("version");
   }


   public WebAppType<T> setMetadataComplete(Boolean metadataComplete)
   {
      this.metadataComplete = metadataComplete;
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public Boolean getMetadataComplete()
   {
      return Strings.isTrue(childNode.textValue("metadata-complete"));
   }

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setModuleName(String moduleName)   {
      this.moduleName = moduleName;
      childNode.getOrCreate("module-name").text(moduleName);
      return this;
   }

   public String getModuleName()
   {
      return childNode.textValue("module-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setAbsoluteOrdering(AbsoluteOrderingType<WebAppType<T>> absoluteOrdering)   {
      this.absoluteOrdering = absoluteOrdering;
      childNode.getOrCreate("absolute-ordering").text(absoluteOrdering);
      return this;
   }

   public AbsoluteOrderingType<WebAppType<T>> getAbsoluteOrdering()
   {
      if( absoluteOrdering == null)
      {
          absoluteOrdering = new AbsoluteOrderingTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return absoluteOrdering;
   }


}
