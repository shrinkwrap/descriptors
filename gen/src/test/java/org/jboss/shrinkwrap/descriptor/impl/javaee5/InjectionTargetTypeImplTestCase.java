package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class InjectionTargetTypeImplTestCase
{   
   @Test
   public void testInjectionTargetClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InjectionTargetType<TestDescriptorImpl> type = new InjectionTargetTypeImpl<TestDescriptorImpl>(provider, "injection-targetType", provider.getRootNode());
      type.setInjectionTargetClass("test");
      assertEquals(type.getInjectionTargetClass(), "test");
      type.removeInjectionTargetClass();
      assertNull(type.getInjectionTargetClass());
   }

   
   @Test
   public void testInjectionTargetName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InjectionTargetType<TestDescriptorImpl> type = new InjectionTargetTypeImpl<TestDescriptorImpl>(provider, "injection-targetType", provider.getRootNode());
      type.setInjectionTargetName("test");
      assertEquals(type.getInjectionTargetName(), "test");
      type.removeInjectionTargetName();
      assertNull(type.getInjectionTargetName());
   }
}
