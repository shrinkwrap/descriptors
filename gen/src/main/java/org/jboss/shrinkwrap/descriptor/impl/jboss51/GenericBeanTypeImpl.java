package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.GenericBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PortComponentType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public class GenericBeanTypeImpl<T> implements Child<T>, GenericBeanType<T> {
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

	public GenericBeanTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public GenericBeanTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public GenericBeanType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public GenericBeanType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public GenericBeanType<T> removeAllDescription() {
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
	public GenericBeanType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public GenericBeanType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public GenericBeanType<T> removeAllDisplayName() {
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
	public GenericBeanType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<GenericBeanType<T>> icon() {
		return new IconTypeImpl<GenericBeanType<T>>(this, "icon", childNode);
	}

	public List<IconType<GenericBeanType<T>>> getIconList() {
		List<IconType<GenericBeanType<T>>> list = new ArrayList<IconType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<GenericBeanType<T>> type = new IconTypeImpl<GenericBeanType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : env-entry
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllEnvEntry() {
		childNode.remove("env-entry");
		return this;
	}

	public EnvEntryType<GenericBeanType<T>> envEntry() {
		return new EnvEntryTypeImpl<GenericBeanType<T>>(this, "env-entry",
				childNode);
	}

	public List<EnvEntryType<GenericBeanType<T>>> getEnvEntryList() {
		List<EnvEntryType<GenericBeanType<T>>> list = new ArrayList<EnvEntryType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("env-entry");
		for (Node node : nodeList) {
			EnvEntryType<GenericBeanType<T>> type = new EnvEntryTypeImpl<GenericBeanType<T>>(
					this, "env-entry", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllEjbRef() {
		childNode.remove("ejb-ref");
		return this;
	}

	public EjbRefType<GenericBeanType<T>> ejbRef() {
		return new EjbRefTypeImpl<GenericBeanType<T>>(this, "ejb-ref",
				childNode);
	}

	public List<EjbRefType<GenericBeanType<T>>> getEjbRefList() {
		List<EjbRefType<GenericBeanType<T>>> list = new ArrayList<EjbRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("ejb-ref");
		for (Node node : nodeList) {
			EjbRefType<GenericBeanType<T>> type = new EjbRefTypeImpl<GenericBeanType<T>>(
					this, "ejb-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-local-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllEjbLocalRef() {
		childNode.remove("ejb-local-ref");
		return this;
	}

	public EjbLocalRefType<GenericBeanType<T>> ejbLocalRef() {
		return new EjbLocalRefTypeImpl<GenericBeanType<T>>(this,
				"ejb-local-ref", childNode);
	}

	public List<EjbLocalRefType<GenericBeanType<T>>> getEjbLocalRefList() {
		List<EjbLocalRefType<GenericBeanType<T>>> list = new ArrayList<EjbLocalRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("ejb-local-ref");
		for (Node node : nodeList) {
			EjbLocalRefType<GenericBeanType<T>> type = new EjbLocalRefTypeImpl<GenericBeanType<T>>(
					this, "ejb-local-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllResourceRef() {
		childNode.remove("resource-ref");
		return this;
	}

	public ResourceRefType<GenericBeanType<T>> resourceRef() {
		return new ResourceRefTypeImpl<GenericBeanType<T>>(this,
				"resource-ref", childNode);
	}

	public List<ResourceRefType<GenericBeanType<T>>> getResourceRefList() {
		List<ResourceRefType<GenericBeanType<T>>> list = new ArrayList<ResourceRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("resource-ref");
		for (Node node : nodeList) {
			ResourceRefType<GenericBeanType<T>> type = new ResourceRefTypeImpl<GenericBeanType<T>>(
					this, "resource-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-env-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllResourceEnvRef() {
		childNode.remove("resource-env-ref");
		return this;
	}

	public ResourceEnvRefType<GenericBeanType<T>> resourceEnvRef() {
		return new ResourceEnvRefTypeImpl<GenericBeanType<T>>(this,
				"resource-env-ref", childNode);
	}

	public List<ResourceEnvRefType<GenericBeanType<T>>> getResourceEnvRefList() {
		List<ResourceEnvRefType<GenericBeanType<T>>> list = new ArrayList<ResourceEnvRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("resource-env-ref");
		for (Node node : nodeList) {
			ResourceEnvRefType<GenericBeanType<T>> type = new ResourceEnvRefTypeImpl<GenericBeanType<T>>(
					this, "resource-env-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllMessageDestinationRef() {
		childNode.remove("message-destination-ref");
		return this;
	}

	public MessageDestinationRefType<GenericBeanType<T>> messageDestinationRef() {
		return new MessageDestinationRefTypeImpl<GenericBeanType<T>>(this,
				"message-destination-ref", childNode);
	}

	public List<MessageDestinationRefType<GenericBeanType<T>>> getMessageDestinationRefList() {
		List<MessageDestinationRefType<GenericBeanType<T>>> list = new ArrayList<MessageDestinationRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("message-destination-ref");
		for (Node node : nodeList) {
			MessageDestinationRefType<GenericBeanType<T>> type = new MessageDestinationRefTypeImpl<GenericBeanType<T>>(
					this, "message-destination-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-context-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllPersistenceContextRef() {
		childNode.remove("persistence-context-ref");
		return this;
	}

	public PersistenceContextRefType<GenericBeanType<T>> persistenceContextRef() {
		return new PersistenceContextRefTypeImpl<GenericBeanType<T>>(this,
				"persistence-context-ref", childNode);
	}

	public List<PersistenceContextRefType<GenericBeanType<T>>> getPersistenceContextRefList() {
		List<PersistenceContextRefType<GenericBeanType<T>>> list = new ArrayList<PersistenceContextRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("persistence-context-ref");
		for (Node node : nodeList) {
			PersistenceContextRefType<GenericBeanType<T>> type = new PersistenceContextRefTypeImpl<GenericBeanType<T>>(
					this, "persistence-context-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-unit-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllPersistenceUnitRef() {
		childNode.remove("persistence-unit-ref");
		return this;
	}

	public PersistenceUnitRefType<GenericBeanType<T>> persistenceUnitRef() {
		return new PersistenceUnitRefTypeImpl<GenericBeanType<T>>(this,
				"persistence-unit-ref", childNode);
	}

	public List<PersistenceUnitRefType<GenericBeanType<T>>> getPersistenceUnitRefList() {
		List<PersistenceUnitRefType<GenericBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("persistence-unit-ref");
		for (Node node : nodeList) {
			PersistenceUnitRefType<GenericBeanType<T>> type = new PersistenceUnitRefTypeImpl<GenericBeanType<T>>(
					this, "persistence-unit-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : post-construct
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllPostConstruct() {
		childNode.remove("post-construct");
		return this;
	}

	public LifecycleCallbackType<GenericBeanType<T>> postConstruct() {
		return new LifecycleCallbackTypeImpl<GenericBeanType<T>>(this,
				"post-construct", childNode);
	}

	public List<LifecycleCallbackType<GenericBeanType<T>>> getPostConstructList() {
		List<LifecycleCallbackType<GenericBeanType<T>>> list = new ArrayList<LifecycleCallbackType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("post-construct");
		for (Node node : nodeList) {
			LifecycleCallbackType<GenericBeanType<T>> type = new LifecycleCallbackTypeImpl<GenericBeanType<T>>(
					this, "post-construct", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pre-destroy
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllPreDestroy() {
		childNode.remove("pre-destroy");
		return this;
	}

	public LifecycleCallbackType<GenericBeanType<T>> preDestroy() {
		return new LifecycleCallbackTypeImpl<GenericBeanType<T>>(this,
				"pre-destroy", childNode);
	}

	public List<LifecycleCallbackType<GenericBeanType<T>>> getPreDestroyList() {
		List<LifecycleCallbackType<GenericBeanType<T>>> list = new ArrayList<LifecycleCallbackType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("pre-destroy");
		for (Node node : nodeList) {
			LifecycleCallbackType<GenericBeanType<T>> type = new LifecycleCallbackTypeImpl<GenericBeanType<T>>(
					this, "pre-destroy", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllServiceRef() {
		childNode.remove("service-ref");
		return this;
	}

	public ServiceRefType<GenericBeanType<T>> serviceRef() {
		return new ServiceRefTypeImpl<GenericBeanType<T>>(this, "service-ref",
				childNode);
	}

	public List<ServiceRefType<GenericBeanType<T>>> getServiceRefList() {
		List<ServiceRefType<GenericBeanType<T>>> list = new ArrayList<ServiceRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("service-ref");
		for (Node node : nodeList) {
			ServiceRefType<GenericBeanType<T>> type = new ServiceRefTypeImpl<GenericBeanType<T>>(
					this, "service-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setEjbName(String ejbName) {
		childNode.getOrCreate("ejb-name").text(ejbName);
		return this;
	}

	public GenericBeanType<T> removeEjbName() {
		childNode.remove("ejb-name");
		return this;
	}

	public String getEjbName() {
		return childNode.textValue("ejb-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mapped-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public GenericBeanType<T> removeMappedName() {
		childNode.remove("mapped-name");
		return this;
	}

	public String getMappedName() {
		return childNode.textValue("mapped-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-identity
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeSecurityIdentity() {
		childNode.remove("security-identity");
		return this;
	}

	public SecurityIdentityType<GenericBeanType<T>> securityIdentity() {
		Node node = childNode.getOrCreate("security-identity");
		SecurityIdentityType<GenericBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<GenericBeanType<T>>(
				this, "security-identity", childNode, node);
		return securityIdentity;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setJndiName(String jndiName) {
		childNode.getOrCreate("jndi-name").text(jndiName);
		return this;
	}

	public GenericBeanType<T> removeJndiName() {
		childNode.remove("jndi-name");
		return this;
	}

	public String getJndiName() {
		return childNode.textValue("jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : home-jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setHomeJndiName(String homeJndiName) {
		childNode.getOrCreate("home-jndi-name").text(homeJndiName);
		return this;
	}

	public GenericBeanType<T> removeHomeJndiName() {
		childNode.remove("home-jndi-name");
		return this;
	}

	public String getHomeJndiName() {
		return childNode.textValue("home-jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : local-jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setLocalJndiName(String localJndiName) {
		childNode.getOrCreate("local-jndi-name").text(localJndiName);
		return this;
	}

	public GenericBeanType<T> removeLocalJndiName() {
		childNode.remove("local-jndi-name");
		return this;
	}

	public String getLocalJndiName() {
		return childNode.textValue("local-jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : local-home-jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setLocalHomeJndiName(String localHomeJndiName) {
		childNode.getOrCreate("local-home-jndi-name").text(localHomeJndiName);
		return this;
	}

	public GenericBeanType<T> removeLocalHomeJndiName() {
		childNode.remove("local-home-jndi-name");
		return this;
	}

	public String getLocalHomeJndiName() {
		return childNode.textValue("local-home-jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-binding-policy
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setJndiBindingPolicy(String jndiBindingPolicy) {
		childNode.getOrCreate("jndi-binding-policy").text(jndiBindingPolicy);
		return this;
	}

	public GenericBeanType<T> removeJndiBindingPolicy() {
		childNode.remove("jndi-binding-policy");
		return this;
	}

	public String getJndiBindingPolicy() {
		return childNode.textValue("jndi-binding-policy");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-domain
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setSecurityDomain(String securityDomain) {
		childNode.getOrCreate("security-domain").text(securityDomain);
		return this;
	}

	public GenericBeanType<T> removeSecurityDomain() {
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
	public GenericBeanType<T> removeMethodAttributes() {
		childNode.remove("method-attributes");
		return this;
	}

	public MethodAttributesType<GenericBeanType<T>> methodAttributes() {
		Node node = childNode.getOrCreate("method-attributes");
		MethodAttributesType<GenericBeanType<T>> methodAttributes = new MethodAttributesTypeImpl<GenericBeanType<T>>(
				this, "method-attributes", childNode, node);
		return methodAttributes;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : depends
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setDepends(String depends) {
		childNode.create("depends").text(depends);
		return this;
	}

	public GenericBeanType<T> setDependsList(String... values) {
		for (String name : values) {
			setDepends(name);
		}
		return this;
	}

	public GenericBeanType<T> removeAllDepends() {
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
	public GenericBeanType<T> removeAllAnnotation() {
		childNode.remove("annotation");
		return this;
	}

	public AnnotationType<GenericBeanType<T>> annotation() {
		return new AnnotationTypeImpl<GenericBeanType<T>>(this, "annotation",
				childNode);
	}

	public List<AnnotationType<GenericBeanType<T>>> getAnnotationList() {
		List<AnnotationType<GenericBeanType<T>>> list = new ArrayList<AnnotationType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("annotation");
		for (Node node : nodeList) {
			AnnotationType<GenericBeanType<T>> type = new AnnotationTypeImpl<GenericBeanType<T>>(
					this, "annotation", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ignore-dependency
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeIgnoreDependency() {
		childNode.remove("ignore-dependency");
		return this;
	}

	public IgnoreDependencyType<GenericBeanType<T>> ignoreDependency() {
		Node node = childNode.getOrCreate("ignore-dependency");
		IgnoreDependencyType<GenericBeanType<T>> ignoreDependency = new IgnoreDependencyTypeImpl<GenericBeanType<T>>(
				this, "ignore-dependency", childNode, node);
		return ignoreDependency;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : aop-domain-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> setAopDomainName(String aopDomainName) {
		childNode.getOrCreate("aop-domain-name").text(aopDomainName);
		return this;
	}

	public GenericBeanType<T> removeAopDomainName() {
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
	public GenericBeanType<T> removePoolConfig() {
		childNode.remove("pool-config");
		return this;
	}

	public PoolConfigType<GenericBeanType<T>> poolConfig() {
		Node node = childNode.getOrCreate("pool-config");
		PoolConfigType<GenericBeanType<T>> poolConfig = new PoolConfigTypeImpl<GenericBeanType<T>>(
				this, "pool-config", childNode, node);
		return poolConfig;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removeAllJndiRef() {
		childNode.remove("jndi-ref");
		return this;
	}

	public JndiRefType<GenericBeanType<T>> jndiRef() {
		return new JndiRefTypeImpl<GenericBeanType<T>>(this, "jndi-ref",
				childNode);
	}

	public List<JndiRefType<GenericBeanType<T>>> getJndiRefList() {
		List<JndiRefType<GenericBeanType<T>>> list = new ArrayList<JndiRefType<GenericBeanType<T>>>();
		List<Node> nodeList = childNode.get("jndi-ref");
		for (Node node : nodeList) {
			JndiRefType<GenericBeanType<T>> type = new JndiRefTypeImpl<GenericBeanType<T>>(
					this, "jndi-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : port-component
	// isComplexType: true maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public GenericBeanType<T> removePortComponent() {
		childNode.remove("port-component");
		return this;
	}

	public PortComponentType<GenericBeanType<T>> portComponent() {
		Node node = childNode.getOrCreate("port-component");
		PortComponentType<GenericBeanType<T>> portComponent = new PortComponentTypeImpl<GenericBeanType<T>>(
				this, "port-component", childNode, node);
		return portComponent;
	}

}
