package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResAuthType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResSharingScopeType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The resource-ref element gives a mapping between the
 * "code name" of a resource (res-ref-name, provided by the Bean Developer) and
 * its "xml name" (resource-name, provided by the Application Assembler). If no
 * resource-ref is provided, jboss will assume that "xml-name" = "code name" See
 * resource-managers.
 * 
 */
public class ResourceRefTypeImpl<T> implements Child<T>, ResourceRefType<T> {
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

	public ResourceRefTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ResourceRefTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public ResourceRefType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public ResourceRefType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public ResourceRefType<T> removeAllDescription() {
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
	// Element type : res-ref-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> setResRefName(String resRefName) {
		childNode.getOrCreate("res-ref-name").text(resRefName);
		return this;
	}

	public ResourceRefType<T> removeResRefName() {
		childNode.remove("res-ref-name");
		return this;
	}

	public String getResRefName() {
		return childNode.textValue("res-ref-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : res-type
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> setResType(String resType) {
		childNode.getOrCreate("res-type").text(resType);
		return this;
	}

	public ResourceRefType<T> removeResType() {
		childNode.remove("res-type");
		return this;
	}

	public String getResType() {
		return childNode.textValue("res-type");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : res-auth
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> setResAuth(ResAuthType resAuth) {
		childNode.getOrCreate("res-auth").text(resAuth);
		return this;
	}

	public ResourceRefType<T> setResAuth(String resAuth) {
		childNode.getOrCreate("res-auth").text(resAuth);
		return this;
	}

	public ResAuthType getResAuth() {
		return ResAuthType.getFromStringValue(childNode.textValue("res-auth"));
	}

	public String getResAuthAsString() {
		return childNode.textValue("res-auth");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : res-sharing-scope
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> setResSharingScope(
			ResSharingScopeType resSharingScope) {
		childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
		return this;
	}

	public ResourceRefType<T> setResSharingScope(String resSharingScope) {
		childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
		return this;
	}

	public ResSharingScopeType getResSharingScope() {
		return ResSharingScopeType.getFromStringValue(childNode
				.textValue("res-sharing-scope"));
	}

	public String getResSharingScopeAsString() {
		return childNode.textValue("res-sharing-scope");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : injection-target
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> removeAllInjectionTarget() {
		childNode.remove("injection-target");
		return this;
	}

	public InjectionTargetType<ResourceRefType<T>> injectionTarget() {
		return new InjectionTargetTypeImpl<ResourceRefType<T>>(this,
				"injection-target", childNode);
	}

	public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList() {
		List<InjectionTargetType<ResourceRefType<T>>> list = new ArrayList<InjectionTargetType<ResourceRefType<T>>>();
		List<Node> nodeList = childNode.get("injection-target");
		for (Node node : nodeList) {
			InjectionTargetType<ResourceRefType<T>> type = new InjectionTargetTypeImpl<ResourceRefType<T>>(
					this, "injection-target", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ignore-dependency
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> ignoreDependency() {
		childNode.getOrCreate("ignore-dependency");
		return this;
	}

	public Boolean isIgnoreDependency() {
		return childNode.getSingle("ignore-dependency") != null;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> setResourceName(String resourceName) {
		childNode.getOrCreate("resource-name").text(resourceName);
		return this;
	}

	public ResourceRefType<T> removeResourceName() {
		childNode.remove("resource-name");
		return this;
	}

	public String getResourceName() {
		return childNode.textValue("resource-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> setJndiName(String jndiName) {
		childNode.getOrCreate("jndi-name").text(jndiName);
		return this;
	}

	public ResourceRefType<T> removeJndiName() {
		childNode.remove("jndi-name");
		return this;
	}

	public String getJndiName() {
		return childNode.textValue("jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mapped-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public ResourceRefType<T> removeMappedName() {
		childNode.remove("mapped-name");
		return this;
	}

	public String getMappedName() {
		return childNode.textValue("mapped-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : res-url
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ResourceRefType<T> setResUrl(String resUrl) {
		childNode.getOrCreate("res-url").text(resUrl);
		return this;
	}

	public ResourceRefType<T> removeResUrl() {
		childNode.remove("res-url");
		return this;
	}

	public String getResUrl() {
		return childNode.textValue("res-url");
	}

}
