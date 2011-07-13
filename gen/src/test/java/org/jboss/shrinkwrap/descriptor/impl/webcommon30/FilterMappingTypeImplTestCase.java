package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.DispatcherType;

public class FilterMappingTypeImplTestCase
{   
   @Test
   public void testFilterName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider, "filter-mappingType", provider.getRootNode());
      type.setFilterName("test");
      assertEquals(type.getFilterName(), "test");
      type.removeFilterName();
      assertNull(type.getFilterName());
   }

   
   @Test
   public void testDispatcher() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider, "filter-mappingType", provider.getRootNode());
      for(DispatcherType e: DispatcherType.values())
      {
         type.setDispatcher(e);
         assertEquals(type.getDispatcher(), e);
         type.setDispatcher(e.toString());
         assertEquals(type.getDispatcherAsString(), e.toString());
      }
   }

   
   @Test
   public void testUrlPattern() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider, "filter-mappingType", provider.getRootNode());
      type.setUrlPattern("test");
      assertEquals(type.getUrlPattern(), "test");
      type.removeUrlPattern();
      assertNull(type.getUrlPattern());
   }

   
   @Test
   public void testServletName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider, "filter-mappingType", provider.getRootNode());
      type.setServletName("test");
      assertEquals(type.getServletName(), "test");
      type.removeServletName();
      assertNull(type.getServletName());
   }
}
