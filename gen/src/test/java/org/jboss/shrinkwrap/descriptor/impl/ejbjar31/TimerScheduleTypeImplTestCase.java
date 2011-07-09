package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class TimerScheduleTypeImplTestCase
{   
   @Test
   public void testSecond() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerScheduleType<TestDescriptorImpl> type = new TimerScheduleTypeImpl<TestDescriptorImpl>(provider, "timer-scheduleType", provider.getRootNode());
      type.setSecond("test");
      assertEquals(type.getSecond(), "test");
      type.removeSecond();
      assertNull(type.getSecond());
   }

   
   @Test
   public void testMinute() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerScheduleType<TestDescriptorImpl> type = new TimerScheduleTypeImpl<TestDescriptorImpl>(provider, "timer-scheduleType", provider.getRootNode());
      type.setMinute("test");
      assertEquals(type.getMinute(), "test");
      type.removeMinute();
      assertNull(type.getMinute());
   }

   
   @Test
   public void testHour() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerScheduleType<TestDescriptorImpl> type = new TimerScheduleTypeImpl<TestDescriptorImpl>(provider, "timer-scheduleType", provider.getRootNode());
      type.setHour("test");
      assertEquals(type.getHour(), "test");
      type.removeHour();
      assertNull(type.getHour());
   }

   
   @Test
   public void testDayOfMonth() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerScheduleType<TestDescriptorImpl> type = new TimerScheduleTypeImpl<TestDescriptorImpl>(provider, "timer-scheduleType", provider.getRootNode());
      type.setDayOfMonth("test");
      assertEquals(type.getDayOfMonth(), "test");
      type.removeDayOfMonth();
      assertNull(type.getDayOfMonth());
   }

   
   @Test
   public void testMonth() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerScheduleType<TestDescriptorImpl> type = new TimerScheduleTypeImpl<TestDescriptorImpl>(provider, "timer-scheduleType", provider.getRootNode());
      type.setMonth("test");
      assertEquals(type.getMonth(), "test");
      type.removeMonth();
      assertNull(type.getMonth());
   }

   
   @Test
   public void testDayOfWeek() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerScheduleType<TestDescriptorImpl> type = new TimerScheduleTypeImpl<TestDescriptorImpl>(provider, "timer-scheduleType", provider.getRootNode());
      type.setDayOfWeek("test");
      assertEquals(type.getDayOfWeek(), "test");
      type.removeDayOfWeek();
      assertNull(type.getDayOfWeek());
   }

   
   @Test
   public void testYear() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerScheduleType<TestDescriptorImpl> type = new TimerScheduleTypeImpl<TestDescriptorImpl>(provider, "timer-scheduleType", provider.getRootNode());
      type.setYear("test");
      assertEquals(type.getYear(), "test");
      type.removeYear();
      assertNull(type.getYear());
   }
}
