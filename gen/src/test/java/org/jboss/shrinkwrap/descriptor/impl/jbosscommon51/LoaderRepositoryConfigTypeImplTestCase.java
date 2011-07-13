package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class LoaderRepositoryConfigTypeImplTestCase
{   
   @Test
   public void testConfigParserClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoaderRepositoryConfigType<TestDescriptorImpl> type = new LoaderRepositoryConfigTypeImpl<TestDescriptorImpl>(provider, "loader-repository-configType", provider.getRootNode());
      type.setConfigParserClass("test");
      assertEquals(type.getConfigParserClass(), "test");
      type.removeConfigParserClass();
      assertNull(type.getConfigParserClass());
   }
}
