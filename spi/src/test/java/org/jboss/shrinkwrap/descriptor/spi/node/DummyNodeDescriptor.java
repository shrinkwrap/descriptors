package org.jboss.shrinkwrap.descriptor.spi.node;

import org.jboss.shrinkwrap.descriptor.api.formatter.Formatter;
import org.jboss.shrinkwrap.descriptor.api.formatter.Formatters;

public class DummyNodeDescriptor extends NodeDescriptorImplBase {

    private Node node;

    public DummyNodeDescriptor(String descriptorName) {
        this(descriptorName, new Node("dummy"));
    }

    public DummyNodeDescriptor(String descriptorName, Node node) {
        super(descriptorName);
        this.node = node;
    }

    @Override
    public Node getRootNode() {
        return node;
    }

	@Override
	public String toString(boolean verbose) {
		return Formatters.XML.format(this);
	}

	@Override
	public String toString(Formatter formatter) throws IllegalArgumentException {
		return formatter.format(this);
	}
}
