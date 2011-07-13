package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefProtocolBindingListType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The handler-chain element defines the handlerchain. Handlerchain can be
 * defined such that the handlers in the handlerchain operate,all ports of a
 * service, on a specific port or on a list of protocol-bindings. The choice of
 * elements service-name-pattern, port-name-pattern and protocol-bindings are
 * used to specify whether the handlers in handler-chain are for a service, port
 * or protocol binding. If none of these choices are specified with the
 * handler-chain element then the handlers specified in the handler-chain will
 * be applied on everything.
 * 
 * 
 * 
 */
public class ServiceRefHandlerChainTypeImpl<T> implements Child<T>,
		ServiceRefHandlerChainType<T> {
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

	public ServiceRefHandlerChainTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ServiceRefHandlerChainTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : handler
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefHandlerChainType<T> removeAllHandler() {
		childNode.remove("handler");
		return this;
	}

	public ServiceRefHandlerType<ServiceRefHandlerChainType<T>> handler() {
		return new ServiceRefHandlerTypeImpl<ServiceRefHandlerChainType<T>>(
				this, "handler", childNode);
	}

	public List<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>> getHandlerList() {
		List<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>> list = new ArrayList<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>>();
		List<Node> nodeList = childNode.get("handler");
		for (Node node : nodeList) {
			ServiceRefHandlerType<ServiceRefHandlerChainType<T>> type = new ServiceRefHandlerTypeImpl<ServiceRefHandlerChainType<T>>(
					this, "handler", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-name-pattern
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefHandlerChainType<T> setServiceNamePattern(
			String serviceNamePattern) {
		childNode.getOrCreate("service-name-pattern").text(serviceNamePattern);
		return this;
	}

	public ServiceRefHandlerChainType<T> removeServiceNamePattern() {
		childNode.remove("service-name-pattern");
		return this;
	}

	public String getServiceNamePattern() {
		return childNode.textValue("service-name-pattern");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : port-name-pattern
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefHandlerChainType<T> setPortNamePattern(
			String portNamePattern) {
		childNode.getOrCreate("port-name-pattern").text(portNamePattern);
		return this;
	}

	public ServiceRefHandlerChainType<T> removePortNamePattern() {
		childNode.remove("port-name-pattern");
		return this;
	}

	public String getPortNamePattern() {
		return childNode.textValue("port-name-pattern");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : protocol-bindings
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefHandlerChainType<T> removeProtocolBindings() {
		childNode.remove("protocol-bindings");
		return this;
	}

	public ServiceRefProtocolBindingListType<ServiceRefHandlerChainType<T>> protocolBindings() {
		Node node = childNode.getOrCreate("protocol-bindings");
		ServiceRefProtocolBindingListType<ServiceRefHandlerChainType<T>> protocolBindings = new ServiceRefProtocolBindingListTypeImpl<ServiceRefHandlerChainType<T>>(
				this, "protocol-bindings", childNode, node);
		return protocolBindings;
	}

}
