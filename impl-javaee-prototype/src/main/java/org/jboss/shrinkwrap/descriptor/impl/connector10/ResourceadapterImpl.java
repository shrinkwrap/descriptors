package org.jboss.shrinkwrap.descriptor.impl.connector10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty;
import org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> resourceadapter </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ResourceadapterImpl implements Resourceadapter, ChildNodeInitializer {
	private boolean isDetached = true;
	private Node detachedNode;
	private Node childNode;	

	public void initialize(String nodeName, Node node) {
		if (isDetached) {
			if (detachedNode != null) {	
				childNode = node.createChild(nodeName);
				Node.copyFromTo(detachedNode, childNode); // setters already called
			} else {
				childNode = node.createChild(nodeName); // just created no setters called
			}
			isDetached = false;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void assign(String nodeName, Node node) {
		childNode = node;
		isDetached = false;
	}

	/**
	 * Creates a new <code>config-property</code> element
	 * 
	 * @return the new created instance of <code>ConfigProperty</code>
	 */
	public Resourceadapter addConfigProperty(ConfigProperty configProperty) {
		if (configProperty instanceof ChildNodeInitializer) {
			((ChildNodeInitializer)configProperty).initialize("config-property", getNode());
		}
		return this;
	}

	/**
	 * Returns all <code>config-property</code> elements
	 * 
	 * @return list of <code>config-property</code>
	 */
	public List<ConfigProperty> getAllConfigProperty() {
		List<ConfigProperty> list = new ArrayList<ConfigProperty>();
		List<Node> nodeList = childNode.get("config-property");
		for (Node node : nodeList) {
			ConfigPropertyImpl type = new ConfigPropertyImpl();
			type.assign("config-property", getNode());
			list.add(type);
		}
		return list;
	}

	/**
	 * Removes all <code>config-property</code> elements
	 * 
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public Resourceadapter removeAllConfigProperty() {
		getNode().removeChildren("config-property");
		return this;
	}

	private Node getNode() {		
		if (!isDetached) {
			return childNode;
		} 
		
		if (detachedNode == null) {
			detachedNode = new Node("DetachedNode");
		}
		
		return detachedNode;
	}
}
