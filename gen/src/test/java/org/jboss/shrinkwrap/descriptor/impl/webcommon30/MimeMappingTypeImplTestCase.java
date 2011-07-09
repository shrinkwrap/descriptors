package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class MimeMappingTypeImplTestCase
{   
   @Test
   public void testExtension() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MimeMappingType<TestDescriptorImpl> type = new MimeMappingTypeImpl<TestDescriptorImpl>(provider, "mime-mappingType", provider.getRootNode());
      type.setExtension("test");
      assertEquals(type.getExtension(), "test");
      type.removeExtension();
      assertNull(type.getExtension());
   }

   
   @Test
   public void testMimeType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MimeMappingType<TestDescriptorImpl> type = new MimeMappingTypeImpl<TestDescriptorImpl>(provider, "mime-mappingType", provider.getRootNode());
      type.setMimeType("test");
      assertEquals(type.getMimeType(), "test");
      type.removeMimeType();
      assertNull(type.getMimeType());
   }
}
