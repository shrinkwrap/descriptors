package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

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
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
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
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.JspConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class WebFragmentTypeImpl<T> implements Child<T>, WebFragmentType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String name;
   private OrderingType<WebFragmentType<T>> ordering;

   private Boolean distributable;
   private ParamValueType<WebFragmentType<T>> contextParam;
   private FilterType<WebFragmentType<T>> filter;
   private FilterMappingType<WebFragmentType<T>> filterMapping;
   private ListenerType<WebFragmentType<T>> listener;
   private ServletType<WebFragmentType<T>> servlet;
   private ServletMappingType<WebFragmentType<T>> servletMapping;
   private SessionConfigType<WebFragmentType<T>> sessionConfig;
   private MimeMappingType<WebFragmentType<T>> mimeMapping;
   private WelcomeFileListType<WebFragmentType<T>> welcomeFileList;
   private ErrorPageType<WebFragmentType<T>> errorPage;
   private JspConfigType<WebFragmentType<T>> jspConfig;
   private SecurityConstraintType<WebFragmentType<T>> securityConstraint;
   private LoginConfigType<WebFragmentType<T>> loginConfig;
   private SecurityRoleType<WebFragmentType<T>> securityRole;
   private MessageDestinationType<WebFragmentType<T>> messageDestination;
   private LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList;
   private String description;
   private String displayName;
   private IconType<WebFragmentType<T>> icon;
   private EnvEntryType<WebFragmentType<T>> envEntry;
   private EjbRefType<WebFragmentType<T>> ejbRef;
   private EjbLocalRefType<WebFragmentType<T>> ejbLocalRef;
   private ResourceRefType<WebFragmentType<T>> resourceRef;
   private ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef;
   private MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef;
   private PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef;
   private PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef;
   private LifecycleCallbackType<WebFragmentType<T>> postConstruct;
   private LifecycleCallbackType<WebFragmentType<T>> preDestroy;
   private DataSourceType<WebFragmentType<T>> dataSource;
   private ServiceRefType<WebFragmentType<T>> serviceRef;
   private String version;
   private Boolean metadataComplete;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebFragmentTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("");   }


   public T up()
   {
      return t;
   }



   public WebFragmentType<T> setDistributable(Boolean distributable)
   {
      this.distributable = distributable;
      childNode.getOrCreate("distributable").text(distributable);
      return this;
   }

   public Boolean getDistributable()
   {
      return distributable;
   }


   public WebFragmentType<T> setContextParam(ParamValueType<WebFragmentType<T>> contextParam)
   {
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



   public WebFragmentType<T> setFilter(FilterType<WebFragmentType<T>> filter)
   {
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



   public WebFragmentType<T> setFilterMapping(FilterMappingType<WebFragmentType<T>> filterMapping)
   {
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



   public WebFragmentType<T> setListener(ListenerType<WebFragmentType<T>> listener)
   {
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



   public WebFragmentType<T> setServlet(ServletType<WebFragmentType<T>> servlet)
   {
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



   public WebFragmentType<T> setServletMapping(ServletMappingType<WebFragmentType<T>> servletMapping)
   {
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



   public WebFragmentType<T> setSessionConfig(SessionConfigType<WebFragmentType<T>> sessionConfig)
   {
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



   public WebFragmentType<T> setMimeMapping(MimeMappingType<WebFragmentType<T>> mimeMapping)
   {
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



   public WebFragmentType<T> setWelcomeFileList(WelcomeFileListType<WebFragmentType<T>> welcomeFileList)
   {
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



   public WebFragmentType<T> setErrorPage(ErrorPageType<WebFragmentType<T>> errorPage)
   {
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



   public WebFragmentType<T> setJspConfig(JspConfigType<WebFragmentType<T>> jspConfig)
   {
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



   public WebFragmentType<T> setSecurityConstraint(SecurityConstraintType<WebFragmentType<T>> securityConstraint)
   {
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



   public WebFragmentType<T> setLoginConfig(LoginConfigType<WebFragmentType<T>> loginConfig)
   {
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



   public WebFragmentType<T> setSecurityRole(SecurityRoleType<WebFragmentType<T>> securityRole)
   {
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



   public WebFragmentType<T> setMessageDestination(MessageDestinationType<WebFragmentType<T>> messageDestination)
   {
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



   public WebFragmentType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList)
   {
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



   public WebFragmentType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public WebFragmentType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public WebFragmentType<T> setIcon(IconType<WebFragmentType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<WebFragmentType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return icon;
   }



   public WebFragmentType<T> setEnvEntry(EnvEntryType<WebFragmentType<T>> envEntry)
   {
      this.envEntry = envEntry;
      childNode.getOrCreate("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<WebFragmentType<T>> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return envEntry;
   }



   public WebFragmentType<T> setEjbRef(EjbRefType<WebFragmentType<T>> ejbRef)
   {
      this.ejbRef = ejbRef;
      childNode.getOrCreate("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<WebFragmentType<T>> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return ejbRef;
   }



   public WebFragmentType<T> setEjbLocalRef(EjbLocalRefType<WebFragmentType<T>> ejbLocalRef)
   {
      this.ejbLocalRef = ejbLocalRef;
      childNode.getOrCreate("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<WebFragmentType<T>> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return ejbLocalRef;
   }



   public WebFragmentType<T> setResourceRef(ResourceRefType<WebFragmentType<T>> resourceRef)
   {
      this.resourceRef = resourceRef;
      childNode.getOrCreate("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<WebFragmentType<T>> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return resourceRef;
   }



   public WebFragmentType<T> setResourceEnvRef(ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef)
   {
      this.resourceEnvRef = resourceEnvRef;
      childNode.getOrCreate("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<WebFragmentType<T>> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return resourceEnvRef;
   }



   public WebFragmentType<T> setMessageDestinationRef(MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef)
   {
      this.messageDestinationRef = messageDestinationRef;
      childNode.getOrCreate("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<WebFragmentType<T>> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return messageDestinationRef;
   }



   public WebFragmentType<T> setPersistenceContextRef(PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef)
   {
      this.persistenceContextRef = persistenceContextRef;
      childNode.getOrCreate("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<WebFragmentType<T>> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return persistenceContextRef;
   }



   public WebFragmentType<T> setPersistenceUnitRef(PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef)
   {
      this.persistenceUnitRef = persistenceUnitRef;
      childNode.getOrCreate("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<WebFragmentType<T>> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return persistenceUnitRef;
   }



   public WebFragmentType<T> setPostConstruct(LifecycleCallbackType<WebFragmentType<T>> postConstruct)
   {
      this.postConstruct = postConstruct;
      childNode.getOrCreate("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<WebFragmentType<T>> getPostConstruct()
   {
      if( postConstruct == null)
      {
          postConstruct = new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return postConstruct;
   }



   public WebFragmentType<T> setPreDestroy(LifecycleCallbackType<WebFragmentType<T>> preDestroy)
   {
      this.preDestroy = preDestroy;
      childNode.getOrCreate("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<WebFragmentType<T>> getPreDestroy()
   {
      if( preDestroy == null)
      {
          preDestroy = new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return preDestroy;
   }



   public WebFragmentType<T> setDataSource(DataSourceType<WebFragmentType<T>> dataSource)
   {
      this.dataSource = dataSource;
      childNode.getOrCreate("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<WebFragmentType<T>> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return dataSource;
   }



   public WebFragmentType<T> setServiceRef(ServiceRefType<WebFragmentType<T>> serviceRef)
   {
      this.serviceRef = serviceRef;
      childNode.getOrCreate("service-ref").text(serviceRef);
      return this;
   }

   public ServiceRefType<WebFragmentType<T>> getServiceRef()
   {
      if( serviceRef == null)
      {
          serviceRef = new ServiceRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
      }
      return serviceRef;
   }



   public WebFragmentType<T> setVersion(String version)
   {
      this.version = version;
      childNode.getOrCreate("version").text(version);
      return this;
   }

   public String getVersion()
   {
      return version;
   }


   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete)
   {
      this.metadataComplete = metadataComplete;
      childNode.getOrCreate("metadata-complete").text(metadataComplete);
      return this;
   }

   public Boolean getMetadataComplete()
   {
      return metadataComplete;
   }


   public WebFragmentType<T> setName(String name)
   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return name;
   }



   public WebFragmentType<T> setOrdering(OrderingType<WebFragmentType<T>> ordering)
   {
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
