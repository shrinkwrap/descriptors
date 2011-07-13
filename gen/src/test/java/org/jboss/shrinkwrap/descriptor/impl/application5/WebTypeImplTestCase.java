package org.jboss.shrinkwrap.descriptor.impl.application5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.application5.WebType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class WebTypeImplTestCase
{   
   @Test
   public void testWebUri() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebType<TestDescriptorImpl> type = new WebTypeImpl<TestDescriptorImpl>(provider, "webType", provider.getRootNode());
      type.setWebUri("test");
      assertEquals(type.getWebUri(), "test");
      type.removeWebUri();
      assertNull(type.getWebUri());
   }

   
   @Test
   public void testContextRoot() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebType<TestDescriptorImpl> type = new WebTypeImpl<TestDescriptorImpl>(provider, "webType", provider.getRootNode());
      type.setContextRoot("test");
      assertEquals(type.getContextRoot(), "test");
      type.removeContextRoot();
      assertNull(type.getContextRoot());
   }
}
