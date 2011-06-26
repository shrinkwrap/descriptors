package org.jboss.shrinkwrap.descriptor.gen;

import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;

public class TestDescriptorImpl extends NodeProviderImplBase
{
   private Node model;

   public TestDescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("some-app"));
   }

   public TestDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
   }

   public Node getRootNode()
   {
      return model;
   }

   protected DescriptorExporter getExporter()
   {
      return new XMLExporter();
   }
}
