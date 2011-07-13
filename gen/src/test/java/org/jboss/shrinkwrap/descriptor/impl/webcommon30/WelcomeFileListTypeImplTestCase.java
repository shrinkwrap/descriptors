package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class WelcomeFileListTypeImplTestCase
{   
   @Test
   public void testWelcomeFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WelcomeFileListType<TestDescriptorImpl> type = new WelcomeFileListTypeImpl<TestDescriptorImpl>(provider, "welcome-file-listType", provider.getRootNode());
      type.setWelcomeFile("value1");
      type.setWelcomeFile("value2");
      type.setWelcomeFileList("value3", "value4");
      assertTrue(type.getWelcomeFileList().size() == 4);
      assertEquals(type.getWelcomeFileList().get(0), "value1");
      assertEquals(type.getWelcomeFileList().get(1), "value2");
      assertEquals(type.getWelcomeFileList().get(2), "value3");
      assertEquals(type.getWelcomeFileList().get(3), "value4");
      type.removeAllWelcomeFile();
      assertTrue(type.getWelcomeFileList().size() == 0);
   }
}
