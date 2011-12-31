package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.ConnectionDefinitionsType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ConnectionDefintionType;
import org.jboss.ironjacamar.impl.ConnectionDefintionTypeImpl;

public class ConnectionDefinitionsTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefinitionsType<TestDescriptorImpl> type = new ConnectionDefinitionsTypeImpl<TestDescriptorImpl>(provider, "connection-definitionsType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testConnectionDefinition() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefinitionsType<TestDescriptorImpl> type = new ConnectionDefinitionsTypeImpl<TestDescriptorImpl>(provider, "connection-definitionsType", provider.getRootNode());
      type.createConnectionDefinition().up();
      type.createConnectionDefinition().up();
      assertTrue(type.getAllConnectionDefinition().size() == 2);
      type.removeAllConnectionDefinition();
      assertTrue(type.getAllConnectionDefinition().size() == 0);
   }
}
