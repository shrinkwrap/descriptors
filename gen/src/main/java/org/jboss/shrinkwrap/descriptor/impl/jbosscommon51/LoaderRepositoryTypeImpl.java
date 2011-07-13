package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryConfigType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The loader-repository specifies the name of the UnifiedLoaderRepository MBean
 * to use for the ear to provide ear level scoping of classes deployed in the
 * ear. It is a unique JMX ObjectName string. It may also specify an arbitrary
 * configuration by including a loader-repository-config element.
 * 
 * Examples:
 * <loader-repository>jboss.test:loader=cts-cmp2v1-sar.ear</loader-repository>
 * 
 * <loader-repository loaderRepositoryClass='dot.com.LoaderRepository'>
 * dot.com:loader=unique-archive-name <loader-repository-config
 * configParserClass='dot.com.LoaderParser'> java2ParentDelegaton=true
 * </loader-repository-config> </loader-repository> </loader-repository>
 * 
 * 
 * 
 */
public class LoaderRepositoryTypeImpl<T> implements Child<T>,
		LoaderRepositoryType<T> {
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

	public LoaderRepositoryTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public LoaderRepositoryTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : loader-repository-config
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public LoaderRepositoryType<T> removeAllLoaderRepositoryConfig() {
		childNode.remove("loader-repository-config");
		return this;
	}

	public LoaderRepositoryConfigType<LoaderRepositoryType<T>> loaderRepositoryConfig() {
		return new LoaderRepositoryConfigTypeImpl<LoaderRepositoryType<T>>(
				this, "loader-repository-config", childNode);
	}

	public List<LoaderRepositoryConfigType<LoaderRepositoryType<T>>> getLoaderRepositoryConfigList() {
		List<LoaderRepositoryConfigType<LoaderRepositoryType<T>>> list = new ArrayList<LoaderRepositoryConfigType<LoaderRepositoryType<T>>>();
		List<Node> nodeList = childNode.get("loader-repository-config");
		for (Node node : nodeList) {
			LoaderRepositoryConfigType<LoaderRepositoryType<T>> type = new LoaderRepositoryConfigTypeImpl<LoaderRepositoryType<T>>(
					this, "loader-repository-config", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : loaderRepositoryClass
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public LoaderRepositoryType<T> setLoaderRepositoryClass(
			String loaderRepositoryClass) {
		childNode.attribute("loaderRepositoryClass", loaderRepositoryClass);
		return this;
	}

	public LoaderRepositoryType<T> removeLoaderRepositoryClass() {
		childNode.attributes().remove("loaderRepositoryClass");
		return this;
	}

	public String getLoaderRepositoryClass() {
		return childNode.attributes().get("loaderRepositoryClass");
	}

}
