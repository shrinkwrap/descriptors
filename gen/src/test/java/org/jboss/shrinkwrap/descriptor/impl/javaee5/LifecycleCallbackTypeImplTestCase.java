package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class LifecycleCallbackTypeImplTestCase
{   
   @Test
   public void testLifecycleCallbackClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LifecycleCallbackType<TestDescriptorImpl> type = new LifecycleCallbackTypeImpl<TestDescriptorImpl>(provider, "lifecycle-callbackType", provider.getRootNode());
      type.setLifecycleCallbackClass("test");
      assertEquals(type.getLifecycleCallbackClass(), "test");
      type.removeLifecycleCallbackClass();
      assertNull(type.getLifecycleCallbackClass());
   }

   
   @Test
   public void testLifecycleCallbackMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LifecycleCallbackType<TestDescriptorImpl> type = new LifecycleCallbackTypeImpl<TestDescriptorImpl>(provider, "lifecycle-callbackType", provider.getRootNode());
      type.setLifecycleCallbackMethod("test");
      assertEquals(type.getLifecycleCallbackMethod(), "test");
      type.removeLifecycleCallbackMethod();
      assertNull(type.getLifecycleCallbackMethod());
   }
}
