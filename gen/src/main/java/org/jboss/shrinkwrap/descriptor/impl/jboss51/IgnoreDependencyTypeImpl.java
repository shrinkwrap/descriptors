package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.InjectionTargetTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The ignore-dependency element removes an injection
 * dependency
 * 
 */
public class IgnoreDependencyTypeImpl<T> implements Child<T>,
		IgnoreDependencyType<T> {
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

	public IgnoreDependencyTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public IgnoreDependencyTypeImpl(T t, String nodeName, Node node,
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
	public IgnoreDependencyType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public IgnoreDependencyType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public IgnoreDependencyType<T> removeAllDescription() {
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
	// Element type : injection-target
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public IgnoreDependencyType<T> removeAllInjectionTarget() {
		childNode.remove("injection-target");
		return this;
	}

	public InjectionTargetType<IgnoreDependencyType<T>> injectionTarget() {
		return new InjectionTargetTypeImpl<IgnoreDependencyType<T>>(this,
				"injection-target", childNode);
	}

	public List<InjectionTargetType<IgnoreDependencyType<T>>> getInjectionTargetList() {
		List<InjectionTargetType<IgnoreDependencyType<T>>> list = new ArrayList<InjectionTargetType<IgnoreDependencyType<T>>>();
		List<Node> nodeList = childNode.get("injection-target");
		for (Node node : nodeList) {
			InjectionTargetType<IgnoreDependencyType<T>> type = new InjectionTargetTypeImpl<IgnoreDependencyType<T>>(
					this, "injection-target", childNode, node);
			list.add(type);
		}
		return list;
	}

}
