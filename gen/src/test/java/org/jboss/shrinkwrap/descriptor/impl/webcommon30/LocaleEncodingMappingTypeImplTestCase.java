package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class LocaleEncodingMappingTypeImplTestCase
{   
   @Test
   public void testLocale() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LocaleEncodingMappingType<TestDescriptorImpl> type = new LocaleEncodingMappingTypeImpl<TestDescriptorImpl>(provider, "locale-encoding-mappingType", provider.getRootNode());
      type.setLocale("test");
      assertEquals(type.getLocale(), "test");
      type.removeLocale();
      assertNull(type.getLocale());
   }

   
   @Test
   public void testEncoding() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LocaleEncodingMappingType<TestDescriptorImpl> type = new LocaleEncodingMappingTypeImpl<TestDescriptorImpl>(provider, "locale-encoding-mappingType", provider.getRootNode());
      type.setEncoding("test");
      assertEquals(type.getEncoding(), "test");
      type.removeEncoding();
      assertNull(type.getEncoding());
   }
}
