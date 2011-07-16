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
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 */
public class WebApp30DescriptorImpl extends NodeProviderImplBase implements
		DescriptorNamespace<WebApp30Descriptor>, WebApp30Descriptor {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private Node model;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public WebApp30DescriptorImpl(String descriptorName) {
		this(descriptorName, new Node("web-app"));
	}

	public WebApp30DescriptorImpl(String descriptorName, Node node) {
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

	/**
     * {@inheritDoc}
     * @see org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase#getExporter()
     */
    @Override
    protected DescriptorExporter getExporter() {
        return new XmlDomExporter();
    }

	// -------------------------------------------------------------------------------------||
	// Namespace
	// ---------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public WebApp30Descriptor addDefaultNamespaces() {
		addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
		addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		addNamespace(
				"xsi:schemaLocation",
				"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd");
		return this;
	}

	public WebApp30Descriptor addNamespace(String name, String value) {
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

	public WebApp30Descriptor removeAllNamespaces() {
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
	// Element type : module-name
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor setModuleName(String moduleName) {
		model.create("module-name").text(moduleName);
		return this;
	}

	public WebApp30Descriptor setModuleNameList(String... values) {
		for (String name : values) {
			setModuleName(name);
		}
		return this;
	}

	public WebApp30Descriptor removeAllModuleName() {
		model.remove("module-name");
		return this;
	}

	public List<String> getModuleNameList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = model.get("module-name");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : absolute-ordering
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllAbsoluteOrdering() {
		model.remove("absolute-ordering");
		return this;
	}

	public AbsoluteOrderingType<WebApp30Descriptor> absoluteOrdering() {
		return new AbsoluteOrderingTypeImpl<WebApp30Descriptor>(this,
				"absolute-ordering", model);
	}

	public List<AbsoluteOrderingType<WebApp30Descriptor>> getAbsoluteOrderingList() {
		List<AbsoluteOrderingType<WebApp30Descriptor>> list = new ArrayList<AbsoluteOrderingType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("absolute-ordering");
		for (Node node : nodeList) {
			AbsoluteOrderingType<WebApp30Descriptor> type = new AbsoluteOrderingTypeImpl<WebApp30Descriptor>(
					this, "absolute-ordering", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : distributable
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor distributable() {
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
	public WebApp30Descriptor removeAllContextParam() {
		model.remove("context-param");
		return this;
	}

	public ParamValueType<WebApp30Descriptor> contextParam() {
		return new ParamValueTypeImpl<WebApp30Descriptor>(this,
				"context-param", model);
	}

	public List<ParamValueType<WebApp30Descriptor>> getContextParamList() {
		List<ParamValueType<WebApp30Descriptor>> list = new ArrayList<ParamValueType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("context-param");
		for (Node node : nodeList) {
			ParamValueType<WebApp30Descriptor> type = new ParamValueTypeImpl<WebApp30Descriptor>(
					this, "context-param", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : filter
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllFilter() {
		model.remove("filter");
		return this;
	}

	public FilterType<WebApp30Descriptor> filter() {
		return new FilterTypeImpl<WebApp30Descriptor>(this, "filter", model);
	}

	public List<FilterType<WebApp30Descriptor>> getFilterList() {
		List<FilterType<WebApp30Descriptor>> list = new ArrayList<FilterType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("filter");
		for (Node node : nodeList) {
			FilterType<WebApp30Descriptor> type = new FilterTypeImpl<WebApp30Descriptor>(
					this, "filter", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : filter-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllFilterMapping() {
		model.remove("filter-mapping");
		return this;
	}

	public FilterMappingType<WebApp30Descriptor> filterMapping() {
		return new FilterMappingTypeImpl<WebApp30Descriptor>(this,
				"filter-mapping", model);
	}

	public List<FilterMappingType<WebApp30Descriptor>> getFilterMappingList() {
		List<FilterMappingType<WebApp30Descriptor>> list = new ArrayList<FilterMappingType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("filter-mapping");
		for (Node node : nodeList) {
			FilterMappingType<WebApp30Descriptor> type = new FilterMappingTypeImpl<WebApp30Descriptor>(
					this, "filter-mapping", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : listener
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllListener() {
		model.remove("listener");
		return this;
	}

	public ListenerType<WebApp30Descriptor> listener() {
		return new ListenerTypeImpl<WebApp30Descriptor>(this, "listener", model);
	}

	public List<ListenerType<WebApp30Descriptor>> getListenerList() {
		List<ListenerType<WebApp30Descriptor>> list = new ArrayList<ListenerType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("listener");
		for (Node node : nodeList) {
			ListenerType<WebApp30Descriptor> type = new ListenerTypeImpl<WebApp30Descriptor>(
					this, "listener", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : servlet
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllServlet() {
		model.remove("servlet");
		return this;
	}

	public ServletType<WebApp30Descriptor> servlet() {
		return new ServletTypeImpl<WebApp30Descriptor>(this, "servlet", model);
	}

	public List<ServletType<WebApp30Descriptor>> getServletList() {
		List<ServletType<WebApp30Descriptor>> list = new ArrayList<ServletType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("servlet");
		for (Node node : nodeList) {
			ServletType<WebApp30Descriptor> type = new ServletTypeImpl<WebApp30Descriptor>(
					this, "servlet", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : servlet-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllServletMapping() {
		model.remove("servlet-mapping");
		return this;
	}

	public ServletMappingType<WebApp30Descriptor> servletMapping() {
		return new ServletMappingTypeImpl<WebApp30Descriptor>(this,
				"servlet-mapping", model);
	}

	public List<ServletMappingType<WebApp30Descriptor>> getServletMappingList() {
		List<ServletMappingType<WebApp30Descriptor>> list = new ArrayList<ServletMappingType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("servlet-mapping");
		for (Node node : nodeList) {
			ServletMappingType<WebApp30Descriptor> type = new ServletMappingTypeImpl<WebApp30Descriptor>(
					this, "servlet-mapping", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : session-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllSessionConfig() {
		model.remove("session-config");
		return this;
	}

	public SessionConfigType<WebApp30Descriptor> sessionConfig() {
		return new SessionConfigTypeImpl<WebApp30Descriptor>(this,
				"session-config", model);
	}

	public List<SessionConfigType<WebApp30Descriptor>> getSessionConfigList() {
		List<SessionConfigType<WebApp30Descriptor>> list = new ArrayList<SessionConfigType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("session-config");
		for (Node node : nodeList) {
			SessionConfigType<WebApp30Descriptor> type = new SessionConfigTypeImpl<WebApp30Descriptor>(
					this, "session-config", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mime-mapping
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllMimeMapping() {
		model.remove("mime-mapping");
		return this;
	}

	public MimeMappingType<WebApp30Descriptor> mimeMapping() {
		return new MimeMappingTypeImpl<WebApp30Descriptor>(this,
				"mime-mapping", model);
	}

	public List<MimeMappingType<WebApp30Descriptor>> getMimeMappingList() {
		List<MimeMappingType<WebApp30Descriptor>> list = new ArrayList<MimeMappingType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("mime-mapping");
		for (Node node : nodeList) {
			MimeMappingType<WebApp30Descriptor> type = new MimeMappingTypeImpl<WebApp30Descriptor>(
					this, "mime-mapping", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : welcome-file-list
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllWelcomeFileList() {
		model.remove("welcome-file-list");
		return this;
	}

	public WelcomeFileListType<WebApp30Descriptor> welcomeFileList() {
		return new WelcomeFileListTypeImpl<WebApp30Descriptor>(this,
				"welcome-file-list", model);
	}

	public List<WelcomeFileListType<WebApp30Descriptor>> getWelcomeFileListList() {
		List<WelcomeFileListType<WebApp30Descriptor>> list = new ArrayList<WelcomeFileListType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("welcome-file-list");
		for (Node node : nodeList) {
			WelcomeFileListType<WebApp30Descriptor> type = new WelcomeFileListTypeImpl<WebApp30Descriptor>(
					this, "welcome-file-list", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : error-page
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllErrorPage() {
		model.remove("error-page");
		return this;
	}

	public ErrorPageType<WebApp30Descriptor> errorPage() {
		return new ErrorPageTypeImpl<WebApp30Descriptor>(this, "error-page",
				model);
	}

	public List<ErrorPageType<WebApp30Descriptor>> getErrorPageList() {
		List<ErrorPageType<WebApp30Descriptor>> list = new ArrayList<ErrorPageType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("error-page");
		for (Node node : nodeList) {
			ErrorPageType<WebApp30Descriptor> type = new ErrorPageTypeImpl<WebApp30Descriptor>(
					this, "error-page", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jsp-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllJspConfig() {
		model.remove("jsp-config");
		return this;
	}

	public JspConfigType<WebApp30Descriptor> jspConfig() {
		return new JspConfigTypeImpl<WebApp30Descriptor>(this, "jsp-config",
				model);
	}

	public List<JspConfigType<WebApp30Descriptor>> getJspConfigList() {
		List<JspConfigType<WebApp30Descriptor>> list = new ArrayList<JspConfigType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("jsp-config");
		for (Node node : nodeList) {
			JspConfigType<WebApp30Descriptor> type = new JspConfigTypeImpl<WebApp30Descriptor>(
					this, "jsp-config", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-constraint
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllSecurityConstraint() {
		model.remove("security-constraint");
		return this;
	}

	public SecurityConstraintType<WebApp30Descriptor> securityConstraint() {
		return new SecurityConstraintTypeImpl<WebApp30Descriptor>(this,
				"security-constraint", model);
	}

	public List<SecurityConstraintType<WebApp30Descriptor>> getSecurityConstraintList() {
		List<SecurityConstraintType<WebApp30Descriptor>> list = new ArrayList<SecurityConstraintType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("security-constraint");
		for (Node node : nodeList) {
			SecurityConstraintType<WebApp30Descriptor> type = new SecurityConstraintTypeImpl<WebApp30Descriptor>(
					this, "security-constraint", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : login-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllLoginConfig() {
		model.remove("login-config");
		return this;
	}

	public LoginConfigType<WebApp30Descriptor> loginConfig() {
		return new LoginConfigTypeImpl<WebApp30Descriptor>(this,
				"login-config", model);
	}

	public List<LoginConfigType<WebApp30Descriptor>> getLoginConfigList() {
		List<LoginConfigType<WebApp30Descriptor>> list = new ArrayList<LoginConfigType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("login-config");
		for (Node node : nodeList) {
			LoginConfigType<WebApp30Descriptor> type = new LoginConfigTypeImpl<WebApp30Descriptor>(
					this, "login-config", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-role
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllSecurityRole() {
		model.remove("security-role");
		return this;
	}

	public SecurityRoleType<WebApp30Descriptor> securityRole() {
		return new SecurityRoleTypeImpl<WebApp30Descriptor>(this,
				"security-role", model);
	}

	public List<SecurityRoleType<WebApp30Descriptor>> getSecurityRoleList() {
		List<SecurityRoleType<WebApp30Descriptor>> list = new ArrayList<SecurityRoleType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("security-role");
		for (Node node : nodeList) {
			SecurityRoleType<WebApp30Descriptor> type = new SecurityRoleTypeImpl<WebApp30Descriptor>(
					this, "security-role", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllMessageDestination() {
		model.remove("message-destination");
		return this;
	}

	public MessageDestinationType<WebApp30Descriptor> messageDestination() {
		return new MessageDestinationTypeImpl<WebApp30Descriptor>(this,
				"message-destination", model);
	}

	public List<MessageDestinationType<WebApp30Descriptor>> getMessageDestinationList() {
		List<MessageDestinationType<WebApp30Descriptor>> list = new ArrayList<MessageDestinationType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("message-destination");
		for (Node node : nodeList) {
			MessageDestinationType<WebApp30Descriptor> type = new MessageDestinationTypeImpl<WebApp30Descriptor>(
					this, "message-destination", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : locale-encoding-mapping-list
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllLocaleEncodingMappingList() {
		model.remove("locale-encoding-mapping-list");
		return this;
	}

	public LocaleEncodingMappingListType<WebApp30Descriptor> localeEncodingMappingList() {
		return new LocaleEncodingMappingListTypeImpl<WebApp30Descriptor>(this,
				"locale-encoding-mapping-list", model);
	}

	public List<LocaleEncodingMappingListType<WebApp30Descriptor>> getLocaleEncodingMappingListList() {
		List<LocaleEncodingMappingListType<WebApp30Descriptor>> list = new ArrayList<LocaleEncodingMappingListType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("locale-encoding-mapping-list");
		for (Node node : nodeList) {
			LocaleEncodingMappingListType<WebApp30Descriptor> type = new LocaleEncodingMappingListTypeImpl<WebApp30Descriptor>(
					this, "locale-encoding-mapping-list", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor setDescription(String description) {
		model.create("description").text(description);
		return this;
	}

	public WebApp30Descriptor setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public WebApp30Descriptor removeAllDescription() {
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
	public WebApp30Descriptor setDisplayName(String displayName) {
		model.create("display-name").text(displayName);
		return this;
	}

	public WebApp30Descriptor setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public WebApp30Descriptor removeAllDisplayName() {
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
	public WebApp30Descriptor removeAllIcon() {
		model.remove("icon");
		return this;
	}

	public IconType<WebApp30Descriptor> icon() {
		return new IconTypeImpl<WebApp30Descriptor>(this, "icon", model);
	}

	public List<IconType<WebApp30Descriptor>> getIconList() {
		List<IconType<WebApp30Descriptor>> list = new ArrayList<IconType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("icon");
		for (Node node : nodeList) {
			IconType<WebApp30Descriptor> type = new IconTypeImpl<WebApp30Descriptor>(
					this, "icon", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : env-entry
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllEnvEntry() {
		model.remove("env-entry");
		return this;
	}

	public EnvEntryType<WebApp30Descriptor> envEntry() {
		return new EnvEntryTypeImpl<WebApp30Descriptor>(this, "env-entry",
				model);
	}

	public List<EnvEntryType<WebApp30Descriptor>> getEnvEntryList() {
		List<EnvEntryType<WebApp30Descriptor>> list = new ArrayList<EnvEntryType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("env-entry");
		for (Node node : nodeList) {
			EnvEntryType<WebApp30Descriptor> type = new EnvEntryTypeImpl<WebApp30Descriptor>(
					this, "env-entry", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllEjbRef() {
		model.remove("ejb-ref");
		return this;
	}

	public EjbRefType<WebApp30Descriptor> ejbRef() {
		return new EjbRefTypeImpl<WebApp30Descriptor>(this, "ejb-ref", model);
	}

	public List<EjbRefType<WebApp30Descriptor>> getEjbRefList() {
		List<EjbRefType<WebApp30Descriptor>> list = new ArrayList<EjbRefType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("ejb-ref");
		for (Node node : nodeList) {
			EjbRefType<WebApp30Descriptor> type = new EjbRefTypeImpl<WebApp30Descriptor>(
					this, "ejb-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-local-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllEjbLocalRef() {
		model.remove("ejb-local-ref");
		return this;
	}

	public EjbLocalRefType<WebApp30Descriptor> ejbLocalRef() {
		return new EjbLocalRefTypeImpl<WebApp30Descriptor>(this,
				"ejb-local-ref", model);
	}

	public List<EjbLocalRefType<WebApp30Descriptor>> getEjbLocalRefList() {
		List<EjbLocalRefType<WebApp30Descriptor>> list = new ArrayList<EjbLocalRefType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("ejb-local-ref");
		for (Node node : nodeList) {
			EjbLocalRefType<WebApp30Descriptor> type = new EjbLocalRefTypeImpl<WebApp30Descriptor>(
					this, "ejb-local-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllResourceRef() {
		model.remove("resource-ref");
		return this;
	}

	public ResourceRefType<WebApp30Descriptor> resourceRef() {
		return new ResourceRefTypeImpl<WebApp30Descriptor>(this,
				"resource-ref", model);
	}

	public List<ResourceRefType<WebApp30Descriptor>> getResourceRefList() {
		List<ResourceRefType<WebApp30Descriptor>> list = new ArrayList<ResourceRefType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("resource-ref");
		for (Node node : nodeList) {
			ResourceRefType<WebApp30Descriptor> type = new ResourceRefTypeImpl<WebApp30Descriptor>(
					this, "resource-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-env-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllResourceEnvRef() {
		model.remove("resource-env-ref");
		return this;
	}

	public ResourceEnvRefType<WebApp30Descriptor> resourceEnvRef() {
		return new ResourceEnvRefTypeImpl<WebApp30Descriptor>(this,
				"resource-env-ref", model);
	}

	public List<ResourceEnvRefType<WebApp30Descriptor>> getResourceEnvRefList() {
		List<ResourceEnvRefType<WebApp30Descriptor>> list = new ArrayList<ResourceEnvRefType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("resource-env-ref");
		for (Node node : nodeList) {
			ResourceEnvRefType<WebApp30Descriptor> type = new ResourceEnvRefTypeImpl<WebApp30Descriptor>(
					this, "resource-env-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllMessageDestinationRef() {
		model.remove("message-destination-ref");
		return this;
	}

	public MessageDestinationRefType<WebApp30Descriptor> messageDestinationRef() {
		return new MessageDestinationRefTypeImpl<WebApp30Descriptor>(this,
				"message-destination-ref", model);
	}

	public List<MessageDestinationRefType<WebApp30Descriptor>> getMessageDestinationRefList() {
		List<MessageDestinationRefType<WebApp30Descriptor>> list = new ArrayList<MessageDestinationRefType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("message-destination-ref");
		for (Node node : nodeList) {
			MessageDestinationRefType<WebApp30Descriptor> type = new MessageDestinationRefTypeImpl<WebApp30Descriptor>(
					this, "message-destination-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-context-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllPersistenceContextRef() {
		model.remove("persistence-context-ref");
		return this;
	}

	public PersistenceContextRefType<WebApp30Descriptor> persistenceContextRef() {
		return new PersistenceContextRefTypeImpl<WebApp30Descriptor>(this,
				"persistence-context-ref", model);
	}

	public List<PersistenceContextRefType<WebApp30Descriptor>> getPersistenceContextRefList() {
		List<PersistenceContextRefType<WebApp30Descriptor>> list = new ArrayList<PersistenceContextRefType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("persistence-context-ref");
		for (Node node : nodeList) {
			PersistenceContextRefType<WebApp30Descriptor> type = new PersistenceContextRefTypeImpl<WebApp30Descriptor>(
					this, "persistence-context-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-unit-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllPersistenceUnitRef() {
		model.remove("persistence-unit-ref");
		return this;
	}

	public PersistenceUnitRefType<WebApp30Descriptor> persistenceUnitRef() {
		return new PersistenceUnitRefTypeImpl<WebApp30Descriptor>(this,
				"persistence-unit-ref", model);
	}

	public List<PersistenceUnitRefType<WebApp30Descriptor>> getPersistenceUnitRefList() {
		List<PersistenceUnitRefType<WebApp30Descriptor>> list = new ArrayList<PersistenceUnitRefType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("persistence-unit-ref");
		for (Node node : nodeList) {
			PersistenceUnitRefType<WebApp30Descriptor> type = new PersistenceUnitRefTypeImpl<WebApp30Descriptor>(
					this, "persistence-unit-ref", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : post-construct
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllPostConstruct() {
		model.remove("post-construct");
		return this;
	}

	public LifecycleCallbackType<WebApp30Descriptor> postConstruct() {
		return new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this,
				"post-construct", model);
	}

	public List<LifecycleCallbackType<WebApp30Descriptor>> getPostConstructList() {
		List<LifecycleCallbackType<WebApp30Descriptor>> list = new ArrayList<LifecycleCallbackType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("post-construct");
		for (Node node : nodeList) {
			LifecycleCallbackType<WebApp30Descriptor> type = new LifecycleCallbackTypeImpl<WebApp30Descriptor>(
					this, "post-construct", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pre-destroy
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllPreDestroy() {
		model.remove("pre-destroy");
		return this;
	}

	public LifecycleCallbackType<WebApp30Descriptor> preDestroy() {
		return new LifecycleCallbackTypeImpl<WebApp30Descriptor>(this,
				"pre-destroy", model);
	}

	public List<LifecycleCallbackType<WebApp30Descriptor>> getPreDestroyList() {
		List<LifecycleCallbackType<WebApp30Descriptor>> list = new ArrayList<LifecycleCallbackType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("pre-destroy");
		for (Node node : nodeList) {
			LifecycleCallbackType<WebApp30Descriptor> type = new LifecycleCallbackTypeImpl<WebApp30Descriptor>(
					this, "pre-destroy", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : data-source
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor removeAllDataSource() {
		model.remove("data-source");
		return this;
	}

	public DataSourceType<WebApp30Descriptor> dataSource() {
		return new DataSourceTypeImpl<WebApp30Descriptor>(this, "data-source",
				model);
	}

	public List<DataSourceType<WebApp30Descriptor>> getDataSourceList() {
		List<DataSourceType<WebApp30Descriptor>> list = new ArrayList<DataSourceType<WebApp30Descriptor>>();
		List<Node> nodeList = model.get("data-source");
		for (Node node : nodeList) {
			DataSourceType<WebApp30Descriptor> type = new DataSourceTypeImpl<WebApp30Descriptor>(
					this, "data-source", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public WebApp30Descriptor setVersion(WebAppVersionType version) {
		model.attribute("version", version);
		return this;
	}

	public WebApp30Descriptor setVersion(String version) {
		model.attribute("version", version);
		return this;
	}

	public WebApp30Descriptor removeVersion() {
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
	public WebApp30Descriptor setMetadataComplete(Boolean metadataComplete) {
		model.attribute("metadata-complete", metadataComplete);
		return this;
	}

	public WebApp30Descriptor removeMetadataComplete() {
		model.attributes().remove("metadata-complete");
		return this;
	}

	public Boolean isMetadataComplete() {
		return Strings.isTrue(model.attribute("metadata-complete"));
	}

}
