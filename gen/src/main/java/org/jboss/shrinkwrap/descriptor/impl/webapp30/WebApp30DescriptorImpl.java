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
 * Generation date :2011-06-19T21:45:00.466-04:00
 */
public class WebApp30DescriptorImpl extends NodeProviderImplBase implements WebApp30Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private Node model;

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

   // -------------------------------------------------------------------------------------||
   // Element type : module-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor setModuleName(String moduleName)
   {
      model.getOrCreate("module-name").text(moduleName);
      return this;
   }

   public WebApp30Descriptor removeModuleName()
   {
      model.remove("module-name");
      return this;
   }

   public String getModuleName()
   {
      return model.textValue("module-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : absolute-ordering
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAbsoluteOrdering()
   {
      model.remove("absolute-ordering");
      return this;
   }

   public AbsoluteOrderingType<WebApp30Descriptor> absoluteOrdering()
   {
      Node node = model.getOrCreate(AbsoluteOrderingTypeImpl.nodeName);
      AbsoluteOrderingType<WebApp30Descriptor> absoluteOrdering = new AbsoluteOrderingTypeImpl<WebApp30Descriptor>(
            this, "", model, node);
      return absoluteOrdering;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : distributable
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor distributable()
   {
      model.getOrCreate("distributable");
      return this;
   }

   public Boolean isDistributable()
   {
      return model.attributes().get("distributable") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeContextParam()
   {
      model.remove("context-param");
      return this;
   }

   public ParamValueType<WebApp30Descriptor> contextParam()
   {
      Node node = model.getOrCreate(ParamValueTypeImpl.nodeName);
      ParamValueType<WebApp30Descriptor> contextParam = new ParamValueTypeImpl<WebApp30Descriptor>(this, "", model,
            node);
      return contextParam;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeFilter()
   {
      model.remove("filter");
      return this;
   }

   public FilterType<WebApp30Descriptor> filter()
   {
      Node node = model.getOrCreate(FilterTypeImpl.nodeName);
      FilterType<WebApp30Descriptor> filter = new FilterTypeImpl<WebApp30Descriptor>(this, "", model, node);
      return filter;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeFilterMapping()
   {
      model.remove("filter-mapping");
      return this;
   }

   public FilterMappingType<WebApp30Descriptor> filterMapping()
   {
      Node node = model.getOrCreate(FilterMappingTypeImpl.nodeName);
      FilterMappingType<WebApp30Descriptor> filterMapping = new FilterMappingTypeImpl<WebApp30Descriptor>(this, "",
            model, node);
      return filterMapping;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeListener()
   {
      model.remove("listener");
      return this;
   }

   public ListenerType<WebApp30Descriptor> listener()
   {
      Node node = model.getOrCreate(ListenerTypeImpl.nodeName);
      ListenerType<WebApp30Descriptor> listener = new ListenerTypeImpl<WebApp30Descriptor>(this, "", model, node);
      return listener;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeServlet()
   {
      model.remove("servlet");
      return this;
   }

   public ServletType<WebApp30Descriptor> servlet()
   {
      Node node = model.getOrCreate(ServletTypeImpl.nodeName);
      ServletType<WebApp30Descriptor> servlet = new ServletTypeImpl<WebApp30Descriptor>(this, "", model, node);
      return servlet;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeServletMapping()
   {
      model.remove("servlet-mapping");
      return this;
   }

   public ServletMappingType<WebApp30Descriptor> servletMapping()
   {
      Node node = model.getOrCreate(ServletMappingTypeImpl.nodeName);
      ServletMappingType<WebApp30Descriptor> servletMapping = new ServletMappingTypeImpl<WebApp30Descriptor>(this, "",
            model, node);
      return servletMapping;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeSessionConfig()
   {
      model.remove("session-config");
      return this;
   }

   public SessionConfigType<WebApp30Descriptor> sessionConfig()
   {
      Node node = model.getOrCreate(SessionConfigTypeImpl.nodeName);
      SessionConfigType<WebApp30Descriptor> sessionConfig = new SessionConfigTypeImpl<WebApp30Descriptor>(this, "",
            model, node);
      return sessionConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeMimeMapping()
   {
      model.remove("mime-mapping");
      return this;
   }

   public MimeMappingType<WebApp30Descriptor> mimeMapping()
   {
      Node node = model.getOrCreate(MimeMappingTypeImpl.nodeName);
      MimeMappingType<WebApp30Descriptor> mimeMapping = new MimeMappingTypeImpl<WebApp30Descriptor>(this, "", model,
            node);
      return mimeMapping;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeWelcomeFileList()
   {
      model.remove("welcome-file-list");
      return this;
   }

   public WelcomeFileListType<WebApp30Descriptor> welcomeFileList()
   {
      Node node = model.getOrCreate(WelcomeFileListTypeImpl.nodeName);
      WelcomeFileListType<WebApp30Descriptor> welcomeFileList = new WelcomeFileListTypeImpl<WebApp30Descriptor>(this,
            "", model, node);
      return welcomeFileList;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeErrorPage()
   {
      model.remove("error-page");
      return this;
   }

   public ErrorPageType<WebApp30Descriptor> errorPage()
   {
      Node node = model.getOrCreate(ErrorPageTypeImpl.nodeName);
      ErrorPageType<WebApp30Descriptor> errorPage = new ErrorPageTypeImpl<WebApp30Descriptor>(this, "", model, node);
      return errorPage;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeJspConfig()
   {
      model.remove("jsp-config");
      return this;
   }

   public JspConfigType<WebApp30Descriptor> jspConfig()
   {
      Node node = model.getOrCreate(JspConfigTypeImpl.nodeName);
      JspConfigType<WebApp30Descriptor> jspConfig = new JspConfigTypeImpl<WebApp30Descriptor>(this, "", model, node);
      return jspConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeSecurityConstraint()
   {
      model.remove("security-constraint");
      return this;
   }

   public SecurityConstraintType<WebApp30Descriptor> securityConstraint()
   {
      Node node = model.getOrCreate(SecurityConstraintTypeImpl.nodeName);
      SecurityConstraintType<WebApp30Descriptor> securityConstraint = new SecurityConstraintTypeImpl<WebApp30Descriptor>(
            this, "", model, node);
      return securityConstraint;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeLoginConfig()
   {
      model.remove("login-config");
      return this;
   }

   public LoginConfigType<WebApp30Descriptor> loginConfig()
   {
      Node node = model.getOrCreate(LoginConfigTypeImpl.nodeName);
      LoginConfigType<WebApp30Descriptor> loginConfig = new LoginConfigTypeImpl<WebApp30Descriptor>(this, "", model,
            node);
      return loginConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeSecurityRole()
   {
      model.remove("security-role");
      return this;
   }

   public SecurityRoleType<WebApp30Descriptor> securityRole()
   {
      Node node = model.getOrCreate(SecurityRoleTypeImpl.nodeName);
      SecurityRoleType<WebApp30Descriptor> securityRole = new SecurityRoleTypeImpl<WebApp30Descriptor>(this, "", model,
            node);
      return securityRole;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeMessageDestination()
   {
      model.remove("message-destination");
      return this;
   }

   public MessageDestinationType<WebApp30Descriptor> messageDestination()
   {
      Node node = model.getOrCreate(MessageDestinationTypeImpl.nodeName);
      MessageDestinationType<WebApp30Descriptor> messageDestination = new MessageDestinationTypeImpl<WebApp30Descriptor>(
            this, "", model, node);
      return messageDestination;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeLocaleEncodingMappingList()
   {
      model.remove("locale-encoding-mapping-list");
      return this;
   }

   public LocaleEncodingMappingListType<WebApp30Descriptor> localeEncodingMappingList()
   {
      Node node = model.getOrCreate(LocaleEncodingMappingListTypeImpl.nodeName);
      LocaleEncodingMappingListType<WebApp30Descriptor> localeEncodingMappingList = new LocaleEncodingMappingListTypeImpl<WebApp30Descriptor>(
            this, "", model, node);
      return localeEncodingMappingList;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   public WebApp30Descriptor setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public WebApp30Descriptor removeAllDescription()
   {
      model.remove("description");
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

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   public WebApp30Descriptor setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public WebApp30Descriptor removeAllDisplayName()
   {
      model.remove("display-name");
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

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   public IconType<WebApp30Descriptor> icon()
   {
      return new IconTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<IconType<WebApp30Descriptor>> getIconList()
   {
      List<IconType<WebApp30Descriptor>> list = new ArrayList<IconType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(IconTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         IconType<WebApp30Descriptor> type = new IconTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllEnvEntry()
   {
      model.remove("env-entry");
      return this;
   }

   public EnvEntryType<WebApp30Descriptor> envEntry()
   {
      return new EnvEntryTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<EnvEntryType<WebApp30Descriptor>> getEnvEntryList()
   {
      List<EnvEntryType<WebApp30Descriptor>> list = new ArrayList<EnvEntryType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(EnvEntryTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EnvEntryType<WebApp30Descriptor> type = new EnvEntryTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllEjbRef()
   {
      model.remove("ejb-ref");
      return this;
   }

   public EjbRefType<WebApp30Descriptor> ejbRef()
   {
      return new EjbRefTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<EjbRefType<WebApp30Descriptor>> getEjbRefList()
   {
      List<EjbRefType<WebApp30Descriptor>> list = new ArrayList<EjbRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(EjbRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EjbRefType<WebApp30Descriptor> type = new EjbRefTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllEjbLocalRef()
   {
      model.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<WebApp30Descriptor> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<EjbLocalRefType<WebApp30Descriptor>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<WebApp30Descriptor>> list = new ArrayList<EjbLocalRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(EjbLocalRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EjbLocalRefType<WebApp30Descriptor> type = new EjbLocalRefTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllResourceRef()
   {
      model.remove("resource-ref");
      return this;
   }

   public ResourceRefType<WebApp30Descriptor> resourceRef()
   {
      return new ResourceRefTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<ResourceRefType<WebApp30Descriptor>> getResourceRefList()
   {
      List<ResourceRefType<WebApp30Descriptor>> list = new ArrayList<ResourceRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(ResourceRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ResourceRefType<WebApp30Descriptor> type = new ResourceRefTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllResourceEnvRef()
   {
      model.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<WebApp30Descriptor> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<ResourceEnvRefType<WebApp30Descriptor>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<WebApp30Descriptor>> list = new ArrayList<ResourceEnvRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(ResourceEnvRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ResourceEnvRefType<WebApp30Descriptor> type = new ResourceEnvRefTypeImpl<WebApp30Descriptor>(this, "", model,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllMessageDestinationRef()
   {
      model.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<WebApp30Descriptor> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<MessageDestinationRefType<WebApp30Descriptor>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<WebApp30Descriptor>> list = new ArrayList<MessageDestinationRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(MessageDestinationRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MessageDestinationRefType<WebApp30Descriptor> type = new MessageDestinationRefTypeImpl<WebApp30Descriptor>(
               this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllPersistenceContextRef()
   {
      model.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<WebApp30Descriptor> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<PersistenceContextRefType<WebApp30Descriptor>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<WebApp30Descriptor>> list = new ArrayList<PersistenceContextRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(PersistenceContextRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PersistenceContextRefType<WebApp30Descriptor> type = new PersistenceContextRefTypeImpl<WebApp30Descriptor>(
               this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllPersistenceUnitRef()
   {
      model.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<WebApp30Descriptor> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<PersistenceUnitRefType<WebApp30Descriptor>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<WebApp30Descriptor>> list = new ArrayList<PersistenceUnitRefType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(PersistenceUnitRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<WebApp30Descriptor> type = new PersistenceUnitRefTypeImpl<WebApp30Descriptor>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllPostConstruct()
   {
      model.remove("post-construct");
      return this;
   }

   public LifecycleCallbackType<WebApp30Descriptor> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<LifecycleCallbackType<WebApp30Descriptor>> getPostConstructList()
   {
      List<LifecycleCallbackType<WebApp30Descriptor>> list = new ArrayList<LifecycleCallbackType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(LifecycleCallbackTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebApp30Descriptor> type = new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllPreDestroy()
   {
      model.remove("pre-destroy");
      return this;
   }

   public LifecycleCallbackType<WebApp30Descriptor> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<LifecycleCallbackType<WebApp30Descriptor>> getPreDestroyList()
   {
      List<LifecycleCallbackType<WebApp30Descriptor>> list = new ArrayList<LifecycleCallbackType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(LifecycleCallbackTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebApp30Descriptor> type = new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllDataSource()
   {
      model.remove("data-source");
      return this;
   }

   public DataSourceType<WebApp30Descriptor> dataSource()
   {
      return new DataSourceTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<DataSourceType<WebApp30Descriptor>> getDataSourceList()
   {
      List<DataSourceType<WebApp30Descriptor>> list = new ArrayList<DataSourceType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(DataSourceTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         DataSourceType<WebApp30Descriptor> type = new DataSourceTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   public String getVersion()
   {
      return model.attributes().get("version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor setMetadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(model.textValue("metadata-complete"));
   }

}
