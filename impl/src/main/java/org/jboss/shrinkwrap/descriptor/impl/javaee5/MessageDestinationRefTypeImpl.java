package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationUsageType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * 
 * The message-destination-ref element contains a declaration of Deployment
 * Component's reference to a message destination associated with a resource in
 * Deployment Component's environment. It consists of:
 * 
 * - an optional description - the message destination reference name - an
 * optional message destination type - an optional specification as to whether
 * the destination is used for consuming or producing messages, or both. if not
 * specified, "both" is assumed. - an optional link to the message destination -
 * optional injection targets
 * 
 * The message destination type must be supplied unless an injection target is
 * specified, in which case the type of the target is used. If both are
 * specified, the type must be assignment compatible with the type of the
 * injection target.
 * 
 * Examples:
 * 
 * <message-destination-ref> <message-destination-ref-name>jms/StockQueue
 * </message-destination-ref-name> <message-destination-type>javax.jms.Queue
 * </message-destination-type> <message-destination-usage>Consumes
 * </message-destination-usage> <message-destination-link>CorporateStocks
 * </message-destination-link> </message-destination-ref>
 * 
 * 
 * 
 * 
 */
public class MessageDestinationRefTypeImpl<T> implements Child<T>,
		MessageDestinationRefType<T> {
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

	public MessageDestinationRefTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public MessageDestinationRefTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mapped-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationRefType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public MessageDestinationRefType<T> removeMappedName() {
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
	public MessageDestinationRefType<T> removeAllInjectionTarget() {
		childNode.remove("injection-target");
		return this;
	}

	public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget() {
		return new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this,
				"injection-target", childNode);
	}

	public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList() {
		List<InjectionTargetType<MessageDestinationRefType<T>>> list = new ArrayList<InjectionTargetType<MessageDestinationRefType<T>>>();
		List<Node> nodeList = childNode.get("injection-target");
		for (Node node : nodeList) {
			InjectionTargetType<MessageDestinationRefType<T>> type = new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(
					this, "injection-target", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationRefType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public MessageDestinationRefType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public MessageDestinationRefType<T> removeAllDescription() {
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
	// Element type : message-destination-ref-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationRefType<T> setMessageDestinationRefName(
			String messageDestinationRefName) {
		childNode.getOrCreate("message-destination-ref-name").text(
				messageDestinationRefName);
		return this;
	}

	public MessageDestinationRefType<T> removeMessageDestinationRefName() {
		childNode.remove("message-destination-ref-name");
		return this;
	}

	public String getMessageDestinationRefName() {
		return childNode.textValue("message-destination-ref-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-type
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationRefType<T> setMessageDestinationType(
			String messageDestinationType) {
		childNode.getOrCreate("message-destination-type").text(
				messageDestinationType);
		return this;
	}

	public MessageDestinationRefType<T> removeMessageDestinationType() {
		childNode.remove("message-destination-type");
		return this;
	}

	public String getMessageDestinationType() {
		return childNode.textValue("message-destination-type");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-usage
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationRefType<T> setMessageDestinationUsage(
			MessageDestinationUsageType messageDestinationUsage) {
		childNode.getOrCreate("message-destination-usage").text(
				messageDestinationUsage);
		return this;
	}

	public MessageDestinationRefType<T> setMessageDestinationUsage(
			String messageDestinationUsage) {
		childNode.getOrCreate("message-destination-usage").text(
				messageDestinationUsage);
		return this;
	}

	public MessageDestinationUsageType getMessageDestinationUsage() {
		return MessageDestinationUsageType.getFromStringValue(childNode
				.textValue("message-destination-usage"));
	}

	public String getMessageDestinationUsageAsString() {
		return childNode.textValue("message-destination-usage");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-link
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDestinationRefType<T> setMessageDestinationLink(
			String messageDestinationLink) {
		childNode.getOrCreate("message-destination-link").text(
				messageDestinationLink);
		return this;
	}

	public MessageDestinationRefType<T> removeMessageDestinationLink() {
		childNode.remove("message-destination-link");
		return this;
	}

	public String getMessageDestinationLink() {
		return childNode.textValue("message-destination-link");
	}

}
