package org.jboss.shrinkwrap.descriptor.impl.webfragment30;

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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.WebFragment30Descriptor;
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
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ErrorPageTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LocaleEncodingMappingListTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LoginConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.MimeMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.OrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.SecurityConstraintTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ServletMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ServletTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.SessionConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.WelcomeFileListTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 */
public class WebFragment30DescriptorImpl extends NodeProviderImplBase implements
		DescriptorNamespace<WebFragment30Descriptor>, WebFragment30Descriptor {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private Node model;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public WebFragment30DescriptorImpl(String descriptorName) {
		this(descriptorName, new Node("web-fragment"));
	}

	public WebFragment30DescriptorImpl(String descriptorName, Node node) {
		super(descriptorName);
		this.model = node;
	}

	// -------------------------------------------------------------------------------------||
	// Methods
	// -----------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public Node getRootNode() {
		return model;
	}

	protected DescriptorExporter getExporter() {
		return new XMLExporter();
	}

	// -------------------------------------------------------------------------------------||
	// Namespace
	// ---------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public WebFragment30Descriptor addDefaultNamespaces() {
		addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
		addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		addNamespace(
				"xsi:schemaLocation",
				"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-fragment_3_0.xsd");
		return this;
	}

	public WebFragment30Descriptor addNamespace(String name, String value) {
		model.attribute(name, value);
		return this;
	}

	public List<String> getNamespaces() {
		List<String> namespaceList = new ArrayList<String>();
		Map<String, String> attributes = model.attributes();
		for (String name : attributes.keySet()) {
			String value = attributes.get(name);
			if (value != null && value.startsWith("http://")) {
				namespaceList.add(name + "=" + value);
			}
		}
		return namespaceList;
	}

	public WebFragment30Descriptor removeAllNamespaces() {
		List<String> nameSpaceKeys = new ArrayList<String>();
		Map<String, String> attributes = model.attributes();
		for (String name : attributes.keySet()) {
			String value = attributes.get(name);
			if (value != null && value.startsWith("http://")) {
				nameSpaceKeys.add(name);
			}
		}
		for (String name : nameSpaceKeys) {
			model.attributes().remove(name);
		}
		return this;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : name
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor setName(String name) {
		model.create("name").text(name);
		return this;
	}

	public WebFragment30Descriptor setNameList(String... values) {
		for (String name : values) {
			setName(name);
		}
		return this;
	}

	public WebFragment30Descriptor removeAllName() {
		model.remove("name");
		return this;
	}

	public List<String> getNameList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = model.get("name");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ordering
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllOrdering() {
		model.remove("ordering");
		return this;
	}

	public OrderingType<WebFragment30Descriptor> ordering() {
		return new OrderingTypeImpl<WebFragment30Descriptor>(this, "ordering",
				model);
	}

	public List<OrderingType<WebFragment30Descriptor>> getOrderingList() {
		List<OrderingType<WebFragment30Descriptor>> list = new ArrayList<OrderingType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("ordering");
		for (Node node : nodeList) {
			OrderingType<WebFragment30Descriptor> type = new OrderingTypeImpl<WebFragment30Descriptor>(
					this, "ordering", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : distributable
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor distributable() {
		model.getOrCreate("distributable");
		return this;
	}

	public Boolean isDistributable() {
		return model.getSingle("distributable") != null;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : context-param
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllContextParam() {
		model.remove("context-param");
		return this;
	}

	public ParamValueType<WebFragment30Descriptor> contextParam() {
		return new ParamValueTypeImpl<WebFragment30Descriptor>(this,
				"context-param", model);
	}

	public List<ParamValueType<WebFragment30Descriptor>> getContextParamList() {
		List<ParamValueType<WebFragment30Descriptor>> list = new ArrayList<ParamValueType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("context-param");
		for (Node node : nodeList) {
			ParamValueType<WebFragment30Descriptor> type = new ParamValueTypeImpl<WebFragment30Descriptor>(
					this, "context-param", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : filter
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllFilter() {
		model.remove("filter");
		return this;
	}

	public FilterType<WebFragment30Descriptor> filter() {
		return new FilterTypeImpl<WebFragment30Descriptor>(this, "filter",
				model);
	}

	public List<FilterType<WebFragment30Descriptor>> getFilterList() {
		List<FilterType<WebFragment30Descriptor>> list = new ArrayList<FilterType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("filter");
		for (Node node : nodeList) {
			FilterType<WebFragment30Descriptor> type = new FilterTypeImpl<WebFragment30Descriptor>(
					this, "filter", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : filter-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllFilterMapping() {
		model.remove("filter-mapping");
		return this;
	}

	public FilterMappingType<WebFragment30Descriptor> filterMapping() {
		return new FilterMappingTypeImpl<WebFragment30Descriptor>(this,
				"filter-mapping", model);
	}

	public List<FilterMappingType<WebFragment30Descriptor>> getFilterMappingList() {
		List<FilterMappingType<WebFragment30Descriptor>> list = new ArrayList<FilterMappingType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("filter-mapping");
		for (Node node : nodeList) {
			FilterMappingType<WebFragment30Descriptor> type = new FilterMappingTypeImpl<WebFragment30Descriptor>(
					this, "filter-mapping", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : listener
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllListener() {
		model.remove("listener");
		return this;
	}

	public ListenerType<WebFragment30Descriptor> listener() {
		return new ListenerTypeImpl<WebFragment30Descriptor>(this, "listener",
				model);
	}

	public List<ListenerType<WebFragment30Descriptor>> getListenerList() {
		List<ListenerType<WebFragment30Descriptor>> list = new ArrayList<ListenerType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("listener");
		for (Node node : nodeList) {
			ListenerType<WebFragment30Descriptor> type = new ListenerTypeImpl<WebFragment30Descriptor>(
					this, "listener", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : servlet
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllServlet() {
		model.remove("servlet");
		return this;
	}

	public ServletType<WebFragment30Descriptor> servlet() {
		return new ServletTypeImpl<WebFragment30Descriptor>(this, "servlet",
				model);
	}

	public List<ServletType<WebFragment30Descriptor>> getServletList() {
		List<ServletType<WebFragment30Descriptor>> list = new ArrayList<ServletType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("servlet");
		for (Node node : nodeList) {
			ServletType<WebFragment30Descriptor> type = new ServletTypeImpl<WebFragment30Descriptor>(
					this, "servlet", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : servlet-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllServletMapping() {
		model.remove("servlet-mapping");
		return this;
	}

	public ServletMappingType<WebFragment30Descriptor> servletMapping() {
		return new ServletMappingTypeImpl<WebFragment30Descriptor>(this,
				"servlet-mapping", model);
	}

	public List<ServletMappingType<WebFragment30Descriptor>> getServletMappingList() {
		List<ServletMappingType<WebFragment30Descriptor>> list = new ArrayList<ServletMappingType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("servlet-mapping");
		for (Node node : nodeList) {
			ServletMappingType<WebFragment30Descriptor> type = new ServletMappingTypeImpl<WebFragment30Descriptor>(
					this, "servlet-mapping", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : session-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllSessionConfig() {
		model.remove("session-config");
		return this;
	}

	public SessionConfigType<WebFragment30Descriptor> sessionConfig() {
		return new SessionConfigTypeImpl<WebFragment30Descriptor>(this,
				"session-config", model);
	}

	public List<SessionConfigType<WebFragment30Descriptor>> getSessionConfigList() {
		List<SessionConfigType<WebFragment30Descriptor>> list = new ArrayList<SessionConfigType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("session-config");
		for (Node node : nodeList) {
			SessionConfigType<WebFragment30Descriptor> type = new SessionConfigTypeImpl<WebFragment30Descriptor>(
					this, "session-config", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mime-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllMimeMapping() {
		model.remove("mime-mapping");
		return this;
	}

	public MimeMappingType<WebFragment30Descriptor> mimeMapping() {
		return new MimeMappingTypeImpl<WebFragment30Descriptor>(this,
				"mime-mapping", model);
	}

	public List<MimeMappingType<WebFragment30Descriptor>> getMimeMappingList() {
		List<MimeMappingType<WebFragment30Descriptor>> list = new ArrayList<MimeMappingType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("mime-mapping");
		for (Node node : nodeList) {
			MimeMappingType<WebFragment30Descriptor> type = new MimeMappingTypeImpl<WebFragment30Descriptor>(
					this, "mime-mapping", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : welcome-file-list
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllWelcomeFileList() {
		model.remove("welcome-file-list");
		return this;
	}

	public WelcomeFileListType<WebFragment30Descriptor> welcomeFileList() {
		return new WelcomeFileListTypeImpl<WebFragment30Descriptor>(this,
				"welcome-file-list", model);
	}

	public List<WelcomeFileListType<WebFragment30Descriptor>> getWelcomeFileListList() {
		List<WelcomeFileListType<WebFragment30Descriptor>> list = new ArrayList<WelcomeFileListType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("welcome-file-list");
		for (Node node : nodeList) {
			WelcomeFileListType<WebFragment30Descriptor> type = new WelcomeFileListTypeImpl<WebFragment30Descriptor>(
					this, "welcome-file-list", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : error-page
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllErrorPage() {
		model.remove("error-page");
		return this;
	}

	public ErrorPageType<WebFragment30Descriptor> errorPage() {
		return new ErrorPageTypeImpl<WebFragment30Descriptor>(this,
				"error-page", model);
	}

	public List<ErrorPageType<WebFragment30Descriptor>> getErrorPageList() {
		List<ErrorPageType<WebFragment30Descriptor>> list = new ArrayList<ErrorPageType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("error-page");
		for (Node node : nodeList) {
			ErrorPageType<WebFragment30Descriptor> type = new ErrorPageTypeImpl<WebFragment30Descriptor>(
					this, "error-page", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jsp-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllJspConfig() {
		model.remove("jsp-config");
		return this;
	}

	public JspConfigType<WebFragment30Descriptor> jspConfig() {
		return new JspConfigTypeImpl<WebFragment30Descriptor>(this,
				"jsp-config", model);
	}

	public List<JspConfigType<WebFragment30Descriptor>> getJspConfigList() {
		List<JspConfigType<WebFragment30Descriptor>> list = new ArrayList<JspConfigType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("jsp-config");
		for (Node node : nodeList) {
			JspConfigType<WebFragment30Descriptor> type = new JspConfigTypeImpl<WebFragment30Descriptor>(
					this, "jsp-config", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-constraint
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllSecurityConstraint() {
		model.remove("security-constraint");
		return this;
	}

	public SecurityConstraintType<WebFragment30Descriptor> securityConstraint() {
		return new SecurityConstraintTypeImpl<WebFragment30Descriptor>(this,
				"security-constraint", model);
	}

	public List<SecurityConstraintType<WebFragment30Descriptor>> getSecurityConstraintList() {
		List<SecurityConstraintType<WebFragment30Descriptor>> list = new ArrayList<SecurityConstraintType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("security-constraint");
		for (Node node : nodeList) {
			SecurityConstraintType<WebFragment30Descriptor> type = new SecurityConstraintTypeImpl<WebFragment30Descriptor>(
					this, "security-constraint", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : login-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllLoginConfig() {
		model.remove("login-config");
		return this;
	}

	public LoginConfigType<WebFragment30Descriptor> loginConfig() {
		return new LoginConfigTypeImpl<WebFragment30Descriptor>(this,
				"login-config", model);
	}

	public List<LoginConfigType<WebFragment30Descriptor>> getLoginConfigList() {
		List<LoginConfigType<WebFragment30Descriptor>> list = new ArrayList<LoginConfigType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("login-config");
		for (Node node : nodeList) {
			LoginConfigType<WebFragment30Descriptor> type = new LoginConfigTypeImpl<WebFragment30Descriptor>(
					this, "login-config", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-role
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllSecurityRole() {
		model.remove("security-role");
		return this;
	}

	public SecurityRoleType<WebFragment30Descriptor> securityRole() {
		return new SecurityRoleTypeImpl<WebFragment30Descriptor>(this,
				"security-role", model);
	}

	public List<SecurityRoleType<WebFragment30Descriptor>> getSecurityRoleList() {
		List<SecurityRoleType<WebFragment30Descriptor>> list = new ArrayList<SecurityRoleType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("security-role");
		for (Node node : nodeList) {
			SecurityRoleType<WebFragment30Descriptor> type = new SecurityRoleTypeImpl<WebFragment30Descriptor>(
					this, "security-role", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllMessageDestination() {
		model.remove("message-destination");
		return this;
	}

	public MessageDestinationType<WebFragment30Descriptor> messageDestination() {
		return new MessageDestinationTypeImpl<WebFragment30Descriptor>(this,
				"message-destination", model);
	}

	public List<MessageDestinationType<WebFragment30Descriptor>> getMessageDestinationList() {
		List<MessageDestinationType<WebFragment30Descriptor>> list = new ArrayList<MessageDestinationType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("message-destination");
		for (Node node : nodeList) {
			MessageDestinationType<WebFragment30Descriptor> type = new MessageDestinationTypeImpl<WebFragment30Descriptor>(
					this, "message-destination", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : locale-encoding-mapping-list
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllLocaleEncodingMappingList() {
		model.remove("locale-encoding-mapping-list");
		return this;
	}

	public LocaleEncodingMappingListType<WebFragment30Descriptor> localeEncodingMappingList() {
		return new LocaleEncodingMappingListTypeImpl<WebFragment30Descriptor>(
				this, "locale-encoding-mapping-list", model);
	}

	public List<LocaleEncodingMappingListType<WebFragment30Descriptor>> getLocaleEncodingMappingListList() {
		List<LocaleEncodingMappingListType<WebFragment30Descriptor>> list = new ArrayList<LocaleEncodingMappingListType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("locale-encoding-mapping-list");
		for (Node node : nodeList) {
			LocaleEncodingMappingListType<WebFragment30Descriptor> type = new LocaleEncodingMappingListTypeImpl<WebFragment30Descriptor>(
					this, "locale-encoding-mapping-list", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor setDescription(String description) {
		model.create("description").text(description);
		return this;
	}

	public WebFragment30Descriptor setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public WebFragment30Descriptor removeAllDescription() {
		model.remove("description");
		return this;
	}

	public List<String> getDescriptionList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = model.get("description");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : display-name
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor setDisplayName(String displayName) {
		model.create("display-name").text(displayName);
		return this;
	}

	public WebFragment30Descriptor setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public WebFragment30Descriptor removeAllDisplayName() {
		model.remove("display-name");
		return this;
	}

	public List<String> getDisplayNameList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = model.get("display-name");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : icon
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllIcon() {
		model.remove("icon");
		return this;
	}

	public IconType<WebFragment30Descriptor> icon() {
		return new IconTypeImpl<WebFragment30Descriptor>(this, "icon", model);
	}

	public List<IconType<WebFragment30Descriptor>> getIconList() {
		List<IconType<WebFragment30Descriptor>> list = new ArrayList<IconType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("icon");
		for (Node node : nodeList) {
			IconType<WebFragment30Descriptor> type = new IconTypeImpl<WebFragment30Descriptor>(
					this, "icon", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : env-entry
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllEnvEntry() {
		model.remove("env-entry");
		return this;
	}

	public EnvEntryType<WebFragment30Descriptor> envEntry() {
		return new EnvEntryTypeImpl<WebFragment30Descriptor>(this, "env-entry",
				model);
	}

	public List<EnvEntryType<WebFragment30Descriptor>> getEnvEntryList() {
		List<EnvEntryType<WebFragment30Descriptor>> list = new ArrayList<EnvEntryType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("env-entry");
		for (Node node : nodeList) {
			EnvEntryType<WebFragment30Descriptor> type = new EnvEntryTypeImpl<WebFragment30Descriptor>(
					this, "env-entry", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllEjbRef() {
		model.remove("ejb-ref");
		return this;
	}

	public EjbRefType<WebFragment30Descriptor> ejbRef() {
		return new EjbRefTypeImpl<WebFragment30Descriptor>(this, "ejb-ref",
				model);
	}

	public List<EjbRefType<WebFragment30Descriptor>> getEjbRefList() {
		List<EjbRefType<WebFragment30Descriptor>> list = new ArrayList<EjbRefType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("ejb-ref");
		for (Node node : nodeList) {
			EjbRefType<WebFragment30Descriptor> type = new EjbRefTypeImpl<WebFragment30Descriptor>(
					this, "ejb-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-local-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllEjbLocalRef() {
		model.remove("ejb-local-ref");
		return this;
	}

	public EjbLocalRefType<WebFragment30Descriptor> ejbLocalRef() {
		return new EjbLocalRefTypeImpl<WebFragment30Descriptor>(this,
				"ejb-local-ref", model);
	}

	public List<EjbLocalRefType<WebFragment30Descriptor>> getEjbLocalRefList() {
		List<EjbLocalRefType<WebFragment30Descriptor>> list = new ArrayList<EjbLocalRefType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("ejb-local-ref");
		for (Node node : nodeList) {
			EjbLocalRefType<WebFragment30Descriptor> type = new EjbLocalRefTypeImpl<WebFragment30Descriptor>(
					this, "ejb-local-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllResourceRef() {
		model.remove("resource-ref");
		return this;
	}

	public ResourceRefType<WebFragment30Descriptor> resourceRef() {
		return new ResourceRefTypeImpl<WebFragment30Descriptor>(this,
				"resource-ref", model);
	}

	public List<ResourceRefType<WebFragment30Descriptor>> getResourceRefList() {
		List<ResourceRefType<WebFragment30Descriptor>> list = new ArrayList<ResourceRefType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("resource-ref");
		for (Node node : nodeList) {
			ResourceRefType<WebFragment30Descriptor> type = new ResourceRefTypeImpl<WebFragment30Descriptor>(
					this, "resource-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-env-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllResourceEnvRef() {
		model.remove("resource-env-ref");
		return this;
	}

	public ResourceEnvRefType<WebFragment30Descriptor> resourceEnvRef() {
		return new ResourceEnvRefTypeImpl<WebFragment30Descriptor>(this,
				"resource-env-ref", model);
	}

	public List<ResourceEnvRefType<WebFragment30Descriptor>> getResourceEnvRefList() {
		List<ResourceEnvRefType<WebFragment30Descriptor>> list = new ArrayList<ResourceEnvRefType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("resource-env-ref");
		for (Node node : nodeList) {
			ResourceEnvRefType<WebFragment30Descriptor> type = new ResourceEnvRefTypeImpl<WebFragment30Descriptor>(
					this, "resource-env-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllMessageDestinationRef() {
		model.remove("message-destination-ref");
		return this;
	}

	public MessageDestinationRefType<WebFragment30Descriptor> messageDestinationRef() {
		return new MessageDestinationRefTypeImpl<WebFragment30Descriptor>(this,
				"message-destination-ref", model);
	}

	public List<MessageDestinationRefType<WebFragment30Descriptor>> getMessageDestinationRefList() {
		List<MessageDestinationRefType<WebFragment30Descriptor>> list = new ArrayList<MessageDestinationRefType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("message-destination-ref");
		for (Node node : nodeList) {
			MessageDestinationRefType<WebFragment30Descriptor> type = new MessageDestinationRefTypeImpl<WebFragment30Descriptor>(
					this, "message-destination-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-context-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllPersistenceContextRef() {
		model.remove("persistence-context-ref");
		return this;
	}

	public PersistenceContextRefType<WebFragment30Descriptor> persistenceContextRef() {
		return new PersistenceContextRefTypeImpl<WebFragment30Descriptor>(this,
				"persistence-context-ref", model);
	}

	public List<PersistenceContextRefType<WebFragment30Descriptor>> getPersistenceContextRefList() {
		List<PersistenceContextRefType<WebFragment30Descriptor>> list = new ArrayList<PersistenceContextRefType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("persistence-context-ref");
		for (Node node : nodeList) {
			PersistenceContextRefType<WebFragment30Descriptor> type = new PersistenceContextRefTypeImpl<WebFragment30Descriptor>(
					this, "persistence-context-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-unit-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllPersistenceUnitRef() {
		model.remove("persistence-unit-ref");
		return this;
	}

	public PersistenceUnitRefType<WebFragment30Descriptor> persistenceUnitRef() {
		return new PersistenceUnitRefTypeImpl<WebFragment30Descriptor>(this,
				"persistence-unit-ref", model);
	}

	public List<PersistenceUnitRefType<WebFragment30Descriptor>> getPersistenceUnitRefList() {
		List<PersistenceUnitRefType<WebFragment30Descriptor>> list = new ArrayList<PersistenceUnitRefType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("persistence-unit-ref");
		for (Node node : nodeList) {
			PersistenceUnitRefType<WebFragment30Descriptor> type = new PersistenceUnitRefTypeImpl<WebFragment30Descriptor>(
					this, "persistence-unit-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : post-construct
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllPostConstruct() {
		model.remove("post-construct");
		return this;
	}

	public LifecycleCallbackType<WebFragment30Descriptor> postConstruct() {
		return new LifecycleCallbackTypeImpl<WebFragment30Descriptor>(this,
				"post-construct", model);
	}

	public List<LifecycleCallbackType<WebFragment30Descriptor>> getPostConstructList() {
		List<LifecycleCallbackType<WebFragment30Descriptor>> list = new ArrayList<LifecycleCallbackType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("post-construct");
		for (Node node : nodeList) {
			LifecycleCallbackType<WebFragment30Descriptor> type = new LifecycleCallbackTypeImpl<WebFragment30Descriptor>(
					this, "post-construct", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pre-destroy
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllPreDestroy() {
		model.remove("pre-destroy");
		return this;
	}

	public LifecycleCallbackType<WebFragment30Descriptor> preDestroy() {
		return new LifecycleCallbackTypeImpl<WebFragment30Descriptor>(this,
				"pre-destroy", model);
	}

	public List<LifecycleCallbackType<WebFragment30Descriptor>> getPreDestroyList() {
		List<LifecycleCallbackType<WebFragment30Descriptor>> list = new ArrayList<LifecycleCallbackType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("pre-destroy");
		for (Node node : nodeList) {
			LifecycleCallbackType<WebFragment30Descriptor> type = new LifecycleCallbackTypeImpl<WebFragment30Descriptor>(
					this, "pre-destroy", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : data-source
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor removeAllDataSource() {
		model.remove("data-source");
		return this;
	}

	public DataSourceType<WebFragment30Descriptor> dataSource() {
		return new DataSourceTypeImpl<WebFragment30Descriptor>(this,
				"data-source", model);
	}

	public List<DataSourceType<WebFragment30Descriptor>> getDataSourceList() {
		List<DataSourceType<WebFragment30Descriptor>> list = new ArrayList<DataSourceType<WebFragment30Descriptor>>();
		List<Node> nodeList = model.get("data-source");
		for (Node node : nodeList) {
			DataSourceType<WebFragment30Descriptor> type = new DataSourceTypeImpl<WebFragment30Descriptor>(
					this, "data-source", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor setVersion(WebAppVersionType version) {
		model.attribute("version", version);
		return this;
	}

	public WebFragment30Descriptor setVersion(String version) {
		model.attribute("version", version);
		return this;
	}

	public WebFragment30Descriptor removeVersion() {
		model.attributes().remove("version");
		return this;
	}

	public WebAppVersionType getVersion() {
		return WebAppVersionType.getFromStringValue(model.attribute("version"));
	}

	public String getVersionAsString() {
		return model.attribute("version");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : metadata-complete
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public WebFragment30Descriptor setMetadataComplete(Boolean metadataComplete) {
		model.attribute("metadata-complete", metadataComplete);
		return this;
	}

	public WebFragment30Descriptor removeMetadataComplete() {
		model.attributes().remove("metadata-complete");
		return this;
	}

	public Boolean isMetadataComplete() {
		return Strings.isTrue(model.attribute("metadata-complete"));
	}

}
