package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebResourceCollectionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class WebResourceCollectionTypeImplTestCase
{   
   @Test
   public void testWebResourceName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(provider, "web-resource-collectionType", provider.getRootNode());
      type.setWebResourceName("test");
      assertEquals(type.getWebResourceName(), "test");
      type.removeWebResourceName();
      assertNull(type.getWebResourceName());
   }

   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(provider, "web-resource-collectionType", provider.getRootNode());
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
   public void testUrlPattern() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(provider, "web-resource-collectionType", provider.getRootNode());
      type.setUrlPattern("value1");
      type.setUrlPattern("value2");
      type.setUrlPatternList("value3", "value4");
      assertTrue(type.getUrlPatternList().size() == 4);
      assertEquals(type.getUrlPatternList().get(0), "value1");
      assertEquals(type.getUrlPatternList().get(1), "value2");
      assertEquals(type.getUrlPatternList().get(2), "value3");
      assertEquals(type.getUrlPatternList().get(3), "value4");
      type.removeAllUrlPattern();
      assertTrue(type.getUrlPatternList().size() == 0);
   }

   
   @Test
   public void testHttpMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(provider, "web-resource-collectionType", provider.getRootNode());
      type.setHttpMethod("value1");
      type.setHttpMethod("value2");
      type.setHttpMethodList("value3", "value4");
      assertTrue(type.getHttpMethodList().size() == 4);
      assertEquals(type.getHttpMethodList().get(0), "value1");
      assertEquals(type.getHttpMethodList().get(1), "value2");
      assertEquals(type.getHttpMethodList().get(2), "value3");
      assertEquals(type.getHttpMethodList().get(3), "value4");
      type.removeAllHttpMethod();
      assertTrue(type.getHttpMethodList().size() == 0);
   }

   
   @Test
   public void testHttpMethodOmission() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(provider, "web-resource-collectionType", provider.getRootNode());
      type.setHttpMethodOmission("value1");
      type.setHttpMethodOmission("value2");
      type.setHttpMethodOmissionList("value3", "value4");
      assertTrue(type.getHttpMethodOmissionList().size() == 4);
      assertEquals(type.getHttpMethodOmissionList().get(0), "value1");
      assertEquals(type.getHttpMethodOmissionList().get(1), "value2");
      assertEquals(type.getHttpMethodOmissionList().get(2), "value3");
      assertEquals(type.getHttpMethodOmissionList().get(3), "value4");
      type.removeAllHttpMethodOmission();
      assertTrue(type.getHttpMethodOmissionList().size() == 0);
   }
}
