package org.jboss.shrinkwrap.descriptor.impl.persistence20; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Properties;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Property;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.PropertyImpl;

public class PropertiesImplTestCase
{   
   @Test
   public void testProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      Properties<TestDescriptorImpl> type = new PropertiesImpl<TestDescriptorImpl>(provider, "properties", provider.getRootNode());
      type.property().up();
      type.property().up();
      assertTrue(type.getPropertyList().size() == 2);
      type.removeAllProperty();
      assertTrue(type.getPropertyList().size() == 0);
   }
}
