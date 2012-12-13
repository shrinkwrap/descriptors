package org.jboss.shrinkwrap.descriptor.spi.node;

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
}
