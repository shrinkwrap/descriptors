package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

public class ListenerTypeImplTestCase
{   
   @Test
   public void testListenerClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ListenerType<TestDescriptorImpl> type = new ListenerTypeImpl<TestDescriptorImpl>(provider, "listenerType", provider.getRootNode());
      type.setListenerClass("test");
      assertEquals(type.getListenerClass(), "test");
      type.removeListenerClass();
      assertNull(type.getListenerClass());
   }
}
