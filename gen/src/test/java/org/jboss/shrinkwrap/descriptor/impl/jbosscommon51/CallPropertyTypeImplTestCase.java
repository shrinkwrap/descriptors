package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.CallPropertyType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class CallPropertyTypeImplTestCase
{   
   @Test
   public void testPropName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CallPropertyType<TestDescriptorImpl> type = new CallPropertyTypeImpl<TestDescriptorImpl>(provider, "call-propertyType", provider.getRootNode());
      type.setPropName("test");
      assertEquals(type.getPropName(), "test");
      type.removePropName();
      assertNull(type.getPropName());
   }

   
   @Test
   public void testPropValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CallPropertyType<TestDescriptorImpl> type = new CallPropertyTypeImpl<TestDescriptorImpl>(provider, "call-propertyType", provider.getRootNode());
      type.setPropValue("test");
      assertEquals(type.getPropValue(), "test");
      type.removePropValue();
      assertNull(type.getPropValue());
   }
}
