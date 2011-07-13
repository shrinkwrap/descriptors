package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainsType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.InjectionTargetTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The service-ref element declares a reference to a Web service. It contains
 * optional description, display name and icons, a declaration of the required
 * Service interface, an optional WSDL document location, an optional set of
 * JAX-RPC mappings, an optional QName for the service element, an optional set
 * of Service Endpoint Interfaces to be resolved by the container to a WSDL
 * port, and an optional set of handlers.
 * 
 * 
 * 
 */
public class ServiceRefTypeImpl<T> implements Child<T>, ServiceRefType<T> {
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

	public ServiceRefTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ServiceRefTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public ServiceRefType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public ServiceRefType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public ServiceRefType<T> removeAllDescription() {
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
	// Element type : display-name
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public ServiceRefType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public ServiceRefType<T> removeAllDisplayName() {
		childNode.remove("display-name");
		return this;
	}

	public List<String> getDisplayNameList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("display-name");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : icon
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<ServiceRefType<T>> icon() {
		return new IconTypeImpl<ServiceRefType<T>>(this, "icon", childNode);
	}

	public List<IconType<ServiceRefType<T>>> getIconList() {
		List<IconType<ServiceRefType<T>>> list = new ArrayList<IconType<ServiceRefType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<ServiceRefType<T>> type = new IconTypeImpl<ServiceRefType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mapped-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public ServiceRefType<T> removeMappedName() {
		childNode.remove("mapped-name");
		return this;
	}

	public String getMappedName() {
		return childNode.textValue("mapped-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : injection-target
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> removeAllInjectionTarget() {
		childNode.remove("injection-target");
		return this;
	}

	public InjectionTargetType<ServiceRefType<T>> injectionTarget() {
		return new InjectionTargetTypeImpl<ServiceRefType<T>>(this,
				"injection-target", childNode);
	}

	public List<InjectionTargetType<ServiceRefType<T>>> getInjectionTargetList() {
		List<InjectionTargetType<ServiceRefType<T>>> list = new ArrayList<InjectionTargetType<ServiceRefType<T>>>();
		List<Node> nodeList = childNode.get("injection-target");
		for (Node node : nodeList) {
			InjectionTargetType<ServiceRefType<T>> type = new InjectionTargetTypeImpl<ServiceRefType<T>>(
					this, "injection-target", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-ref-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> setServiceRefName(String serviceRefName) {
		childNode.getOrCreate("service-ref-name").text(serviceRefName);
		return this;
	}

	public ServiceRefType<T> removeServiceRefName() {
		childNode.remove("service-ref-name");
		return this;
	}

	public String getServiceRefName() {
		return childNode.textValue("service-ref-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-interface
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> setServiceInterface(String serviceInterface) {
		childNode.getOrCreate("service-interface").text(serviceInterface);
		return this;
	}

	public ServiceRefType<T> removeServiceInterface() {
		childNode.remove("service-interface");
		return this;
	}

	public String getServiceInterface() {
		return childNode.textValue("service-interface");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-ref-type
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> setServiceRefType(String serviceRefType) {
		childNode.getOrCreate("service-ref-type").text(serviceRefType);
		return this;
	}

	public ServiceRefType<T> removeServiceRefType() {
		childNode.remove("service-ref-type");
		return this;
	}

	public String getServiceRefType() {
		return childNode.textValue("service-ref-type");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : wsdl-file
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> setWsdlFile(String wsdlFile) {
		childNode.getOrCreate("wsdl-file").text(wsdlFile);
		return this;
	}

	public ServiceRefType<T> removeWsdlFile() {
		childNode.remove("wsdl-file");
		return this;
	}

	public String getWsdlFile() {
		return childNode.textValue("wsdl-file");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jaxrpc-mapping-file
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> setJaxrpcMappingFile(String jaxrpcMappingFile) {
		childNode.getOrCreate("jaxrpc-mapping-file").text(jaxrpcMappingFile);
		return this;
	}

	public ServiceRefType<T> removeJaxrpcMappingFile() {
		childNode.remove("jaxrpc-mapping-file");
		return this;
	}

	public String getJaxrpcMappingFile() {
		return childNode.textValue("jaxrpc-mapping-file");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-qname
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> setServiceQname(String serviceQname) {
		childNode.getOrCreate("service-qname").text(serviceQname);
		return this;
	}

	public ServiceRefType<T> removeServiceQname() {
		childNode.remove("service-qname");
		return this;
	}

	public String getServiceQname() {
		return childNode.textValue("service-qname");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : port-component-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> removeAllPortComponentRef() {
		childNode.remove("port-component-ref");
		return this;
	}

	public PortComponentRefType<ServiceRefType<T>> portComponentRef() {
		return new PortComponentRefTypeImpl<ServiceRefType<T>>(this,
				"port-component-ref", childNode);
	}

	public List<PortComponentRefType<ServiceRefType<T>>> getPortComponentRefList() {
		List<PortComponentRefType<ServiceRefType<T>>> list = new ArrayList<PortComponentRefType<ServiceRefType<T>>>();
		List<Node> nodeList = childNode.get("port-component-ref");
		for (Node node : nodeList) {
			PortComponentRefType<ServiceRefType<T>> type = new PortComponentRefTypeImpl<ServiceRefType<T>>(
					this, "port-component-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : handler
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> removeAllHandler() {
		childNode.remove("handler");
		return this;
	}

	public ServiceRefHandlerType<ServiceRefType<T>> handler() {
		return new ServiceRefHandlerTypeImpl<ServiceRefType<T>>(this,
				"handler", childNode);
	}

	public List<ServiceRefHandlerType<ServiceRefType<T>>> getHandlerList() {
		List<ServiceRefHandlerType<ServiceRefType<T>>> list = new ArrayList<ServiceRefHandlerType<ServiceRefType<T>>>();
		List<Node> nodeList = childNode.get("handler");
		for (Node node : nodeList) {
			ServiceRefHandlerType<ServiceRefType<T>> type = new ServiceRefHandlerTypeImpl<ServiceRefType<T>>(
					this, "handler", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : handler-chains
	// isComplexType: true maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ServiceRefType<T> removeHandlerChains() {
		childNode.remove("handler-chains");
		return this;
	}

	public ServiceRefHandlerChainsType<ServiceRefType<T>> handlerChains() {
		Node node = childNode.getOrCreate("handler-chains");
		ServiceRefHandlerChainsType<ServiceRefType<T>> handlerChains = new ServiceRefHandlerChainsTypeImpl<ServiceRefType<T>>(
				this, "handler-chains", childNode, node);
		return handlerChains;
	}

}
