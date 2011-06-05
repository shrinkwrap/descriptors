package org.jboss.shrinkwrap.descriptor.impl.webapp30; 

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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
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

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class WebApp30DescriptorImpl extends NodeProviderImplBase implements WebApp30Descriptor<WebApp30DescriptorImpl>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private Node model;
   private String moduleName;
   private AbsoluteOrderingType<WebApp30DescriptorImpl> absoluteOrdering;
   private Boolean distributable;
   private ParamValueType<WebApp30DescriptorImpl> contextParam;
   private FilterType<WebApp30DescriptorImpl> filter;
   private FilterMappingType<WebApp30DescriptorImpl> filterMapping;
   private ListenerType<WebApp30DescriptorImpl> listener;
   private ServletType<WebApp30DescriptorImpl> servlet;
   private ServletMappingType<WebApp30DescriptorImpl> servletMapping;
   private SessionConfigType<WebApp30DescriptorImpl> sessionConfig;
   private MimeMappingType<WebApp30DescriptorImpl> mimeMapping;
   private WelcomeFileListType<WebApp30DescriptorImpl> welcomeFileList;
   private ErrorPageType<WebApp30DescriptorImpl> errorPage;
   private JspConfigType<WebApp30DescriptorImpl> jspConfig;
   private SecurityConstraintType<WebApp30DescriptorImpl> securityConstraint;
   private LoginConfigType<WebApp30DescriptorImpl> loginConfig;
   private SecurityRoleType<WebApp30DescriptorImpl> securityRole;
   private MessageDestinationType<WebApp30DescriptorImpl> messageDestination;
   private LocaleEncodingMappingListType<WebApp30DescriptorImpl> localeEncodingMappingList;
   private String description;
   private String displayName;
   private IconType<WebApp30DescriptorImpl> icon;
   private EnvEntryType<WebApp30DescriptorImpl> envEntry;
   private EjbRefType<WebApp30DescriptorImpl> ejbRef;
   private EjbLocalRefType<WebApp30DescriptorImpl> ejbLocalRef;
   private ResourceRefType<WebApp30DescriptorImpl> resourceRef;
   private ResourceEnvRefType<WebApp30DescriptorImpl> resourceEnvRef;
   private MessageDestinationRefType<WebApp30DescriptorImpl> messageDestinationRef;
   private PersistenceContextRefType<WebApp30DescriptorImpl> persistenceContextRef;
   private PersistenceUnitRefType<WebApp30DescriptorImpl> persistenceUnitRef;
   private LifecycleCallbackType<WebApp30DescriptorImpl> postConstruct;
   private LifecycleCallbackType<WebApp30DescriptorImpl> preDestroy;
   private DataSourceType<WebApp30DescriptorImpl> dataSource;
   private ServiceRefType<WebApp30DescriptorImpl> serviceRef;
   private String version;
   private Boolean metadataComplete;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
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
   // Methods -----------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }

   protected DescriptorExporter getExporter()
   {
      return new XMLExporter();
   }

   public WebApp30DescriptorImpl setModuleName(String moduleName)
   {
      this.moduleName = moduleName;
      model.getOrCreate("module-name").text(moduleName);
      return this;
   }

   public String getModuleName()
   {
      return moduleName;
   }


   public WebApp30DescriptorImpl setAbsoluteOrdering(AbsoluteOrderingType<WebApp30DescriptorImpl> absoluteOrdering)
   {
      this.absoluteOrdering = absoluteOrdering;
      model.getOrCreate("absolute-ordering").text(absoluteOrdering);
      return this;
   }

   public AbsoluteOrderingType<WebApp30DescriptorImpl> getAbsoluteOrdering()
   {
      if( absoluteOrdering == null)
      {
          absoluteOrdering = new AbsoluteOrderingTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return absoluteOrdering;
   }



   public WebApp30DescriptorImpl setDistributable(Boolean distributable)
   {
      this.distributable = distributable;
      model.getOrCreate("distributable").text(distributable);
      return this;
   }

   public Boolean getDistributable()
   {
      return distributable;
   }


   public WebApp30DescriptorImpl setContextParam(ParamValueType<WebApp30DescriptorImpl> contextParam)
   {
      this.contextParam = contextParam;
      model.getOrCreate("context-param").text(contextParam);
      return this;
   }

   public ParamValueType<WebApp30DescriptorImpl> getContextParam()
   {
      if( contextParam == null)
      {
          contextParam = new ParamValueTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return contextParam;
   }



   public WebApp30DescriptorImpl setFilter(FilterType<WebApp30DescriptorImpl> filter)
   {
      this.filter = filter;
      model.getOrCreate("filter").text(filter);
      return this;
   }

   public FilterType<WebApp30DescriptorImpl> getFilter()
   {
      if( filter == null)
      {
          filter = new FilterTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return filter;
   }



   public WebApp30DescriptorImpl setFilterMapping(FilterMappingType<WebApp30DescriptorImpl> filterMapping)
   {
      this.filterMapping = filterMapping;
      model.getOrCreate("filter-mapping").text(filterMapping);
      return this;
   }

   public FilterMappingType<WebApp30DescriptorImpl> getFilterMapping()
   {
      if( filterMapping == null)
      {
          filterMapping = new FilterMappingTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return filterMapping;
   }



   public WebApp30DescriptorImpl setListener(ListenerType<WebApp30DescriptorImpl> listener)
   {
      this.listener = listener;
      model.getOrCreate("listener").text(listener);
      return this;
   }

   public ListenerType<WebApp30DescriptorImpl> getListener()
   {
      if( listener == null)
      {
          listener = new ListenerTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return listener;
   }



   public WebApp30DescriptorImpl setServlet(ServletType<WebApp30DescriptorImpl> servlet)
   {
      this.servlet = servlet;
      model.getOrCreate("servlet").text(servlet);
      return this;
   }

   public ServletType<WebApp30DescriptorImpl> getServlet()
   {
      if( servlet == null)
      {
          servlet = new ServletTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return servlet;
   }



   public WebApp30DescriptorImpl setServletMapping(ServletMappingType<WebApp30DescriptorImpl> servletMapping)
   {
      this.servletMapping = servletMapping;
      model.getOrCreate("servlet-mapping").text(servletMapping);
      return this;
   }

   public ServletMappingType<WebApp30DescriptorImpl> getServletMapping()
   {
      if( servletMapping == null)
      {
          servletMapping = new ServletMappingTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return servletMapping;
   }



   public WebApp30DescriptorImpl setSessionConfig(SessionConfigType<WebApp30DescriptorImpl> sessionConfig)
   {
      this.sessionConfig = sessionConfig;
      model.getOrCreate("session-config").text(sessionConfig);
      return this;
   }

   public SessionConfigType<WebApp30DescriptorImpl> getSessionConfig()
   {
      if( sessionConfig == null)
      {
          sessionConfig = new SessionConfigTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return sessionConfig;
   }



   public WebApp30DescriptorImpl setMimeMapping(MimeMappingType<WebApp30DescriptorImpl> mimeMapping)
   {
      this.mimeMapping = mimeMapping;
      model.getOrCreate("mime-mapping").text(mimeMapping);
      return this;
   }

   public MimeMappingType<WebApp30DescriptorImpl> getMimeMapping()
   {
      if( mimeMapping == null)
      {
          mimeMapping = new MimeMappingTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return mimeMapping;
   }



   public WebApp30DescriptorImpl setWelcomeFileList(WelcomeFileListType<WebApp30DescriptorImpl> welcomeFileList)
   {
      this.welcomeFileList = welcomeFileList;
      model.getOrCreate("welcome-file-list").text(welcomeFileList);
      return this;
   }

   public WelcomeFileListType<WebApp30DescriptorImpl> getWelcomeFileList()
   {
      if( welcomeFileList == null)
      {
          welcomeFileList = new WelcomeFileListTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return welcomeFileList;
   }



   public WebApp30DescriptorImpl setErrorPage(ErrorPageType<WebApp30DescriptorImpl> errorPage)
   {
      this.errorPage = errorPage;
      model.getOrCreate("error-page").text(errorPage);
      return this;
   }

   public ErrorPageType<WebApp30DescriptorImpl> getErrorPage()
   {
      if( errorPage == null)
      {
          errorPage = new ErrorPageTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return errorPage;
   }



   public WebApp30DescriptorImpl setJspConfig(JspConfigType<WebApp30DescriptorImpl> jspConfig)
   {
      this.jspConfig = jspConfig;
      model.getOrCreate("jsp-config").text(jspConfig);
      return this;
   }

   public JspConfigType<WebApp30DescriptorImpl> getJspConfig()
   {
      if( jspConfig == null)
      {
          jspConfig = new JspConfigTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return jspConfig;
   }



   public WebApp30DescriptorImpl setSecurityConstraint(SecurityConstraintType<WebApp30DescriptorImpl> securityConstraint)
   {
      this.securityConstraint = securityConstraint;
      model.getOrCreate("security-constraint").text(securityConstraint);
      return this;
   }

   public SecurityConstraintType<WebApp30DescriptorImpl> getSecurityConstraint()
   {
      if( securityConstraint == null)
      {
          securityConstraint = new SecurityConstraintTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return securityConstraint;
   }



   public WebApp30DescriptorImpl setLoginConfig(LoginConfigType<WebApp30DescriptorImpl> loginConfig)
   {
      this.loginConfig = loginConfig;
      model.getOrCreate("login-config").text(loginConfig);
      return this;
   }

   public LoginConfigType<WebApp30DescriptorImpl> getLoginConfig()
   {
      if( loginConfig == null)
      {
          loginConfig = new LoginConfigTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return loginConfig;
   }



   public WebApp30DescriptorImpl setSecurityRole(SecurityRoleType<WebApp30DescriptorImpl> securityRole)
   {
      this.securityRole = securityRole;
      model.getOrCreate("security-role").text(securityRole);
      return this;
   }

   public SecurityRoleType<WebApp30DescriptorImpl> getSecurityRole()
   {
      if( securityRole == null)
      {
          securityRole = new SecurityRoleTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return securityRole;
   }



   public WebApp30DescriptorImpl setMessageDestination(MessageDestinationType<WebApp30DescriptorImpl> messageDestination)
   {
      this.messageDestination = messageDestination;
      model.getOrCreate("message-destination").text(messageDestination);
      return this;
   }

   public MessageDestinationType<WebApp30DescriptorImpl> getMessageDestination()
   {
      if( messageDestination == null)
      {
          messageDestination = new MessageDestinationTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return messageDestination;
   }



   public WebApp30DescriptorImpl setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebApp30DescriptorImpl> localeEncodingMappingList)
   {
      this.localeEncodingMappingList = localeEncodingMappingList;
      model.getOrCreate("locale-encoding-mapping-list").text(localeEncodingMappingList);
      return this;
   }

   public LocaleEncodingMappingListType<WebApp30DescriptorImpl> getLocaleEncodingMappingList()
   {
      if( localeEncodingMappingList == null)
      {
          localeEncodingMappingList = new LocaleEncodingMappingListTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return localeEncodingMappingList;
   }



   public WebApp30DescriptorImpl setDescription(String description)
   {
      this.description = description;
      model.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public WebApp30DescriptorImpl setDisplayName(String displayName)
   {
      this.displayName = displayName;
      model.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public WebApp30DescriptorImpl setIcon(IconType<WebApp30DescriptorImpl> icon)
   {
      this.icon = icon;
      model.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<WebApp30DescriptorImpl> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return icon;
   }



   public WebApp30DescriptorImpl setEnvEntry(EnvEntryType<WebApp30DescriptorImpl> envEntry)
   {
      this.envEntry = envEntry;
      model.getOrCreate("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<WebApp30DescriptorImpl> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return envEntry;
   }



   public WebApp30DescriptorImpl setEjbRef(EjbRefType<WebApp30DescriptorImpl> ejbRef)
   {
      this.ejbRef = ejbRef;
      model.getOrCreate("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<WebApp30DescriptorImpl> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return ejbRef;
   }



   public WebApp30DescriptorImpl setEjbLocalRef(EjbLocalRefType<WebApp30DescriptorImpl> ejbLocalRef)
   {
      this.ejbLocalRef = ejbLocalRef;
      model.getOrCreate("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<WebApp30DescriptorImpl> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return ejbLocalRef;
   }



   public WebApp30DescriptorImpl setResourceRef(ResourceRefType<WebApp30DescriptorImpl> resourceRef)
   {
      this.resourceRef = resourceRef;
      model.getOrCreate("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<WebApp30DescriptorImpl> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return resourceRef;
   }



   public WebApp30DescriptorImpl setResourceEnvRef(ResourceEnvRefType<WebApp30DescriptorImpl> resourceEnvRef)
   {
      this.resourceEnvRef = resourceEnvRef;
      model.getOrCreate("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<WebApp30DescriptorImpl> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return resourceEnvRef;
   }



   public WebApp30DescriptorImpl setMessageDestinationRef(MessageDestinationRefType<WebApp30DescriptorImpl> messageDestinationRef)
   {
      this.messageDestinationRef = messageDestinationRef;
      model.getOrCreate("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<WebApp30DescriptorImpl> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return messageDestinationRef;
   }



   public WebApp30DescriptorImpl setPersistenceContextRef(PersistenceContextRefType<WebApp30DescriptorImpl> persistenceContextRef)
   {
      this.persistenceContextRef = persistenceContextRef;
      model.getOrCreate("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<WebApp30DescriptorImpl> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return persistenceContextRef;
   }



   public WebApp30DescriptorImpl setPersistenceUnitRef(PersistenceUnitRefType<WebApp30DescriptorImpl> persistenceUnitRef)
   {
      this.persistenceUnitRef = persistenceUnitRef;
      model.getOrCreate("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<WebApp30DescriptorImpl> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return persistenceUnitRef;
   }



   public WebApp30DescriptorImpl setPostConstruct(LifecycleCallbackType<WebApp30DescriptorImpl> postConstruct)
   {
      this.postConstruct = postConstruct;
      model.getOrCreate("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<WebApp30DescriptorImpl> getPostConstruct()
   {
      if( postConstruct == null)
      {
          postConstruct = new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return postConstruct;
   }



   public WebApp30DescriptorImpl setPreDestroy(LifecycleCallbackType<WebApp30DescriptorImpl> preDestroy)
   {
      this.preDestroy = preDestroy;
      model.getOrCreate("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<WebApp30DescriptorImpl> getPreDestroy()
   {
      if( preDestroy == null)
      {
          preDestroy = new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return preDestroy;
   }



   public WebApp30DescriptorImpl setDataSource(DataSourceType<WebApp30DescriptorImpl> dataSource)
   {
      this.dataSource = dataSource;
      model.getOrCreate("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<WebApp30DescriptorImpl> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return dataSource;
   }



   public WebApp30DescriptorImpl setServiceRef(ServiceRefType<WebApp30DescriptorImpl> serviceRef)
   {
      this.serviceRef = serviceRef;
      model.getOrCreate("service-ref").text(serviceRef);
      return this;
   }

   public ServiceRefType<WebApp30DescriptorImpl> getServiceRef()
   {
      if( serviceRef == null)
      {
          serviceRef = new ServiceRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
      }
      return serviceRef;
   }



   public WebApp30DescriptorImpl setVersion(String version)
   {
      this.version = version;
      model.getOrCreate("version").text(version);
      return this;
   }

   public String getVersion()
   {
      return version;
   }


   public WebApp30DescriptorImpl setMetadataComplete(Boolean metadataComplete)
   {
      this.metadataComplete = metadataComplete;
      model.getOrCreate("metadata-complete").text(metadataComplete);
      return this;
   }

   public Boolean getMetadataComplete()
   {
      return metadataComplete;
   }


}
