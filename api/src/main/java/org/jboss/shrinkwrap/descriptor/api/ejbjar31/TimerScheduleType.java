package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface TimerScheduleType<T> extends Child<T>
{
   public TimerScheduleType<T> setSecond(String second);

   public String getSecond();

   public TimerScheduleType<T> setMinute(String minute);

   public String getMinute();

   public TimerScheduleType<T> setHour(String hour);

   public String getHour();

   public TimerScheduleType<T> setDayOfMonth(String dayOfMonth);

   public String getDayOfMonth();

   public TimerScheduleType<T> setMonth(String month);

   public String getMonth();

   public TimerScheduleType<T> setDayOfWeek(String dayOfWeek);

   public String getDayOfWeek();

   public TimerScheduleType<T> setYear(String year);

   public String getYear();
}
