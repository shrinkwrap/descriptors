package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.TaglibTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.JspPropertyGroupTypeImpl;

public class JspConfigTypeImplTestCase
{   
   @Test
   public void testTaglib() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspConfigType<TestDescriptorImpl> type = new JspConfigTypeImpl<TestDescriptorImpl>(provider, "jsp-configType", provider.getRootNode());
      type.taglib().up();
      type.taglib().up();
      assertTrue(type.getTaglibList().size() == 2);
      type.removeAllTaglib();
      assertTrue(type.getTaglibList().size() == 0);
   }

   
   @Test
   public void testJspPropertyGroup() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspConfigType<TestDescriptorImpl> type = new JspConfigTypeImpl<TestDescriptorImpl>(provider, "jsp-configType", provider.getRootNode());
      type.jspPropertyGroup().up();
      type.jspPropertyGroup().up();
      assertTrue(type.getJspPropertyGroupList().size() == 2);
      type.removeAllJspPropertyGroup();
      assertTrue(type.getJspPropertyGroupList().size() == 0);
   }
}
