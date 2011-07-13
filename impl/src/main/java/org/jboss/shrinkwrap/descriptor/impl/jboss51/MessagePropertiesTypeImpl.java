package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessagePropertiesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: Element for defining JMS message properties (e.g.
 * persistence, priority) for a consumer bean Used in: consumer
 * 
 */
public class MessagePropertiesTypeImpl<T> implements Child<T>,
		MessagePropertiesType<T> {
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

	public MessagePropertiesTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public MessagePropertiesTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : class
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessagePropertiesType<T> setClazz(String clazz) {
		childNode.getOrCreate("class").text(clazz);
		return this;
	}

	public MessagePropertiesType<T> removeClazz() {
		childNode.remove("class");
		return this;
	}

	public String getClazz() {
		return childNode.textValue("class");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : method
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessagePropertiesType<T> removeMethod() {
		childNode.remove("method");
		return this;
	}

	public MethodType<MessagePropertiesType<T>> method() {
		Node node = childNode.getOrCreate("method");
		MethodType<MessagePropertiesType<T>> method = new MethodTypeImpl<MessagePropertiesType<T>>(
				this, "method", childNode, node);
		return method;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : delivery
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessagePropertiesType<T> setDelivery(String delivery) {
		childNode.getOrCreate("delivery").text(delivery);
		return this;
	}

	public MessagePropertiesType<T> removeDelivery() {
		childNode.remove("delivery");
		return this;
	}

	public String getDelivery() {
		return childNode.textValue("delivery");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : priority
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessagePropertiesType<T> setPriority(Integer priority) {
		childNode.getOrCreate("priority").text(priority);
		return this;
	}

	public MessagePropertiesType<T> removePriority() {
		childNode.remove("priority");
		return this;
	}

	public Integer getPriority() {
		return Integer.valueOf(childNode.textValue("priority"));
	}

}
