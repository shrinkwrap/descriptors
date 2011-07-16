package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RelationshipRoleSourceType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The relationship-role-sourceType designates the source of a role that
 * participates in a relationship. A relationship-role-sourceType is used by
 * relationship-role-source elements to uniquely identify an entity bean.
 * 
 * 
 * 
 */
public class RelationshipRoleSourceTypeImpl<T> implements Child<T>,
		RelationshipRoleSourceType<T> {
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

	public RelationshipRoleSourceTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public RelationshipRoleSourceTypeImpl(T t, String nodeName, Node node,
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
	public RelationshipRoleSourceType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public RelationshipRoleSourceType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public RelationshipRoleSourceType<T> removeAllDescription() {
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
	// Element type : ejb-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public RelationshipRoleSourceType<T> setEjbName(String ejbName) {
		childNode.getOrCreate("ejb-name").text(ejbName);
		return this;
	}

	public RelationshipRoleSourceType<T> removeEjbName() {
		childNode.remove("ejb-name");
		return this;
	}

	public String getEjbName() {
		return childNode.textValue("ejb-name");
	}

}
