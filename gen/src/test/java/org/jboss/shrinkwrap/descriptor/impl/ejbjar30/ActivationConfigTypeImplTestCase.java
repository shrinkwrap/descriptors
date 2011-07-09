package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ActivationConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ActivationConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.ActivationConfigPropertyTypeImpl;

public class ActivationConfigTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ActivationConfigType<TestDescriptorImpl> type = new ActivationConfigTypeImpl<TestDescriptorImpl>(provider, "activation-configType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }

   
   @Test
   public void testActivationConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ActivationConfigType<TestDescriptorImpl> type = new ActivationConfigTypeImpl<TestDescriptorImpl>(provider, "activation-configType", provider.getRootNode());
      type.activationConfigProperty().up();
      type.activationConfigProperty().up();
      assertTrue(type.getActivationConfigPropertyList().size() == 2);
      type.removeAllActivationConfigProperty();
      assertTrue(type.getActivationConfigPropertyList().size() == 0);
   }
}
