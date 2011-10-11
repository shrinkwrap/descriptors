package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.ValidationType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class ValidationTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testBackgroundValidation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.backgroundValidation(true);
      assertTrue(type.isBackgroundValidation());
      type.removeBackgroundValidation();
      assertFalse(type.isBackgroundValidation());
   }

   
   @Test
   public void testBackgroundValidationMillis() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.backgroundValidationMillis(8);
      assertTrue(type.getBackgroundValidationMillis() == 8);
      type.removeBackgroundValidationMillis();
      assertNull(type.getBackgroundValidationMillis());
   }

   
   @Test
   public void testUseFastFail() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.useFastFail(true);
      assertTrue(type.isUseFastFail());
      type.removeUseFastFail();
      assertFalse(type.isUseFastFail());
   }
}
