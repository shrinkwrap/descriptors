package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.Date;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface TimerType<T> extends Child<T>
{
   public TimerType<T> setDescription(String description);

   public String getDescription();

   public TimerScheduleType<TimerType<T>> setSchedule(TimerScheduleType<T> schedule);

   public TimerScheduleType<TimerType<T>> getSchedule();

   public TimerType<T> setStart(Date start);

   public Date getStart();

   public TimerType<T> setEnd(Date end);

   public Date getEnd();

   public NamedMethodType<TimerType<T>> setTimeoutMethod(NamedMethodType<T> timeoutMethod);

   public NamedMethodType<TimerType<T>> getTimeoutMethod();

   public TimerType<T> setPersistent(Boolean persistent);

   public Boolean getPersistent();

   public TimerType<T> setTimezone(String timezone);

   public String getTimezone();

   public TimerType<T> setInfo(String info);

   public String getInfo();
}
