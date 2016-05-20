package org.jboss.shrinkwrap.descriptor.impl.connector10;

import org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> config-property </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConfigPropertyImpl implements ConfigProperty, ChildNodeInitializer {
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
	 * Sets the <code>config-property-value</code> element
	 * 
	 * @param configPropertyValue
	 *            the value for the element <code>config-property-value</code>
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public ConfigProperty configPropertyValue(String configPropertyValue) {
		getNode().getOrCreate("config-property-value").text(configPropertyValue);
		return this;
	}

	/**
	 * Returns the <code>config-property-value</code> element
	 * 
	 * @return the node defined for the element
	 *         <code>config-property-value</code>
	 */
	public String getConfigPropertyValue() {
		return getNode().getTextValueForPatternName("config-property-value");
	}

	/**
	 * Removes the <code>config-property-value</code> element
	 * 
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public ConfigProperty removeConfigPropertyValue() {
		getNode().removeChildren("config-property-value");
		return this;
	}

	/**
	 * Sets the <code>description</code> element
	 * 
	 * @param description
	 *            the value for the element <code>description</code>
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public ConfigProperty description(String description) {
		getNode().getOrCreate("description").text(description);
		return this;
	}

	/**
	 * Returns the <code>description</code> element
	 * 
	 * @return the node defined for the element <code>description</code>
	 */
	public String getDescription() {
		return getNode().getTextValueForPatternName("description");
	}

	/**
	 * Removes the <code>description</code> element
	 * 
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public ConfigProperty removeDescription() {
		getNode().removeChildren("description");
		return this;
	}

	/**
	 * Sets the <code>config-property-name</code> element
	 * 
	 * @param configPropertyName
	 *            the value for the element <code>config-property-name</code>
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public ConfigProperty configPropertyName(String configPropertyName) {
		getNode().getOrCreate("config-property-name").text(configPropertyName);
		return this;
	}

	/**
	 * Returns the <code>config-property-name</code> element
	 * 
	 * @return the node defined for the element
	 *         <code>config-property-name</code>
	 */
	public String getConfigPropertyName() {
		return getNode().getTextValueForPatternName("config-property-name");
	}

	/**
	 * Removes the <code>config-property-name</code> element
	 * 
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public ConfigProperty removeConfigPropertyName() {
		getNode().removeChildren("config-property-name");
		return this;
	}

	/**
	 * Sets the <code>config-property-type</code> element
	 * 
	 * @param configPropertyType
	 *            the value for the element <code>config-property-type</code>
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public ConfigProperty configPropertyType(String configPropertyType) {
		getNode().getOrCreate("config-property-type").text(configPropertyType);
		return this;
	}

	/**
	 * Returns the <code>config-property-type</code> element
	 * 
	 * @return the node defined for the element
	 *         <code>config-property-type</code>
	 */
	public String getConfigPropertyType() {
		return getNode().getTextValueForPatternName("config-property-type");
	}

	/**
	 * Removes the <code>config-property-type</code> element
	 * 
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public ConfigProperty removeConfigPropertyType() {
		getNode().removeChildren("config-property-type");
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
