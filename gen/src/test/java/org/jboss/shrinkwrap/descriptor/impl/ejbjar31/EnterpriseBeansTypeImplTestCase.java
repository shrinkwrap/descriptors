package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.SessionBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.EntityBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.MessageDrivenBeanTypeImpl;

public class EnterpriseBeansTypeImplTestCase
{   
   @Test
   public void testSession() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      type.session().up();
      type.session().up();
      assertTrue(type.getSessionList().size() == 2);
      type.removeAllSession();
      assertTrue(type.getSessionList().size() == 0);
   }

   
   @Test
   public void testEntity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      type.entity().up();
      type.entity().up();
      assertTrue(type.getEntityList().size() == 2);
      type.removeAllEntity();
      assertTrue(type.getEntityList().size() == 0);
   }

   
   @Test
   public void testMessageDriven() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      type.messageDriven().up();
      type.messageDriven().up();
      assertTrue(type.getMessageDrivenList().size() == 2);
      type.removeAllMessageDriven();
      assertTrue(type.getMessageDrivenList().size() == 0);
   }
}
