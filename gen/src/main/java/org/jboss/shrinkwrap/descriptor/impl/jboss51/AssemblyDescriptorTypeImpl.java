package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The assembly-descriptor element contains
 * application-assembly information. The definition of security roles allows you
 * to map assembly roles to one or more principals. For example, you may define
 * a run-as principal in the security-identity element and include that
 * principal in one or more security-role(s) in the assembly descriptor. When
 * called with a run-as role, the callee will see all those roles in
 * ctx.isCallerInRole(...) Used in: jboss
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

}
