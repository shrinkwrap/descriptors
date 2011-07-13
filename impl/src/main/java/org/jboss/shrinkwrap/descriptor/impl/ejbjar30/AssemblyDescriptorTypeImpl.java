package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ApplicationExceptionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ContainerTransactionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ExcludeListType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorBindingType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodPermissionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The assembly-descriptorType defines application-assembly information.
 * 
 * The application-assembly information consists of the following parts: the
 * definition of security roles, the definition of method permissions, the
 * definition of transaction attributes for enterprise beans with
 * container-managed transaction demarcation, the definition of interceptor
 * bindings, a list of methods to be excluded from being invoked, and a list of
 * exception types that should be treated as application exceptions.
 * 
 * All the parts are optional in the sense that they are omitted if the lists
 * represented by them are empty.
 * 
 * Providing an assembly-descriptor in the deployment descriptor is optional for
 * the ejb-jar file producer.
 * 
 * 
 * 
 */
public class AssemblyDescriptorTypeImpl<T> implements Child<T>,
		AssemblyDescriptorType<T> {
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

	public AssemblyDescriptorTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public AssemblyDescriptorTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : security-role
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AssemblyDescriptorType<T> removeAllSecurityRole() {
		childNode.remove("security-role");
		return this;
	}

	public SecurityRoleType<AssemblyDescriptorType<T>> securityRole() {
		return new SecurityRoleTypeImpl<AssemblyDescriptorType<T>>(this,
				"security-role", childNode);
	}

	public List<SecurityRoleType<AssemblyDescriptorType<T>>> getSecurityRoleList() {
		List<SecurityRoleType<AssemblyDescriptorType<T>>> list = new ArrayList<SecurityRoleType<AssemblyDescriptorType<T>>>();
		List<Node> nodeList = childNode.get("security-role");
		for (Node node : nodeList) {
			SecurityRoleType<AssemblyDescriptorType<T>> type = new SecurityRoleTypeImpl<AssemblyDescriptorType<T>>(
					this, "security-role", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : method-permission
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AssemblyDescriptorType<T> removeAllMethodPermission() {
		childNode.remove("method-permission");
		return this;
	}

	public MethodPermissionType<AssemblyDescriptorType<T>> methodPermission() {
		return new MethodPermissionTypeImpl<AssemblyDescriptorType<T>>(this,
				"method-permission", childNode);
	}

	public List<MethodPermissionType<AssemblyDescriptorType<T>>> getMethodPermissionList() {
		List<MethodPermissionType<AssemblyDescriptorType<T>>> list = new ArrayList<MethodPermissionType<AssemblyDescriptorType<T>>>();
		List<Node> nodeList = childNode.get("method-permission");
		for (Node node : nodeList) {
			MethodPermissionType<AssemblyDescriptorType<T>> type = new MethodPermissionTypeImpl<AssemblyDescriptorType<T>>(
					this, "method-permission", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : container-transaction
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AssemblyDescriptorType<T> removeAllContainerTransaction() {
		childNode.remove("container-transaction");
		return this;
	}

	public ContainerTransactionType<AssemblyDescriptorType<T>> containerTransaction() {
		return new ContainerTransactionTypeImpl<AssemblyDescriptorType<T>>(
				this, "container-transaction", childNode);
	}

	public List<ContainerTransactionType<AssemblyDescriptorType<T>>> getContainerTransactionList() {
		List<ContainerTransactionType<AssemblyDescriptorType<T>>> list = new ArrayList<ContainerTransactionType<AssemblyDescriptorType<T>>>();
		List<Node> nodeList = childNode.get("container-transaction");
		for (Node node : nodeList) {
			ContainerTransactionType<AssemblyDescriptorType<T>> type = new ContainerTransactionTypeImpl<AssemblyDescriptorType<T>>(
					this, "container-transaction", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : interceptor-binding
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AssemblyDescriptorType<T> removeAllInterceptorBinding() {
		childNode.remove("interceptor-binding");
		return this;
	}

	public InterceptorBindingType<AssemblyDescriptorType<T>> interceptorBinding() {
		return new InterceptorBindingTypeImpl<AssemblyDescriptorType<T>>(this,
				"interceptor-binding", childNode);
	}

	public List<InterceptorBindingType<AssemblyDescriptorType<T>>> getInterceptorBindingList() {
		List<InterceptorBindingType<AssemblyDescriptorType<T>>> list = new ArrayList<InterceptorBindingType<AssemblyDescriptorType<T>>>();
		List<Node> nodeList = childNode.get("interceptor-binding");
		for (Node node : nodeList) {
			InterceptorBindingType<AssemblyDescriptorType<T>> type = new InterceptorBindingTypeImpl<AssemblyDescriptorType<T>>(
					this, "interceptor-binding", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : message-destination
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AssemblyDescriptorType<T> removeAllMessageDestination() {
		childNode.remove("message-destination");
		return this;
	}

	public MessageDestinationType<AssemblyDescriptorType<T>> messageDestination() {
		return new MessageDestinationTypeImpl<AssemblyDescriptorType<T>>(this,
				"message-destination", childNode);
	}

	public List<MessageDestinationType<AssemblyDescriptorType<T>>> getMessageDestinationList() {
		List<MessageDestinationType<AssemblyDescriptorType<T>>> list = new ArrayList<MessageDestinationType<AssemblyDescriptorType<T>>>();
		List<Node> nodeList = childNode.get("message-destination");
		for (Node node : nodeList) {
			MessageDestinationType<AssemblyDescriptorType<T>> type = new MessageDestinationTypeImpl<AssemblyDescriptorType<T>>(
					this, "message-destination", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : exclude-list
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AssemblyDescriptorType<T> removeExcludeList() {
		childNode.remove("exclude-list");
		return this;
	}

	public ExcludeListType<AssemblyDescriptorType<T>> excludeList() {
		Node node = childNode.getOrCreate("exclude-list");
		ExcludeListType<AssemblyDescriptorType<T>> excludeList = new ExcludeListTypeImpl<AssemblyDescriptorType<T>>(
				this, "exclude-list", childNode, node);
		return excludeList;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : application-exception
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public AssemblyDescriptorType<T> removeAllApplicationException() {
		childNode.remove("application-exception");
		return this;
	}

	public ApplicationExceptionType<AssemblyDescriptorType<T>> applicationException() {
		return new ApplicationExceptionTypeImpl<AssemblyDescriptorType<T>>(
				this, "application-exception", childNode);
	}

	public List<ApplicationExceptionType<AssemblyDescriptorType<T>>> getApplicationExceptionList() {
		List<ApplicationExceptionType<AssemblyDescriptorType<T>>> list = new ArrayList<ApplicationExceptionType<AssemblyDescriptorType<T>>>();
		List<Node> nodeList = childNode.get("application-exception");
		for (Node node : nodeList) {
			ApplicationExceptionType<AssemblyDescriptorType<T>> type = new ApplicationExceptionTypeImpl<AssemblyDescriptorType<T>>(
					this, "application-exception", childNode, node);
			list.add(type);
		}
		return list;
	}

}
