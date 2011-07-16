package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ExcludeListType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The exclude-listType specifies one or more methods which the Assembler marks
 * to be uncallable.
 * 
 * If the method permission relation contains methods that are in the exclude
 * list, the Deployer should consider those methods to be uncallable.
 * 
 * 
 * 
 */
public class ExcludeListTypeImpl<T> implements Child<T>, ExcludeListType<T> {
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

	public ExcludeListTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ExcludeListTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public ExcludeListType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public ExcludeListType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public ExcludeListType<T> removeAllDescription() {
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
	// Element type : method
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ExcludeListType<T> removeAllMethod() {
		childNode.remove("method");
		return this;
	}

	public MethodType<ExcludeListType<T>> method() {
		return new MethodTypeImpl<ExcludeListType<T>>(this, "method", childNode);
	}

	public List<MethodType<ExcludeListType<T>>> getMethodList() {
		List<MethodType<ExcludeListType<T>>> list = new ArrayList<MethodType<ExcludeListType<T>>>();
		List<Node> nodeList = childNode.get("method");
		for (Node node : nodeList) {
			MethodType<ExcludeListType<T>> type = new MethodTypeImpl<ExcludeListType<T>>(
					this, "method", childNode, node);
			list.add(type);
		}
		return list;
	}

}
