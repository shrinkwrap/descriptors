package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The message-destination element is used to configure
 * the jndi-name for a message-destination in ejb-jar.xml Used in:
 * assembly-descriptor
 * 
 */
public class MessageDestinationTypeImpl<T> implements Child<T>,
		MessageDestinationType<T> {
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

	public MessageDestinationTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public MessageDestinationTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
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
	public MessageDestinationType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public MessageDestinationType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public MessageDestinationType<T> removeAllDescription() {
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
	public MessageDestinationType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public MessageDestinationType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public MessageDestinationType<T> removeAllDisplayName() {
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
	public MessageDestinationType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<MessageDestinationType<T>> icon() {
		return new IconTypeImpl<MessageDestinationType<T>>(this, "icon",
				childNode);
	}

	public List<IconType<MessageDestinationType<T>>> getIconList() {
		List<IconType<MessageDestinationType<T>>> list = new ArrayList<IconType<MessageDestinationType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<MessageDestinationType<T>> type = new IconTypeImpl<MessageDestinationType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationType<T> setMessageDestinationName(
			String messageDestinationName) {
		childNode.getOrCreate("message-destination-name").text(
				messageDestinationName);
		return this;
	}

	public MessageDestinationType<T> removeMessageDestinationName() {
		childNode.remove("message-destination-name");
		return this;
	}

	public String getMessageDestinationName() {
		return childNode.textValue("message-destination-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationType<T> setJndiName(String jndiName) {
		childNode.getOrCreate("jndi-name").text(jndiName);
		return this;
	}

	public MessageDestinationType<T> removeJndiName() {
		childNode.remove("jndi-name");
		return this;
	}

	public String getJndiName() {
		return childNode.textValue("jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mapped-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public MessageDestinationType<T> removeMappedName() {
		childNode.remove("mapped-name");
		return this;
	}

	public String getMappedName() {
		return childNode.textValue("mapped-name");
	}

}
