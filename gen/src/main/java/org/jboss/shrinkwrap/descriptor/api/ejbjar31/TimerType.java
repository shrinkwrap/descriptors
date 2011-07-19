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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> timerType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The timerType specifies an enterprise bean timer. Each <br> 
 * timer is automatically created by the container upon <br> 
 * deployment. Timer callbacks occur based on the <br> 
 * schedule attributes. All callbacks are made to the <br> 
 * timeout-method associated with the timer. <br> 
 *<br>
 * A timer can have an optional start and/or end date. If <br> 
 * a start date is specified, it takes precedence over the <br> 
 * associated timer schedule such that any matching <br> 
 * expirations prior to the start time will not occur. <br> 
 * Likewise, no matching expirations will occur after any <br> 
 * end date. Start/End dates are specified using the <br> 
 * XML Schema dateTime type, which follows the ISO-8601 <br> 
 * standard for date(and optional time-within-the-day) <br> 
 * representation. <br> 
 *<br>
 * An optional flag can be used to control whether <br> 
 * this timer has persistent(true) delivery semantics or <br> 
 * non-persistent(false) delivery semantics. If not specified, <br> 
 * the value defaults to persistent(true). <br> 
 *<br>
 * A time zone can optionally be associated with a timer. <br> 
 * If specified, the timer's schedule is evaluated in the context <br> 
 * of that time zone, regardless of the default time zone in which <br> 
 * the container is executing. Time zones are specified as an <br> 
 * ID string. The set of required time zone IDs is defined by <br> 
 * the Zone Name(TZ) column of the public domain zoneinfo database. <br> 
 *<br>
 * An optional info string can be assigned to the timer and <br> 
 * retrieved at runtime through the Timer.getInfo() method. <br> 
 *<br>
 * The timerType can only be specified on stateless session <br> 
 * beans, singleton session beans, and message-driven beans. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface TimerType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : schedule
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>schedule</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> removeSchedule();

   /**
    * If not already created, a new <code>schedule</code> element will be created and returned.
    * Otherwise, the existing <code>schedule</code> element will be returned.
    * @return the node defined for the element <code>schedule</code> 
    */
   public TimerScheduleType<TimerType<T>> schedule();

   // -------------------------------------------------------------------------------------||
   // Element type : start
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>start</code> element with the given value will be created.
    * Otherwise, the existing <code>start</code> element will be updated with the given value.
    * @param java.util.Date
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> setStart(java.util.Date start);

   /**
    * Removes the <code>start</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> removeStart();

   /**
    * Returns the <code>start</code> element
    * @return the node defined for the element <code>start</code> 
    */
   public java.util.Date getStart();

   // -------------------------------------------------------------------------------------||
   // Element type : end
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>end</code> element with the given value will be created.
    * Otherwise, the existing <code>end</code> element will be updated with the given value.
    * @param java.util.Date
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> setEnd(java.util.Date end);

   /**
    * Removes the <code>end</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> removeEnd();

   /**
    * Returns the <code>end</code> element
    * @return the node defined for the element <code>end</code> 
    */
   public java.util.Date getEnd();

   // -------------------------------------------------------------------------------------||
   // Element type : timeout-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> removeTimeoutMethod();

   /**
    * If not already created, a new <code>timeout-method</code> element will be created and returned.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return the node defined for the element <code>timeout-method</code> 
    */
   public NamedMethodType<TimerType<T>> timeoutMethod();

   // -------------------------------------------------------------------------------------||
   // Element type : persistent
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistent</code> element with the given value will be created.
    * Otherwise, the existing <code>persistent</code> element will be updated with the given value.
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> setPersistent(Boolean persistent);

   /**
    * Removes the <code>persistent</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> removePersistent();

   /**
    * Returns the <code>persistent</code> element
    * @return the node defined for the element <code>persistent</code> 
    */
   public Boolean isPersistent();

   // -------------------------------------------------------------------------------------||
   // Element type : timezone
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timezone</code> element with the given value will be created.
    * Otherwise, the existing <code>timezone</code> element will be updated with the given value.
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> setTimezone(String timezone);

   /**
    * Removes the <code>timezone</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> removeTimezone();

   /**
    * Returns the <code>timezone</code> element
    * @return the node defined for the element <code>timezone</code> 
    */
   public String getTimezone();

   // -------------------------------------------------------------------------------------||
   // Element type : info
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>info</code> element with the given value will be created.
    * Otherwise, the existing <code>info</code> element will be updated with the given value.
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> setInfo(String info);

   /**
    * Removes the <code>info</code> element 
    * @return the current instance of {@link TimerType<T>} 
    */
   public TimerType<T> removeInfo();

   /**
    * Returns the <code>info</code> element
    * @return the node defined for the element <code>info</code> 
    */
   public String getInfo();

}
