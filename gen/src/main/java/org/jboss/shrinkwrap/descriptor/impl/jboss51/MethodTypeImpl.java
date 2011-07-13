package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The method element is used to specify attributes for
 * one method or all those matching a pattern startingstring*.
 * 
 */
public class MethodTypeImpl<T> implements Child<T>, MethodType<T> {
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

	public MethodTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public MethodTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public MethodType<T> setMethodName(String methodName) {
		childNode.getOrCreate("method-name").text(methodName);
		return this;
	}

	public MethodType<T> removeMethodName() {
		childNode.remove("method-name");
		return this;
	}

	public String getMethodName() {
		return childNode.textValue("method-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : read-only
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MethodType<T> setReadOnly(Boolean readOnly) {
		childNode.getOrCreate("read-only").text(readOnly);
		return this;
	}

	public MethodType<T> removeReadOnly() {
		childNode.remove("read-only");
		return this;
	}

	public Boolean isReadOnly() {
		return Strings.isTrue(childNode.textValue("read-only"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : idempotent
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MethodType<T> setIdempotent(Boolean idempotent) {
		childNode.getOrCreate("idempotent").text(idempotent);
		return this;
	}

	public MethodType<T> removeIdempotent() {
		childNode.remove("idempotent");
		return this;
	}

	public Boolean isIdempotent() {
		return Strings.isTrue(childNode.textValue("idempotent"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : transaction-timeout
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MethodType<T> setTransactionTimeout(String transactionTimeout) {
		childNode.getOrCreate("transaction-timeout").text(transactionTimeout);
		return this;
	}

	public MethodType<T> removeTransactionTimeout() {
		childNode.remove("transaction-timeout");
		return this;
	}

	public String getTransactionTimeout() {
		return childNode.textValue("transaction-timeout");
	}

}
