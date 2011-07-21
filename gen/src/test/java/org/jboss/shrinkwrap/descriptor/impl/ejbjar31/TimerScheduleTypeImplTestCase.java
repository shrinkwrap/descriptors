/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class TimerScheduleTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimerScheduleType<TestDescriptorImpl> type = new TimerScheduleTypeImpl<TestDescriptorImpl>(provider, "timer-scheduleType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
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
