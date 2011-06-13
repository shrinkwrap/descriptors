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
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public class WebApp30DescriptorImpl extends NodeProviderImplBase implements WebApp30Descriptor<WebApp30DescriptorImpl>
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
   public WebApp30DescriptorImpl setModuleName(String moduleName)
   {
      model.getOrCreate("module-name").text(moduleName);
      return this;
   }

   public WebApp30DescriptorImpl removeModuleName()
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
   public WebApp30DescriptorImpl removeAbsoluteOrdering()
   {
      model.remove("absolute-ordering");
      return this;
   }

   public AbsoluteOrderingType<WebApp30DescriptorImpl> absoluteOrdering()
   {
      Node node = model.getOrCreate(AbsoluteOrderingTypeImpl.nodeName);
      AbsoluteOrderingType<WebApp30DescriptorImpl> absoluteOrdering = new AbsoluteOrderingTypeImpl<WebApp30DescriptorImpl>(
            this, "", model, node);
      return absoluteOrdering;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : distributable
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl setDistributable(Boolean distributable)
   {
      model.getOrCreate("distributable").text(distributable);
      return this;
   }

   public WebApp30DescriptorImpl removeDistributable()
   {
      model.remove("distributable");
      return this;
   }

   public Boolean isDistributable()
   {
      return Strings.isTrue(model.textValue("distributable"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeContextParam()
   {
      model.remove("context-param");
      return this;
   }

   public ParamValueType<WebApp30DescriptorImpl> contextParam()
   {
      Node node = model.getOrCreate(ParamValueTypeImpl.nodeName);
      ParamValueType<WebApp30DescriptorImpl> contextParam = new ParamValueTypeImpl<WebApp30DescriptorImpl>(this, "",
            model, node);
      return contextParam;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeFilter()
   {
      model.remove("filter");
      return this;
   }

   public FilterType<WebApp30DescriptorImpl> filter()
   {
      Node node = model.getOrCreate(FilterTypeImpl.nodeName);
      FilterType<WebApp30DescriptorImpl> filter = new FilterTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
      return filter;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeFilterMapping()
   {
      model.remove("filter-mapping");
      return this;
   }

   public FilterMappingType<WebApp30DescriptorImpl> filterMapping()
   {
      Node node = model.getOrCreate(FilterMappingTypeImpl.nodeName);
      FilterMappingType<WebApp30DescriptorImpl> filterMapping = new FilterMappingTypeImpl<WebApp30DescriptorImpl>(this,
            "", model, node);
      return filterMapping;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeListener()
   {
      model.remove("listener");
      return this;
   }

   public ListenerType<WebApp30DescriptorImpl> listener()
   {
      Node node = model.getOrCreate(ListenerTypeImpl.nodeName);
      ListenerType<WebApp30DescriptorImpl> listener = new ListenerTypeImpl<WebApp30DescriptorImpl>(this, "", model,
            node);
      return listener;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeServlet()
   {
      model.remove("servlet");
      return this;
   }

   public ServletType<WebApp30DescriptorImpl> servlet()
   {
      Node node = model.getOrCreate(ServletTypeImpl.nodeName);
      ServletType<WebApp30DescriptorImpl> servlet = new ServletTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
      return servlet;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeServletMapping()
   {
      model.remove("servlet-mapping");
      return this;
   }

   public ServletMappingType<WebApp30DescriptorImpl> servletMapping()
   {
      Node node = model.getOrCreate(ServletMappingTypeImpl.nodeName);
      ServletMappingType<WebApp30DescriptorImpl> servletMapping = new ServletMappingTypeImpl<WebApp30DescriptorImpl>(
            this, "", model, node);
      return servletMapping;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeSessionConfig()
   {
      model.remove("session-config");
      return this;
   }

   public SessionConfigType<WebApp30DescriptorImpl> sessionConfig()
   {
      Node node = model.getOrCreate(SessionConfigTypeImpl.nodeName);
      SessionConfigType<WebApp30DescriptorImpl> sessionConfig = new SessionConfigTypeImpl<WebApp30DescriptorImpl>(this,
            "", model, node);
      return sessionConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeMimeMapping()
   {
      model.remove("mime-mapping");
      return this;
   }

   public MimeMappingType<WebApp30DescriptorImpl> mimeMapping()
   {
      Node node = model.getOrCreate(MimeMappingTypeImpl.nodeName);
      MimeMappingType<WebApp30DescriptorImpl> mimeMapping = new MimeMappingTypeImpl<WebApp30DescriptorImpl>(this, "",
            model, node);
      return mimeMapping;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeWelcomeFileList()
   {
      model.remove("welcome-file-list");
      return this;
   }

   public WelcomeFileListType<WebApp30DescriptorImpl> welcomeFileList()
   {
      Node node = model.getOrCreate(WelcomeFileListTypeImpl.nodeName);
      WelcomeFileListType<WebApp30DescriptorImpl> welcomeFileList = new WelcomeFileListTypeImpl<WebApp30DescriptorImpl>(
            this, "", model, node);
      return welcomeFileList;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeErrorPage()
   {
      model.remove("error-page");
      return this;
   }

   public ErrorPageType<WebApp30DescriptorImpl> errorPage()
   {
      Node node = model.getOrCreate(ErrorPageTypeImpl.nodeName);
      ErrorPageType<WebApp30DescriptorImpl> errorPage = new ErrorPageTypeImpl<WebApp30DescriptorImpl>(this, "", model,
            node);
      return errorPage;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeJspConfig()
   {
      model.remove("jsp-config");
      return this;
   }

   public JspConfigType<WebApp30DescriptorImpl> jspConfig()
   {
      Node node = model.getOrCreate(JspConfigTypeImpl.nodeName);
      JspConfigType<WebApp30DescriptorImpl> jspConfig = new JspConfigTypeImpl<WebApp30DescriptorImpl>(this, "", model,
            node);
      return jspConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeSecurityConstraint()
   {
      model.remove("security-constraint");
      return this;
   }

   public SecurityConstraintType<WebApp30DescriptorImpl> securityConstraint()
   {
      Node node = model.getOrCreate(SecurityConstraintTypeImpl.nodeName);
      SecurityConstraintType<WebApp30DescriptorImpl> securityConstraint = new SecurityConstraintTypeImpl<WebApp30DescriptorImpl>(
            this, "", model, node);
      return securityConstraint;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeLoginConfig()
   {
      model.remove("login-config");
      return this;
   }

   public LoginConfigType<WebApp30DescriptorImpl> loginConfig()
   {
      Node node = model.getOrCreate(LoginConfigTypeImpl.nodeName);
      LoginConfigType<WebApp30DescriptorImpl> loginConfig = new LoginConfigTypeImpl<WebApp30DescriptorImpl>(this, "",
            model, node);
      return loginConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeSecurityRole()
   {
      model.remove("security-role");
      return this;
   }

   public SecurityRoleType<WebApp30DescriptorImpl> securityRole()
   {
      Node node = model.getOrCreate(SecurityRoleTypeImpl.nodeName);
      SecurityRoleType<WebApp30DescriptorImpl> securityRole = new SecurityRoleTypeImpl<WebApp30DescriptorImpl>(this,
            "", model, node);
      return securityRole;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeMessageDestination()
   {
      model.remove("message-destination");
      return this;
   }

   public MessageDestinationType<WebApp30DescriptorImpl> messageDestination()
   {
      Node node = model.getOrCreate(MessageDestinationTypeImpl.nodeName);
      MessageDestinationType<WebApp30DescriptorImpl> messageDestination = new MessageDestinationTypeImpl<WebApp30DescriptorImpl>(
            this, "", model, node);
      return messageDestination;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeLocaleEncodingMappingList()
   {
      model.remove("locale-encoding-mapping-list");
      return this;
   }

   public LocaleEncodingMappingListType<WebApp30DescriptorImpl> localeEncodingMappingList()
   {
      Node node = model.getOrCreate(LocaleEncodingMappingListTypeImpl.nodeName);
      LocaleEncodingMappingListType<WebApp30DescriptorImpl> localeEncodingMappingList = new LocaleEncodingMappingListTypeImpl<WebApp30DescriptorImpl>(
            this, "", model, node);
      return localeEncodingMappingList;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   public WebApp30DescriptorImpl setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public WebApp30DescriptorImpl removeAllDescription()
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
   public WebApp30DescriptorImpl setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   public WebApp30DescriptorImpl setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public WebApp30DescriptorImpl removeAllDisplayName()
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
   public WebApp30DescriptorImpl removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   public IconType<WebApp30DescriptorImpl> icon()
   {
      return new IconTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<IconType<WebApp30DescriptorImpl>> getIconList()
   {
      List<IconType<WebApp30DescriptorImpl>> list = new ArrayList<IconType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(IconTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         IconType<WebApp30DescriptorImpl> type = new IconTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllEnvEntry()
   {
      model.remove("env-entry");
      return this;
   }

   public EnvEntryType<WebApp30DescriptorImpl> envEntry()
   {
      return new EnvEntryTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<EnvEntryType<WebApp30DescriptorImpl>> getEnvEntryList()
   {
      List<EnvEntryType<WebApp30DescriptorImpl>> list = new ArrayList<EnvEntryType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(EnvEntryTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EnvEntryType<WebApp30DescriptorImpl> type = new EnvEntryTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllEjbRef()
   {
      model.remove("ejb-ref");
      return this;
   }

   public EjbRefType<WebApp30DescriptorImpl> ejbRef()
   {
      return new EjbRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<EjbRefType<WebApp30DescriptorImpl>> getEjbRefList()
   {
      List<EjbRefType<WebApp30DescriptorImpl>> list = new ArrayList<EjbRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(EjbRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EjbRefType<WebApp30DescriptorImpl> type = new EjbRefTypeImpl<WebApp30DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllEjbLocalRef()
   {
      model.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<WebApp30DescriptorImpl> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<EjbLocalRefType<WebApp30DescriptorImpl>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<WebApp30DescriptorImpl>> list = new ArrayList<EjbLocalRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(EjbLocalRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EjbLocalRefType<WebApp30DescriptorImpl> type = new EjbLocalRefTypeImpl<WebApp30DescriptorImpl>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllResourceRef()
   {
      model.remove("resource-ref");
      return this;
   }

   public ResourceRefType<WebApp30DescriptorImpl> resourceRef()
   {
      return new ResourceRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<ResourceRefType<WebApp30DescriptorImpl>> getResourceRefList()
   {
      List<ResourceRefType<WebApp30DescriptorImpl>> list = new ArrayList<ResourceRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(ResourceRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ResourceRefType<WebApp30DescriptorImpl> type = new ResourceRefTypeImpl<WebApp30DescriptorImpl>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllResourceEnvRef()
   {
      model.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<WebApp30DescriptorImpl> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<ResourceEnvRefType<WebApp30DescriptorImpl>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<WebApp30DescriptorImpl>> list = new ArrayList<ResourceEnvRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(ResourceEnvRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ResourceEnvRefType<WebApp30DescriptorImpl> type = new ResourceEnvRefTypeImpl<WebApp30DescriptorImpl>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllMessageDestinationRef()
   {
      model.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<WebApp30DescriptorImpl> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<MessageDestinationRefType<WebApp30DescriptorImpl>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<WebApp30DescriptorImpl>> list = new ArrayList<MessageDestinationRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(MessageDestinationRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MessageDestinationRefType<WebApp30DescriptorImpl> type = new MessageDestinationRefTypeImpl<WebApp30DescriptorImpl>(
               this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllPersistenceContextRef()
   {
      model.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<WebApp30DescriptorImpl> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<PersistenceContextRefType<WebApp30DescriptorImpl>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<WebApp30DescriptorImpl>> list = new ArrayList<PersistenceContextRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(PersistenceContextRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PersistenceContextRefType<WebApp30DescriptorImpl> type = new PersistenceContextRefTypeImpl<WebApp30DescriptorImpl>(
               this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllPersistenceUnitRef()
   {
      model.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<WebApp30DescriptorImpl> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<PersistenceUnitRefType<WebApp30DescriptorImpl>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<WebApp30DescriptorImpl>> list = new ArrayList<PersistenceUnitRefType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(PersistenceUnitRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<WebApp30DescriptorImpl> type = new PersistenceUnitRefTypeImpl<WebApp30DescriptorImpl>(
               this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllPostConstruct()
   {
      model.remove("post-construct");
      return this;
   }

   public LifecycleCallbackType<WebApp30DescriptorImpl> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<LifecycleCallbackType<WebApp30DescriptorImpl>> getPostConstructList()
   {
      List<LifecycleCallbackType<WebApp30DescriptorImpl>> list = new ArrayList<LifecycleCallbackType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(LifecycleCallbackTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebApp30DescriptorImpl> type = new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(
               this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllPreDestroy()
   {
      model.remove("pre-destroy");
      return this;
   }

   public LifecycleCallbackType<WebApp30DescriptorImpl> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<LifecycleCallbackType<WebApp30DescriptorImpl>> getPreDestroyList()
   {
      List<LifecycleCallbackType<WebApp30DescriptorImpl>> list = new ArrayList<LifecycleCallbackType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(LifecycleCallbackTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebApp30DescriptorImpl> type = new LifecycleCallbackTypeImpl<WebApp30DescriptorImpl>(
               this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl removeAllDataSource()
   {
      model.remove("data-source");
      return this;
   }

   public DataSourceType<WebApp30DescriptorImpl> dataSource()
   {
      return new DataSourceTypeImpl<WebApp30DescriptorImpl>(this, "", model);
   }

   public List<DataSourceType<WebApp30DescriptorImpl>> getDataSourceList()
   {
      List<DataSourceType<WebApp30DescriptorImpl>> list = new ArrayList<DataSourceType<WebApp30DescriptorImpl>>();
      List<Node> nodeList = model.get(DataSourceTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         DataSourceType<WebApp30DescriptorImpl> type = new DataSourceTypeImpl<WebApp30DescriptorImpl>(this, "", model,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   public String getVersion()
   {
      return model.textValue("version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public WebApp30DescriptorImpl setMetadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(model.textValue("metadata-complete"));
   }

}
