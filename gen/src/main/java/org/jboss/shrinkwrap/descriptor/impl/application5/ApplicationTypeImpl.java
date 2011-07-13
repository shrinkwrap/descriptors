package org.jboss.shrinkwrap.descriptor.impl.application5;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The applicationType defines the structure of the application.
 * 
 * 
 * 
 */
public class ApplicationTypeImpl<T> implements Child<T>, ApplicationType<T> {
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

	public ApplicationTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ApplicationTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public ApplicationType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public ApplicationType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public ApplicationType<T> removeAllDescription() {
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
	public ApplicationType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public ApplicationType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public ApplicationType<T> removeAllDisplayName() {
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
	public ApplicationType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<ApplicationType<T>> icon() {
		return new IconTypeImpl<ApplicationType<T>>(this, "icon", childNode);
	}

	public List<IconType<ApplicationType<T>>> getIconList() {
		List<IconType<ApplicationType<T>>> list = new ArrayList<IconType<ApplicationType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<ApplicationType<T>> type = new IconTypeImpl<ApplicationType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : module
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ApplicationType<T> removeAllModule() {
		childNode.remove("module");
		return this;
	}

	public ModuleType<ApplicationType<T>> module() {
		return new ModuleTypeImpl<ApplicationType<T>>(this, "module", childNode);
	}

	public List<ModuleType<ApplicationType<T>>> getModuleList() {
		List<ModuleType<ApplicationType<T>>> list = new ArrayList<ModuleType<ApplicationType<T>>>();
		List<Node> nodeList = childNode.get("module");
		for (Node node : nodeList) {
			ModuleType<ApplicationType<T>> type = new ModuleTypeImpl<ApplicationType<T>>(
					this, "module", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-role
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ApplicationType<T> removeAllSecurityRole() {
		childNode.remove("security-role");
		return this;
	}

	public SecurityRoleType<ApplicationType<T>> securityRole() {
		return new SecurityRoleTypeImpl<ApplicationType<T>>(this,
				"security-role", childNode);
	}

	public List<SecurityRoleType<ApplicationType<T>>> getSecurityRoleList() {
		List<SecurityRoleType<ApplicationType<T>>> list = new ArrayList<SecurityRoleType<ApplicationType<T>>>();
		List<Node> nodeList = childNode.get("security-role");
		for (Node node : nodeList) {
			SecurityRoleType<ApplicationType<T>> type = new SecurityRoleTypeImpl<ApplicationType<T>>(
					this, "security-role", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : library-directory
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ApplicationType<T> setLibraryDirectory(String libraryDirectory) {
		childNode.getOrCreate("library-directory").text(libraryDirectory);
		return this;
	}

	public ApplicationType<T> removeLibraryDirectory() {
		childNode.remove("library-directory");
		return this;
	}

	public String getLibraryDirectory() {
		return childNode.textValue("library-directory");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public ApplicationType<T> setVersion(String version) {
		childNode.attribute("version", version);
		return this;
	}

	public ApplicationType<T> removeVersion() {
		childNode.attributes().remove("version");
		return this;
	}

	public String getVersion() {
		return childNode.attributes().get("version");
	}

}
