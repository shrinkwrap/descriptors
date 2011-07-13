package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The port-component-ref element declares a client dependency on the container
 * for resolving a Service Endpoint Interface to a WSDL port. It optionally
 * associates the Service Endpoint Interface with a particular port-component.
 * This is only used by the container for a Service.getPort(Class) method call.
 * 
 * 
 * 
 */
public class PortComponentRefTypeImpl<T> implements Child<T>,
		PortComponentRefType<T> {
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

	public PortComponentRefTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public PortComponentRefTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-endpoint-interface
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PortComponentRefType<T> setServiceEndpointInterface(
			String serviceEndpointInterface) {
		childNode.getOrCreate("service-endpoint-interface").text(
				serviceEndpointInterface);
		return this;
	}

	public PortComponentRefType<T> removeServiceEndpointInterface() {
		childNode.remove("service-endpoint-interface");
		return this;
	}

	public String getServiceEndpointInterface() {
		return childNode.textValue("service-endpoint-interface");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : enable-mtom
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PortComponentRefType<T> setEnableMtom(Boolean enableMtom) {
		childNode.getOrCreate("enable-mtom").text(enableMtom);
		return this;
	}

	public PortComponentRefType<T> removeEnableMtom() {
		childNode.remove("enable-mtom");
		return this;
	}

	public Boolean isEnableMtom() {
		return Strings.isTrue(childNode.textValue("enable-mtom"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : port-component-link
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PortComponentRefType<T> setPortComponentLink(String portComponentLink) {
		childNode.getOrCreate("port-component-link").text(portComponentLink);
		return this;
	}

	public PortComponentRefType<T> removePortComponentLink() {
		childNode.remove("port-component-link");
		return this;
	}

	public String getPortComponentLink() {
		return childNode.textValue("port-component-link");
	}

}
