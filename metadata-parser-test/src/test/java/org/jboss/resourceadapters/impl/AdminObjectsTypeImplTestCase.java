package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.resourceadapters.api.AdminObjectsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.AdminObjectType;
import org.jboss.resourceadapters.impl.AdminObjectTypeImpl;

public class AdminObjectsTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectsType<TestDescriptorImpl> type = new AdminObjectsTypeImpl<TestDescriptorImpl>(provider, "admin-objectsType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testAdminObject() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectsType<TestDescriptorImpl> type = new AdminObjectsTypeImpl<TestDescriptorImpl>(provider, "admin-objectsType", provider.getRootNode());
      type.createAdminObject().up();
      type.createAdminObject().up();
      assertTrue(type.getAllAdminObject().size() == 2);
      type.removeAllAdminObject();
      assertTrue(type.getAllAdminObject().size() == 0);
   }
}
