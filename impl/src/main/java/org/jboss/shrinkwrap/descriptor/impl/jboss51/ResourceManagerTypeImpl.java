package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagerType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The resource-manager element is used to provide a
 * mapping between the "xml name" of a resource (res-name) and its "runtime jndi
 * name" (res-jndi-name or res-url according to the type of the resource). If it
 * is not provided, and if the type of the resource is javax.sql.DataSource,
 * jboss will look for a javax.sql.DataSource in the jndi tree. See
 * resource-managers. Used in: resource-managers
 * 
 */
public class ResourceManagerTypeImpl<T> implements Child<T>,
		ResourceManagerType<T> {
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

	public ResourceManagerTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ResourceManagerTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
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
	public ResourceManagerType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public ResourceManagerType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public ResourceManagerType<T> removeAllDescription() {
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
	// Element type : res-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceManagerType<T> setResName(String resName) {
		childNode.getOrCreate("res-name").text(resName);
		return this;
	}

	public ResourceManagerType<T> removeResName() {
		childNode.remove("res-name");
		return this;
	}

	public String getResName() {
		return childNode.textValue("res-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : res-jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceManagerType<T> setResJndiName(String resJndiName) {
		childNode.getOrCreate("res-jndi-name").text(resJndiName);
		return this;
	}

	public ResourceManagerType<T> removeResJndiName() {
		childNode.remove("res-jndi-name");
		return this;
	}

	public String getResJndiName() {
		return childNode.textValue("res-jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : res-url
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceManagerType<T> setResUrl(String resUrl) {
		childNode.getOrCreate("res-url").text(resUrl);
		return this;
	}

	public ResourceManagerType<T> removeResUrl() {
		childNode.remove("res-url");
		return this;
	}

	public String getResUrl() {
		return childNode.textValue("res-url");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : res-class
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public ResourceManagerType<T> setResClass(String resClass) {
		childNode.attribute("res-class", resClass);
		return this;
	}

	public ResourceManagerType<T> removeResClass() {
		childNode.attributes().remove("res-class");
		return this;
	}

	public String getResClass() {
		return childNode.attributes().get("res-class");
	}

}
