package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InitMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.SessionTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The session-beanType declares an session bean. The declaration consists of:
 * 
 * - an optional description - an optional display name - an optional icon
 * element that contains a small and a large icon file name - a name assigned to
 * the enterprise bean in the deployment description - an optional mapped-name
 * element that can be used to provide vendor-specific deployment information
 * such as the physical jndi-name of the session bean's remote home/business
 * interface. This element is not required to be supported by all
 * implementations. Any use of this element is non-portable. - the names of all
 * the remote or local business interfaces, if any - the names of the session
 * bean's remote home and remote interfaces, if any - the names of the session
 * bean's local home and local interfaces, if any - the name of the session
 * bean's web service endpoint interface, if any - the session bean's
 * implementation class - the session bean's state management type - an optional
 * declaration of the session bean's timeout method. - the optional session
 * bean's transaction management type. If it is not present, it is defaulted to
 * Container. - an optional list of the session bean class and/or superclass
 * around-invoke methods. - an optional declaration of the bean's environment
 * entries - an optional declaration of the bean's EJB references - an optional
 * declaration of the bean's local EJB references - an optional declaration of
 * the bean's web service references - an optional declaration of the security
 * role references - an optional declaration of the security identity to be used
 * for the execution of the bean's methods - an optional declaration of the
 * bean's resource manager connection factory references - an optional
 * declaration of the bean's resource environment references. - an optional
 * declaration of the bean's message destination references
 * 
 * The elements that are optional are "optional" in the sense that they are
 * omitted when if lists represented by them are empty.
 * 
 * Either both the local-home and the local elements or both the home and the
 * remote elements must be specified for the session bean.
 * 
 * The service-endpoint element may only be specified if the bean is a stateless
 * session bean.
 * 
 * 
 * 
 */
public class SessionBeanTypeImpl<T> implements Child<T>, SessionBeanType<T> {
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

	public SessionBeanTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public SessionBeanTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public SessionBeanType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public SessionBeanType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public SessionBeanType<T> removeAllDescription() {
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
	public SessionBeanType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public SessionBeanType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public SessionBeanType<T> removeAllDisplayName() {
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
	public SessionBeanType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<SessionBeanType<T>> icon() {
		return new IconTypeImpl<SessionBeanType<T>>(this, "icon", childNode);
	}

	public List<IconType<SessionBeanType<T>>> getIconList() {
		List<IconType<SessionBeanType<T>>> list = new ArrayList<IconType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<SessionBeanType<T>> type = new IconTypeImpl<SessionBeanType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : env-entry
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllEnvEntry() {
		childNode.remove("env-entry");
		return this;
	}

	public EnvEntryType<SessionBeanType<T>> envEntry() {
		return new EnvEntryTypeImpl<SessionBeanType<T>>(this, "env-entry",
				childNode);
	}

	public List<EnvEntryType<SessionBeanType<T>>> getEnvEntryList() {
		List<EnvEntryType<SessionBeanType<T>>> list = new ArrayList<EnvEntryType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("env-entry");
		for (Node node : nodeList) {
			EnvEntryType<SessionBeanType<T>> type = new EnvEntryTypeImpl<SessionBeanType<T>>(
					this, "env-entry", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllEjbRef() {
		childNode.remove("ejb-ref");
		return this;
	}

	public EjbRefType<SessionBeanType<T>> ejbRef() {
		return new EjbRefTypeImpl<SessionBeanType<T>>(this, "ejb-ref",
				childNode);
	}

	public List<EjbRefType<SessionBeanType<T>>> getEjbRefList() {
		List<EjbRefType<SessionBeanType<T>>> list = new ArrayList<EjbRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("ejb-ref");
		for (Node node : nodeList) {
			EjbRefType<SessionBeanType<T>> type = new EjbRefTypeImpl<SessionBeanType<T>>(
					this, "ejb-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-local-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllEjbLocalRef() {
		childNode.remove("ejb-local-ref");
		return this;
	}

	public EjbLocalRefType<SessionBeanType<T>> ejbLocalRef() {
		return new EjbLocalRefTypeImpl<SessionBeanType<T>>(this,
				"ejb-local-ref", childNode);
	}

	public List<EjbLocalRefType<SessionBeanType<T>>> getEjbLocalRefList() {
		List<EjbLocalRefType<SessionBeanType<T>>> list = new ArrayList<EjbLocalRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("ejb-local-ref");
		for (Node node : nodeList) {
			EjbLocalRefType<SessionBeanType<T>> type = new EjbLocalRefTypeImpl<SessionBeanType<T>>(
					this, "ejb-local-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllResourceRef() {
		childNode.remove("resource-ref");
		return this;
	}

	public ResourceRefType<SessionBeanType<T>> resourceRef() {
		return new ResourceRefTypeImpl<SessionBeanType<T>>(this,
				"resource-ref", childNode);
	}

	public List<ResourceRefType<SessionBeanType<T>>> getResourceRefList() {
		List<ResourceRefType<SessionBeanType<T>>> list = new ArrayList<ResourceRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("resource-ref");
		for (Node node : nodeList) {
			ResourceRefType<SessionBeanType<T>> type = new ResourceRefTypeImpl<SessionBeanType<T>>(
					this, "resource-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : resource-env-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllResourceEnvRef() {
		childNode.remove("resource-env-ref");
		return this;
	}

	public ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef() {
		return new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this,
				"resource-env-ref", childNode);
	}

	public List<ResourceEnvRefType<SessionBeanType<T>>> getResourceEnvRefList() {
		List<ResourceEnvRefType<SessionBeanType<T>>> list = new ArrayList<ResourceEnvRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("resource-env-ref");
		for (Node node : nodeList) {
			ResourceEnvRefType<SessionBeanType<T>> type = new ResourceEnvRefTypeImpl<SessionBeanType<T>>(
					this, "resource-env-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllMessageDestinationRef() {
		childNode.remove("message-destination-ref");
		return this;
	}

	public MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef() {
		return new MessageDestinationRefTypeImpl<SessionBeanType<T>>(this,
				"message-destination-ref", childNode);
	}

	public List<MessageDestinationRefType<SessionBeanType<T>>> getMessageDestinationRefList() {
		List<MessageDestinationRefType<SessionBeanType<T>>> list = new ArrayList<MessageDestinationRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("message-destination-ref");
		for (Node node : nodeList) {
			MessageDestinationRefType<SessionBeanType<T>> type = new MessageDestinationRefTypeImpl<SessionBeanType<T>>(
					this, "message-destination-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-context-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllPersistenceContextRef() {
		childNode.remove("persistence-context-ref");
		return this;
	}

	public PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef() {
		return new PersistenceContextRefTypeImpl<SessionBeanType<T>>(this,
				"persistence-context-ref", childNode);
	}

	public List<PersistenceContextRefType<SessionBeanType<T>>> getPersistenceContextRefList() {
		List<PersistenceContextRefType<SessionBeanType<T>>> list = new ArrayList<PersistenceContextRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("persistence-context-ref");
		for (Node node : nodeList) {
			PersistenceContextRefType<SessionBeanType<T>> type = new PersistenceContextRefTypeImpl<SessionBeanType<T>>(
					this, "persistence-context-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-unit-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllPersistenceUnitRef() {
		childNode.remove("persistence-unit-ref");
		return this;
	}

	public PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef() {
		return new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this,
				"persistence-unit-ref", childNode);
	}

	public List<PersistenceUnitRefType<SessionBeanType<T>>> getPersistenceUnitRefList() {
		List<PersistenceUnitRefType<SessionBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("persistence-unit-ref");
		for (Node node : nodeList) {
			PersistenceUnitRefType<SessionBeanType<T>> type = new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(
					this, "persistence-unit-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : post-construct
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllPostConstruct() {
		childNode.remove("post-construct");
		return this;
	}

	public LifecycleCallbackType<SessionBeanType<T>> postConstruct() {
		return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
				"post-construct", childNode);
	}

	public List<LifecycleCallbackType<SessionBeanType<T>>> getPostConstructList() {
		List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("post-construct");
		for (Node node : nodeList) {
			LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(
					this, "post-construct", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pre-destroy
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllPreDestroy() {
		childNode.remove("pre-destroy");
		return this;
	}

	public LifecycleCallbackType<SessionBeanType<T>> preDestroy() {
		return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
				"pre-destroy", childNode);
	}

	public List<LifecycleCallbackType<SessionBeanType<T>>> getPreDestroyList() {
		List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("pre-destroy");
		for (Node node : nodeList) {
			LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(
					this, "pre-destroy", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllServiceRef() {
		childNode.remove("service-ref");
		return this;
	}

	public ServiceRefType<SessionBeanType<T>> serviceRef() {
		return new ServiceRefTypeImpl<SessionBeanType<T>>(this, "service-ref",
				childNode);
	}

	public List<ServiceRefType<SessionBeanType<T>>> getServiceRefList() {
		List<ServiceRefType<SessionBeanType<T>>> list = new ArrayList<ServiceRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("service-ref");
		for (Node node : nodeList) {
			ServiceRefType<SessionBeanType<T>> type = new ServiceRefTypeImpl<SessionBeanType<T>>(
					this, "service-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setEjbName(String ejbName) {
		childNode.getOrCreate("ejb-name").text(ejbName);
		return this;
	}

	public SessionBeanType<T> removeEjbName() {
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
	public SessionBeanType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public SessionBeanType<T> removeMappedName() {
		childNode.remove("mapped-name");
		return this;
	}

	public String getMappedName() {
		return childNode.textValue("mapped-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : home
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setHome(String home) {
		childNode.getOrCreate("home").text(home);
		return this;
	}

	public SessionBeanType<T> removeHome() {
		childNode.remove("home");
		return this;
	}

	public String getHome() {
		return childNode.textValue("home");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : remote
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setRemote(String remote) {
		childNode.getOrCreate("remote").text(remote);
		return this;
	}

	public SessionBeanType<T> removeRemote() {
		childNode.remove("remote");
		return this;
	}

	public String getRemote() {
		return childNode.textValue("remote");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : local-home
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setLocalHome(String localHome) {
		childNode.getOrCreate("local-home").text(localHome);
		return this;
	}

	public SessionBeanType<T> removeLocalHome() {
		childNode.remove("local-home");
		return this;
	}

	public String getLocalHome() {
		return childNode.textValue("local-home");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : local
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setLocal(String local) {
		childNode.getOrCreate("local").text(local);
		return this;
	}

	public SessionBeanType<T> removeLocal() {
		childNode.remove("local");
		return this;
	}

	public String getLocal() {
		return childNode.textValue("local");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : business-local
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setBusinessLocal(String businessLocal) {
		childNode.create("business-local").text(businessLocal);
		return this;
	}

	public SessionBeanType<T> setBusinessLocalList(String... values) {
		for (String name : values) {
			setBusinessLocal(name);
		}
		return this;
	}

	public SessionBeanType<T> removeAllBusinessLocal() {
		childNode.remove("business-local");
		return this;
	}

	public List<String> getBusinessLocalList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("business-local");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : business-remote
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setBusinessRemote(String businessRemote) {
		childNode.create("business-remote").text(businessRemote);
		return this;
	}

	public SessionBeanType<T> setBusinessRemoteList(String... values) {
		for (String name : values) {
			setBusinessRemote(name);
		}
		return this;
	}

	public SessionBeanType<T> removeAllBusinessRemote() {
		childNode.remove("business-remote");
		return this;
	}

	public List<String> getBusinessRemoteList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("business-remote");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : service-endpoint
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint) {
		childNode.getOrCreate("service-endpoint").text(serviceEndpoint);
		return this;
	}

	public SessionBeanType<T> removeServiceEndpoint() {
		childNode.remove("service-endpoint");
		return this;
	}

	public String getServiceEndpoint() {
		return childNode.textValue("service-endpoint");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-class
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setEjbClass(String ejbClass) {
		childNode.getOrCreate("ejb-class").text(ejbClass);
		return this;
	}

	public SessionBeanType<T> removeEjbClass() {
		childNode.remove("ejb-class");
		return this;
	}

	public String getEjbClass() {
		return childNode.textValue("ejb-class");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : session-type
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setSessionType(SessionTypeType sessionType) {
		childNode.getOrCreate("session-type").text(sessionType);
		return this;
	}

	public SessionBeanType<T> setSessionType(String sessionType) {
		childNode.getOrCreate("session-type").text(sessionType);
		return this;
	}

	public SessionTypeType getSessionType() {
		return SessionTypeType.getFromStringValue(childNode
				.textValue("session-type"));
	}

	public String getSessionTypeAsString() {
		return childNode.textValue("session-type");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : timeout-method
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeTimeoutMethod() {
		childNode.remove("timeout-method");
		return this;
	}

	public NamedMethodType<SessionBeanType<T>> timeoutMethod() {
		Node node = childNode.getOrCreate("timeout-method");
		NamedMethodType<SessionBeanType<T>> timeoutMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(
				this, "timeout-method", childNode, node);
		return timeoutMethod;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : init-method
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllInitMethod() {
		childNode.remove("init-method");
		return this;
	}

	public InitMethodType<SessionBeanType<T>> initMethod() {
		return new InitMethodTypeImpl<SessionBeanType<T>>(this, "init-method",
				childNode);
	}

	public List<InitMethodType<SessionBeanType<T>>> getInitMethodList() {
		List<InitMethodType<SessionBeanType<T>>> list = new ArrayList<InitMethodType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("init-method");
		for (Node node : nodeList) {
			InitMethodType<SessionBeanType<T>> type = new InitMethodTypeImpl<SessionBeanType<T>>(
					this, "init-method", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : remove-method
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllRemoveMethod() {
		childNode.remove("remove-method");
		return this;
	}

	public RemoveMethodType<SessionBeanType<T>> removeMethod() {
		return new RemoveMethodTypeImpl<SessionBeanType<T>>(this,
				"remove-method", childNode);
	}

	public List<RemoveMethodType<SessionBeanType<T>>> getRemoveMethodList() {
		List<RemoveMethodType<SessionBeanType<T>>> list = new ArrayList<RemoveMethodType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("remove-method");
		for (Node node : nodeList) {
			RemoveMethodType<SessionBeanType<T>> type = new RemoveMethodTypeImpl<SessionBeanType<T>>(
					this, "remove-method", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : transaction-type
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> setTransactionType(
			TransactionTypeType transactionType) {
		childNode.getOrCreate("transaction-type").text(transactionType);
		return this;
	}

	public SessionBeanType<T> setTransactionType(String transactionType) {
		childNode.getOrCreate("transaction-type").text(transactionType);
		return this;
	}

	public TransactionTypeType getTransactionType() {
		return TransactionTypeType.getFromStringValue(childNode
				.textValue("transaction-type"));
	}

	public String getTransactionTypeAsString() {
		return childNode.textValue("transaction-type");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : around-invoke
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllAroundInvoke() {
		childNode.remove("around-invoke");
		return this;
	}

	public AroundInvokeType<SessionBeanType<T>> aroundInvoke() {
		return new AroundInvokeTypeImpl<SessionBeanType<T>>(this,
				"around-invoke", childNode);
	}

	public List<AroundInvokeType<SessionBeanType<T>>> getAroundInvokeList() {
		List<AroundInvokeType<SessionBeanType<T>>> list = new ArrayList<AroundInvokeType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("around-invoke");
		for (Node node : nodeList) {
			AroundInvokeType<SessionBeanType<T>> type = new AroundInvokeTypeImpl<SessionBeanType<T>>(
					this, "around-invoke", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : post-activate
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllPostActivate() {
		childNode.remove("post-activate");
		return this;
	}

	public LifecycleCallbackType<SessionBeanType<T>> postActivate() {
		return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
				"post-activate", childNode);
	}

	public List<LifecycleCallbackType<SessionBeanType<T>>> getPostActivateList() {
		List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("post-activate");
		for (Node node : nodeList) {
			LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(
					this, "post-activate", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : pre-passivate
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllPrePassivate() {
		childNode.remove("pre-passivate");
		return this;
	}

	public LifecycleCallbackType<SessionBeanType<T>> prePassivate() {
		return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
				"pre-passivate", childNode);
	}

	public List<LifecycleCallbackType<SessionBeanType<T>>> getPrePassivateList() {
		List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("pre-passivate");
		for (Node node : nodeList) {
			LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(
					this, "pre-passivate", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-role-ref
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeAllSecurityRoleRef() {
		childNode.remove("security-role-ref");
		return this;
	}

	public SecurityRoleRefType<SessionBeanType<T>> securityRoleRef() {
		return new SecurityRoleRefTypeImpl<SessionBeanType<T>>(this,
				"security-role-ref", childNode);
	}

	public List<SecurityRoleRefType<SessionBeanType<T>>> getSecurityRoleRefList() {
		List<SecurityRoleRefType<SessionBeanType<T>>> list = new ArrayList<SecurityRoleRefType<SessionBeanType<T>>>();
		List<Node> nodeList = childNode.get("security-role-ref");
		for (Node node : nodeList) {
			SecurityRoleRefType<SessionBeanType<T>> type = new SecurityRoleRefTypeImpl<SessionBeanType<T>>(
					this, "security-role-ref", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-identity
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SessionBeanType<T> removeSecurityIdentity() {
		childNode.remove("security-identity");
		return this;
	}

	public SecurityIdentityType<SessionBeanType<T>> securityIdentity() {
		Node node = childNode.getOrCreate("security-identity");
		SecurityIdentityType<SessionBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<SessionBeanType<T>>(
				this, "security-identity", childNode, node);
		return securityIdentity;
	}

}
