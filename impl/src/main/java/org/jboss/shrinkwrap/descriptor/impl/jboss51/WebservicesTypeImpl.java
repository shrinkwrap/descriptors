package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.WebserviceDescriptionType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.WebserviceDescriptionTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public class WebservicesTypeImpl<T> implements Child<T>, WebservicesType<T> {
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

	public WebservicesTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public WebservicesTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : context-root
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebservicesType<T> setContextRoot(String contextRoot) {
		childNode.getOrCreate("context-root").text(contextRoot);
		return this;
	}

	public WebservicesType<T> removeContextRoot() {
		childNode.remove("context-root");
		return this;
	}

	public String getContextRoot() {
		return childNode.textValue("context-root");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : webservice-description
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebservicesType<T> removeAllWebserviceDescription() {
		childNode.remove("webservice-description");
		return this;
	}

	public WebserviceDescriptionType<WebservicesType<T>> webserviceDescription() {
		return new WebserviceDescriptionTypeImpl<WebservicesType<T>>(this,
				"webservice-description", childNode);
	}

	public List<WebserviceDescriptionType<WebservicesType<T>>> getWebserviceDescriptionList() {
		List<WebserviceDescriptionType<WebservicesType<T>>> list = new ArrayList<WebserviceDescriptionType<WebservicesType<T>>>();
		List<Node> nodeList = childNode.get("webservice-description");
		for (Node node : nodeList) {
			WebserviceDescriptionType<WebservicesType<T>> type = new WebserviceDescriptionTypeImpl<WebservicesType<T>>(
					this, "webservice-description", childNode, node);
			list.add(type);
		}
		return list;
	}

}
