package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public class PersistenceUnitRefTypeImpl<T> implements Child<T>,
		PersistenceUnitRefType<T> {
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

	public PersistenceUnitRefTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public PersistenceUnitRefTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PersistenceUnitRefType<T> setJndiName(String jndiName) {
		childNode.getOrCreate("jndi-name").text(jndiName);
		return this;
	}

	public PersistenceUnitRefType<T> removeJndiName() {
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
	public PersistenceUnitRefType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public PersistenceUnitRefType<T> removeMappedName() {
		childNode.remove("mapped-name");
		return this;
	}

	public String getMappedName() {
		return childNode.textValue("mapped-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : injection-target
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PersistenceUnitRefType<T> removeAllInjectionTarget() {
		childNode.remove("injection-target");
		return this;
	}

	public InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget() {
		return new InjectionTargetTypeImpl<PersistenceUnitRefType<T>>(this,
				"injection-target", childNode);
	}

	public List<InjectionTargetType<PersistenceUnitRefType<T>>> getInjectionTargetList() {
		List<InjectionTargetType<PersistenceUnitRefType<T>>> list = new ArrayList<InjectionTargetType<PersistenceUnitRefType<T>>>();
		List<Node> nodeList = childNode.get("injection-target");
		for (Node node : nodeList) {
			InjectionTargetType<PersistenceUnitRefType<T>> type = new InjectionTargetTypeImpl<PersistenceUnitRefType<T>>(
					this, "injection-target", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ignore-dependency
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PersistenceUnitRefType<T> ignoreDependency() {
		childNode.getOrCreate("ignore-dependency");
		return this;
	}

	public Boolean isIgnoreDependency() {
		return childNode.getSingle("ignore-dependency") != null;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PersistenceUnitRefType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public PersistenceUnitRefType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public PersistenceUnitRefType<T> removeAllDescription() {
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
	// Element type : persistence-unit-ref-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PersistenceUnitRefType<T> setPersistenceUnitRefName(
			String persistenceUnitRefName) {
		childNode.getOrCreate("persistence-unit-ref-name").text(
				persistenceUnitRefName);
		return this;
	}

	public PersistenceUnitRefType<T> removePersistenceUnitRefName() {
		childNode.remove("persistence-unit-ref-name");
		return this;
	}

	public String getPersistenceUnitRefName() {
		return childNode.textValue("persistence-unit-ref-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-unit-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PersistenceUnitRefType<T> setPersistenceUnitName(
			String persistenceUnitName) {
		childNode.getOrCreate("persistence-unit-name")
				.text(persistenceUnitName);
		return this;
	}

	public PersistenceUnitRefType<T> removePersistenceUnitName() {
		childNode.remove("persistence-unit-name");
		return this;
	}

	public String getPersistenceUnitName() {
		return childNode.textValue("persistence-unit-name");
	}

}
