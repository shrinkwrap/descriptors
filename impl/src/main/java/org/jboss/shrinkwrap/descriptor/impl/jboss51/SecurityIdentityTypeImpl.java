package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The security-identity element specifies whether a
 * specific run-as identity is to be used. If there is a run-as role defined for
 * an enterprise bean, there can also be a run-as-principal define here. If you
 * don't define a run-as principal the callee will see ctx.getCallerPrincipal()
 * == 'anonymous' Used in: entity, message-driven, session
 * 
 * 
 */
public class SecurityIdentityTypeImpl<T> implements Child<T>,
		SecurityIdentityType<T> {
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

	public SecurityIdentityTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public SecurityIdentityTypeImpl(T t, String nodeName, Node node,
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
	public SecurityIdentityType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public SecurityIdentityType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public SecurityIdentityType<T> removeAllDescription() {
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
	// Element type : run-as-principal
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SecurityIdentityType<T> setRunAsPrincipal(String runAsPrincipal) {
		childNode.getOrCreate("run-as-principal").text(runAsPrincipal);
		return this;
	}

	public SecurityIdentityType<T> removeRunAsPrincipal() {
		childNode.remove("run-as-principal");
		return this;
	}

	public String getRunAsPrincipal() {
		return childNode.textValue("run-as-principal");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : use-caller-identity
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SecurityIdentityType<T> useCallerIdentity() {
		childNode.getOrCreate("use-caller-identity");
		return this;
	}

	public Boolean isUseCallerIdentity() {
		return childNode.getSingle("use-caller-identity") != null;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : run-as
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public SecurityIdentityType<T> removeRunAs() {
		childNode.remove("run-as");
		return this;
	}

	public RunAsType<SecurityIdentityType<T>> runAs() {
		Node node = childNode.getOrCreate("run-as");
		RunAsType<SecurityIdentityType<T>> runAs = new RunAsTypeImpl<SecurityIdentityType<T>>(
				this, "run-as", childNode, node);
		return runAs;
	}

}
