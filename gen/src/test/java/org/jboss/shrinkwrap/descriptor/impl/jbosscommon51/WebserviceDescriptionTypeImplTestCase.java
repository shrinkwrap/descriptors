package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.WebserviceDescriptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class WebserviceDescriptionTypeImplTestCase
{   
   @Test
   public void testWebserviceDescriptionName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(provider, "webservice-descriptionType", provider.getRootNode());
      type.setWebserviceDescriptionName("test");
      assertEquals(type.getWebserviceDescriptionName(), "test");
      type.removeWebserviceDescriptionName();
      assertNull(type.getWebserviceDescriptionName());
   }

   
   @Test
   public void testConfigName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(provider, "webservice-descriptionType", provider.getRootNode());
      type.setConfigName("test");
      assertEquals(type.getConfigName(), "test");
      type.removeConfigName();
      assertNull(type.getConfigName());
   }

   
   @Test
   public void testConfigFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(provider, "webservice-descriptionType", provider.getRootNode());
      type.setConfigFile("test");
      assertEquals(type.getConfigFile(), "test");
      type.removeConfigFile();
      assertNull(type.getConfigFile());
   }

   
   @Test
   public void testWsdlPublishLocation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(provider, "webservice-descriptionType", provider.getRootNode());
      type.setWsdlPublishLocation("test");
      assertEquals(type.getWsdlPublishLocation(), "test");
      type.removeWsdlPublishLocation();
      assertNull(type.getWsdlPublishLocation());
   }
}
