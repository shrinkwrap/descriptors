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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
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
 * Generation date :2011-06-29T17:02:36.405-04:00
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

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebFragmentTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public WebFragmentTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   public WebFragmentType<T> distributable()
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
   public WebFragmentType<T> removeAllContextParam()
   {
      childNode.remove(ParamValueTypeImpl.nodeName);
      return this;
   }

   public ParamValueType<WebFragmentType<T>> contextParam()
   {
      return new ParamValueTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ParamValueType<WebFragmentType<T>>> getContextParamList()
   {
      List<ParamValueType<WebFragmentType<T>>> list = new ArrayList<ParamValueType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ParamValueTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ParamValueType<WebFragmentType<T>> type = new ParamValueTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllFilter()
   {
      childNode.remove(FilterTypeImpl.nodeName);
      return this;
   }

   public FilterType<WebFragmentType<T>> filter()
   {
      return new FilterTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<FilterType<WebFragmentType<T>>> getFilterList()
   {
      List<FilterType<WebFragmentType<T>>> list = new ArrayList<FilterType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(FilterTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         FilterType<WebFragmentType<T>> type = new FilterTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllFilterMapping()
   {
      childNode.remove(FilterMappingTypeImpl.nodeName);
      return this;
   }

   public FilterMappingType<WebFragmentType<T>> filterMapping()
   {
      return new FilterMappingTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<FilterMappingType<WebFragmentType<T>>> getFilterMappingList()
   {
      List<FilterMappingType<WebFragmentType<T>>> list = new ArrayList<FilterMappingType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(FilterMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         FilterMappingType<WebFragmentType<T>> type = new FilterMappingTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllListener()
   {
      childNode.remove(ListenerTypeImpl.nodeName);
      return this;
   }

   public ListenerType<WebFragmentType<T>> listener()
   {
      return new ListenerTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ListenerType<WebFragmentType<T>>> getListenerList()
   {
      List<ListenerType<WebFragmentType<T>>> list = new ArrayList<ListenerType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ListenerTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ListenerType<WebFragmentType<T>> type = new ListenerTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllServlet()
   {
      childNode.remove(ServletTypeImpl.nodeName);
      return this;
   }

   public ServletType<WebFragmentType<T>> servlet()
   {
      return new ServletTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ServletType<WebFragmentType<T>>> getServletList()
   {
      List<ServletType<WebFragmentType<T>>> list = new ArrayList<ServletType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ServletTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ServletType<WebFragmentType<T>> type = new ServletTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllServletMapping()
   {
      childNode.remove(ServletMappingTypeImpl.nodeName);
      return this;
   }

   public ServletMappingType<WebFragmentType<T>> servletMapping()
   {
      return new ServletMappingTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ServletMappingType<WebFragmentType<T>>> getServletMappingList()
   {
      List<ServletMappingType<WebFragmentType<T>>> list = new ArrayList<ServletMappingType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ServletMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ServletMappingType<WebFragmentType<T>> type = new ServletMappingTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllSessionConfig()
   {
      childNode.remove(SessionConfigTypeImpl.nodeName);
      return this;
   }

   public SessionConfigType<WebFragmentType<T>> sessionConfig()
   {
      return new SessionConfigTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<SessionConfigType<WebFragmentType<T>>> getSessionConfigList()
   {
      List<SessionConfigType<WebFragmentType<T>>> list = new ArrayList<SessionConfigType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(SessionConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SessionConfigType<WebFragmentType<T>> type = new SessionConfigTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllMimeMapping()
   {
      childNode.remove(MimeMappingTypeImpl.nodeName);
      return this;
   }

   public MimeMappingType<WebFragmentType<T>> mimeMapping()
   {
      return new MimeMappingTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<MimeMappingType<WebFragmentType<T>>> getMimeMappingList()
   {
      List<MimeMappingType<WebFragmentType<T>>> list = new ArrayList<MimeMappingType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(MimeMappingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MimeMappingType<WebFragmentType<T>> type = new MimeMappingTypeImpl<WebFragmentType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllWelcomeFileList()
   {
      childNode.remove(WelcomeFileListTypeImpl.nodeName);
      return this;
   }

   public WelcomeFileListType<WebFragmentType<T>> welcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<WelcomeFileListType<WebFragmentType<T>>> getWelcomeFileListList()
   {
      List<WelcomeFileListType<WebFragmentType<T>>> list = new ArrayList<WelcomeFileListType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(WelcomeFileListTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         WelcomeFileListType<WebFragmentType<T>> type = new WelcomeFileListTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllErrorPage()
   {
      childNode.remove(ErrorPageTypeImpl.nodeName);
      return this;
   }

   public ErrorPageType<WebFragmentType<T>> errorPage()
   {
      return new ErrorPageTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ErrorPageType<WebFragmentType<T>>> getErrorPageList()
   {
      List<ErrorPageType<WebFragmentType<T>>> list = new ArrayList<ErrorPageType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ErrorPageTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ErrorPageType<WebFragmentType<T>> type = new ErrorPageTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllJspConfig()
   {
      childNode.remove(JspConfigTypeImpl.nodeName);
      return this;
   }

   public JspConfigType<WebFragmentType<T>> jspConfig()
   {
      return new JspConfigTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<JspConfigType<WebFragmentType<T>>> getJspConfigList()
   {
      List<JspConfigType<WebFragmentType<T>>> list = new ArrayList<JspConfigType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(JspConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         JspConfigType<WebFragmentType<T>> type = new JspConfigTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllSecurityConstraint()
   {
      childNode.remove(SecurityConstraintTypeImpl.nodeName);
      return this;
   }

   public SecurityConstraintType<WebFragmentType<T>> securityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<SecurityConstraintType<WebFragmentType<T>>> getSecurityConstraintList()
   {
      List<SecurityConstraintType<WebFragmentType<T>>> list = new ArrayList<SecurityConstraintType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(SecurityConstraintTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SecurityConstraintType<WebFragmentType<T>> type = new SecurityConstraintTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllLoginConfig()
   {
      childNode.remove(LoginConfigTypeImpl.nodeName);
      return this;
   }

   public LoginConfigType<WebFragmentType<T>> loginConfig()
   {
      return new LoginConfigTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<LoginConfigType<WebFragmentType<T>>> getLoginConfigList()
   {
      List<LoginConfigType<WebFragmentType<T>>> list = new ArrayList<LoginConfigType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(LoginConfigTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LoginConfigType<WebFragmentType<T>> type = new LoginConfigTypeImpl<WebFragmentType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllSecurityRole()
   {
      childNode.remove(SecurityRoleTypeImpl.nodeName);
      return this;
   }

   public SecurityRoleType<WebFragmentType<T>> securityRole()
   {
      return new SecurityRoleTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<SecurityRoleType<WebFragmentType<T>>> getSecurityRoleList()
   {
      List<SecurityRoleType<WebFragmentType<T>>> list = new ArrayList<SecurityRoleType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(SecurityRoleTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SecurityRoleType<WebFragmentType<T>> type = new SecurityRoleTypeImpl<WebFragmentType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllMessageDestination()
   {
      childNode.remove(MessageDestinationTypeImpl.nodeName);
      return this;
   }

   public MessageDestinationType<WebFragmentType<T>> messageDestination()
   {
      return new MessageDestinationTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<MessageDestinationType<WebFragmentType<T>>> getMessageDestinationList()
   {
      List<MessageDestinationType<WebFragmentType<T>>> list = new ArrayList<MessageDestinationType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MessageDestinationType<WebFragmentType<T>> type = new MessageDestinationTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllLocaleEncodingMappingList()
   {
      childNode.remove(LocaleEncodingMappingListTypeImpl.nodeName);
      return this;
   }

   public LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<LocaleEncodingMappingListType<WebFragmentType<T>>> getLocaleEncodingMappingListList()
   {
      List<LocaleEncodingMappingListType<WebFragmentType<T>>> list = new ArrayList<LocaleEncodingMappingListType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(LocaleEncodingMappingListTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LocaleEncodingMappingListType<WebFragmentType<T>> type = new LocaleEncodingMappingListTypeImpl<WebFragmentType<T>>(
               this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public WebFragmentType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public WebFragmentType<T> removeAllDescription()
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
   public WebFragmentType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public WebFragmentType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public WebFragmentType<T> removeAllDisplayName()
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
   public WebFragmentType<T> removeAllIcon()
   {
      childNode.remove(IconTypeImpl.nodeName);
      return this;
   }

   public IconType<WebFragmentType<T>> icon()
   {
      return new IconTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<IconType<WebFragmentType<T>>> getIconList()
   {
      List<IconType<WebFragmentType<T>>> list = new ArrayList<IconType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         IconType<WebFragmentType<T>> type = new IconTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllEnvEntry()
   {
      childNode.remove(EnvEntryTypeImpl.nodeName);
      return this;
   }

   public EnvEntryType<WebFragmentType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<EnvEntryType<WebFragmentType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<WebFragmentType<T>>> list = new ArrayList<EnvEntryType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(EnvEntryTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EnvEntryType<WebFragmentType<T>> type = new EnvEntryTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllEjbRef()
   {
      childNode.remove(EjbRefTypeImpl.nodeName);
      return this;
   }

   public EjbRefType<WebFragmentType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<EjbRefType<WebFragmentType<T>>> getEjbRefList()
   {
      List<EjbRefType<WebFragmentType<T>>> list = new ArrayList<EjbRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(EjbRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EjbRefType<WebFragmentType<T>> type = new EjbRefTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllEjbLocalRef()
   {
      childNode.remove(EjbLocalRefTypeImpl.nodeName);
      return this;
   }

   public EjbLocalRefType<WebFragmentType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<EjbLocalRefType<WebFragmentType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<WebFragmentType<T>>> list = new ArrayList<EjbLocalRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(EjbLocalRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EjbLocalRefType<WebFragmentType<T>> type = new EjbLocalRefTypeImpl<WebFragmentType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllResourceRef()
   {
      childNode.remove(ResourceRefTypeImpl.nodeName);
      return this;
   }

   public ResourceRefType<WebFragmentType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ResourceRefType<WebFragmentType<T>>> getResourceRefList()
   {
      List<ResourceRefType<WebFragmentType<T>>> list = new ArrayList<ResourceRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ResourceRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ResourceRefType<WebFragmentType<T>> type = new ResourceRefTypeImpl<WebFragmentType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllResourceEnvRef()
   {
      childNode.remove(ResourceEnvRefTypeImpl.nodeName);
      return this;
   }

   public ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<ResourceEnvRefType<WebFragmentType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<WebFragmentType<T>>> list = new ArrayList<ResourceEnvRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(ResourceEnvRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ResourceEnvRefType<WebFragmentType<T>> type = new ResourceEnvRefTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllMessageDestinationRef()
   {
      childNode.remove(MessageDestinationRefTypeImpl.nodeName);
      return this;
   }

   public MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<MessageDestinationRefType<WebFragmentType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<WebFragmentType<T>>> list = new ArrayList<MessageDestinationRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MessageDestinationRefType<WebFragmentType<T>> type = new MessageDestinationRefTypeImpl<WebFragmentType<T>>(
               this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllPersistenceContextRef()
   {
      childNode.remove(PersistenceContextRefTypeImpl.nodeName);
      return this;
   }

   public PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<PersistenceContextRefType<WebFragmentType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<WebFragmentType<T>>> list = new ArrayList<PersistenceContextRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceContextRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PersistenceContextRefType<WebFragmentType<T>> type = new PersistenceContextRefTypeImpl<WebFragmentType<T>>(
               this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove(PersistenceUnitRefTypeImpl.nodeName);
      return this;
   }

   public PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<PersistenceUnitRefType<WebFragmentType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<WebFragmentType<T>>> list = new ArrayList<PersistenceUnitRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceUnitRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<WebFragmentType<T>> type = new PersistenceUnitRefTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllPostConstruct()
   {
      childNode.remove(LifecycleCallbackTypeImpl.nodeName);
      return this;
   }

   public LifecycleCallbackType<WebFragmentType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<LifecycleCallbackType<WebFragmentType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<WebFragmentType<T>>> list = new ArrayList<LifecycleCallbackType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(LifecycleCallbackTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebFragmentType<T>> type = new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllPreDestroy()
   {
      childNode.remove(LifecycleCallbackTypeImpl.nodeName);
      return this;
   }

   public LifecycleCallbackType<WebFragmentType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<LifecycleCallbackType<WebFragmentType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<WebFragmentType<T>>> list = new ArrayList<LifecycleCallbackType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(LifecycleCallbackTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         LifecycleCallbackType<WebFragmentType<T>> type = new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllDataSource()
   {
      childNode.remove(DataSourceTypeImpl.nodeName);
      return this;
   }

   public DataSourceType<WebFragmentType<T>> dataSource()
   {
      return new DataSourceTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<DataSourceType<WebFragmentType<T>>> getDataSourceList()
   {
      List<DataSourceType<WebFragmentType<T>>> list = new ArrayList<DataSourceType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(DataSourceTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         DataSourceType<WebFragmentType<T>> type = new DataSourceTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> setVersion(WebAppVersionType version)
   {
      childNode.attribute("version", version);
      return this;
   }

   public WebFragmentType<T> setVersion(String version)
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
   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.attribute("metadata-complete"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> setName(String name)
   {
      childNode.create("name").text(name);
      return this;
   }

   public WebFragmentType<T> setNameList(String... values)
   {
      for (String name : values)
      {
         setName(name);
      }
      return this;
   }

   public WebFragmentType<T> removeAllName()
   {
      childNode.remove("name");
      return this;
   }

   public List<String> getNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ordering
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebFragmentType<T> removeAllOrdering()
   {
      childNode.remove(OrderingTypeImpl.nodeName);
      return this;
   }

   public OrderingType<WebFragmentType<T>> ordering()
   {
      return new OrderingTypeImpl<WebFragmentType<T>>(this, "", childNode);
   }

   public List<OrderingType<WebFragmentType<T>>> getOrderingList()
   {
      List<OrderingType<WebFragmentType<T>>> list = new ArrayList<OrderingType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get(OrderingTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         OrderingType<WebFragmentType<T>> type = new OrderingTypeImpl<WebFragmentType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

}
