package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.StubPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public class StubPropertyTypeImpl<T> implements Child<T>, StubPropertyType<T> {
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

	public StubPropertyTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public StubPropertyTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : prop-name
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public StubPropertyType<T> setPropName(String propName) {
		childNode.getOrCreate("prop-name").text(propName);
		return this;
	}

	public StubPropertyType<T> removePropName() {
		childNode.remove("prop-name");
		return this;
	}

	public String getPropName() {
		return childNode.textValue("prop-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : prop-value
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public StubPropertyType<T> setPropValue(String propValue) {
		childNode.getOrCreate("prop-value").text(propValue);
		return this;
	}

	public StubPropertyType<T> removePropValue() {
		childNode.remove("prop-value");
		return this;
	}

	public String getPropValue() {
		return childNode.textValue("prop-value");
	}

}
