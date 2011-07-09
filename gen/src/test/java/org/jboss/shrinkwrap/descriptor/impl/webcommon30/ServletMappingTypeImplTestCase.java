package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ServletMappingTypeImplTestCase
{   
   @Test
   public void testServletName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletMappingType<TestDescriptorImpl> type = new ServletMappingTypeImpl<TestDescriptorImpl>(provider, "servlet-mappingType", provider.getRootNode());
      type.setServletName("test");
      assertEquals(type.getServletName(), "test");
      type.removeServletName();
      assertNull(type.getServletName());
   }

   
   @Test
   public void testUrlPattern() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletMappingType<TestDescriptorImpl> type = new ServletMappingTypeImpl<TestDescriptorImpl>(provider, "servlet-mappingType", provider.getRootNode());
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
}
