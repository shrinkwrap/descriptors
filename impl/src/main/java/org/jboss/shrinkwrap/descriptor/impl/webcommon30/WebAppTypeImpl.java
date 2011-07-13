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
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 */
public class WebAppTypeImpl<T> implements Child<T>, WebAppType<T> {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private T t;
	private Node node;
	private Node childNode;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public WebAppTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public WebAppTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : distributable
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> distributable() {
		childNode.getOrCreate("distributable");
		return this;
	}

	public Boolean isDistributable() {
		return childNode.getSingle("distributable") != null;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : context-param
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllContextParam() {
		childNode.remove("context-param");
		return this;
	}

	public ParamValueType<WebAppType<T>> contextParam() {
		return new ParamValueTypeImpl<WebAppType<T>>(this, "context-param",
				childNode);
	}

	public List<ParamValueType<WebAppType<T>>> getContextParamList() {
		List<ParamValueType<WebAppType<T>>> list = new ArrayList<ParamValueType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("context-param");
		for (Node node : nodeList) {
			ParamValueType<WebAppType<T>> type = new ParamValueTypeImpl<WebAppType<T>>(
					this, "context-param", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : filter
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllFilter() {
		childNode.remove("filter");
		return this;
	}

	public FilterType<WebAppType<T>> filter() {
		return new FilterTypeImpl<WebAppType<T>>(this, "filter", childNode);
	}

	public List<FilterType<WebAppType<T>>> getFilterList() {
		List<FilterType<WebAppType<T>>> list = new ArrayList<FilterType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("filter");
		for (Node node : nodeList) {
			FilterType<WebAppType<T>> type = new FilterTypeImpl<WebAppType<T>>(
					this, "filter", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : filter-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllFilterMapping() {
		childNode.remove("filter-mapping");
		return this;
	}

	public FilterMappingType<WebAppType<T>> filterMapping() {
		return new FilterMappingTypeImpl<WebAppType<T>>(this, "filter-mapping",
				childNode);
	}

	public List<FilterMappingType<WebAppType<T>>> getFilterMappingList() {
		List<FilterMappingType<WebAppType<T>>> list = new ArrayList<FilterMappingType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("filter-mapping");
		for (Node node : nodeList) {
			FilterMappingType<WebAppType<T>> type = new FilterMappingTypeImpl<WebAppType<T>>(
					this, "filter-mapping", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : listener
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllListener() {
		childNode.remove("listener");
		return this;
	}

	public ListenerType<WebAppType<T>> listener() {
		return new ListenerTypeImpl<WebAppType<T>>(this, "listener", childNode);
	}

	public List<ListenerType<WebAppType<T>>> getListenerList() {
		List<ListenerType<WebAppType<T>>> list = new ArrayList<ListenerType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("listener");
		for (Node node : nodeList) {
			ListenerType<WebAppType<T>> type = new ListenerTypeImpl<WebAppType<T>>(
					this, "listener", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : servlet
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllServlet() {
		childNode.remove("servlet");
		return this;
	}

	public ServletType<WebAppType<T>> servlet() {
		return new ServletTypeImpl<WebAppType<T>>(this, "servlet", childNode);
	}

	public List<ServletType<WebAppType<T>>> getServletList() {
		List<ServletType<WebAppType<T>>> list = new ArrayList<ServletType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("servlet");
		for (Node node : nodeList) {
			ServletType<WebAppType<T>> type = new ServletTypeImpl<WebAppType<T>>(
					this, "servlet", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : servlet-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllServletMapping() {
		childNode.remove("servlet-mapping");
		return this;
	}

	public ServletMappingType<WebAppType<T>> servletMapping() {
		return new ServletMappingTypeImpl<WebAppType<T>>(this,
				"servlet-mapping", childNode);
	}

	public List<ServletMappingType<WebAppType<T>>> getServletMappingList() {
		List<ServletMappingType<WebAppType<T>>> list = new ArrayList<ServletMappingType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("servlet-mapping");
		for (Node node : nodeList) {
			ServletMappingType<WebAppType<T>> type = new ServletMappingTypeImpl<WebAppType<T>>(
					this, "servlet-mapping", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : session-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllSessionConfig() {
		childNode.remove("session-config");
		return this;
	}

	public SessionConfigType<WebAppType<T>> sessionConfig() {
		return new SessionConfigTypeImpl<WebAppType<T>>(this, "session-config",
				childNode);
	}

	public List<SessionConfigType<WebAppType<T>>> getSessionConfigList() {
		List<SessionConfigType<WebAppType<T>>> list = new ArrayList<SessionConfigType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("session-config");
		for (Node node : nodeList) {
			SessionConfigType<WebAppType<T>> type = new SessionConfigTypeImpl<WebAppType<T>>(
					this, "session-config", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mime-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllMimeMapping() {
		childNode.remove("mime-mapping");
		return this;
	}

	public MimeMappingType<WebAppType<T>> mimeMapping() {
		return new MimeMappingTypeImpl<WebAppType<T>>(this, "mime-mapping",
				childNode);
	}

	public List<MimeMappingType<WebAppType<T>>> getMimeMappingList() {
		List<MimeMappingType<WebAppType<T>>> list = new ArrayList<MimeMappingType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("mime-mapping");
		for (Node node : nodeList) {
			MimeMappingType<WebAppType<T>> type = new MimeMappingTypeImpl<WebAppType<T>>(
					this, "mime-mapping", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : welcome-file-list
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllWelcomeFileList() {
		childNode.remove("welcome-file-list");
		return this;
	}

	public WelcomeFileListType<WebAppType<T>> welcomeFileList() {
		return new WelcomeFileListTypeImpl<WebAppType<T>>(this,
				"welcome-file-list", childNode);
	}

	public List<WelcomeFileListType<WebAppType<T>>> getWelcomeFileListList() {
		List<WelcomeFileListType<WebAppType<T>>> list = new ArrayList<WelcomeFileListType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("welcome-file-list");
		for (Node node : nodeList) {
			WelcomeFileListType<WebAppType<T>> type = new WelcomeFileListTypeImpl<WebAppType<T>>(
					this, "welcome-file-list", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : error-page
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllErrorPage() {
		childNode.remove("error-page");
		return this;
	}

	public ErrorPageType<WebAppType<T>> errorPage() {
		return new ErrorPageTypeImpl<WebAppType<T>>(this, "error-page",
				childNode);
	}

	public List<ErrorPageType<WebAppType<T>>> getErrorPageList() {
		List<ErrorPageType<WebAppType<T>>> list = new ArrayList<ErrorPageType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("error-page");
		for (Node node : nodeList) {
			ErrorPageType<WebAppType<T>> type = new ErrorPageTypeImpl<WebAppType<T>>(
					this, "error-page", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jsp-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllJspConfig() {
		childNode.remove("jsp-config");
		return this;
	}

	public JspConfigType<WebAppType<T>> jspConfig() {
		return new JspConfigTypeImpl<WebAppType<T>>(this, "jsp-config",
				childNode);
	}

	public List<JspConfigType<WebAppType<T>>> getJspConfigList() {
		List<JspConfigType<WebAppType<T>>> list = new ArrayList<JspConfigType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("jsp-config");
		for (Node node : nodeList) {
			JspConfigType<WebAppType<T>> type = new JspConfigTypeImpl<WebAppType<T>>(
					this, "jsp-config", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-constraint
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllSecurityConstraint() {
		childNode.remove("security-constraint");
		return this;
	}

	public SecurityConstraintType<WebAppType<T>> securityConstraint() {
		return new SecurityConstraintTypeImpl<WebAppType<T>>(this,
				"security-constraint", childNode);
	}

	public List<SecurityConstraintType<WebAppType<T>>> getSecurityConstraintList() {
		List<SecurityConstraintType<WebAppType<T>>> list = new ArrayList<SecurityConstraintType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("security-constraint");
		for (Node node : nodeList) {
			SecurityConstraintType<WebAppType<T>> type = new SecurityConstraintTypeImpl<WebAppType<T>>(
					this, "security-constraint", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : login-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllLoginConfig() {
		childNode.remove("login-config");
		return this;
	}

	public LoginConfigType<WebAppType<T>> loginConfig() {
		return new LoginConfigTypeImpl<WebAppType<T>>(this, "login-config",
				childNode);
	}

	public List<LoginConfigType<WebAppType<T>>> getLoginConfigList() {
		List<LoginConfigType<WebAppType<T>>> list = new ArrayList<LoginConfigType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("login-config");
		for (Node node : nodeList) {
			LoginConfigType<WebAppType<T>> type = new LoginConfigTypeImpl<WebAppType<T>>(
					this, "login-config", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-role
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllSecurityRole() {
		childNode.remove("security-role");
		return this;
	}

	public SecurityRoleType<WebAppType<T>> securityRole() {
		return new SecurityRoleTypeImpl<WebAppType<T>>(this, "security-role",
				childNode);
	}

	public List<SecurityRoleType<WebAppType<T>>> getSecurityRoleList() {
		List<SecurityRoleType<WebAppType<T>>> list = new ArrayList<SecurityRoleType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("security-role");
		for (Node node : nodeList) {
			SecurityRoleType<WebAppType<T>> type = new SecurityRoleTypeImpl<WebAppType<T>>(
					this, "security-role", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllMessageDestination() {
		childNode.remove("message-destination");
		return this;
	}

	public MessageDestinationType<WebAppType<T>> messageDestination() {
		return new MessageDestinationTypeImpl<WebAppType<T>>(this,
				"message-destination", childNode);
	}

	public List<MessageDestinationType<WebAppType<T>>> getMessageDestinationList() {
		List<MessageDestinationType<WebAppType<T>>> list = new ArrayList<MessageDestinationType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("message-destination");
		for (Node node : nodeList) {
			MessageDestinationType<WebAppType<T>> type = new MessageDestinationTypeImpl<WebAppType<T>>(
					this, "message-destination", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : locale-encoding-mapping-list
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllLocaleEncodingMappingList() {
		childNode.remove("locale-encoding-mapping-list");
		return this;
	}

	public LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList() {
		return new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this,
				"locale-encoding-mapping-list", childNode);
	}

	public List<LocaleEncodingMappingListType<WebAppType<T>>> getLocaleEncodingMappingListList() {
		List<LocaleEncodingMappingListType<WebAppType<T>>> list = new ArrayList<LocaleEncodingMappingListType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("locale-encoding-mapping-list");
		for (Node node : nodeList) {
			LocaleEncodingMappingListType<WebAppType<T>> type = new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(
					this, "locale-encoding-mapping-list", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public WebAppType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public WebAppType<T> removeAllDescription() {
		childNode.remove("description");
		return this;
	}

	public List<String> getDescriptionList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("description");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : display-name
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public WebAppType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public WebAppType<T> removeAllDisplayName() {
		childNode.remove("display-name");
		return this;
	}

	public List<String> getDisplayNameList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("display-name");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : icon
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<WebAppType<T>> icon() {
		return new IconTypeImpl<WebAppType<T>>(this, "icon", childNode);
	}

	public List<IconType<WebAppType<T>>> getIconList() {
		List<IconType<WebAppType<T>>> list = new ArrayList<IconType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<WebAppType<T>> type = new IconTypeImpl<WebAppType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : env-entry
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllEnvEntry() {
		childNode.remove("env-entry");
		return this;
	}

	public EnvEntryType<WebAppType<T>> envEntry() {
		return new EnvEntryTypeImpl<WebAppType<T>>(this, "env-entry", childNode);
	}

	public List<EnvEntryType<WebAppType<T>>> getEnvEntryList() {
		List<EnvEntryType<WebAppType<T>>> list = new ArrayList<EnvEntryType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("env-entry");
		for (Node node : nodeList) {
			EnvEntryType<WebAppType<T>> type = new EnvEntryTypeImpl<WebAppType<T>>(
					this, "env-entry", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllEjbRef() {
		childNode.remove("ejb-ref");
		return this;
	}

	public EjbRefType<WebAppType<T>> ejbRef() {
		return new EjbRefTypeImpl<WebAppType<T>>(this, "ejb-ref", childNode);
	}

	public List<EjbRefType<WebAppType<T>>> getEjbRefList() {
		List<EjbRefType<WebAppType<T>>> list = new ArrayList<EjbRefType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("ejb-ref");
		for (Node node : nodeList) {
			EjbRefType<WebAppType<T>> type = new EjbRefTypeImpl<WebAppType<T>>(
					this, "ejb-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-local-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllEjbLocalRef() {
		childNode.remove("ejb-local-ref");
		return this;
	}

	public EjbLocalRefType<WebAppType<T>> ejbLocalRef() {
		return new EjbLocalRefTypeImpl<WebAppType<T>>(this, "ejb-local-ref",
				childNode);
	}

	public List<EjbLocalRefType<WebAppType<T>>> getEjbLocalRefList() {
		List<EjbLocalRefType<WebAppType<T>>> list = new ArrayList<EjbLocalRefType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("ejb-local-ref");
		for (Node node : nodeList) {
			EjbLocalRefType<WebAppType<T>> type = new EjbLocalRefTypeImpl<WebAppType<T>>(
					this, "ejb-local-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllResourceRef() {
		childNode.remove("resource-ref");
		return this;
	}

	public ResourceRefType<WebAppType<T>> resourceRef() {
		return new ResourceRefTypeImpl<WebAppType<T>>(this, "resource-ref",
				childNode);
	}

	public List<ResourceRefType<WebAppType<T>>> getResourceRefList() {
		List<ResourceRefType<WebAppType<T>>> list = new ArrayList<ResourceRefType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("resource-ref");
		for (Node node : nodeList) {
			ResourceRefType<WebAppType<T>> type = new ResourceRefTypeImpl<WebAppType<T>>(
					this, "resource-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-env-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllResourceEnvRef() {
		childNode.remove("resource-env-ref");
		return this;
	}

	public ResourceEnvRefType<WebAppType<T>> resourceEnvRef() {
		return new ResourceEnvRefTypeImpl<WebAppType<T>>(this,
				"resource-env-ref", childNode);
	}

	public List<ResourceEnvRefType<WebAppType<T>>> getResourceEnvRefList() {
		List<ResourceEnvRefType<WebAppType<T>>> list = new ArrayList<ResourceEnvRefType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("resource-env-ref");
		for (Node node : nodeList) {
			ResourceEnvRefType<WebAppType<T>> type = new ResourceEnvRefTypeImpl<WebAppType<T>>(
					this, "resource-env-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllMessageDestinationRef() {
		childNode.remove("message-destination-ref");
		return this;
	}

	public MessageDestinationRefType<WebAppType<T>> messageDestinationRef() {
		return new MessageDestinationRefTypeImpl<WebAppType<T>>(this,
				"message-destination-ref", childNode);
	}

	public List<MessageDestinationRefType<WebAppType<T>>> getMessageDestinationRefList() {
		List<MessageDestinationRefType<WebAppType<T>>> list = new ArrayList<MessageDestinationRefType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("message-destination-ref");
		for (Node node : nodeList) {
			MessageDestinationRefType<WebAppType<T>> type = new MessageDestinationRefTypeImpl<WebAppType<T>>(
					this, "message-destination-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-context-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllPersistenceContextRef() {
		childNode.remove("persistence-context-ref");
		return this;
	}

	public PersistenceContextRefType<WebAppType<T>> persistenceContextRef() {
		return new PersistenceContextRefTypeImpl<WebAppType<T>>(this,
				"persistence-context-ref", childNode);
	}

	public List<PersistenceContextRefType<WebAppType<T>>> getPersistenceContextRefList() {
		List<PersistenceContextRefType<WebAppType<T>>> list = new ArrayList<PersistenceContextRefType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("persistence-context-ref");
		for (Node node : nodeList) {
			PersistenceContextRefType<WebAppType<T>> type = new PersistenceContextRefTypeImpl<WebAppType<T>>(
					this, "persistence-context-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-unit-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllPersistenceUnitRef() {
		childNode.remove("persistence-unit-ref");
		return this;
	}

	public PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef() {
		return new PersistenceUnitRefTypeImpl<WebAppType<T>>(this,
				"persistence-unit-ref", childNode);
	}

	public List<PersistenceUnitRefType<WebAppType<T>>> getPersistenceUnitRefList() {
		List<PersistenceUnitRefType<WebAppType<T>>> list = new ArrayList<PersistenceUnitRefType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("persistence-unit-ref");
		for (Node node : nodeList) {
			PersistenceUnitRefType<WebAppType<T>> type = new PersistenceUnitRefTypeImpl<WebAppType<T>>(
					this, "persistence-unit-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : post-construct
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllPostConstruct() {
		childNode.remove("post-construct");
		return this;
	}

	public LifecycleCallbackType<WebAppType<T>> postConstruct() {
		return new LifecycleCallbackTypeImpl<WebAppType<T>>(this,
				"post-construct", childNode);
	}

	public List<LifecycleCallbackType<WebAppType<T>>> getPostConstructList() {
		List<LifecycleCallbackType<WebAppType<T>>> list = new ArrayList<LifecycleCallbackType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("post-construct");
		for (Node node : nodeList) {
			LifecycleCallbackType<WebAppType<T>> type = new LifecycleCallbackTypeImpl<WebAppType<T>>(
					this, "post-construct", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pre-destroy
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllPreDestroy() {
		childNode.remove("pre-destroy");
		return this;
	}

	public LifecycleCallbackType<WebAppType<T>> preDestroy() {
		return new LifecycleCallbackTypeImpl<WebAppType<T>>(this,
				"pre-destroy", childNode);
	}

	public List<LifecycleCallbackType<WebAppType<T>>> getPreDestroyList() {
		List<LifecycleCallbackType<WebAppType<T>>> list = new ArrayList<LifecycleCallbackType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("pre-destroy");
		for (Node node : nodeList) {
			LifecycleCallbackType<WebAppType<T>> type = new LifecycleCallbackTypeImpl<WebAppType<T>>(
					this, "pre-destroy", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : data-source
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllDataSource() {
		childNode.remove("data-source");
		return this;
	}

	public DataSourceType<WebAppType<T>> dataSource() {
		return new DataSourceTypeImpl<WebAppType<T>>(this, "data-source",
				childNode);
	}

	public List<DataSourceType<WebAppType<T>>> getDataSourceList() {
		List<DataSourceType<WebAppType<T>>> list = new ArrayList<DataSourceType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("data-source");
		for (Node node : nodeList) {
			DataSourceType<WebAppType<T>> type = new DataSourceTypeImpl<WebAppType<T>>(
					this, "data-source", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> setVersion(WebAppVersionType version) {
		childNode.attribute("version", version);
		return this;
	}

	public WebAppType<T> setVersion(String version) {
		childNode.attribute("version", version);
		return this;
	}

	public WebAppType<T> removeVersion() {
		childNode.attributes().remove("version");
		return this;
	}

	public WebAppVersionType getVersion() {
		return WebAppVersionType.getFromStringValue(childNode
				.attribute("version"));
	}

	public String getVersionAsString() {
		return childNode.attribute("version");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : metadata-complete
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> setMetadataComplete(Boolean metadataComplete) {
		childNode.attribute("metadata-complete", metadataComplete);
		return this;
	}

	public WebAppType<T> removeMetadataComplete() {
		childNode.attributes().remove("metadata-complete");
		return this;
	}

	public Boolean isMetadataComplete() {
		return Strings.isTrue(childNode.attribute("metadata-complete"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : module-name
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> setModuleName(String moduleName) {
		childNode.create("module-name").text(moduleName);
		return this;
	}

	public WebAppType<T> setModuleNameList(String... values) {
		for (String name : values) {
			setModuleName(name);
		}
		return this;
	}

	public WebAppType<T> removeAllModuleName() {
		childNode.remove("module-name");
		return this;
	}

	public List<String> getModuleNameList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("module-name");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : absolute-ordering
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebAppType<T> removeAllAbsoluteOrdering() {
		childNode.remove("absolute-ordering");
		return this;
	}

	public AbsoluteOrderingType<WebAppType<T>> absoluteOrdering() {
		return new AbsoluteOrderingTypeImpl<WebAppType<T>>(this,
				"absolute-ordering", childNode);
	}

	public List<AbsoluteOrderingType<WebAppType<T>>> getAbsoluteOrderingList() {
		List<AbsoluteOrderingType<WebAppType<T>>> list = new ArrayList<AbsoluteOrderingType<WebAppType<T>>>();
		List<Node> nodeList = childNode.get("absolute-ordering");
		for (Node node : nodeList) {
			AbsoluteOrderingType<WebAppType<T>> type = new AbsoluteOrderingTypeImpl<WebAppType<T>>(
					this, "absolute-ordering", childNode, node);
			list.add(type);
		}
		return list;
	}

}
