package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.CallPropertyType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.StubPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
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
	// isComplexType: false maxOccurs: -1 isAttribute: false
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
	// Element type : port-qname
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PortComponentRefType<T> setPortQname(String portQname) {
		childNode.getOrCreate("port-qname").text(portQname);
		return this;
	}

	public PortComponentRefType<T> removePortQname() {
		childNode.remove("port-qname");
		return this;
	}

	public String getPortQname() {
		return childNode.textValue("port-qname");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : config-name
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PortComponentRefType<T> setConfigName(String configName) {
		childNode.getOrCreate("config-name").text(configName);
		return this;
	}

	public PortComponentRefType<T> removeConfigName() {
		childNode.remove("config-name");
		return this;
	}

	public String getConfigName() {
		return childNode.textValue("config-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : config-file
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PortComponentRefType<T> setConfigFile(String configFile) {
		childNode.getOrCreate("config-file").text(configFile);
		return this;
	}

	public PortComponentRefType<T> removeConfigFile() {
		childNode.remove("config-file");
		return this;
	}

	public String getConfigFile() {
		return childNode.textValue("config-file");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : stub-property
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PortComponentRefType<T> removeAllStubProperty() {
		childNode.remove("stub-property");
		return this;
	}

	public StubPropertyType<PortComponentRefType<T>> stubProperty() {
		return new StubPropertyTypeImpl<PortComponentRefType<T>>(this,
				"stub-property", childNode);
	}

	public List<StubPropertyType<PortComponentRefType<T>>> getStubPropertyList() {
		List<StubPropertyType<PortComponentRefType<T>>> list = new ArrayList<StubPropertyType<PortComponentRefType<T>>>();
		List<Node> nodeList = childNode.get("stub-property");
		for (Node node : nodeList) {
			StubPropertyType<PortComponentRefType<T>> type = new StubPropertyTypeImpl<PortComponentRefType<T>>(
					this, "stub-property", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : call-property
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public PortComponentRefType<T> removeAllCallProperty() {
		childNode.remove("call-property");
		return this;
	}

	public CallPropertyType<PortComponentRefType<T>> callProperty() {
		return new CallPropertyTypeImpl<PortComponentRefType<T>>(this,
				"call-property", childNode);
	}

	public List<CallPropertyType<PortComponentRefType<T>>> getCallPropertyList() {
		List<CallPropertyType<PortComponentRefType<T>>> list = new ArrayList<CallPropertyType<PortComponentRefType<T>>>();
		List<Node> nodeList = childNode.get("call-property");
		for (Node node : nodeList) {
			CallPropertyType<PortComponentRefType<T>> type = new CallPropertyTypeImpl<PortComponentRefType<T>>(
					this, "call-property", childNode, node);
			list.add(type);
		}
		return list;
	}

}
