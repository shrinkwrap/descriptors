package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.WebserviceDescriptionType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Runtime information about a web service. wsdl-publish-location is optionally
 * used to specify where the final wsdl and any dependent files should be
 * stored. This location resides on the file system from which deployment is
 * initiated.
 * 
 * 
 * 
 */
public class WebserviceDescriptionTypeImpl<T> implements Child<T>,
		WebserviceDescriptionType<T> {
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

	public WebserviceDescriptionTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public WebserviceDescriptionTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : webservice-description-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebserviceDescriptionType<T> setWebserviceDescriptionName(
			String webserviceDescriptionName) {
		childNode.getOrCreate("webservice-description-name").text(
				webserviceDescriptionName);
		return this;
	}

	public WebserviceDescriptionType<T> removeWebserviceDescriptionName() {
		childNode.remove("webservice-description-name");
		return this;
	}

	public String getWebserviceDescriptionName() {
		return childNode.textValue("webservice-description-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : config-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebserviceDescriptionType<T> setConfigName(String configName) {
		childNode.getOrCreate("config-name").text(configName);
		return this;
	}

	public WebserviceDescriptionType<T> removeConfigName() {
		childNode.remove("config-name");
		return this;
	}

	public String getConfigName() {
		return childNode.textValue("config-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : config-file
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebserviceDescriptionType<T> setConfigFile(String configFile) {
		childNode.getOrCreate("config-file").text(configFile);
		return this;
	}

	public WebserviceDescriptionType<T> removeConfigFile() {
		childNode.remove("config-file");
		return this;
	}

	public String getConfigFile() {
		return childNode.textValue("config-file");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : wsdl-publish-location
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public WebserviceDescriptionType<T> setWsdlPublishLocation(
			String wsdlPublishLocation) {
		childNode.getOrCreate("wsdl-publish-location")
				.text(wsdlPublishLocation);
		return this;
	}

	public WebserviceDescriptionType<T> removeWsdlPublishLocation() {
		childNode.remove("wsdl-publish-location");
		return this;
	}

	public String getWsdlPublishLocation() {
		return childNode.textValue("wsdl-publish-location");
	}

}
