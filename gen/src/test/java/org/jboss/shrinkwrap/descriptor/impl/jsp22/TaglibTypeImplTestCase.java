package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class TaglibTypeImplTestCase
{   
   @Test
   public void testTaglibUri() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TaglibType<TestDescriptorImpl> type = new TaglibTypeImpl<TestDescriptorImpl>(provider, "taglibType", provider.getRootNode());
      type.setTaglibUri("test");
      assertEquals(type.getTaglibUri(), "test");
      type.removeTaglibUri();
      assertNull(type.getTaglibUri());
   }

   
   @Test
   public void testTaglibLocation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TaglibType<TestDescriptorImpl> type = new TaglibTypeImpl<TestDescriptorImpl>(provider, "taglibType", provider.getRootNode());
      type.setTaglibLocation("test");
      assertEquals(type.getTaglibLocation(), "test");
      type.removeTaglibLocation();
      assertNull(type.getTaglibLocation());
   }
}
