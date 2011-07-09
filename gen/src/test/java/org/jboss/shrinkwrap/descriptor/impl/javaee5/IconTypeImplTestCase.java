package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class IconTypeImplTestCase
{   
   @Test
   public void testSmallIcon() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      IconType<TestDescriptorImpl> type = new IconTypeImpl<TestDescriptorImpl>(provider, "iconType", provider.getRootNode());
      type.setSmallIcon("test");
      assertEquals(type.getSmallIcon(), "test");
      type.removeSmallIcon();
      assertNull(type.getSmallIcon());
   }

   
   @Test
   public void testLargeIcon() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      IconType<TestDescriptorImpl> type = new IconTypeImpl<TestDescriptorImpl>(provider, "iconType", provider.getRootNode());
      type.setLargeIcon("test");
      assertEquals(type.getLargeIcon(), "test");
      type.removeLargeIcon();
      assertNull(type.getLargeIcon());
   }
}
