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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
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
 * Generation date :2011-06-29T17:02:36.405-04:00
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

   public WebAppTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public WebAppTypeImpl(T t, String descriptorName, Node node, Node childNode)
   {
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
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> distributable()
   {
      childNode.getOrCreate("distributable");
      return this;
   }

   public Boolean isDistributable()
   {
      return childNode.getSingle("distributable") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllContextParam()
   {
      childNode.remove(ParamValueTypeImpl.nodeName);
      return this;
   }

   public ParamValueType<WebAppType<T>> contextParam()
   {
      return new ParamValueTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<ParamValueType<WebAppType<T>>> getContextParamList()
   {
      List<ParamValueType<WebAppType<T>>> list = new ArrayList<ParamValueType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(ParamValueTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ParamValueType<WebAppType<T>> type = new ParamValueTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllFilter()
   {
      childNode.remove(FilterTypeImpl.nodeName);
      return this;
   }

   public FilterType<WebAppType<T>> filter()
   {
      return new FilterTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<FilterType<WebAppType<T>>> getFilterList()
   {
      List<FilterType<WebAppType<T>>> list = new ArrayList<FilterType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(FilterTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         FilterType<WebAppType<T>> type = new FilterTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllFilterMapping()
   {
      childNode.remove(FilterMappingTypeImpl.nodeName);
      return this;
   }

   public FilterMappingType<WebAppType<T>> filterMapping()
   {
      return new FilterMappingTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<FilterMappingType<WebAppType<T>>> getFilterMappingList()
   {
      List<FilterMappingType<WebAppType<T>>> list = new ArrayList<FilterMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(FilterMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         FilterMappingType<WebAppType<T>> type = new FilterMappingTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllListener()
   {
      childNode.remove(ListenerTypeImpl.nodeName);
      return this;
   }

   public ListenerType<WebAppType<T>> listener()
   {
      return new ListenerTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<ListenerType<WebAppType<T>>> getListenerList()
   {
      List<ListenerType<WebAppType<T>>> list = new ArrayList<ListenerType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(ListenerTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ListenerType<WebAppType<T>> type = new ListenerTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllServlet()
   {
      childNode.remove(ServletTypeImpl.nodeName);
      return this;
   }

   public ServletType<WebAppType<T>> servlet()
   {
      return new ServletTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<ServletType<WebAppType<T>>> getServletList()
   {
      List<ServletType<WebAppType<T>>> list = new ArrayList<ServletType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(ServletTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ServletType<WebAppType<T>> type = new ServletTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllServletMapping()
   {
      childNode.remove(ServletMappingTypeImpl.nodeName);
      return this;
   }

   public ServletMappingType<WebAppType<T>> servletMapping()
   {
      return new ServletMappingTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<ServletMappingType<WebAppType<T>>> getServletMappingList()
   {
      List<ServletMappingType<WebAppType<T>>> list = new ArrayList<ServletMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(ServletMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ServletMappingType<WebAppType<T>> type = new ServletMappingTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllSessionConfig()
   {
      childNode.remove(SessionConfigTypeImpl.nodeName);
      return this;
   }

   public SessionConfigType<WebAppType<T>> sessionConfig()
   {
      return new SessionConfigTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<SessionConfigType<WebAppType<T>>> getSessionConfigList()
   {
      List<SessionConfigType<WebAppType<T>>> list = new ArrayList<SessionConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(SessionConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SessionConfigType<WebAppType<T>> type = new SessionConfigTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllMimeMapping()
   {
      childNode.remove(MimeMappingTypeImpl.nodeName);
      return this;
   }

   public MimeMappingType<WebAppType<T>> mimeMapping()
   {
      return new MimeMappingTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<MimeMappingType<WebAppType<T>>> getMimeMappingList()
   {
      List<MimeMappingType<WebAppType<T>>> list = new ArrayList<MimeMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(MimeMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MimeMappingType<WebAppType<T>> type = new MimeMappingTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllWelcomeFileList()
   {
      childNode.remove(WelcomeFileListTypeImpl.nodeName);
      return this;
   }

   public WelcomeFileListType<WebAppType<T>> welcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<WelcomeFileListType<WebAppType<T>>> getWelcomeFileListList()
   {
      List<WelcomeFileListType<WebAppType<T>>> list = new ArrayList<WelcomeFileListType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(WelcomeFileListTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         WelcomeFileListType<WebAppType<T>> type = new WelcomeFileListTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllErrorPage()
   {
      childNode.remove(ErrorPageTypeImpl.nodeName);
      return this;
   }

   public ErrorPageType<WebAppType<T>> errorPage()
   {
      return new ErrorPageTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<ErrorPageType<WebAppType<T>>> getErrorPageList()
   {
      List<ErrorPageType<WebAppType<T>>> list = new ArrayList<ErrorPageType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(ErrorPageTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ErrorPageType<WebAppType<T>> type = new ErrorPageTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllJspConfig()
   {
      childNode.remove(JspConfigTypeImpl.nodeName);
      return this;
   }

   public JspConfigType<WebAppType<T>> jspConfig()
   {
      return new JspConfigTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<JspConfigType<WebAppType<T>>> getJspConfigList()
   {
      List<JspConfigType<WebAppType<T>>> list = new ArrayList<JspConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(JspConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         JspConfigType<WebAppType<T>> type = new JspConfigTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllSecurityConstraint()
   {
      childNode.remove(SecurityConstraintTypeImpl.nodeName);
      return this;
   }

   public SecurityConstraintType<WebAppType<T>> securityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<SecurityConstraintType<WebAppType<T>>> getSecurityConstraintList()
   {
      List<SecurityConstraintType<WebAppType<T>>> list = new ArrayList<SecurityConstraintType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(SecurityConstraintTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SecurityConstraintType<WebAppType<T>> type = new SecurityConstraintTypeImpl<WebAppType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllLoginConfig()
   {
      childNode.remove(LoginConfigTypeImpl.nodeName);
      return this;
   }

   public LoginConfigType<WebAppType<T>> loginConfig()
   {
      return new LoginConfigTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<LoginConfigType<WebAppType<T>>> getLoginConfigList()
   {
      List<LoginConfigType<WebAppType<T>>> list = new ArrayList<LoginConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(LoginConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LoginConfigType<WebAppType<T>> type = new LoginConfigTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllSecurityRole()
   {
      childNode.remove(SecurityRoleTypeImpl.nodeName);
      return this;
   }

   public SecurityRoleType<WebAppType<T>> securityRole()
   {
      return new SecurityRoleTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<SecurityRoleType<WebAppType<T>>> getSecurityRoleList()
   {
      List<SecurityRoleType<WebAppType<T>>> list = new ArrayList<SecurityRoleType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(SecurityRoleTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SecurityRoleType<WebAppType<T>> type = new SecurityRoleTypeImpl<WebAppType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllMessageDestination()
   {
      childNode.remove(MessageDestinationTypeImpl.nodeName);
      return this;
   }

   public MessageDestinationType<WebAppType<T>> messageDestination()
   {
      return new MessageDestinationTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<MessageDestinationType<WebAppType<T>>> getMessageDestinationList()
   {
      List<MessageDestinationType<WebAppType<T>>> list = new ArrayList<MessageDestinationType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MessageDestinationType<WebAppType<T>> type = new MessageDestinationTypeImpl<WebAppType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> removeAllLocaleEncodingMappingList()
   {
      childNode.remove(LocaleEncodingMappingListTypeImpl.nodeName);
      return this;
   }

   public LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<LocaleEncodingMappingListType<WebAppType<T>>> getLocaleEncodingMappingListList()
   {
      List<LocaleEncodingMappingListType<WebAppType<T>>> list = new ArrayList<LocaleEncodingMappingListType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(LocaleEncodingMappingListTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LocaleEncodingMappingListType<WebAppType<T>> type = new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this,
               "", childNode, node);
         list.add(type);
      }
      return list;
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

   public WebAppType<T> setDescriptionList(String... values)
   {
      for (String name : values)
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

   public WebAppType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
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
      childNode.remove(IconTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         IconType<WebAppType<T>> type = new IconTypeImpl<WebAppType<T>>(this, "", childNode, node);
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
      childNode.remove(EnvEntryTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         EnvEntryType<WebAppType<T>> type = new EnvEntryTypeImpl<WebAppType<T>>(this, "", childNode, node);
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
      childNode.remove(EjbRefTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         EjbRefType<WebAppType<T>> type = new EjbRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
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
      childNode.remove(EjbLocalRefTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         EjbLocalRefType<WebAppType<T>> type = new EjbLocalRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
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
      childNode.remove(ResourceRefTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         ResourceRefType<WebAppType<T>> type = new ResourceRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
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
      childNode.remove(ResourceEnvRefTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         ResourceEnvRefType<WebAppType<T>> type = new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "", childNode, node);
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
      childNode.remove(MessageDestinationRefTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         MessageDestinationRefType<WebAppType<T>> type = new MessageDestinationRefTypeImpl<WebAppType<T>>(this, "",
               childNode, node);
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
      childNode.remove(PersistenceContextRefTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         PersistenceContextRefType<WebAppType<T>> type = new PersistenceContextRefTypeImpl<WebAppType<T>>(this, "",
               childNode, node);
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
      childNode.remove(PersistenceUnitRefTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<WebAppType<T>> type = new PersistenceUnitRefTypeImpl<WebAppType<T>>(this, "",
               childNode, node);
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
      childNode.remove(LifecycleCallbackTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebAppType<T>> type = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "", childNode,
               node);
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
      childNode.remove(LifecycleCallbackTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebAppType<T>> type = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "", childNode,
               node);
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
      childNode.remove(DataSourceTypeImpl.nodeName);
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
      for (Node node : nodeList)
      {
         DataSourceType<WebAppType<T>> type = new DataSourceTypeImpl<WebAppType<T>>(this, "", childNode, node);
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
      return WebAppVersionType.getFromStringValue(childNode.attribute("version"));
   }

   public String getVersionAsString()
   {
      return childNode.attribute("version");
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
      return Strings.isTrue(childNode.attribute("metadata-complete"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebAppType<T> setModuleName(String moduleName)
   {
      childNode.create("module-name").text(moduleName);
      return this;
   }

   public WebAppType<T> setModuleNameList(String... values)
   {
      for (String name : values)
      {
         setModuleName(name);
      }
      return this;
   }

   public WebAppType<T> removeAllModuleName()
   {
      childNode.remove("module-name");
      return this;
   }

   public List<String> getModuleNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("module-name");
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
   public WebAppType<T> removeAllAbsoluteOrdering()
   {
      childNode.remove(AbsoluteOrderingTypeImpl.nodeName);
      return this;
   }

   public AbsoluteOrderingType<WebAppType<T>> absoluteOrdering()
   {
      return new AbsoluteOrderingTypeImpl<WebAppType<T>>(this, "", childNode);
   }

   public List<AbsoluteOrderingType<WebAppType<T>>> getAbsoluteOrderingList()
   {
      List<AbsoluteOrderingType<WebAppType<T>>> list = new ArrayList<AbsoluteOrderingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get(AbsoluteOrderingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         AbsoluteOrderingType<WebAppType<T>> type = new AbsoluteOrderingTypeImpl<WebAppType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

}
