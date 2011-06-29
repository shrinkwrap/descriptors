package org.jboss.shrinkwrap.descriptor.impl.webapp30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
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
 * Generation date :2011-06-29T17:02:36.405-04:00
 */
public class WebApp30DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<WebApp30Descriptor>,
         WebApp30Descriptor
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
   // Namespace ---------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebApp30Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd");
      return this;
   }

   public WebApp30Descriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   public WebApp30Descriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name : nameSpaceKeys)
      {
         model.attributes().remove(name);
      }
      return this;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor setModuleName(String moduleName)
   {
      model.create("module-name").text(moduleName);
      return this;
   }

   public WebApp30Descriptor setModuleNameList(String... values)
   {
      for (String name : values)
      {
         setModuleName(name);
      }
      return this;
   }

   public WebApp30Descriptor removeAllModuleName()
   {
      model.remove("module-name");
      return this;
   }

   public List<String> getModuleNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("module-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : absolute-ordering
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllAbsoluteOrdering()
   {
      model.remove(AbsoluteOrderingTypeImpl.nodeName);
      return this;
   }

   public AbsoluteOrderingType<WebApp30Descriptor> absoluteOrdering()
   {
      return new AbsoluteOrderingTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<AbsoluteOrderingType<WebApp30Descriptor>> getAbsoluteOrderingList()
   {
      List<AbsoluteOrderingType<WebApp30Descriptor>> list = new ArrayList<AbsoluteOrderingType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(AbsoluteOrderingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         AbsoluteOrderingType<WebApp30Descriptor> type = new AbsoluteOrderingTypeImpl<WebApp30Descriptor>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : distributable
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor distributable()
   {
      model.getOrCreate("distributable");
      return this;
   }

   public Boolean isDistributable()
   {
      return model.getSingle("distributable") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllContextParam()
   {
      model.remove(ParamValueTypeImpl.nodeName);
      return this;
   }

   public ParamValueType<WebApp30Descriptor> contextParam()
   {
      return new ParamValueTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<ParamValueType<WebApp30Descriptor>> getContextParamList()
   {
      List<ParamValueType<WebApp30Descriptor>> list = new ArrayList<ParamValueType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(ParamValueTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ParamValueType<WebApp30Descriptor> type = new ParamValueTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllFilter()
   {
      model.remove(FilterTypeImpl.nodeName);
      return this;
   }

   public FilterType<WebApp30Descriptor> filter()
   {
      return new FilterTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<FilterType<WebApp30Descriptor>> getFilterList()
   {
      List<FilterType<WebApp30Descriptor>> list = new ArrayList<FilterType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(FilterTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         FilterType<WebApp30Descriptor> type = new FilterTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllFilterMapping()
   {
      model.remove(FilterMappingTypeImpl.nodeName);
      return this;
   }

   public FilterMappingType<WebApp30Descriptor> filterMapping()
   {
      return new FilterMappingTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<FilterMappingType<WebApp30Descriptor>> getFilterMappingList()
   {
      List<FilterMappingType<WebApp30Descriptor>> list = new ArrayList<FilterMappingType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(FilterMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         FilterMappingType<WebApp30Descriptor> type = new FilterMappingTypeImpl<WebApp30Descriptor>(this, "", model,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllListener()
   {
      model.remove(ListenerTypeImpl.nodeName);
      return this;
   }

   public ListenerType<WebApp30Descriptor> listener()
   {
      return new ListenerTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<ListenerType<WebApp30Descriptor>> getListenerList()
   {
      List<ListenerType<WebApp30Descriptor>> list = new ArrayList<ListenerType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(ListenerTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ListenerType<WebApp30Descriptor> type = new ListenerTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllServlet()
   {
      model.remove(ServletTypeImpl.nodeName);
      return this;
   }

   public ServletType<WebApp30Descriptor> servlet()
   {
      return new ServletTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<ServletType<WebApp30Descriptor>> getServletList()
   {
      List<ServletType<WebApp30Descriptor>> list = new ArrayList<ServletType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(ServletTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ServletType<WebApp30Descriptor> type = new ServletTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllServletMapping()
   {
      model.remove(ServletMappingTypeImpl.nodeName);
      return this;
   }

   public ServletMappingType<WebApp30Descriptor> servletMapping()
   {
      return new ServletMappingTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<ServletMappingType<WebApp30Descriptor>> getServletMappingList()
   {
      List<ServletMappingType<WebApp30Descriptor>> list = new ArrayList<ServletMappingType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(ServletMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ServletMappingType<WebApp30Descriptor> type = new ServletMappingTypeImpl<WebApp30Descriptor>(this, "", model,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllSessionConfig()
   {
      model.remove(SessionConfigTypeImpl.nodeName);
      return this;
   }

   public SessionConfigType<WebApp30Descriptor> sessionConfig()
   {
      return new SessionConfigTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<SessionConfigType<WebApp30Descriptor>> getSessionConfigList()
   {
      List<SessionConfigType<WebApp30Descriptor>> list = new ArrayList<SessionConfigType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(SessionConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SessionConfigType<WebApp30Descriptor> type = new SessionConfigTypeImpl<WebApp30Descriptor>(this, "", model,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllMimeMapping()
   {
      model.remove(MimeMappingTypeImpl.nodeName);
      return this;
   }

   public MimeMappingType<WebApp30Descriptor> mimeMapping()
   {
      return new MimeMappingTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<MimeMappingType<WebApp30Descriptor>> getMimeMappingList()
   {
      List<MimeMappingType<WebApp30Descriptor>> list = new ArrayList<MimeMappingType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(MimeMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MimeMappingType<WebApp30Descriptor> type = new MimeMappingTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllWelcomeFileList()
   {
      model.remove(WelcomeFileListTypeImpl.nodeName);
      return this;
   }

   public WelcomeFileListType<WebApp30Descriptor> welcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<WelcomeFileListType<WebApp30Descriptor>> getWelcomeFileListList()
   {
      List<WelcomeFileListType<WebApp30Descriptor>> list = new ArrayList<WelcomeFileListType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(WelcomeFileListTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         WelcomeFileListType<WebApp30Descriptor> type = new WelcomeFileListTypeImpl<WebApp30Descriptor>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllErrorPage()
   {
      model.remove(ErrorPageTypeImpl.nodeName);
      return this;
   }

   public ErrorPageType<WebApp30Descriptor> errorPage()
   {
      return new ErrorPageTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<ErrorPageType<WebApp30Descriptor>> getErrorPageList()
   {
      List<ErrorPageType<WebApp30Descriptor>> list = new ArrayList<ErrorPageType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(ErrorPageTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ErrorPageType<WebApp30Descriptor> type = new ErrorPageTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllJspConfig()
   {
      model.remove(JspConfigTypeImpl.nodeName);
      return this;
   }

   public JspConfigType<WebApp30Descriptor> jspConfig()
   {
      return new JspConfigTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<JspConfigType<WebApp30Descriptor>> getJspConfigList()
   {
      List<JspConfigType<WebApp30Descriptor>> list = new ArrayList<JspConfigType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(JspConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         JspConfigType<WebApp30Descriptor> type = new JspConfigTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllSecurityConstraint()
   {
      model.remove(SecurityConstraintTypeImpl.nodeName);
      return this;
   }

   public SecurityConstraintType<WebApp30Descriptor> securityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<SecurityConstraintType<WebApp30Descriptor>> getSecurityConstraintList()
   {
      List<SecurityConstraintType<WebApp30Descriptor>> list = new ArrayList<SecurityConstraintType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(SecurityConstraintTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SecurityConstraintType<WebApp30Descriptor> type = new SecurityConstraintTypeImpl<WebApp30Descriptor>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllLoginConfig()
   {
      model.remove(LoginConfigTypeImpl.nodeName);
      return this;
   }

   public LoginConfigType<WebApp30Descriptor> loginConfig()
   {
      return new LoginConfigTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<LoginConfigType<WebApp30Descriptor>> getLoginConfigList()
   {
      List<LoginConfigType<WebApp30Descriptor>> list = new ArrayList<LoginConfigType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(LoginConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LoginConfigType<WebApp30Descriptor> type = new LoginConfigTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllSecurityRole()
   {
      model.remove(SecurityRoleTypeImpl.nodeName);
      return this;
   }

   public SecurityRoleType<WebApp30Descriptor> securityRole()
   {
      return new SecurityRoleTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<SecurityRoleType<WebApp30Descriptor>> getSecurityRoleList()
   {
      List<SecurityRoleType<WebApp30Descriptor>> list = new ArrayList<SecurityRoleType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(SecurityRoleTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SecurityRoleType<WebApp30Descriptor> type = new SecurityRoleTypeImpl<WebApp30Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllMessageDestination()
   {
      model.remove(MessageDestinationTypeImpl.nodeName);
      return this;
   }

   public MessageDestinationType<WebApp30Descriptor> messageDestination()
   {
      return new MessageDestinationTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<MessageDestinationType<WebApp30Descriptor>> getMessageDestinationList()
   {
      List<MessageDestinationType<WebApp30Descriptor>> list = new ArrayList<MessageDestinationType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(MessageDestinationTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MessageDestinationType<WebApp30Descriptor> type = new MessageDestinationTypeImpl<WebApp30Descriptor>(this, "",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebApp30Descriptor removeAllLocaleEncodingMappingList()
   {
      model.remove(LocaleEncodingMappingListTypeImpl.nodeName);
      return this;
   }

   public LocaleEncodingMappingListType<WebApp30Descriptor> localeEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebApp30Descriptor>(this, "", model);
   }

   public List<LocaleEncodingMappingListType<WebApp30Descriptor>> getLocaleEncodingMappingListList()
   {
      List<LocaleEncodingMappingListType<WebApp30Descriptor>> list = new ArrayList<LocaleEncodingMappingListType<WebApp30Descriptor>>();
      List<Node> nodeList = model.get(LocaleEncodingMappingListTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LocaleEncodingMappingListType<WebApp30Descriptor> type = new LocaleEncodingMappingListTypeImpl<WebApp30Descriptor>(
               this, "", model, node);
         list.add(type);
      }
      return list;
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
      model.remove(IconTypeImpl.nodeName);
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
      model.remove(EnvEntryTypeImpl.nodeName);
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
      model.remove(EjbRefTypeImpl.nodeName);
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
      model.remove(EjbLocalRefTypeImpl.nodeName);
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
      model.remove(ResourceRefTypeImpl.nodeName);
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
      model.remove(ResourceEnvRefTypeImpl.nodeName);
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
      model.remove(MessageDestinationRefTypeImpl.nodeName);
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
      model.remove(PersistenceContextRefTypeImpl.nodeName);
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
      model.remove(PersistenceUnitRefTypeImpl.nodeName);
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
      model.remove(LifecycleCallbackTypeImpl.nodeName);
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
      model.remove(LifecycleCallbackTypeImpl.nodeName);
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
      model.remove(DataSourceTypeImpl.nodeName);
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
   public WebApp30Descriptor setVersion(WebAppVersionType version)
   {
      model.attribute("version", version);
      return this;
   }

   public WebApp30Descriptor setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   public WebAppVersionType getVersion()
   {
      return WebAppVersionType.getFromStringValue(model.attribute("version"));
   }

   public String getVersionAsString()
   {
      return model.attribute("version");
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
      return Strings.isTrue(model.attribute("metadata-complete"));
   }

}
