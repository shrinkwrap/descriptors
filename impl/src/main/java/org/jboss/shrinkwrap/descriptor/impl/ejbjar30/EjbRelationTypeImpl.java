package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbRelationType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The ejb-relationType describes a relationship between two entity beans with
 * container-managed persistence. It is used by ejb-relation elements. It
 * contains a description; an optional ejb-relation-name element; and exactly
 * two relationship role declarations, defined by the ejb-relationship-role
 * elements. The name of the relationship, if specified, is unique within the
 * ejb-jar file.
 * 
 * 
 * 
 */
public class EjbRelationTypeImpl<T> implements Child<T>, EjbRelationType<T> {
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

	public EjbRelationTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public EjbRelationTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public EjbRelationType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public EjbRelationType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public EjbRelationType<T> removeAllDescription() {
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
	// Element type : ejb-relation-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRelationType<T> setEjbRelationName(String ejbRelationName) {
		childNode.getOrCreate("ejb-relation-name").text(ejbRelationName);
		return this;
	}

	public EjbRelationType<T> removeEjbRelationName() {
		childNode.remove("ejb-relation-name");
		return this;
	}

	public String getEjbRelationName() {
		return childNode.textValue("ejb-relation-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-relationship-role
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRelationType<T> removeEjbRelationshipRole() {
		childNode.remove("ejb-relationship-role");
		return this;
	}

	public EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole() {
		Node node = childNode.getOrCreate("ejb-relationship-role");
		EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole = new EjbRelationshipRoleTypeImpl<EjbRelationType<T>>(
				this, "ejb-relationship-role", childNode, node);
		return ejbRelationshipRole;
	}

}
