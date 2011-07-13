package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.WebserviceDescriptionType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.WebserviceDescriptionTypeImpl;

public class WebservicesTypeImplTestCase
{   
   @Test
   public void testContextRoot() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebservicesType<TestDescriptorImpl> type = new WebservicesTypeImpl<TestDescriptorImpl>(provider, "webservicesType", provider.getRootNode());
      type.setContextRoot("test");
      assertEquals(type.getContextRoot(), "test");
      type.removeContextRoot();
      assertNull(type.getContextRoot());
   }

   
   @Test
   public void testWebserviceDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebservicesType<TestDescriptorImpl> type = new WebservicesTypeImpl<TestDescriptorImpl>(provider, "webservicesType", provider.getRootNode());
      type.webserviceDescription().up();
      type.webserviceDescription().up();
      assertTrue(type.getWebserviceDescriptionList().size() == 2);
      type.removeAllWebserviceDescription();
      assertTrue(type.getWebserviceDescriptionList().size() == 0);
   }
}
