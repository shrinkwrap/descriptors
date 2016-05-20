package org.jboss.shrinkwrap.descriptor.impl.connector10;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;

public interface ChildNodeInitializer {
	
	public void initialize(String nodeName, Node node);

	public void assign(String nodeName, Node node);
}
