package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface TimerScheduleType<T> extends Child<T>
{
   public TimerScheduleType<T> setSecond(String second);

   @NodeInfo(xmlName = "second")
   public String getSecond();

   public TimerScheduleType<T> setMinute(String minute);

   @NodeInfo(xmlName = "minute")
   public String getMinute();

   public TimerScheduleType<T> setHour(String hour);

   @NodeInfo(xmlName = "hour")
   public String getHour();

   public TimerScheduleType<T> setDayOfMonth(String dayOfMonth);

   @NodeInfo(xmlName = "day-of-month")
   public String getDayOfMonth();

   public TimerScheduleType<T> setMonth(String month);

   @NodeInfo(xmlName = "month")
   public String getMonth();

   public TimerScheduleType<T> setDayOfWeek(String dayOfWeek);

   @NodeInfo(xmlName = "day-of-week")
   public String getDayOfWeek();

   public TimerScheduleType<T> setYear(String year);

   @NodeInfo(xmlName = "year")
   public String getYear();
}
