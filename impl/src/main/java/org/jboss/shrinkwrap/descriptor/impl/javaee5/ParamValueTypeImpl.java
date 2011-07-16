package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * This type is a general type that can be used to declare parameter/value
 * lists.
 * 
 * 
 * 
 */
public class ParamValueTypeImpl<T> implements Child<T>, ParamValueType<T> {
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

	public ParamValueTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ParamValueTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public ParamValueType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public ParamValueType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public ParamValueType<T> removeAllDescription() {
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
	// Element type : param-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ParamValueType<T> setParamName(String paramName) {
		childNode.getOrCreate("param-name").text(paramName);
		return this;
	}

	public ParamValueType<T> removeParamName() {
		childNode.remove("param-name");
		return this;
	}

	public String getParamName() {
		return childNode.textValue("param-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : param-value
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ParamValueType<T> setParamValue(String paramValue) {
		childNode.getOrCreate("param-value").text(paramValue);
		return this;
	}

	public ParamValueType<T> removeParamValue() {
		childNode.remove("param-value");
		return this;
	}

	public String getParamValue() {
		return childNode.textValue("param-value");
	}

}
