package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefTypeType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The ejb-local-ref element is used to give the
 * jndi-name of an external ejb reference. In the case of an external ejb
 * reference, you don't provide a ejb-link element in ejb-jar.xml, but you
 * provide a jndi-name in jboss.xml
 * 
 */
public class EjbLocalRefTypeImpl<T> implements Child<T>, EjbLocalRefType<T> {
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

	public EjbLocalRefTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public EjbLocalRefTypeImpl(T t, String nodeName, Node node, Node childNode) {
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
	public EjbLocalRefType<T> setJndiName(String jndiName) {
		childNode.getOrCreate("jndi-name").text(jndiName);
		return this;
	}

	public EjbLocalRefType<T> removeJndiName() {
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
	public EjbLocalRefType<T> setMappedName(String mappedName) {
		childNode.getOrCreate("mapped-name").text(mappedName);
		return this;
	}

	public EjbLocalRefType<T> removeMappedName() {
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
	public EjbLocalRefType<T> removeAllInjectionTarget() {
		childNode.remove("injection-target");
		return this;
	}

	public InjectionTargetType<EjbLocalRefType<T>> injectionTarget() {
		return new InjectionTargetTypeImpl<EjbLocalRefType<T>>(this,
				"injection-target", childNode);
	}

	public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList() {
		List<InjectionTargetType<EjbLocalRefType<T>>> list = new ArrayList<InjectionTargetType<EjbLocalRefType<T>>>();
		List<Node> nodeList = childNode.get("injection-target");
		for (Node node : nodeList) {
			InjectionTargetType<EjbLocalRefType<T>> type = new InjectionTargetTypeImpl<EjbLocalRefType<T>>(
					this, "injection-target", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ignore-dependency
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbLocalRefType<T> ignoreDependency() {
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
	public EjbLocalRefType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public EjbLocalRefType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public EjbLocalRefType<T> removeAllDescription() {
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
	public EjbLocalRefType<T> setEjbRefName(String ejbRefName) {
		childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
		return this;
	}

	public EjbLocalRefType<T> removeEjbRefName() {
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
	public EjbLocalRefType<T> setEjbRefType(EjbRefTypeType ejbRefType) {
		childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
		return this;
	}

	public EjbLocalRefType<T> setEjbRefType(String ejbRefType) {
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
	// Element type : local-home
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbLocalRefType<T> setLocalHome(String localHome) {
		childNode.getOrCreate("local-home").text(localHome);
		return this;
	}

	public EjbLocalRefType<T> removeLocalHome() {
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
	public EjbLocalRefType<T> setLocal(String local) {
		childNode.getOrCreate("local").text(local);
		return this;
	}

	public EjbLocalRefType<T> removeLocal() {
		childNode.remove("local");
		return this;
	}

	public String getLocal() {
		return childNode.textValue("local");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-link
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbLocalRefType<T> setEjbLink(String ejbLink) {
		childNode.getOrCreate("ejb-link").text(ejbLink);
		return this;
	}

	public EjbLocalRefType<T> removeEjbLink() {
		childNode.remove("ejb-link");
		return this;
	}

	public String getEjbLink() {
		return childNode.textValue("ejb-link");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : local-jndi-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbLocalRefType<T> setLocalJndiName(String localJndiName) {
		childNode.getOrCreate("local-jndi-name").text(localJndiName);
		return this;
	}

	public EjbLocalRefType<T> removeLocalJndiName() {
		childNode.remove("local-jndi-name");
		return this;
	}

	public String getLocalJndiName() {
		return childNode.textValue("local-jndi-name");
	}

}
