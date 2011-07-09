package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryConfigType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LoaderRepositoryConfigTypeImpl;

public class LoaderRepositoryTypeImplTestCase
{   
   @Test
   public void testLoaderRepositoryConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoaderRepositoryType<TestDescriptorImpl> type = new LoaderRepositoryTypeImpl<TestDescriptorImpl>(provider, "loader-repositoryType", provider.getRootNode());
      type.loaderRepositoryConfig().up();
      type.loaderRepositoryConfig().up();
      assertTrue(type.getLoaderRepositoryConfigList().size() == 2);
      type.removeAllLoaderRepositoryConfig();
      assertTrue(type.getLoaderRepositoryConfigList().size() == 0);
   }

   
   @Test
   public void testLoaderRepositoryClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoaderRepositoryType<TestDescriptorImpl> type = new LoaderRepositoryTypeImpl<TestDescriptorImpl>(provider, "loader-repositoryType", provider.getRootNode());
      type.setLoaderRepositoryClass("test");
      assertEquals(type.getLoaderRepositoryClass(), "test");
      type.removeLoaderRepositoryClass();
      assertNull(type.getLoaderRepositoryClass());
   }
}
