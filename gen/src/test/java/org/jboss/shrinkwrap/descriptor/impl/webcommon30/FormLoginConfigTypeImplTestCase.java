package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class FormLoginConfigTypeImplTestCase
{   
   @Test
   public void testFormLoginPage() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FormLoginConfigType<TestDescriptorImpl> type = new FormLoginConfigTypeImpl<TestDescriptorImpl>(provider, "form-login-configType", provider.getRootNode());
      type.setFormLoginPage("test");
      assertEquals(type.getFormLoginPage(), "test");
      type.removeFormLoginPage();
      assertNull(type.getFormLoginPage());
   }

   
   @Test
   public void testFormErrorPage() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FormLoginConfigType<TestDescriptorImpl> type = new FormLoginConfigTypeImpl<TestDescriptorImpl>(provider, "form-login-configType", provider.getRootNode());
      type.setFormErrorPage("test");
      assertEquals(type.getFormErrorPage(), "test");
      type.removeFormErrorPage();
      assertNull(type.getFormErrorPage());
   }
}
