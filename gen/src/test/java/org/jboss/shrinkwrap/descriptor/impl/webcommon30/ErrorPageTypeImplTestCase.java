package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ErrorPageTypeImplTestCase
{   
   @Test
   public void testLocation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ErrorPageType<TestDescriptorImpl> type = new ErrorPageTypeImpl<TestDescriptorImpl>(provider, "error-pageType", provider.getRootNode());
      type.setLocation("test");
      assertEquals(type.getLocation(), "test");
      type.removeLocation();
      assertNull(type.getLocation());
   }

   
   @Test
   public void testErrorCode() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ErrorPageType<TestDescriptorImpl> type = new ErrorPageTypeImpl<TestDescriptorImpl>(provider, "error-pageType", provider.getRootNode());
      type.setErrorCode(8);
      assertTrue(type.getErrorCode() == 8);
   }

   
   @Test
   public void testExceptionType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ErrorPageType<TestDescriptorImpl> type = new ErrorPageTypeImpl<TestDescriptorImpl>(provider, "error-pageType", provider.getRootNode());
      type.setExceptionType("test");
      assertEquals(type.getExceptionType(), "test");
      type.removeExceptionType();
      assertNull(type.getExceptionType());
   }
}
