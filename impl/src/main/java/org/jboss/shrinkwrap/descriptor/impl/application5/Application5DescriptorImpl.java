package org.jboss.shrinkwrap.descriptor.impl.application5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.application5.Application5Descriptor;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public class Application5DescriptorImpl extends NodeProviderImplBase implements
		DescriptorNamespace<Application5Descriptor>, Application5Descriptor {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private Node model;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public Application5DescriptorImpl(String descriptorName) {
		this(descriptorName, new Node("application"));
	}

	public Application5DescriptorImpl(String descriptorName, Node node) {
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
		return new XmlDomExporter();
	}

	// -------------------------------------------------------------------------------------||
	// Namespace
	// ---------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public Application5Descriptor addDefaultNamespaces() {
		addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
		addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		addNamespace(
				"xsi:schemaLocation",
				"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_5.xsd");
		return this;
	}

	public Application5Descriptor addNamespace(String name, String value) {
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

	public Application5Descriptor removeAllNamespaces() {
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
	// Element type : module
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Application5Descriptor removeAllModule() {
		model.remove("module");
		return this;
	}

	public ModuleType<Application5Descriptor> module() {
		return new ModuleTypeImpl<Application5Descriptor>(this, "module", model);
	}

	public List<ModuleType<Application5Descriptor>> getModuleList() {
		List<ModuleType<Application5Descriptor>> list = new ArrayList<ModuleType<Application5Descriptor>>();
		List<Node> nodeList = model.get("module");
		for (Node node : nodeList) {
			ModuleType<Application5Descriptor> type = new ModuleTypeImpl<Application5Descriptor>(
					this, "module", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-role
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Application5Descriptor removeAllSecurityRole() {
		model.remove("security-role");
		return this;
	}

	public SecurityRoleType<Application5Descriptor> securityRole() {
		return new SecurityRoleTypeImpl<Application5Descriptor>(this,
				"security-role", model);
	}

	public List<SecurityRoleType<Application5Descriptor>> getSecurityRoleList() {
		List<SecurityRoleType<Application5Descriptor>> list = new ArrayList<SecurityRoleType<Application5Descriptor>>();
		List<Node> nodeList = model.get("security-role");
		for (Node node : nodeList) {
			SecurityRoleType<Application5Descriptor> type = new SecurityRoleTypeImpl<Application5Descriptor>(
					this, "security-role", model, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : library-directory
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Application5Descriptor setLibraryDirectory(String libraryDirectory) {
		model.getOrCreate("library-directory").text(libraryDirectory);
		return this;
	}

	public Application5Descriptor removeLibraryDirectory() {
		model.remove("library-directory");
		return this;
	}

	public String getLibraryDirectory() {
		return model.textValue("library-directory");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public Application5Descriptor setVersion(String version) {
		model.attribute("version", version);
		return this;
	}

	public Application5Descriptor removeVersion() {
		model.attributes().remove("version");
		return this;
	}

	public String getVersion() {
		return model.attributes().get("version");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Application5Descriptor setDescription(String description) {
		model.create("description").text(description);
		return this;
	}

	public Application5Descriptor setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public Application5Descriptor removeAllDescription() {
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
	public Application5Descriptor setDisplayName(String displayName) {
		model.create("display-name").text(displayName);
		return this;
	}

	public Application5Descriptor setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public Application5Descriptor removeAllDisplayName() {
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
	public Application5Descriptor removeAllIcon() {
		model.remove("icon");
		return this;
	}

	public IconType<Application5Descriptor> icon() {
		return new IconTypeImpl<Application5Descriptor>(this, "icon", model);
	}

	public List<IconType<Application5Descriptor>> getIconList() {
		List<IconType<Application5Descriptor>> list = new ArrayList<IconType<Application5Descriptor>>();
		List<Node> nodeList = model.get("icon");
		for (Node node : nodeList) {
			IconType<Application5Descriptor> type = new IconTypeImpl<Application5Descriptor>(
					this, "icon", model, node);
			list.add(type);
		}
		return list;
	}

}
