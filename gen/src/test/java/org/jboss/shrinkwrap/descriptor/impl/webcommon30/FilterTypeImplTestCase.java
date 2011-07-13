package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

public class FilterTypeImplTestCase
{   
   @Test
   public void testFilterName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterType<TestDescriptorImpl> type = new FilterTypeImpl<TestDescriptorImpl>(provider, "filterType", provider.getRootNode());
      type.setFilterName("test");
      assertEquals(type.getFilterName(), "test");
      type.removeFilterName();
      assertNull(type.getFilterName());
   }

   
   @Test
   public void testFilterClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterType<TestDescriptorImpl> type = new FilterTypeImpl<TestDescriptorImpl>(provider, "filterType", provider.getRootNode());
      type.setFilterClass("test");
      assertEquals(type.getFilterClass(), "test");
      type.removeFilterClass();
      assertNull(type.getFilterClass());
   }

   
   @Test
   public void testAsyncSupported() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterType<TestDescriptorImpl> type = new FilterTypeImpl<TestDescriptorImpl>(provider, "filterType", provider.getRootNode());
      type.setAsyncSupported(true);
      assertTrue(type.isAsyncSupported());
   }

   
   @Test
   public void testInitParam() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterType<TestDescriptorImpl> type = new FilterTypeImpl<TestDescriptorImpl>(provider, "filterType", provider.getRootNode());
      type.initParam().up();
      type.initParam().up();
      assertTrue(type.getInitParamList().size() == 2);
      type.removeAllInitParam();
      assertTrue(type.getInitParamList().size() == 0);
   }
}
