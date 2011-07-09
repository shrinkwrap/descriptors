package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ApplicationExceptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ApplicationExceptionTypeImplTestCase
{   
   @Test
   public void testExceptionClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationExceptionType<TestDescriptorImpl> type = new ApplicationExceptionTypeImpl<TestDescriptorImpl>(provider, "application-exceptionType", provider.getRootNode());
      type.setExceptionClass("test");
      assertEquals(type.getExceptionClass(), "test");
      type.removeExceptionClass();
      assertNull(type.getExceptionClass());
   }

   
   @Test
   public void testRollback() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationExceptionType<TestDescriptorImpl> type = new ApplicationExceptionTypeImpl<TestDescriptorImpl>(provider, "application-exceptionType", provider.getRootNode());
      type.setRollback(true);
      assertTrue(type.isRollback());
   }
}
