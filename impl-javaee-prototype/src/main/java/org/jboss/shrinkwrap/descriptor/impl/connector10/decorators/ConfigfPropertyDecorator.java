package org.jboss.shrinkwrap.descriptor.impl.connector10.decorators;

import org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty;
import org.jboss.shrinkwrap.descriptor.impl.connector10.ChildNodeInitializer;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;


public abstract class ConfigfPropertyDecorator implements ConfigProperty, ChildNodeInitializer {
	protected ConfigProperty configProperty;
	protected Node childNode;
	 
    public ConfigfPropertyDecorator (ConfigProperty configProperty) {
        this.configProperty = configProperty;
    }
    
    public void initialize(String nodeName, Node node) {
		this.childNode = node.createChild(nodeName);
	}
	
	public void assign(String nodeName, Node node) {
		this.childNode = node;
	}
}
