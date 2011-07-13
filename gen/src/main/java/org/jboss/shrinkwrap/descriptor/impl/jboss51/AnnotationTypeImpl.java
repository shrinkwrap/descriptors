package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationPropertyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.InjectionTargetTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The annotationType is used to add annotations to a bean class, method, or
 * field.
 * 
 * 
 * 
 */
public class AnnotationTypeImpl<T> implements Child<T>, AnnotationType<T> {
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

	public AnnotationTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public AnnotationTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public AnnotationType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public AnnotationType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public AnnotationType<T> removeAllDescription() {
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
	// Element type : annotation-class
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AnnotationType<T> setAnnotationClass(String annotationClass) {
		childNode.getOrCreate("annotation-class").text(annotationClass);
		return this;
	}

	public AnnotationType<T> removeAnnotationClass() {
		childNode.remove("annotation-class");
		return this;
	}

	public String getAnnotationClass() {
		return childNode.textValue("annotation-class");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : annotation-implementation-class
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AnnotationType<T> setAnnotationImplementationClass(
			String annotationImplementationClass) {
		childNode.getOrCreate("annotation-implementation-class").text(
				annotationImplementationClass);
		return this;
	}

	public AnnotationType<T> removeAnnotationImplementationClass() {
		childNode.remove("annotation-implementation-class");
		return this;
	}

	public String getAnnotationImplementationClass() {
		return childNode.textValue("annotation-implementation-class");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : injection-target
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AnnotationType<T> removeInjectionTarget() {
		childNode.remove("injection-target");
		return this;
	}

	public InjectionTargetType<AnnotationType<T>> injectionTarget() {
		Node node = childNode.getOrCreate("injection-target");
		InjectionTargetType<AnnotationType<T>> injectionTarget = new InjectionTargetTypeImpl<AnnotationType<T>>(
				this, "injection-target", childNode, node);
		return injectionTarget;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : property
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AnnotationType<T> removeAllProperty() {
		childNode.remove("property");
		return this;
	}

	public AnnotationPropertyType<AnnotationType<T>> property() {
		return new AnnotationPropertyTypeImpl<AnnotationType<T>>(this,
				"property", childNode);
	}

	public List<AnnotationPropertyType<AnnotationType<T>>> getPropertyList() {
		List<AnnotationPropertyType<AnnotationType<T>>> list = new ArrayList<AnnotationPropertyType<AnnotationType<T>>>();
		List<Node> nodeList = childNode.get("property");
		for (Node node : nodeList) {
			AnnotationPropertyType<AnnotationType<T>> type = new AnnotationPropertyTypeImpl<AnnotationType<T>>(
					this, "property", childNode, node);
			list.add(type);
		}
		return list;
	}

}
