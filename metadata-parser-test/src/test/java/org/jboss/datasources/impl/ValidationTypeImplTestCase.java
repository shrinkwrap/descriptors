package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.ValidationType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.ExtensionType;
import org.jboss.datasources.impl.ExtensionTypeImpl;
import org.jboss.datasources.api.ExtensionType;
import org.jboss.datasources.impl.ExtensionTypeImpl;
import org.jboss.datasources.api.ExtensionType;
import org.jboss.datasources.impl.ExtensionTypeImpl;

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
   public void testValidConnectionChecker() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.getOrCreateValidConnectionChecker().up();
      type.removeValidConnectionChecker();
      assertNull(provider.getRootNode().getSingle("valid-connection-checker"));
   }

   
   @Test
   public void testCheckValidConnectionSql() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.checkValidConnectionSql("test");
      assertEquals(type.getCheckValidConnectionSql(), "test");
      type.removeCheckValidConnectionSql();
      assertNull(type.getCheckValidConnectionSql());
   }

   
   @Test
   public void testValidateOnMatch() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.validateOnMatch(true);
      assertTrue(type.isValidateOnMatch());
      type.removeValidateOnMatch();
      assertFalse(type.isValidateOnMatch());
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

   
   @Test
   public void testStaleConnectionChecker() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.getOrCreateStaleConnectionChecker().up();
      type.removeStaleConnectionChecker();
      assertNull(provider.getRootNode().getSingle("stale-connection-checker"));
   }

   
   @Test
   public void testExceptionSorter() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.getOrCreateExceptionSorter().up();
      type.removeExceptionSorter();
      assertNull(provider.getRootNode().getSingle("exception-sorter"));
   }
}
