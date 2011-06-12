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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebFragmentType;
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
public class WebFragmentTypeImpl<T> implements Child<T>, WebFragmentType<T>
{
   public final static String nodeName = "";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String name;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private OrderingType<WebFragmentType<T>> ordering;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean distributable;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ParamValueType<WebFragmentType<T>> contextParam;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private FilterType<WebFragmentType<T>> filter;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private FilterMappingType<WebFragmentType<T>> filterMapping;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ListenerType<WebFragmentType<T>> listener;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ServletType<WebFragmentType<T>> servlet;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ServletMappingType<WebFragmentType<T>> servletMapping;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private SessionConfigType<WebFragmentType<T>> sessionConfig;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private MimeMappingType<WebFragmentType<T>> mimeMapping;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private WelcomeFileListType<WebFragmentType<T>> welcomeFileList;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ErrorPageType<WebFragmentType<T>> errorPage;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private JspConfigType<WebFragmentType<T>> jspConfig;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private SecurityConstraintType<WebFragmentType<T>> securityConstraint;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private LoginConfigType<WebFragmentType<T>> loginConfig;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private SecurityRoleType<WebFragmentType<T>> securityRole;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private MessageDestinationType<WebFragmentType<T>> messageDestination;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private IconType<WebFragmentType<T>> icon;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private EnvEntryType<WebFragmentType<T>> envEntry;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private EjbRefType<WebFragmentType<T>> ejbRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private EjbLocalRefType<WebFragmentType<T>> ejbLocalRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private ResourceRefType<WebFragmentType<T>> resourceRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private LifecycleCallbackType<WebFragmentType<T>> postConstruct;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private LifecycleCallbackType<WebFragmentType<T>> preDestroy;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private DataSourceType<WebFragmentType<T>> dataSource;
   private String version;
   private Boolean metadataComplete;
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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setDistributable(Boolean distributable)   {
      this.distributable = distributable;
      childNode.getOrCreate("distributable").text(distributable);
      return this;
   }

   public Boolean getDistributable()
   {
      return Strings.isTrue(childNode.textValue("distributable"));
   }

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setContextParam(ParamValueType<WebFragmentType<T>> contextParam)   {
      this.contextParam = contextParam;
      childNode.getOrCreate("context-param").text(contextParam);
      return this;
   }

   public ParamValueType<WebFragmentType<T>> getContextParam()
   {
      if( contextParam == null)
      {
          contextParam = new ParamValueTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return contextParam;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setFilter(FilterType<WebFragmentType<T>> filter)   {
      this.filter = filter;
      childNode.getOrCreate("filter").text(filter);
      return this;
   }

   public FilterType<WebFragmentType<T>> getFilter()
   {
      if( filter == null)
      {
          filter = new FilterTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return filter;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setFilterMapping(FilterMappingType<WebFragmentType<T>> filterMapping)   {
      this.filterMapping = filterMapping;
      childNode.getOrCreate("filter-mapping").text(filterMapping);
      return this;
   }

   public FilterMappingType<WebFragmentType<T>> getFilterMapping()
   {
      if( filterMapping == null)
      {
          filterMapping = new FilterMappingTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return filterMapping;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setListener(ListenerType<WebFragmentType<T>> listener)   {
      this.listener = listener;
      childNode.getOrCreate("listener").text(listener);
      return this;
   }

   public ListenerType<WebFragmentType<T>> getListener()
   {
      if( listener == null)
      {
          listener = new ListenerTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return listener;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setServlet(ServletType<WebFragmentType<T>> servlet)   {
      this.servlet = servlet;
      childNode.getOrCreate("servlet").text(servlet);
      return this;
   }

   public ServletType<WebFragmentType<T>> getServlet()
   {
      if( servlet == null)
      {
          servlet = new ServletTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return servlet;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setServletMapping(ServletMappingType<WebFragmentType<T>> servletMapping)   {
      this.servletMapping = servletMapping;
      childNode.getOrCreate("servlet-mapping").text(servletMapping);
      return this;
   }

   public ServletMappingType<WebFragmentType<T>> getServletMapping()
   {
      if( servletMapping == null)
      {
          servletMapping = new ServletMappingTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return servletMapping;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setSessionConfig(SessionConfigType<WebFragmentType<T>> sessionConfig)   {
      this.sessionConfig = sessionConfig;
      childNode.getOrCreate("session-config").text(sessionConfig);
      return this;
   }

   public SessionConfigType<WebFragmentType<T>> getSessionConfig()
   {
      if( sessionConfig == null)
      {
          sessionConfig = new SessionConfigTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return sessionConfig;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setMimeMapping(MimeMappingType<WebFragmentType<T>> mimeMapping)   {
      this.mimeMapping = mimeMapping;
      childNode.getOrCreate("mime-mapping").text(mimeMapping);
      return this;
   }

   public MimeMappingType<WebFragmentType<T>> getMimeMapping()
   {
      if( mimeMapping == null)
      {
          mimeMapping = new MimeMappingTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return mimeMapping;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setWelcomeFileList(WelcomeFileListType<WebFragmentType<T>> welcomeFileList)   {
      this.welcomeFileList = welcomeFileList;
      childNode.getOrCreate("welcome-file-list").text(welcomeFileList);
      return this;
   }

   public WelcomeFileListType<WebFragmentType<T>> getWelcomeFileList()
   {
      if( welcomeFileList == null)
      {
          welcomeFileList = new WelcomeFileListTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return welcomeFileList;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setErrorPage(ErrorPageType<WebFragmentType<T>> errorPage)   {
      this.errorPage = errorPage;
      childNode.getOrCreate("error-page").text(errorPage);
      return this;
   }

   public ErrorPageType<WebFragmentType<T>> getErrorPage()
   {
      if( errorPage == null)
      {
          errorPage = new ErrorPageTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return errorPage;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setJspConfig(JspConfigType<WebFragmentType<T>> jspConfig)   {
      this.jspConfig = jspConfig;
      childNode.getOrCreate("jsp-config").text(jspConfig);
      return this;
   }

   public JspConfigType<WebFragmentType<T>> getJspConfig()
   {
      if( jspConfig == null)
      {
          jspConfig = new JspConfigTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return jspConfig;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setSecurityConstraint(SecurityConstraintType<WebFragmentType<T>> securityConstraint)   {
      this.securityConstraint = securityConstraint;
      childNode.getOrCreate("security-constraint").text(securityConstraint);
      return this;
   }

   public SecurityConstraintType<WebFragmentType<T>> getSecurityConstraint()
   {
      if( securityConstraint == null)
      {
          securityConstraint = new SecurityConstraintTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return securityConstraint;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setLoginConfig(LoginConfigType<WebFragmentType<T>> loginConfig)   {
      this.loginConfig = loginConfig;
      childNode.getOrCreate("login-config").text(loginConfig);
      return this;
   }

   public LoginConfigType<WebFragmentType<T>> getLoginConfig()
   {
      if( loginConfig == null)
      {
          loginConfig = new LoginConfigTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return loginConfig;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setSecurityRole(SecurityRoleType<WebFragmentType<T>> securityRole)   {
      this.securityRole = securityRole;
      childNode.getOrCreate("security-role").text(securityRole);
      return this;
   }

   public SecurityRoleType<WebFragmentType<T>> getSecurityRole()
   {
      if( securityRole == null)
      {
          securityRole = new SecurityRoleTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return securityRole;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setMessageDestination(MessageDestinationType<WebFragmentType<T>> messageDestination)   {
      this.messageDestination = messageDestination;
      childNode.getOrCreate("message-destination").text(messageDestination);
      return this;
   }

   public MessageDestinationType<WebFragmentType<T>> getMessageDestination()
   {
      if( messageDestination == null)
      {
          messageDestination = new MessageDestinationTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return messageDestination;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList)   {
      this.localeEncodingMappingList = localeEncodingMappingList;
      childNode.getOrCreate("locale-encoding-mapping-list").text(localeEncodingMappingList);
      return this;
   }

   public LocaleEncodingMappingListType<WebFragmentType<T>> getLocaleEncodingMappingList()
   {
      if( localeEncodingMappingList == null)
      {
          localeEncodingMappingList = new LocaleEncodingMappingListTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return localeEncodingMappingList;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public WebFragmentType<T> setDescription(String ... values)
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

   public WebFragmentType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public WebFragmentType<T> setDisplayName(String ... values)
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

   public WebFragmentType<T> setIcon(IconType<WebFragmentType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<WebFragmentType<T>> getIcon()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setEnvEntry(EnvEntryType<WebFragmentType<T>> envEntry)
   {
      childNode.create("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<WebFragmentType<T>> getEnvEntry()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setEjbRef(EjbRefType<WebFragmentType<T>> ejbRef)
   {
      childNode.create("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<WebFragmentType<T>> getEjbRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setEjbLocalRef(EjbLocalRefType<WebFragmentType<T>> ejbLocalRef)
   {
      childNode.create("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<WebFragmentType<T>> getEjbLocalRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setResourceRef(ResourceRefType<WebFragmentType<T>> resourceRef)
   {
      childNode.create("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<WebFragmentType<T>> getResourceRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setResourceEnvRef(ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef)
   {
      childNode.create("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<WebFragmentType<T>> getResourceEnvRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setMessageDestinationRef(MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef)
   {
      childNode.create("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<WebFragmentType<T>> getMessageDestinationRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setPersistenceContextRef(PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef)
   {
      childNode.create("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<WebFragmentType<T>> getPersistenceContextRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setPersistenceUnitRef(PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef)
   {
      childNode.create("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<WebFragmentType<T>> getPersistenceUnitRef()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setPostConstruct(LifecycleCallbackType<WebFragmentType<T>> postConstruct)
   {
      childNode.create("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<WebFragmentType<T>> getPostConstruct()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setPreDestroy(LifecycleCallbackType<WebFragmentType<T>> preDestroy)
   {
      childNode.create("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<WebFragmentType<T>> getPreDestroy()
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setDataSource(DataSourceType<WebFragmentType<T>> dataSource)
   {
      childNode.create("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<WebFragmentType<T>> getDataSource()
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



   public WebFragmentType<T> setVersion(String version)
   {
      this.version = version;
      childNode.attribute("version", version);
      return this;
   }

   public String getVersion()
   {
      return childNode.textValue("version");
   }


   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete)
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

   public WebFragmentType<T> setName(String name)   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return childNode.textValue("name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setOrdering(OrderingType<WebFragmentType<T>> ordering)   {
      this.ordering = ordering;
      childNode.getOrCreate("ordering").text(ordering);
      return this;
   }

   public OrderingType<WebFragmentType<T>> getOrdering()
   {
      if( ordering == null)
      {
          ordering = new OrderingTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return ordering;
   }


}
