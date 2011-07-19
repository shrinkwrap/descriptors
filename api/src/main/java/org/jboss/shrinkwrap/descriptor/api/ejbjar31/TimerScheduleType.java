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
package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> timer-scheduleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface TimerScheduleType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : second
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>second</code> element with the given value will be created.
    * Otherwise, the existing <code>second</code> element will be updated with the given value.
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> setSecond(String second);

   /**
    * Removes the <code>second</code> element 
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> removeSecond();

   /**
    * Returns the <code>second</code> element
    * @return the node defined for the element <code>second</code> 
    */
   public String getSecond();

   // -------------------------------------------------------------------------------------||
   // Element type : minute
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>minute</code> element with the given value will be created.
    * Otherwise, the existing <code>minute</code> element will be updated with the given value.
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> setMinute(String minute);

   /**
    * Removes the <code>minute</code> element 
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> removeMinute();

   /**
    * Returns the <code>minute</code> element
    * @return the node defined for the element <code>minute</code> 
    */
   public String getMinute();

   // -------------------------------------------------------------------------------------||
   // Element type : hour
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>hour</code> element with the given value will be created.
    * Otherwise, the existing <code>hour</code> element will be updated with the given value.
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> setHour(String hour);

   /**
    * Removes the <code>hour</code> element 
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> removeHour();

   /**
    * Returns the <code>hour</code> element
    * @return the node defined for the element <code>hour</code> 
    */
   public String getHour();

   // -------------------------------------------------------------------------------------||
   // Element type : day-of-month
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>day-of-month</code> element with the given value will be created.
    * Otherwise, the existing <code>day-of-month</code> element will be updated with the given value.
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> setDayOfMonth(String dayOfMonth);

   /**
    * Removes the <code>day-of-month</code> element 
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> removeDayOfMonth();

   /**
    * Returns the <code>day-of-month</code> element
    * @return the node defined for the element <code>day-of-month</code> 
    */
   public String getDayOfMonth();

   // -------------------------------------------------------------------------------------||
   // Element type : month
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>month</code> element with the given value will be created.
    * Otherwise, the existing <code>month</code> element will be updated with the given value.
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> setMonth(String month);

   /**
    * Removes the <code>month</code> element 
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> removeMonth();

   /**
    * Returns the <code>month</code> element
    * @return the node defined for the element <code>month</code> 
    */
   public String getMonth();

   // -------------------------------------------------------------------------------------||
   // Element type : day-of-week
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>day-of-week</code> element with the given value will be created.
    * Otherwise, the existing <code>day-of-week</code> element will be updated with the given value.
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> setDayOfWeek(String dayOfWeek);

   /**
    * Removes the <code>day-of-week</code> element 
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> removeDayOfWeek();

   /**
    * Returns the <code>day-of-week</code> element
    * @return the node defined for the element <code>day-of-week</code> 
    */
   public String getDayOfWeek();

   // -------------------------------------------------------------------------------------||
   // Element type : year
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>year</code> element with the given value will be created.
    * Otherwise, the existing <code>year</code> element will be updated with the given value.
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> setYear(String year);

   /**
    * Removes the <code>year</code> element 
    * @return the current instance of {@link TimerScheduleType<T>} 
    */
   public TimerScheduleType<T> removeYear();

   /**
    * Returns the <code>year</code> element
    * @return the node defined for the element <code>year</code> 
    */
   public String getYear();

}
