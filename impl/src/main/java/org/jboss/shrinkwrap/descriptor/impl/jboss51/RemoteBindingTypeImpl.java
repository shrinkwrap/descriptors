package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.RemoteBindingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: Element for specifying the remote jndi binding for a
 * bean as well as the client interceptor stack
 * 
 * 
 */
public class RemoteBindingTypeImpl<T> implements Child<T>, RemoteBindingType<T> {
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

	public RemoteBindingTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public RemoteBindingTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public RemoteBindingType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public RemoteBindingType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public RemoteBindingType<T> removeAllDescription() {
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
	// Element type : jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public RemoteBindingType<T> setJndiName(String jndiName) {
		childNode.getOrCreate("jndi-name").text(jndiName);
		return this;
	}

	public RemoteBindingType<T> removeJndiName() {
		childNode.remove("jndi-name");
		return this;
	}

	public String getJndiName() {
		return childNode.textValue("jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : client-bind-url
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public RemoteBindingType<T> setClientBindUrl(String clientBindUrl) {
		childNode.getOrCreate("client-bind-url").text(clientBindUrl);
		return this;
	}

	public RemoteBindingType<T> removeClientBindUrl() {
		childNode.remove("client-bind-url");
		return this;
	}

	public String getClientBindUrl() {
		return childNode.textValue("client-bind-url");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : interceptor-stack
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public RemoteBindingType<T> setInterceptorStack(String interceptorStack) {
		childNode.getOrCreate("interceptor-stack").text(interceptorStack);
		return this;
	}

	public RemoteBindingType<T> removeInterceptorStack() {
		childNode.remove("interceptor-stack");
		return this;
	}

	public String getInterceptorStack() {
		return childNode.textValue("interceptor-stack");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : invoker-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public RemoteBindingType<T> setInvokerName(String invokerName) {
		childNode.getOrCreate("invoker-name").text(invokerName);
		return this;
	}

	public RemoteBindingType<T> removeInvokerName() {
		childNode.remove("invoker-name");
		return this;
	}

	public String getInvokerName() {
		return childNode.textValue("invoker-name");
	}

}
