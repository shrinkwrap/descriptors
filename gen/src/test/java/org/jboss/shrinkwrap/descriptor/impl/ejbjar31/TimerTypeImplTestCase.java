package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.TimerScheduleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.NamedMethodTypeImpl;

public class TimerTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerType<TestDescriptorImpl> type = new TimerTypeImpl<TestDescriptorImpl>(provider, "timerType", provider.getRootNode());
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
   public void testSchedule() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerType<TestDescriptorImpl> type = new TimerTypeImpl<TestDescriptorImpl>(provider, "timerType", provider.getRootNode());
      type.schedule().up();
      type.removeSchedule();
      assertNull(provider.getRootNode().getSingle("schedule"));
   }

   
   @Test
   public void testStart() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerType<TestDescriptorImpl> type = new TimerTypeImpl<TestDescriptorImpl>(provider, "timerType", provider.getRootNode());
      java.util.Date testDate = new java.util.Date();
      type.setStart(testDate);
      assertEquals(type.getStart(), testDate);
   }

   
   @Test
   public void testEnd() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerType<TestDescriptorImpl> type = new TimerTypeImpl<TestDescriptorImpl>(provider, "timerType", provider.getRootNode());
      java.util.Date testDate = new java.util.Date();
      type.setEnd(testDate);
      assertEquals(type.getEnd(), testDate);
   }

   
   @Test
   public void testTimeoutMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerType<TestDescriptorImpl> type = new TimerTypeImpl<TestDescriptorImpl>(provider, "timerType", provider.getRootNode());
      type.timeoutMethod().up();
      type.removeTimeoutMethod();
      assertNull(provider.getRootNode().getSingle("timeout-method"));
   }

   
   @Test
   public void testPersistent() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerType<TestDescriptorImpl> type = new TimerTypeImpl<TestDescriptorImpl>(provider, "timerType", provider.getRootNode());
      type.setPersistent(true);
      assertTrue(type.isPersistent());
   }

   
   @Test
   public void testTimezone() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerType<TestDescriptorImpl> type = new TimerTypeImpl<TestDescriptorImpl>(provider, "timerType", provider.getRootNode());
      type.setTimezone("test");
      assertEquals(type.getTimezone(), "test");
      type.removeTimezone();
      assertNull(type.getTimezone());
   }

   
   @Test
   public void testInfo() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerType<TestDescriptorImpl> type = new TimerTypeImpl<TestDescriptorImpl>(provider, "timerType", provider.getRootNode());
      type.setInfo("test");
      assertEquals(type.getInfo(), "test");
      type.removeInfo();
      assertNull(type.getInfo());
   }
}
