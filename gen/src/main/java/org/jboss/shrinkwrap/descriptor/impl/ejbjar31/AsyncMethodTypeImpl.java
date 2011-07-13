package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AsyncMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The async-methodType element specifies that a session bean method has
 * asynchronous invocation semantics.
 * 
 * 
 * 
 */
public class AsyncMethodTypeImpl<T> implements Child<T>, AsyncMethodType<T> {
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

	public AsyncMethodTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public AsyncMethodTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : method-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AsyncMethodType<T> setMethodName(String methodName) {
		childNode.getOrCreate("method-name").text(methodName);
		return this;
	}

	public AsyncMethodType<T> removeMethodName() {
		childNode.remove("method-name");
		return this;
	}

	public String getMethodName() {
		return childNode.textValue("method-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : method-params
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AsyncMethodType<T> removeMethodParams() {
		childNode.remove("method-params");
		return this;
	}

	public MethodParamsType<AsyncMethodType<T>> methodParams() {
		Node node = childNode.getOrCreate("method-params");
		MethodParamsType<AsyncMethodType<T>> methodParams = new MethodParamsTypeImpl<AsyncMethodType<T>>(
				this, "method-params", childNode, node);
		return methodParams;
	}

}
