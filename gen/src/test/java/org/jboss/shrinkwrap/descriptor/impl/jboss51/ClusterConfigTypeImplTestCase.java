package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ClusterConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ClusterConfigTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ClusterConfigType<TestDescriptorImpl> type = new ClusterConfigTypeImpl<TestDescriptorImpl>(provider, "cluster-configType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }

   
   @Test
   public void testPartitionName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ClusterConfigType<TestDescriptorImpl> type = new ClusterConfigTypeImpl<TestDescriptorImpl>(provider, "cluster-configType", provider.getRootNode());
      type.setPartitionName("test");
      assertEquals(type.getPartitionName(), "test");
      type.removePartitionName();
      assertNull(type.getPartitionName());
   }

   
   @Test
   public void testHomeLoadBalancePolicy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ClusterConfigType<TestDescriptorImpl> type = new ClusterConfigTypeImpl<TestDescriptorImpl>(provider, "cluster-configType", provider.getRootNode());
      type.setHomeLoadBalancePolicy("test");
      assertEquals(type.getHomeLoadBalancePolicy(), "test");
      type.removeHomeLoadBalancePolicy();
      assertNull(type.getHomeLoadBalancePolicy());
   }

   
   @Test
   public void testSessionStateManagerJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ClusterConfigType<TestDescriptorImpl> type = new ClusterConfigTypeImpl<TestDescriptorImpl>(provider, "cluster-configType", provider.getRootNode());
      type.setSessionStateManagerJndiName("test");
      assertEquals(type.getSessionStateManagerJndiName(), "test");
      type.removeSessionStateManagerJndiName();
      assertNull(type.getSessionStateManagerJndiName());
   }

   
   @Test
   public void testBeanLoadBalancePolicy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ClusterConfigType<TestDescriptorImpl> type = new ClusterConfigTypeImpl<TestDescriptorImpl>(provider, "cluster-configType", provider.getRootNode());
      type.setBeanLoadBalancePolicy("test");
      assertEquals(type.getBeanLoadBalancePolicy(), "test");
      type.removeBeanLoadBalancePolicy();
      assertNull(type.getBeanLoadBalancePolicy());
   }

   
   @Test
   public void testLoadBalancePolicy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ClusterConfigType<TestDescriptorImpl> type = new ClusterConfigTypeImpl<TestDescriptorImpl>(provider, "cluster-configType", provider.getRootNode());
      type.setLoadBalancePolicy("test");
      assertEquals(type.getLoadBalancePolicy(), "test");
      type.removeLoadBalancePolicy();
      assertNull(type.getLoadBalancePolicy());
   }
}
