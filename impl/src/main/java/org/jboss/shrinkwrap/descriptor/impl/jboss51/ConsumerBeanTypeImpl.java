package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ConsumerBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessagePropertiesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ProducerType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The consumer element holds all of the information
 * specific about a consumer bean which is a JBoss proprietary extension to EJB3
 * for sending JMS messages via standard Java interfaces. Used in:
 * enterprise-beans
 * 
 */
public class ConsumerBeanTypeImpl<T> implements Child<T>, ConsumerBeanType<T> {
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

	public ConsumerBeanTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public ConsumerBeanTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public ConsumerBeanType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public ConsumerBeanType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public ConsumerBeanType<T> removeAllDescription() {
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
	public ConsumerBeanType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public ConsumerBeanType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public ConsumerBeanType<T> removeAllDisplayName() {
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
	public ConsumerBeanType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<ConsumerBeanType<T>> icon() {
		return new IconTypeImpl<ConsumerBeanType<T>>(this, "icon", childNode);
	}

	public List<IconType<ConsumerBeanType<T>>> getIconList() {
		List<IconType<ConsumerBeanType<T>>> list = new ArrayList<IconType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<ConsumerBeanType<T>> type = new IconTypeImpl<ConsumerBeanType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> setEjbName(String ejbName) {
		childNode.getOrCreate("ejb-name").text(ejbName);
		return this;
	}

	public ConsumerBeanType<T> removeEjbName() {
		childNode.remove("ejb-name");
		return this;
	}

	public String getEjbName() {
		return childNode.textValue("ejb-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-class
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> setEjbClass(String ejbClass) {
		childNode.getOrCreate("ejb-class").text(ejbClass);
		return this;
	}

	public ConsumerBeanType<T> removeEjbClass() {
		childNode.remove("ejb-class");
		return this;
	}

	public String getEjbClass() {
		return childNode.textValue("ejb-class");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> setMessageDestination(String messageDestination) {
		childNode.getOrCreate("message-destination").text(messageDestination);
		return this;
	}

	public ConsumerBeanType<T> removeMessageDestination() {
		childNode.remove("message-destination");
		return this;
	}

	public String getMessageDestination() {
		return childNode.textValue("message-destination");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-type
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> setMessageDestinationType(
			String messageDestinationType) {
		childNode.getOrCreate("message-destination-type").text(
				messageDestinationType);
		return this;
	}

	public ConsumerBeanType<T> removeMessageDestinationType() {
		childNode.remove("message-destination-type");
		return this;
	}

	public String getMessageDestinationType() {
		return childNode.textValue("message-destination-type");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : producer
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllProducer() {
		childNode.remove("producer");
		return this;
	}

	public ProducerType<ConsumerBeanType<T>> producer() {
		return new ProducerTypeImpl<ConsumerBeanType<T>>(this, "producer",
				childNode);
	}

	public List<ProducerType<ConsumerBeanType<T>>> getProducerList() {
		List<ProducerType<ConsumerBeanType<T>>> list = new ArrayList<ProducerType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("producer");
		for (Node node : nodeList) {
			ProducerType<ConsumerBeanType<T>> type = new ProducerTypeImpl<ConsumerBeanType<T>>(
					this, "producer", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : local-producer
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllLocalProducer() {
		childNode.remove("local-producer");
		return this;
	}

	public ProducerType<ConsumerBeanType<T>> localProducer() {
		return new ProducerTypeImpl<ConsumerBeanType<T>>(this,
				"local-producer", childNode);
	}

	public List<ProducerType<ConsumerBeanType<T>>> getLocalProducerList() {
		List<ProducerType<ConsumerBeanType<T>>> list = new ArrayList<ProducerType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("local-producer");
		for (Node node : nodeList) {
			ProducerType<ConsumerBeanType<T>> type = new ProducerTypeImpl<ConsumerBeanType<T>>(
					this, "local-producer", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : current-message
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeCurrentMessage() {
		childNode.remove("current-message");
		return this;
	}

	public MethodAttributesType<ConsumerBeanType<T>> currentMessage() {
		Node node = childNode.getOrCreate("current-message");
		MethodAttributesType<ConsumerBeanType<T>> currentMessage = new MethodAttributesTypeImpl<ConsumerBeanType<T>>(
				this, "current-message", childNode, node);
		return currentMessage;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-properties
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllMessageProperties() {
		childNode.remove("message-properties");
		return this;
	}

	public MessagePropertiesType<ConsumerBeanType<T>> messageProperties() {
		return new MessagePropertiesTypeImpl<ConsumerBeanType<T>>(this,
				"message-properties", childNode);
	}

	public List<MessagePropertiesType<ConsumerBeanType<T>>> getMessagePropertiesList() {
		List<MessagePropertiesType<ConsumerBeanType<T>>> list = new ArrayList<MessagePropertiesType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("message-properties");
		for (Node node : nodeList) {
			MessagePropertiesType<ConsumerBeanType<T>> type = new MessagePropertiesTypeImpl<ConsumerBeanType<T>>(
					this, "message-properties", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllEjbRef() {
		childNode.remove("ejb-ref");
		return this;
	}

	public EjbRefType<ConsumerBeanType<T>> ejbRef() {
		return new EjbRefTypeImpl<ConsumerBeanType<T>>(this, "ejb-ref",
				childNode);
	}

	public List<EjbRefType<ConsumerBeanType<T>>> getEjbRefList() {
		List<EjbRefType<ConsumerBeanType<T>>> list = new ArrayList<EjbRefType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("ejb-ref");
		for (Node node : nodeList) {
			EjbRefType<ConsumerBeanType<T>> type = new EjbRefTypeImpl<ConsumerBeanType<T>>(
					this, "ejb-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-local-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllEjbLocalRef() {
		childNode.remove("ejb-local-ref");
		return this;
	}

	public EjbLocalRefType<ConsumerBeanType<T>> ejbLocalRef() {
		return new EjbLocalRefTypeImpl<ConsumerBeanType<T>>(this,
				"ejb-local-ref", childNode);
	}

	public List<EjbLocalRefType<ConsumerBeanType<T>>> getEjbLocalRefList() {
		List<EjbLocalRefType<ConsumerBeanType<T>>> list = new ArrayList<EjbLocalRefType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("ejb-local-ref");
		for (Node node : nodeList) {
			EjbLocalRefType<ConsumerBeanType<T>> type = new EjbLocalRefTypeImpl<ConsumerBeanType<T>>(
					this, "ejb-local-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-identity
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeSecurityIdentity() {
		childNode.remove("security-identity");
		return this;
	}

	public SecurityIdentityType<ConsumerBeanType<T>> securityIdentity() {
		Node node = childNode.getOrCreate("security-identity");
		SecurityIdentityType<ConsumerBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<ConsumerBeanType<T>>(
				this, "security-identity", childNode, node);
		return securityIdentity;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllResourceRef() {
		childNode.remove("resource-ref");
		return this;
	}

	public ResourceRefType<ConsumerBeanType<T>> resourceRef() {
		return new ResourceRefTypeImpl<ConsumerBeanType<T>>(this,
				"resource-ref", childNode);
	}

	public List<ResourceRefType<ConsumerBeanType<T>>> getResourceRefList() {
		List<ResourceRefType<ConsumerBeanType<T>>> list = new ArrayList<ResourceRefType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("resource-ref");
		for (Node node : nodeList) {
			ResourceRefType<ConsumerBeanType<T>> type = new ResourceRefTypeImpl<ConsumerBeanType<T>>(
					this, "resource-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-env-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllResourceEnvRef() {
		childNode.remove("resource-env-ref");
		return this;
	}

	public ResourceEnvRefType<ConsumerBeanType<T>> resourceEnvRef() {
		return new ResourceEnvRefTypeImpl<ConsumerBeanType<T>>(this,
				"resource-env-ref", childNode);
	}

	public List<ResourceEnvRefType<ConsumerBeanType<T>>> getResourceEnvRefList() {
		List<ResourceEnvRefType<ConsumerBeanType<T>>> list = new ArrayList<ResourceEnvRefType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("resource-env-ref");
		for (Node node : nodeList) {
			ResourceEnvRefType<ConsumerBeanType<T>> type = new ResourceEnvRefTypeImpl<ConsumerBeanType<T>>(
					this, "resource-env-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllMessageDestinationRef() {
		childNode.remove("message-destination-ref");
		return this;
	}

	public MessageDestinationRefType<ConsumerBeanType<T>> messageDestinationRef() {
		return new MessageDestinationRefTypeImpl<ConsumerBeanType<T>>(this,
				"message-destination-ref", childNode);
	}

	public List<MessageDestinationRefType<ConsumerBeanType<T>>> getMessageDestinationRefList() {
		List<MessageDestinationRefType<ConsumerBeanType<T>>> list = new ArrayList<MessageDestinationRefType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("message-destination-ref");
		for (Node node : nodeList) {
			MessageDestinationRefType<ConsumerBeanType<T>> type = new MessageDestinationRefTypeImpl<ConsumerBeanType<T>>(
					this, "message-destination-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-domain
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> setSecurityDomain(String securityDomain) {
		childNode.getOrCreate("security-domain").text(securityDomain);
		return this;
	}

	public ConsumerBeanType<T> removeSecurityDomain() {
		childNode.remove("security-domain");
		return this;
	}

	public String getSecurityDomain() {
		return childNode.textValue("security-domain");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : method-attributes
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeMethodAttributes() {
		childNode.remove("method-attributes");
		return this;
	}

	public MethodAttributesType<ConsumerBeanType<T>> methodAttributes() {
		Node node = childNode.getOrCreate("method-attributes");
		MethodAttributesType<ConsumerBeanType<T>> methodAttributes = new MethodAttributesTypeImpl<ConsumerBeanType<T>>(
				this, "method-attributes", childNode, node);
		return methodAttributes;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : depends
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> setDepends(String depends) {
		childNode.create("depends").text(depends);
		return this;
	}

	public ConsumerBeanType<T> setDependsList(String... values) {
		for (String name : values) {
			setDepends(name);
		}
		return this;
	}

	public ConsumerBeanType<T> removeAllDepends() {
		childNode.remove("depends");
		return this;
	}

	public List<String> getDependsList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("depends");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : annotation
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllAnnotation() {
		childNode.remove("annotation");
		return this;
	}

	public AnnotationType<ConsumerBeanType<T>> annotation() {
		return new AnnotationTypeImpl<ConsumerBeanType<T>>(this, "annotation",
				childNode);
	}

	public List<AnnotationType<ConsumerBeanType<T>>> getAnnotationList() {
		List<AnnotationType<ConsumerBeanType<T>>> list = new ArrayList<AnnotationType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("annotation");
		for (Node node : nodeList) {
			AnnotationType<ConsumerBeanType<T>> type = new AnnotationTypeImpl<ConsumerBeanType<T>>(
					this, "annotation", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ignore-dependency
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeIgnoreDependency() {
		childNode.remove("ignore-dependency");
		return this;
	}

	public IgnoreDependencyType<ConsumerBeanType<T>> ignoreDependency() {
		Node node = childNode.getOrCreate("ignore-dependency");
		IgnoreDependencyType<ConsumerBeanType<T>> ignoreDependency = new IgnoreDependencyTypeImpl<ConsumerBeanType<T>>(
				this, "ignore-dependency", childNode, node);
		return ignoreDependency;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : aop-domain-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> setAopDomainName(String aopDomainName) {
		childNode.getOrCreate("aop-domain-name").text(aopDomainName);
		return this;
	}

	public ConsumerBeanType<T> removeAopDomainName() {
		childNode.remove("aop-domain-name");
		return this;
	}

	public String getAopDomainName() {
		return childNode.textValue("aop-domain-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pool-config
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removePoolConfig() {
		childNode.remove("pool-config");
		return this;
	}

	public PoolConfigType<ConsumerBeanType<T>> poolConfig() {
		Node node = childNode.getOrCreate("pool-config");
		PoolConfigType<ConsumerBeanType<T>> poolConfig = new PoolConfigTypeImpl<ConsumerBeanType<T>>(
				this, "pool-config", childNode, node);
		return poolConfig;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeAllJndiRef() {
		childNode.remove("jndi-ref");
		return this;
	}

	public JndiRefType<ConsumerBeanType<T>> jndiRef() {
		return new JndiRefTypeImpl<ConsumerBeanType<T>>(this, "jndi-ref",
				childNode);
	}

	public List<JndiRefType<ConsumerBeanType<T>>> getJndiRefList() {
		List<JndiRefType<ConsumerBeanType<T>>> list = new ArrayList<JndiRefType<ConsumerBeanType<T>>>();
		List<Node> nodeList = childNode.get("jndi-ref");
		for (Node node : nodeList) {
			JndiRefType<ConsumerBeanType<T>> type = new JndiRefTypeImpl<ConsumerBeanType<T>>(
					this, "jndi-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : activation-config
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public ConsumerBeanType<T> removeActivationConfig() {
		childNode.remove("activation-config");
		return this;
	}

	public ActivationConfigType<ConsumerBeanType<T>> activationConfig() {
		Node node = childNode.getOrCreate("activation-config");
		ActivationConfigType<ConsumerBeanType<T>> activationConfig = new ActivationConfigTypeImpl<ConsumerBeanType<T>>(
				this, "activation-config", childNode, node);
		return activationConfig;
	}

}
