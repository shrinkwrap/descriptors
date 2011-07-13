package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JbossType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagersType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LoaderRepositoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The jboss element is the root element of the
 * jboss.xml file. It contains all the information used by jboss but not
 * described in the ejb-jar.xml file. All of it is optional. 1- the application
 * assembler can define custom container configurations for the beans. Standard
 * configurations are provided in standardjboss.xml 2- the deployer can override
 * the jndi names under which the beans are deployed 3- the deployer can specify
 * runtime jndi names for resource managers.
 * 
 */
public class JbossTypeImpl<T> implements Child<T>, JbossType<T> {
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

	public JbossTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public JbossTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public JbossType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public JbossType<T> removeAllDescription() {
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
	public JbossType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public JbossType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public JbossType<T> removeAllDisplayName() {
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
	public JbossType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<JbossType<T>> icon() {
		return new IconTypeImpl<JbossType<T>>(this, "icon", childNode);
	}

	public List<IconType<JbossType<T>>> getIconList() {
		List<IconType<JbossType<T>>> list = new ArrayList<IconType<JbossType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<JbossType<T>> type = new IconTypeImpl<JbossType<T>>(this,
					"icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : loader-repository
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> removeLoaderRepository() {
		childNode.remove("loader-repository");
		return this;
	}

	public LoaderRepositoryType<JbossType<T>> loaderRepository() {
		Node node = childNode.getOrCreate("loader-repository");
		LoaderRepositoryType<JbossType<T>> loaderRepository = new LoaderRepositoryTypeImpl<JbossType<T>>(
				this, "loader-repository", childNode, node);
		return loaderRepository;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jmx-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setJmxName(String jmxName) {
		childNode.getOrCreate("jmx-name").text(jmxName);
		return this;
	}

	public JbossType<T> removeJmxName() {
		childNode.remove("jmx-name");
		return this;
	}

	public String getJmxName() {
		return childNode.textValue("jmx-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-domain
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setSecurityDomain(String securityDomain) {
		childNode.getOrCreate("security-domain").text(securityDomain);
		return this;
	}

	public JbossType<T> removeSecurityDomain() {
		childNode.remove("security-domain");
		return this;
	}

	public String getSecurityDomain() {
		return childNode.textValue("security-domain");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : missing-method-permissions-excluded-mode
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setMissingMethodPermissionsExcludedMode(
			Boolean missingMethodPermissionsExcludedMode) {
		childNode.getOrCreate("missing-method-permissions-excluded-mode").text(
				missingMethodPermissionsExcludedMode);
		return this;
	}

	public JbossType<T> removeMissingMethodPermissionsExcludedMode() {
		childNode.remove("missing-method-permissions-excluded-mode");
		return this;
	}

	public Boolean isMissingMethodPermissionsExcludedMode() {
		return Strings.isTrue(childNode
				.textValue("missing-method-permissions-excluded-mode"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : unauthenticated-principal
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setUnauthenticatedPrincipal(
			String unauthenticatedPrincipal) {
		childNode.getOrCreate("unauthenticated-principal").text(
				unauthenticatedPrincipal);
		return this;
	}

	public JbossType<T> removeUnauthenticatedPrincipal() {
		childNode.remove("unauthenticated-principal");
		return this;
	}

	public String getUnauthenticatedPrincipal() {
		return childNode.textValue("unauthenticated-principal");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-binding-policy
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setJndiBindingPolicy(String jndiBindingPolicy) {
		childNode.getOrCreate("jndi-binding-policy").text(jndiBindingPolicy);
		return this;
	}

	public JbossType<T> removeJndiBindingPolicy() {
		childNode.remove("jndi-binding-policy");
		return this;
	}

	public String getJndiBindingPolicy() {
		return childNode.textValue("jndi-binding-policy");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jacc-context-id
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setJaccContextId(String jaccContextId) {
		childNode.getOrCreate("jacc-context-id").text(jaccContextId);
		return this;
	}

	public JbossType<T> removeJaccContextId() {
		childNode.remove("jacc-context-id");
		return this;
	}

	public String getJaccContextId() {
		return childNode.textValue("jacc-context-id");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : webservices
	// isComplexType: true maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> removeWebservices() {
		childNode.remove("webservices");
		return this;
	}

	public WebservicesType<JbossType<T>> webservices() {
		Node node = childNode.getOrCreate("webservices");
		WebservicesType<JbossType<T>> webservices = new WebservicesTypeImpl<JbossType<T>>(
				this, "webservices", childNode, node);
		return webservices;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : enterprise-beans
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> removeEnterpriseBeans() {
		childNode.remove("enterprise-beans");
		return this;
	}

	public EnterpriseBeansType<JbossType<T>> enterpriseBeans() {
		Node node = childNode.getOrCreate("enterprise-beans");
		EnterpriseBeansType<JbossType<T>> enterpriseBeans = new EnterpriseBeansTypeImpl<JbossType<T>>(
				this, "enterprise-beans", childNode, node);
		return enterpriseBeans;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : assembly-descriptor
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> removeAssemblyDescriptor() {
		childNode.remove("assembly-descriptor");
		return this;
	}

	public AssemblyDescriptorType<JbossType<T>> assemblyDescriptor() {
		Node node = childNode.getOrCreate("assembly-descriptor");
		AssemblyDescriptorType<JbossType<T>> assemblyDescriptor = new AssemblyDescriptorTypeImpl<JbossType<T>>(
				this, "assembly-descriptor", childNode, node);
		return assemblyDescriptor;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-managers
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public JbossType<T> removeResourceManagers() {
		childNode.remove("resource-managers");
		return this;
	}

	public ResourceManagersType<JbossType<T>> resourceManagers() {
		Node node = childNode.getOrCreate("resource-managers");
		ResourceManagersType<JbossType<T>> resourceManagers = new ResourceManagersTypeImpl<JbossType<T>>(
				this, "resource-managers", childNode, node);
		return resourceManagers;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setVersion(String version) {
		childNode.attribute("version", version);
		return this;
	}

	public JbossType<T> removeVersion() {
		childNode.attributes().remove("version");
		return this;
	}

	public String getVersion() {
		return childNode.attributes().get("version");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : metadata-complete
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public JbossType<T> setMetadataComplete(Boolean metadataComplete) {
		childNode.attribute("metadata-complete", metadataComplete);
		return this;
	}

	public JbossType<T> removeMetadataComplete() {
		childNode.attributes().remove("metadata-complete");
		return this;
	}

	public Boolean isMetadataComplete() {
		return Strings.isTrue(childNode.attribute("metadata-complete"));
	}

}
