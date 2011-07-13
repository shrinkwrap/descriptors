package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.Jboss51Descriptor;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagersType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LoaderRepositoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public class Jboss51DescriptorImpl extends NodeProviderImplBase implements
		DescriptorNamespace<Jboss51Descriptor>, Jboss51Descriptor {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private Node model;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public Jboss51DescriptorImpl(String descriptorName) {
		this(descriptorName, new Node("jboss"));
	}

	public Jboss51DescriptorImpl(String descriptorName, Node node) {
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

	public Jboss51Descriptor addDefaultNamespaces() {
		addNamespace("xmlns", "http://www.jboss.com/xml/ns/javaee");
		addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		addNamespace(
				"xsi:schemaLocation",
				"http://www.jboss.com/xml/ns/javaee http://www.jboss.org/j2ee/schema/jboss_5_1.xsd");
		return this;
	}

	public Jboss51Descriptor addNamespace(String name, String value) {
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

	public Jboss51Descriptor removeAllNamespaces() {
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
	// Element type : loader-repository
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor removeLoaderRepository() {
		model.remove("loader-repository");
		return this;
	}

	public LoaderRepositoryType<Jboss51Descriptor> loaderRepository() {
		Node node = model.getOrCreate("loader-repository");
		LoaderRepositoryType<Jboss51Descriptor> loaderRepository = new LoaderRepositoryTypeImpl<Jboss51Descriptor>(
				this, "loader-repository", model, node);
		return loaderRepository;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jmx-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setJmxName(String jmxName) {
		model.getOrCreate("jmx-name").text(jmxName);
		return this;
	}

	public Jboss51Descriptor removeJmxName() {
		model.remove("jmx-name");
		return this;
	}

	public String getJmxName() {
		return model.textValue("jmx-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-domain
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setSecurityDomain(String securityDomain) {
		model.getOrCreate("security-domain").text(securityDomain);
		return this;
	}

	public Jboss51Descriptor removeSecurityDomain() {
		model.remove("security-domain");
		return this;
	}

	public String getSecurityDomain() {
		return model.textValue("security-domain");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : missing-method-permissions-excluded-mode
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setMissingMethodPermissionsExcludedMode(
			Boolean missingMethodPermissionsExcludedMode) {
		model.getOrCreate("missing-method-permissions-excluded-mode").text(
				missingMethodPermissionsExcludedMode);
		return this;
	}

	public Jboss51Descriptor removeMissingMethodPermissionsExcludedMode() {
		model.remove("missing-method-permissions-excluded-mode");
		return this;
	}

	public Boolean isMissingMethodPermissionsExcludedMode() {
		return Strings.isTrue(model
				.textValue("missing-method-permissions-excluded-mode"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : unauthenticated-principal
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setUnauthenticatedPrincipal(
			String unauthenticatedPrincipal) {
		model.getOrCreate("unauthenticated-principal").text(
				unauthenticatedPrincipal);
		return this;
	}

	public Jboss51Descriptor removeUnauthenticatedPrincipal() {
		model.remove("unauthenticated-principal");
		return this;
	}

	public String getUnauthenticatedPrincipal() {
		return model.textValue("unauthenticated-principal");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-binding-policy
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setJndiBindingPolicy(String jndiBindingPolicy) {
		model.getOrCreate("jndi-binding-policy").text(jndiBindingPolicy);
		return this;
	}

	public Jboss51Descriptor removeJndiBindingPolicy() {
		model.remove("jndi-binding-policy");
		return this;
	}

	public String getJndiBindingPolicy() {
		return model.textValue("jndi-binding-policy");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jacc-context-id
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setJaccContextId(String jaccContextId) {
		model.getOrCreate("jacc-context-id").text(jaccContextId);
		return this;
	}

	public Jboss51Descriptor removeJaccContextId() {
		model.remove("jacc-context-id");
		return this;
	}

	public String getJaccContextId() {
		return model.textValue("jacc-context-id");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : webservices
	// isComplexType: true maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor removeWebservices() {
		model.remove("webservices");
		return this;
	}

	public WebservicesType<Jboss51Descriptor> webservices() {
		Node node = model.getOrCreate("webservices");
		WebservicesType<Jboss51Descriptor> webservices = new WebservicesTypeImpl<Jboss51Descriptor>(
				this, "webservices", model, node);
		return webservices;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : enterprise-beans
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor removeEnterpriseBeans() {
		model.remove("enterprise-beans");
		return this;
	}

	public EnterpriseBeansType<Jboss51Descriptor> enterpriseBeans() {
		Node node = model.getOrCreate("enterprise-beans");
		EnterpriseBeansType<Jboss51Descriptor> enterpriseBeans = new EnterpriseBeansTypeImpl<Jboss51Descriptor>(
				this, "enterprise-beans", model, node);
		return enterpriseBeans;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : assembly-descriptor
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor removeAssemblyDescriptor() {
		model.remove("assembly-descriptor");
		return this;
	}

	public AssemblyDescriptorType<Jboss51Descriptor> assemblyDescriptor() {
		Node node = model.getOrCreate("assembly-descriptor");
		AssemblyDescriptorType<Jboss51Descriptor> assemblyDescriptor = new AssemblyDescriptorTypeImpl<Jboss51Descriptor>(
				this, "assembly-descriptor", model, node);
		return assemblyDescriptor;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-managers
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor removeResourceManagers() {
		model.remove("resource-managers");
		return this;
	}

	public ResourceManagersType<Jboss51Descriptor> resourceManagers() {
		Node node = model.getOrCreate("resource-managers");
		ResourceManagersType<Jboss51Descriptor> resourceManagers = new ResourceManagersTypeImpl<Jboss51Descriptor>(
				this, "resource-managers", model, node);
		return resourceManagers;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setVersion(String version) {
		model.attribute("version", version);
		return this;
	}

	public Jboss51Descriptor removeVersion() {
		model.attributes().remove("version");
		return this;
	}

	public String getVersion() {
		return model.attributes().get("version");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : metadata-complete
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setMetadataComplete(Boolean metadataComplete) {
		model.attribute("metadata-complete", metadataComplete);
		return this;
	}

	public Jboss51Descriptor removeMetadataComplete() {
		model.attributes().remove("metadata-complete");
		return this;
	}

	public Boolean isMetadataComplete() {
		return Strings.isTrue(model.attribute("metadata-complete"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Jboss51Descriptor setDescription(String description) {
		model.create("description").text(description);
		return this;
	}

	public Jboss51Descriptor setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public Jboss51Descriptor removeAllDescription() {
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
	public Jboss51Descriptor setDisplayName(String displayName) {
		model.create("display-name").text(displayName);
		return this;
	}

	public Jboss51Descriptor setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public Jboss51Descriptor removeAllDisplayName() {
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
	public Jboss51Descriptor removeAllIcon() {
		model.remove("icon");
		return this;
	}

	public IconType<Jboss51Descriptor> icon() {
		return new IconTypeImpl<Jboss51Descriptor>(this, "icon", model);
	}

	public List<IconType<Jboss51Descriptor>> getIconList() {
		List<IconType<Jboss51Descriptor>> list = new ArrayList<IconType<Jboss51Descriptor>>();
		List<Node> nodeList = model.get("icon");
		for (Node node : nodeList) {
			IconType<Jboss51Descriptor> type = new IconTypeImpl<Jboss51Descriptor>(
					this, "icon", model, node);
			list.add(type);
		}
		return list;
	}

}
