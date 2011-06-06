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
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class WebAppTypeImpl<T> implements Child<T>, WebAppType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String moduleName;
   private AbsoluteOrderingType<WebAppType<T>> absoluteOrdering;

   private Boolean distributable;
   private ParamValueType<WebAppType<T>> contextParam;
   private FilterType<WebAppType<T>> filter;
   private FilterMappingType<WebAppType<T>> filterMapping;
   private ListenerType<WebAppType<T>> listener;
   private ServletType<WebAppType<T>> servlet;
   private ServletMappingType<WebAppType<T>> servletMapping;
   private SessionConfigType<WebAppType<T>> sessionConfig;
   private MimeMappingType<WebAppType<T>> mimeMapping;
   private WelcomeFileListType<WebAppType<T>> welcomeFileList;
   private ErrorPageType<WebAppType<T>> errorPage;
   private JspConfigType<WebAppType<T>> jspConfig;
   private SecurityConstraintType<WebAppType<T>> securityConstraint;
   private LoginConfigType<WebAppType<T>> loginConfig;
   private SecurityRoleType<WebAppType<T>> securityRole;
   private MessageDestinationType<WebAppType<T>> messageDestination;
   private LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList;
   private String description;
   private String displayName;
   private IconType<WebAppType<T>> icon;
   private EnvEntryType<WebAppType<T>> envEntry;
   private EjbRefType<WebAppType<T>> ejbRef;
   private EjbLocalRefType<WebAppType<T>> ejbLocalRef;
   private ResourceRefType<WebAppType<T>> resourceRef;
   private ResourceEnvRefType<WebAppType<T>> resourceEnvRef;
   private MessageDestinationRefType<WebAppType<T>> messageDestinationRef;
   private PersistenceContextRefType<WebAppType<T>> persistenceContextRef;
   private PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef;
   private LifecycleCallbackType<WebAppType<T>> postConstruct;
   private LifecycleCallbackType<WebAppType<T>> preDestroy;
   private DataSourceType<WebAppType<T>> dataSource;
   private ServiceRefType<WebAppType<T>> serviceRef;
   private String version;
   private Boolean metadataComplete;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebAppTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("");   }


   public T up()
   {
      return t;
   }



   public WebAppType<T> setDistributable(Boolean distributable)
   {
      this.distributable = distributable;
      childNode.getOrCreate("distributable").text(distributable);
      return this;
   }

   public Boolean getDistributable()
   {
      return distributable;
   }


   public WebAppType<T> setContextParam(ParamValueType<WebAppType<T>> contextParam)
   {
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



   public WebAppType<T> setFilter(FilterType<WebAppType<T>> filter)
   {
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



   public WebAppType<T> setFilterMapping(FilterMappingType<WebAppType<T>> filterMapping)
   {
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



   public WebAppType<T> setListener(ListenerType<WebAppType<T>> listener)
   {
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



   public WebAppType<T> setServlet(ServletType<WebAppType<T>> servlet)
   {
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



   public WebAppType<T> setServletMapping(ServletMappingType<WebAppType<T>> servletMapping)
   {
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



   public WebAppType<T> setSessionConfig(SessionConfigType<WebAppType<T>> sessionConfig)
   {
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



   public WebAppType<T> setMimeMapping(MimeMappingType<WebAppType<T>> mimeMapping)
   {
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



   public WebAppType<T> setWelcomeFileList(WelcomeFileListType<WebAppType<T>> welcomeFileList)
   {
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



   public WebAppType<T> setErrorPage(ErrorPageType<WebAppType<T>> errorPage)
   {
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



   public WebAppType<T> setJspConfig(JspConfigType<WebAppType<T>> jspConfig)
   {
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



   public WebAppType<T> setSecurityConstraint(SecurityConstraintType<WebAppType<T>> securityConstraint)
   {
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



   public WebAppType<T> setLoginConfig(LoginConfigType<WebAppType<T>> loginConfig)
   {
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



   public WebAppType<T> setSecurityRole(SecurityRoleType<WebAppType<T>> securityRole)
   {
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



   public WebAppType<T> setMessageDestination(MessageDestinationType<WebAppType<T>> messageDestination)
   {
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



   public WebAppType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList)
   {
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



   public WebAppType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public WebAppType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public WebAppType<T> setIcon(IconType<WebAppType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<WebAppType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return icon;
   }



   public WebAppType<T> setEnvEntry(EnvEntryType<WebAppType<T>> envEntry)
   {
      childNode.create("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<WebAppType<T>> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return envEntry;
   }



   public WebAppType<T> setEjbRef(EjbRefType<WebAppType<T>> ejbRef)
   {
      childNode.create("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<WebAppType<T>> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return ejbRef;
   }



   public WebAppType<T> setEjbLocalRef(EjbLocalRefType<WebAppType<T>> ejbLocalRef)
   {
      childNode.create("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<WebAppType<T>> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return ejbLocalRef;
   }



   public WebAppType<T> setResourceRef(ResourceRefType<WebAppType<T>> resourceRef)
   {
      childNode.create("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<WebAppType<T>> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return resourceRef;
   }



   public WebAppType<T> setResourceEnvRef(ResourceEnvRefType<WebAppType<T>> resourceEnvRef)
   {
      childNode.create("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<WebAppType<T>> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return resourceEnvRef;
   }



   public WebAppType<T> setMessageDestinationRef(MessageDestinationRefType<WebAppType<T>> messageDestinationRef)
   {
      childNode.create("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<WebAppType<T>> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return messageDestinationRef;
   }



   public WebAppType<T> setPersistenceContextRef(PersistenceContextRefType<WebAppType<T>> persistenceContextRef)
   {
      childNode.create("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<WebAppType<T>> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return persistenceContextRef;
   }



   public WebAppType<T> setPersistenceUnitRef(PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef)
   {
      childNode.create("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<WebAppType<T>> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return persistenceUnitRef;
   }



   public WebAppType<T> setPostConstruct(LifecycleCallbackType<WebAppType<T>> postConstruct)
   {
      childNode.create("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<WebAppType<T>> getPostConstruct()
   {
      if( postConstruct == null)
      {
          postConstruct = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return postConstruct;
   }



   public WebAppType<T> setPreDestroy(LifecycleCallbackType<WebAppType<T>> preDestroy)
   {
      childNode.create("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<WebAppType<T>> getPreDestroy()
   {
      if( preDestroy == null)
      {
          preDestroy = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return preDestroy;
   }



   public WebAppType<T> setDataSource(DataSourceType<WebAppType<T>> dataSource)
   {
      childNode.create("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<WebAppType<T>> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return dataSource;
   }



   public WebAppType<T> setServiceRef(ServiceRefType<WebAppType<T>> serviceRef)
   {
      childNode.create("service-ref").text(serviceRef);
      return this;
   }

   public ServiceRefType<WebAppType<T>> getServiceRef()
   {
      if( serviceRef == null)
      {
          serviceRef = new ServiceRefTypeImpl<WebAppType<T>>(this, "", childNode);
      }
      return serviceRef;
   }



   public WebAppType<T> setVersion(String version)
   {
      this.version = version;
      childNode.attribute("version", version);
      return this;
   }

   public String getVersion()
   {
      return version;
   }


   public WebAppType<T> setMetadataComplete(Boolean metadataComplete)
   {
      this.metadataComplete = metadataComplete;
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public Boolean getMetadataComplete()
   {
      return metadataComplete;
   }


   public WebAppType<T> setModuleName(String moduleName)
   {
      this.moduleName = moduleName;
      childNode.getOrCreate("module-name").text(moduleName);
      return this;
   }

   public String getModuleName()
   {
      return moduleName;
   }



   public WebAppType<T> setAbsoluteOrdering(AbsoluteOrderingType<WebAppType<T>> absoluteOrdering)
   {
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
