package org.jboss.shrinkwrap.descriptor.impl.application5;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application5.WebType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The webType defines the web-uri and context-root of a web application module.
 * 
 * 
 * 
 */
public class WebTypeImpl<T> implements Child<T>, WebType<T> {
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

	public WebTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public WebTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : web-uri
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebType<T> setWebUri(String webUri) {
		childNode.getOrCreate("web-uri").text(webUri);
		return this;
	}

	public WebType<T> removeWebUri() {
		childNode.remove("web-uri");
		return this;
	}

	public String getWebUri() {
		return childNode.textValue("web-uri");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : context-root
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebType<T> setContextRoot(String contextRoot) {
		childNode.getOrCreate("context-root").text(contextRoot);
		return this;
	}

	public WebType<T> removeContextRoot() {
		childNode.remove("context-root");
		return this;
	}

	public String getContextRoot() {
		return childNode.textValue("context-root");
	}

}
