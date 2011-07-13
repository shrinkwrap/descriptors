package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ProducerType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The producer element holds all of the information
 * specific about a producer interface for a consumer bean Used in: consumer
 * 
 */
public class ProducerTypeImpl<T> implements Child<T>, ProducerType<T> {
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

	public ProducerTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ProducerTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public ProducerType<T> setClazz(String clazz) {
		childNode.getOrCreate("class").text(clazz);
		return this;
	}

	public ProducerType<T> removeClazz() {
		childNode.remove("class");
		return this;
	}

	public String getClazz() {
		return childNode.textValue("class");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : connection-factory
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ProducerType<T> setConnectionFactory(String connectionFactory) {
		childNode.getOrCreate("connection-factory").text(connectionFactory);
		return this;
	}

	public ProducerType<T> removeConnectionFactory() {
		childNode.remove("connection-factory");
		return this;
	}

	public String getConnectionFactory() {
		return childNode.textValue("connection-factory");
	}

}
