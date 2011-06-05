package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface TimerType<T> extends Child<T>
{

   public TimerType<T> setDescription(String description);
   public String getDescription();


   public TimerType<T> setSchedule(TimerScheduleType<TimerType<T>> schedule);
   public TimerScheduleType<TimerType<T>> getSchedule();



   public TimerType<T> setStart(java.util.Date start);
   public java.util.Date getStart();


   public TimerType<T> setEnd(java.util.Date end);
   public java.util.Date getEnd();


   public TimerType<T> setTimeoutMethod(NamedMethodType<TimerType<T>> timeoutMethod);
   public NamedMethodType<TimerType<T>> getTimeoutMethod();



   public TimerType<T> setPersistent(Boolean persistent);
   public Boolean getPersistent();


   public TimerType<T> setTimezone(String timezone);
   public String getTimezone();


   public TimerType<T> setInfo(String info);
   public String getInfo();
}
