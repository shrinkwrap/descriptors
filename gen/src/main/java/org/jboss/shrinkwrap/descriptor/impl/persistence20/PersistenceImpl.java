package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Persistence;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 */
public class PersistenceImpl<T> implements Child<T>, Persistence<T> {
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

	public PersistenceImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public PersistenceImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-unit
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public Persistence<T> removeAllPersistenceUnit() {
		childNode.remove("persistence-unit");
		return this;
	}

	public PersistenceUnit<Persistence<T>> persistenceUnit() {
		return new PersistenceUnitImpl<Persistence<T>>(this,
				"persistence-unit", childNode);
	}

	public List<PersistenceUnit<Persistence<T>>> getPersistenceUnitList() {
		List<PersistenceUnit<Persistence<T>>> list = new ArrayList<PersistenceUnit<Persistence<T>>>();
		List<Node> nodeList = childNode.get("persistence-unit");
		for (Node node : nodeList) {
			PersistenceUnit<Persistence<T>> type = new PersistenceUnitImpl<Persistence<T>>(
					this, "persistence-unit", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public Persistence<T> setVersion(String version) {
		childNode.attribute("version", version);
		return this;
	}

	public Persistence<T> removeVersion() {
		childNode.attributes().remove("version");
		return this;
	}

	public String getVersion() {
		return childNode.attributes().get("version");
	}

}
