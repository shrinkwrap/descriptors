package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: Element for specifying the class used to provide the
 * caching mechanism for a bean, and the cache parameters
 * 
 * 
 */
public class PoolConfigTypeImpl<T> implements Child<T>, PoolConfigType<T> {
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

	public PoolConfigTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public PoolConfigTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pool-value
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PoolConfigType<T> setPoolValue(String poolValue) {
		childNode.getOrCreate("pool-value").text(poolValue);
		return this;
	}

	public PoolConfigType<T> removePoolValue() {
		childNode.remove("pool-value");
		return this;
	}

	public String getPoolValue() {
		return childNode.textValue("pool-value");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pool-max-size
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PoolConfigType<T> setPoolMaxSize(Integer poolMaxSize) {
		childNode.getOrCreate("pool-max-size").text(poolMaxSize);
		return this;
	}

	public PoolConfigType<T> removePoolMaxSize() {
		childNode.remove("pool-max-size");
		return this;
	}

	public Integer getPoolMaxSize() {
		return Integer.valueOf(childNode.textValue("pool-max-size"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pool-timeout
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PoolConfigType<T> setPoolTimeout(Integer poolTimeout) {
		childNode.getOrCreate("pool-timeout").text(poolTimeout);
		return this;
	}

	public PoolConfigType<T> removePoolTimeout() {
		childNode.remove("pool-timeout");
		return this;
	}

	public Integer getPoolTimeout() {
		return Integer.valueOf(childNode.textValue("pool-timeout"));
	}

}
