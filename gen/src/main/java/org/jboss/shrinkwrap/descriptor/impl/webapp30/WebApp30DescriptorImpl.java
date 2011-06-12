package org.jboss.shrinkwrap.descriptor.impl.webapp30; 

import java.util.ArrayList;
import java.util.List;

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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
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
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class WebApp30DescriptorImpl extends NodeProviderImplBase implements WebApp30Descriptor<WebApp30DescriptorImpl>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private Node model;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private String moduleName;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private AbsoluteOrderingType<WebApp30DescriptorImpl> absoluteOrdering;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private Boolean distributable;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private ParamValueType<WebApp30DescriptorImpl> contextParam;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private FilterType<WebApp30DescriptorImpl> filter;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private FilterMappingType<WebApp30DescriptorImpl> filterMapping;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private ListenerType<WebApp30DescriptorImpl> listener;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private ServletType<WebApp30DescriptorImpl> servlet;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private ServletMappingType<WebApp30DescriptorImpl> servletMapping;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private SessionConfigType<WebApp30DescriptorImpl> sessionConfig;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private MimeMappingType<WebApp30DescriptorImpl> mimeMapping;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private WelcomeFileListType<WebApp30DescriptorImpl> welcomeFileList;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private ErrorPageType<WebApp30DescriptorImpl> errorPage;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private JspConfigType<WebApp30DescriptorImpl> jspConfig;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private SecurityConstraintType<WebApp30DescriptorImpl> securityConstraint;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private LoginConfigType<WebApp30DescriptorImpl> loginConfig;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private SecurityRoleType<WebApp30DescriptorImpl> securityRole;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private MessageDestinationType<WebApp30DescriptorImpl> messageDestination;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private LocaleEncodingMappingListType<WebApp30DescriptorImpl> localeEncodingMappingList;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private IconType<WebApp30DescriptorImpl> icon;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private EnvEntryType<WebApp30DescriptorImpl> envEntry;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private EjbRefType<WebApp30DescriptorImpl> ejbRef;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private EjbLocalRefType<WebApp30DescriptorImpl> ejbLocalRef;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private ResourceRefType<WebApp30DescriptorImpl> resourceRef;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private ResourceEnvRefType<WebApp30DescriptorImpl> resourceEnvRef;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private MessageDestinationRefType<WebApp30DescriptorImpl> messageDestinationRef;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private PersistenceContextRefType<WebApp30DescriptorImpl> persistenceContextRef;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private PersistenceUnitRefType<WebApp30DescriptorImpl> persistenceUnitRef;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private LifecycleCallbackType<WebApp30DescriptorImpl> postConstruct;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private LifecycleCallbackType<WebApp30DescriptorImpl> preDestroy;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private DataSourceType<WebApp30DescriptorImpl> dataSource;
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
   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setModuleName(String moduleName)   {
      this.moduleName = moduleName;
      model.getOrCreate("module-name").text(moduleName);
      return this;
   }

   public String getModuleName()
   {
      return model.textValue("module-name");
   }

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setAbsoluteOrdering(AbsoluteOrderingType<WebApp30DescriptorImpl> absoluteOrdering)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setDistributable(Boolean distributable)   {
      this.distributable = distributable;
      model.getOrCreate("distributable").text(distributable);
      return this;
   }

   public Boolean getDistributable()
   {
      return Strings.isTrue(model.textValue("distributable"));
   }

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setContextParam(ParamValueType<WebApp30DescriptorImpl> contextParam)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setFilter(FilterType<WebApp30DescriptorImpl> filter)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setFilterMapping(FilterMappingType<WebApp30DescriptorImpl> filterMapping)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setListener(ListenerType<WebApp30DescriptorImpl> listener)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setServlet(ServletType<WebApp30DescriptorImpl> servlet)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setServletMapping(ServletMappingType<WebApp30DescriptorImpl> servletMapping)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setSessionConfig(SessionConfigType<WebApp30DescriptorImpl> sessionConfig)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setMimeMapping(MimeMappingType<WebApp30DescriptorImpl> mimeMapping)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setWelcomeFileList(WelcomeFileListType<WebApp30DescriptorImpl> welcomeFileList)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setErrorPage(ErrorPageType<WebApp30DescriptorImpl> errorPage)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setJspConfig(JspConfigType<WebApp30DescriptorImpl> jspConfig)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setSecurityConstraint(SecurityConstraintType<WebApp30DescriptorImpl> securityConstraint)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setLoginConfig(LoginConfigType<WebApp30DescriptorImpl> loginConfig)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setSecurityRole(SecurityRoleType<WebApp30DescriptorImpl> securityRole)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setMessageDestination(MessageDestinationType<WebApp30DescriptorImpl> messageDestination)   {
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


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebApp30DescriptorImpl> localeEncodingMappingList)   {
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


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   public WebApp30DescriptorImpl setDescription(String ... values)
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
      List<Node> nodes = model.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   public WebApp30DescriptorImpl setDisplayName(String ... values)
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
      List<Node> nodes = model.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setIcon(IconType<WebApp30DescriptorImpl> icon)
   {
      model.create("icon").text(icon);
      return this;
   }

   public IconType<WebApp30DescriptorImpl> getIcon()
   {
      return new IconTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<IconType<WebApp30DescriptorImpl>> getIconList()
   {
      List<IconType<WebApp30DescriptorImpl>> list = new ArrayList<IconType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<WebApp30DescriptorImpl>  type = new IconTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setEnvEntry(EnvEntryType<WebApp30DescriptorImpl> envEntry)
   {
      model.create("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<WebApp30DescriptorImpl> getEnvEntry()
   {
      return new EnvEntryTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<EnvEntryType<WebApp30DescriptorImpl>> getEnvEntryList()
   {
      List<EnvEntryType<WebApp30DescriptorImpl>> list = new ArrayList<EnvEntryType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(EnvEntryTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EnvEntryType<WebApp30DescriptorImpl>  type = new EnvEntryTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setEjbRef(EjbRefType<WebApp30DescriptorImpl> ejbRef)
   {
      model.create("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<WebApp30DescriptorImpl> getEjbRef()
   {
      return new EjbRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<EjbRefType<WebApp30DescriptorImpl>> getEjbRefList()
   {
      List<EjbRefType<WebApp30DescriptorImpl>> list = new ArrayList<EjbRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(EjbRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EjbRefType<WebApp30DescriptorImpl>  type = new EjbRefTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setEjbLocalRef(EjbLocalRefType<WebApp30DescriptorImpl> ejbLocalRef)
   {
      model.create("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<WebApp30DescriptorImpl> getEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<EjbLocalRefType<WebApp30DescriptorImpl>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<WebApp30DescriptorImpl>> list = new ArrayList<EjbLocalRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(EjbLocalRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EjbLocalRefType<WebApp30DescriptorImpl>  type = new EjbLocalRefTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setResourceRef(ResourceRefType<WebApp30DescriptorImpl> resourceRef)
   {
      model.create("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<WebApp30DescriptorImpl> getResourceRef()
   {
      return new ResourceRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<ResourceRefType<WebApp30DescriptorImpl>> getResourceRefList()
   {
      List<ResourceRefType<WebApp30DescriptorImpl>> list = new ArrayList<ResourceRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(ResourceRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ResourceRefType<WebApp30DescriptorImpl>  type = new ResourceRefTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setResourceEnvRef(ResourceEnvRefType<WebApp30DescriptorImpl> resourceEnvRef)
   {
      model.create("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<WebApp30DescriptorImpl> getResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<ResourceEnvRefType<WebApp30DescriptorImpl>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<WebApp30DescriptorImpl>> list = new ArrayList<ResourceEnvRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(ResourceEnvRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ResourceEnvRefType<WebApp30DescriptorImpl>  type = new ResourceEnvRefTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setMessageDestinationRef(MessageDestinationRefType<WebApp30DescriptorImpl> messageDestinationRef)
   {
      model.create("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<WebApp30DescriptorImpl> getMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<MessageDestinationRefType<WebApp30DescriptorImpl>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<WebApp30DescriptorImpl>> list = new ArrayList<MessageDestinationRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(MessageDestinationRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         MessageDestinationRefType<WebApp30DescriptorImpl>  type = new MessageDestinationRefTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setPersistenceContextRef(PersistenceContextRefType<WebApp30DescriptorImpl> persistenceContextRef)
   {
      model.create("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<WebApp30DescriptorImpl> getPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<PersistenceContextRefType<WebApp30DescriptorImpl>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<WebApp30DescriptorImpl>> list = new ArrayList<PersistenceContextRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(PersistenceContextRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PersistenceContextRefType<WebApp30DescriptorImpl>  type = new PersistenceContextRefTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setPersistenceUnitRef(PersistenceUnitRefType<WebApp30DescriptorImpl> persistenceUnitRef)
   {
      model.create("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<WebApp30DescriptorImpl> getPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<PersistenceUnitRefType<WebApp30DescriptorImpl>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<WebApp30DescriptorImpl>> list = new ArrayList<PersistenceUnitRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(PersistenceUnitRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<WebApp30DescriptorImpl>  type = new PersistenceUnitRefTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setPostConstruct(LifecycleCallbackType<WebApp30DescriptorImpl> postConstruct)
   {
      model.create("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<WebApp30DescriptorImpl> getPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<LifecycleCallbackType<WebApp30DescriptorImpl>> getPostConstructList()
   {
      List<LifecycleCallbackType<WebApp30DescriptorImpl>> list = new ArrayList<LifecycleCallbackType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(LifecycleCallbackTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebApp30DescriptorImpl>  type = new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setPreDestroy(LifecycleCallbackType<WebApp30DescriptorImpl> preDestroy)
   {
      model.create("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<WebApp30DescriptorImpl> getPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<LifecycleCallbackType<WebApp30DescriptorImpl>> getPreDestroyList()
   {
      List<LifecycleCallbackType<WebApp30DescriptorImpl>> list = new ArrayList<LifecycleCallbackType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(LifecycleCallbackTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebApp30DescriptorImpl>  type = new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public WebApp30DescriptorImpl setDataSource(DataSourceType<WebApp30DescriptorImpl> dataSource)
   {
      model.create("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<WebApp30DescriptorImpl> getDataSource()
   {
      return new DataSourceTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<DataSourceType<WebApp30DescriptorImpl>> getDataSourceList()
   {
      List<DataSourceType<WebApp30DescriptorImpl>> list = new ArrayList<DataSourceType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(DataSourceTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         DataSourceType<WebApp30DescriptorImpl>  type = new DataSourceTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }



   public WebApp30DescriptorImpl setVersion(String version)
   {
      this.version = version;
      model.attribute("version", version);
      return this;
   }

   public String getVersion()
   {
      return model.textValue("version");
   }


   public WebApp30DescriptorImpl setMetadataComplete(Boolean metadataComplete)
   {
      this.metadataComplete = metadataComplete;
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public Boolean getMetadataComplete()
   {
      return Strings.isTrue(model.textValue("metadata-complete"));
   }


}
