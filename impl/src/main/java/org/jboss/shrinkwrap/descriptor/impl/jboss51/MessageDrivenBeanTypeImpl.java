package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The message-driven element holds information specific
 * to jboss and not declared in ejb-jar.xml about a message-driven bean, such as
 * container configuration and resources. The bean should already be declared in
 * ejb-jar.xml, with the same ejb-name.
 * 
 * 
 */
public class MessageDrivenBeanTypeImpl<T> implements Child<T>,
		MessageDrivenBeanType<T> {
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

	public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node,
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
	public MessageDrivenBeanType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public MessageDrivenBeanType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public MessageDrivenBeanType<T> removeAllDescription() {
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
	public MessageDrivenBeanType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public MessageDrivenBeanType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public MessageDrivenBeanType<T> removeAllDisplayName() {
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
	public MessageDrivenBeanType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<MessageDrivenBeanType<T>> icon() {
		return new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon",
				childNode);
	}

	public List<IconType<MessageDrivenBeanType<T>>> getIconList() {
		List<IconType<MessageDrivenBeanType<T>>> list = new ArrayList<IconType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<MessageDrivenBeanType<T>> type = new IconTypeImpl<MessageDrivenBeanType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setEjbName(String ejbName) {
		childNode.getOrCreate("ejb-name").text(ejbName);
		return this;
	}

	public MessageDrivenBeanType<T> removeEjbName() {
		childNode.remove("ejb-name");
		return this;
	}

	public String getEjbName() {
		return childNode.textValue("ejb-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : activation-config
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeActivationConfig() {
		childNode.remove("activation-config");
		return this;
	}

	public ActivationConfigType<MessageDrivenBeanType<T>> activationConfig() {
		Node node = childNode.getOrCreate("activation-config");
		ActivationConfigType<MessageDrivenBeanType<T>> activationConfig = new ActivationConfigTypeImpl<MessageDrivenBeanType<T>>(
				this, "activation-config", childNode, node);
		return activationConfig;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : destination-jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setDestinationJndiName(
			String destinationJndiName) {
		childNode.getOrCreate("destination-jndi-name")
				.text(destinationJndiName);
		return this;
	}

	public MessageDrivenBeanType<T> removeDestinationJndiName() {
		childNode.remove("destination-jndi-name");
		return this;
	}

	public String getDestinationJndiName() {
		return childNode.textValue("destination-jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mdb-user
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setMdbUser(String mdbUser) {
		childNode.getOrCreate("mdb-user").text(mdbUser);
		return this;
	}

	public MessageDrivenBeanType<T> removeMdbUser() {
		childNode.remove("mdb-user");
		return this;
	}

	public String getMdbUser() {
		return childNode.textValue("mdb-user");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mdb-passwd
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setMdbPasswd(String mdbPasswd) {
		childNode.getOrCreate("mdb-passwd").text(mdbPasswd);
		return this;
	}

	public MessageDrivenBeanType<T> removeMdbPasswd() {
		childNode.remove("mdb-passwd");
		return this;
	}

	public String getMdbPasswd() {
		return childNode.textValue("mdb-passwd");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mdb-client-id
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setMdbClientId(String mdbClientId) {
		childNode.getOrCreate("mdb-client-id").text(mdbClientId);
		return this;
	}

	public MessageDrivenBeanType<T> removeMdbClientId() {
		childNode.remove("mdb-client-id");
		return this;
	}

	public String getMdbClientId() {
		return childNode.textValue("mdb-client-id");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mdb-subscription-id
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setMdbSubscriptionId(
			String mdbSubscriptionId) {
		childNode.getOrCreate("mdb-subscription-id").text(mdbSubscriptionId);
		return this;
	}

	public MessageDrivenBeanType<T> removeMdbSubscriptionId() {
		childNode.remove("mdb-subscription-id");
		return this;
	}

	public String getMdbSubscriptionId() {
		return childNode.textValue("mdb-subscription-id");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-adapter-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setResourceAdapterName(
			String resourceAdapterName) {
		childNode.getOrCreate("resource-adapter-name")
				.text(resourceAdapterName);
		return this;
	}

	public MessageDrivenBeanType<T> removeResourceAdapterName() {
		childNode.remove("resource-adapter-name");
		return this;
	}

	public String getResourceAdapterName() {
		return childNode.textValue("resource-adapter-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeAllEjbRef() {
		childNode.remove("ejb-ref");
		return this;
	}

	public EjbRefType<MessageDrivenBeanType<T>> ejbRef() {
		return new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref",
				childNode);
	}

	public List<EjbRefType<MessageDrivenBeanType<T>>> getEjbRefList() {
		List<EjbRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbRefType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("ejb-ref");
		for (Node node : nodeList) {
			EjbRefType<MessageDrivenBeanType<T>> type = new EjbRefTypeImpl<MessageDrivenBeanType<T>>(
					this, "ejb-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-local-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeAllEjbLocalRef() {
		childNode.remove("ejb-local-ref");
		return this;
	}

	public EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef() {
		return new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this,
				"ejb-local-ref", childNode);
	}

	public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getEjbLocalRefList() {
		List<EjbLocalRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbLocalRefType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("ejb-local-ref");
		for (Node node : nodeList) {
			EjbLocalRefType<MessageDrivenBeanType<T>> type = new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(
					this, "ejb-local-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeAllServiceRef() {
		childNode.remove("service-ref");
		return this;
	}

	public ServiceRefType<MessageDrivenBeanType<T>> serviceRef() {
		return new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this,
				"service-ref", childNode);
	}

	public List<ServiceRefType<MessageDrivenBeanType<T>>> getServiceRefList() {
		List<ServiceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ServiceRefType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("service-ref");
		for (Node node : nodeList) {
			ServiceRefType<MessageDrivenBeanType<T>> type = new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(
					this, "service-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeAllResourceRef() {
		childNode.remove("resource-ref");
		return this;
	}

	public ResourceRefType<MessageDrivenBeanType<T>> resourceRef() {
		return new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this,
				"resource-ref", childNode);
	}

	public List<ResourceRefType<MessageDrivenBeanType<T>>> getResourceRefList() {
		List<ResourceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceRefType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("resource-ref");
		for (Node node : nodeList) {
			ResourceRefType<MessageDrivenBeanType<T>> type = new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(
					this, "resource-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-env-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeAllResourceEnvRef() {
		childNode.remove("resource-env-ref");
		return this;
	}

	public ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef() {
		return new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this,
				"resource-env-ref", childNode);
	}

	public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getResourceEnvRefList() {
		List<ResourceEnvRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceEnvRefType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("resource-env-ref");
		for (Node node : nodeList) {
			ResourceEnvRefType<MessageDrivenBeanType<T>> type = new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(
					this, "resource-env-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeAllMessageDestinationRef() {
		childNode.remove("message-destination-ref");
		return this;
	}

	public MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef() {
		return new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(
				this, "message-destination-ref", childNode);
	}

	public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getMessageDestinationRefList() {
		List<MessageDestinationRefType<MessageDrivenBeanType<T>>> list = new ArrayList<MessageDestinationRefType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("message-destination-ref");
		for (Node node : nodeList) {
			MessageDestinationRefType<MessageDrivenBeanType<T>> type = new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(
					this, "message-destination-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-identity
	// isComplexType: true maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeSecurityIdentity() {
		childNode.remove("security-identity");
		return this;
	}

	public SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity() {
		Node node = childNode.getOrCreate("security-identity");
		SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<MessageDrivenBeanType<T>>(
				this, "security-identity", childNode, node);
		return securityIdentity;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-domain
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setSecurityDomain(String securityDomain) {
		childNode.getOrCreate("security-domain").text(securityDomain);
		return this;
	}

	public MessageDrivenBeanType<T> removeSecurityDomain() {
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
	public MessageDrivenBeanType<T> removeMethodAttributes() {
		childNode.remove("method-attributes");
		return this;
	}

	public MethodAttributesType<MessageDrivenBeanType<T>> methodAttributes() {
		Node node = childNode.getOrCreate("method-attributes");
		MethodAttributesType<MessageDrivenBeanType<T>> methodAttributes = new MethodAttributesTypeImpl<MessageDrivenBeanType<T>>(
				this, "method-attributes", childNode, node);
		return methodAttributes;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : depends
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setDepends(String depends) {
		childNode.create("depends").text(depends);
		return this;
	}

	public MessageDrivenBeanType<T> setDependsList(String... values) {
		for (String name : values) {
			setDepends(name);
		}
		return this;
	}

	public MessageDrivenBeanType<T> removeAllDepends() {
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
	// Element type : ejb-timeout-identity
	// isComplexType: true maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeEjbTimeoutIdentity() {
		childNode.remove("ejb-timeout-identity");
		return this;
	}

	public SecurityIdentityType<MessageDrivenBeanType<T>> ejbTimeoutIdentity() {
		Node node = childNode.getOrCreate("ejb-timeout-identity");
		SecurityIdentityType<MessageDrivenBeanType<T>> ejbTimeoutIdentity = new SecurityIdentityTypeImpl<MessageDrivenBeanType<T>>(
				this, "ejb-timeout-identity", childNode, node);
		return ejbTimeoutIdentity;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : annotation
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeAllAnnotation() {
		childNode.remove("annotation");
		return this;
	}

	public AnnotationType<MessageDrivenBeanType<T>> annotation() {
		return new AnnotationTypeImpl<MessageDrivenBeanType<T>>(this,
				"annotation", childNode);
	}

	public List<AnnotationType<MessageDrivenBeanType<T>>> getAnnotationList() {
		List<AnnotationType<MessageDrivenBeanType<T>>> list = new ArrayList<AnnotationType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("annotation");
		for (Node node : nodeList) {
			AnnotationType<MessageDrivenBeanType<T>> type = new AnnotationTypeImpl<MessageDrivenBeanType<T>>(
					this, "annotation", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ignore-dependency
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeIgnoreDependency() {
		childNode.remove("ignore-dependency");
		return this;
	}

	public IgnoreDependencyType<MessageDrivenBeanType<T>> ignoreDependency() {
		Node node = childNode.getOrCreate("ignore-dependency");
		IgnoreDependencyType<MessageDrivenBeanType<T>> ignoreDependency = new IgnoreDependencyTypeImpl<MessageDrivenBeanType<T>>(
				this, "ignore-dependency", childNode, node);
		return ignoreDependency;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : aop-domain-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setAopDomainName(String aopDomainName) {
		childNode.getOrCreate("aop-domain-name").text(aopDomainName);
		return this;
	}

	public MessageDrivenBeanType<T> removeAopDomainName() {
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
	public MessageDrivenBeanType<T> removePoolConfig() {
		childNode.remove("pool-config");
		return this;
	}

	public PoolConfigType<MessageDrivenBeanType<T>> poolConfig() {
		Node node = childNode.getOrCreate("pool-config");
		PoolConfigType<MessageDrivenBeanType<T>> poolConfig = new PoolConfigTypeImpl<MessageDrivenBeanType<T>>(
				this, "pool-config", childNode, node);
		return poolConfig;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> removeAllJndiRef() {
		childNode.remove("jndi-ref");
		return this;
	}

	public JndiRefType<MessageDrivenBeanType<T>> jndiRef() {
		return new JndiRefTypeImpl<MessageDrivenBeanType<T>>(this, "jndi-ref",
				childNode);
	}

	public List<JndiRefType<MessageDrivenBeanType<T>>> getJndiRefList() {
		List<JndiRefType<MessageDrivenBeanType<T>>> list = new ArrayList<JndiRefType<MessageDrivenBeanType<T>>>();
		List<Node> nodeList = childNode.get("jndi-ref");
		for (Node node : nodeList) {
			JndiRefType<MessageDrivenBeanType<T>> type = new JndiRefTypeImpl<MessageDrivenBeanType<T>>(
					this, "jndi-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : create-destination
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MessageDrivenBeanType<T> setCreateDestination(
			Boolean createDestination) {
		childNode.getOrCreate("create-destination").text(createDestination);
		return this;
	}

	public MessageDrivenBeanType<T> removeCreateDestination() {
		childNode.remove("create-destination");
		return this;
	}

	public Boolean isCreateDestination() {
		return Strings.isTrue(childNode.textValue("create-destination"));
	}

}
