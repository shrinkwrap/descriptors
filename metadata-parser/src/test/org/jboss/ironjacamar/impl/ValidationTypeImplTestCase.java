package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.ValidationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
      type.getOrCreateBackgroundValidation().up();
      type.removeBackgroundValidation();
      assertNull(provider.getRootNode().getSingle("background-validation"));
   }

   
   @Test
   public void testUseFastFail() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ValidationType<TestDescriptorImpl> type = new ValidationTypeImpl<TestDescriptorImpl>(provider, "validationType", provider.getRootNode());
      type.getOrCreateUseFastFail().up();
      type.removeUseFastFail();
      assertNull(provider.getRootNode().getSingle("use-fast-fail"));
   }
}
