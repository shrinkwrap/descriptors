package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Used to set property values for annotations
 * 
 * 
 * 
 */
public class AnnotationPropertyTypeImpl<T> implements Child<T>,
		AnnotationPropertyType<T> {
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

	public AnnotationPropertyTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public AnnotationPropertyTypeImpl(T t, String nodeName, Node node,
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
	public AnnotationPropertyType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public AnnotationPropertyType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public AnnotationPropertyType<T> removeAllDescription() {
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
	// Element type : property-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AnnotationPropertyType<T> setPropertyName(String propertyName) {
		childNode.getOrCreate("property-name").text(propertyName);
		return this;
	}

	public AnnotationPropertyType<T> removePropertyName() {
		childNode.remove("property-name");
		return this;
	}

	public String getPropertyName() {
		return childNode.textValue("property-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : property-value
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AnnotationPropertyType<T> setPropertyValue(String propertyValue) {
		childNode.getOrCreate("property-value").text(propertyValue);
		return this;
	}

	public AnnotationPropertyType<T> removePropertyValue() {
		childNode.remove("property-value");
		return this;
	}

	public String getPropertyValue() {
		return childNode.textValue("property-value");
	}

}
