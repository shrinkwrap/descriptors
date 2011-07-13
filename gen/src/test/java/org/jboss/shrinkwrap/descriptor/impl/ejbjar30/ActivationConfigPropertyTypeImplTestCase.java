package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ActivationConfigPropertyType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ActivationConfigPropertyTypeImplTestCase
{   
   @Test
   public void testActivationConfigPropertyName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ActivationConfigPropertyType<TestDescriptorImpl> type = new ActivationConfigPropertyTypeImpl<TestDescriptorImpl>(provider, "activation-config-propertyType", provider.getRootNode());
      type.setActivationConfigPropertyName("test");
      assertEquals(type.getActivationConfigPropertyName(), "test");
      type.removeActivationConfigPropertyName();
      assertNull(type.getActivationConfigPropertyName());
   }

   
   @Test
   public void testActivationConfigPropertyValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ActivationConfigPropertyType<TestDescriptorImpl> type = new ActivationConfigPropertyTypeImpl<TestDescriptorImpl>(provider, "activation-config-propertyType", provider.getRootNode());
      type.setActivationConfigPropertyValue("test");
      assertEquals(type.getActivationConfigPropertyValue(), "test");
      type.removeActivationConfigPropertyValue();
      assertNull(type.getActivationConfigPropertyValue());
   }
}
