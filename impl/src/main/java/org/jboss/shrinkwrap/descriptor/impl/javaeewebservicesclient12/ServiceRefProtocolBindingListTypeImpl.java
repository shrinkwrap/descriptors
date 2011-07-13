package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefProtocolBindingListType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * Defines the type used for specifying a list of protocol-bindingType(s). For
 * e.g.
 * 
 * ##SOAP11_HTTP ##SOAP12_HTTP ##XML_HTTP
 * 
 * 
 * 
 */
public class ServiceRefProtocolBindingListTypeImpl<T> implements Child<T>,
		ServiceRefProtocolBindingListType<T> {
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

	public ServiceRefProtocolBindingListTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ServiceRefProtocolBindingListTypeImpl(T t, String nodeName,
			Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : protocol-bindingType
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefProtocolBindingListType<T> setProtocolBindingType(
			String protocolBindingType) {
		childNode.create("protocol-bindingType").text(protocolBindingType);
		return this;
	}

	public ServiceRefProtocolBindingListType<T> setProtocolBindingTypeList(
			String... values) {
		for (String name : values) {
			setProtocolBindingType(name);
		}
		return this;
	}

	public ServiceRefProtocolBindingListType<T> removeAllProtocolBindingType() {
		childNode.remove("protocol-bindingType");
		return this;
	}

	public List<String> getProtocolBindingTypeList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("protocol-bindingType");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

}
