package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class MultipartConfigTypeImplTestCase
{   
   @Test
   public void testLocation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider, "multipart-configType", provider.getRootNode());
      type.setLocation("test");
      assertEquals(type.getLocation(), "test");
      type.removeLocation();
      assertNull(type.getLocation());
   }

   
   @Test
   public void testMaxFileSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider, "multipart-configType", provider.getRootNode());
      type.setMaxFileSize(8L);
      assertTrue(type.getMaxFileSize() == 8L);
   }

   
   @Test
   public void testMaxRequestSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider, "multipart-configType", provider.getRootNode());
      type.setMaxRequestSize(8L);
      assertTrue(type.getMaxRequestSize() == 8L);
   }

   
   @Test
   public void testFileSizeThreshold() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider, "multipart-configType", provider.getRootNode());
      type.setFileSizeThreshold(8);
      assertTrue(type.getFileSizeThreshold() == 8);
   }
}
