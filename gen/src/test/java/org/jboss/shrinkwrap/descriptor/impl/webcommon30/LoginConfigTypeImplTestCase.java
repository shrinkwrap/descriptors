package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FormLoginConfigTypeImpl;

public class LoginConfigTypeImplTestCase
{   
   @Test
   public void testAuthMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoginConfigType<TestDescriptorImpl> type = new LoginConfigTypeImpl<TestDescriptorImpl>(provider, "login-configType", provider.getRootNode());
      type.setAuthMethod("test");
      assertEquals(type.getAuthMethod(), "test");
      type.removeAuthMethod();
      assertNull(type.getAuthMethod());
   }

   
   @Test
   public void testRealmName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoginConfigType<TestDescriptorImpl> type = new LoginConfigTypeImpl<TestDescriptorImpl>(provider, "login-configType", provider.getRootNode());
      type.setRealmName("test");
      assertEquals(type.getRealmName(), "test");
      type.removeRealmName();
      assertNull(type.getRealmName());
   }

   
   @Test
   public void testFormLoginConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoginConfigType<TestDescriptorImpl> type = new LoginConfigTypeImpl<TestDescriptorImpl>(provider, "login-configType", provider.getRootNode());
      type.formLoginConfig().up();
      type.removeFormLoginConfig();
      assertNull(provider.getRootNode().getSingle("form-login-config"));
   }
}
