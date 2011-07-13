package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefTypeType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The ejb-ref element is used to give the jndi-name of
 * an external ejb reference. In the case of an external ejb reference, you
 * don't provide a ejb-link element in ejb-jar.xml, but you provide a jndi-name
 * in jboss.xml Used in: entity, session, message-driven, consumer, and service
 * 
 */
public class EjbRefTypeImpl<T> implements Child<T>, EjbRefType<T> {
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

	public EjbRefTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public EjbRefTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> setJndiName(String jndiName) {
		childNode.getOrCreate("jndi-name").text(jndiName);
		return this;
	}

	public EjbRefType<T> removeJndiName() {
		childNode.remove("jndi-name");
		return this;
	}

	public String getJndiName() {
		return childNode.textValue("jndi-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : mapped-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public EjbRefType<T> removeMappedName() {
		childNode.remove("mapped-name");
		return this;
	}

	public String getMappedName() {
		return childNode.textValue("mapped-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : injection-target
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> removeAllInjectionTarget() {
		childNode.remove("injection-target");
		return this;
	}

	public InjectionTargetType<EjbRefType<T>> injectionTarget() {
		return new InjectionTargetTypeImpl<EjbRefType<T>>(this,
				"injection-target", childNode);
	}

	public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList() {
		List<InjectionTargetType<EjbRefType<T>>> list = new ArrayList<InjectionTargetType<EjbRefType<T>>>();
		List<Node> nodeList = childNode.get("injection-target");
		for (Node node : nodeList) {
			InjectionTargetType<EjbRefType<T>> type = new InjectionTargetTypeImpl<EjbRefType<T>>(
					this, "injection-target", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ignore-dependency
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> ignoreDependency() {
		childNode.getOrCreate("ignore-dependency");
		return this;
	}

	public Boolean isIgnoreDependency() {
		return childNode.getSingle("ignore-dependency") != null;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public EjbRefType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public EjbRefType<T> removeAllDescription() {
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
	// Element type : ejb-ref-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> setEjbRefName(String ejbRefName) {
		childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
		return this;
	}

	public EjbRefType<T> removeEjbRefName() {
		childNode.remove("ejb-ref-name");
		return this;
	}

	public String getEjbRefName() {
		return childNode.textValue("ejb-ref-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ref-type
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> setEjbRefType(EjbRefTypeType ejbRefType) {
		childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
		return this;
	}

	public EjbRefType<T> setEjbRefType(String ejbRefType) {
		childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
		return this;
	}

	public EjbRefTypeType getEjbRefType() {
		return EjbRefTypeType.getFromStringValue(childNode
				.textValue("ejb-ref-type"));
	}

	public String getEjbRefTypeAsString() {
		return childNode.textValue("ejb-ref-type");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : home
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> setHome(String home) {
		childNode.getOrCreate("home").text(home);
		return this;
	}

	public EjbRefType<T> removeHome() {
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
	public EjbRefType<T> setRemote(String remote) {
		childNode.getOrCreate("remote").text(remote);
		return this;
	}

	public EjbRefType<T> removeRemote() {
		childNode.remove("remote");
		return this;
	}

	public String getRemote() {
		return childNode.textValue("remote");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-link
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbRefType<T> setEjbLink(String ejbLink) {
		childNode.getOrCreate("ejb-link").text(ejbLink);
		return this;
	}

	public EjbRefType<T> removeEjbLink() {
		childNode.remove("ejb-link");
		return this;
	}

	public String getEjbLink() {
		return childNode.textValue("ejb-link");
	}

}
