package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class TimerScheduleTypeImpl<T> implements Child<T>, TimerScheduleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String second;
   private String minute;
   private String hour;
   private String dayOfMonth;
   private String month;
   private String dayOfWeek;
   private String year;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public TimerScheduleTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("schedule");   }


   public T up()
   {
      return t;
   }



   public TimerScheduleType<T> setSecond(String second)
   {
      this.second = second;
      childNode.getOrCreate("second").text(second);
      return this;
   }

   public String getSecond()
   {
      return second;
   }



   public TimerScheduleType<T> setMinute(String minute)
   {
      this.minute = minute;
      childNode.getOrCreate("minute").text(minute);
      return this;
   }

   public String getMinute()
   {
      return minute;
   }



   public TimerScheduleType<T> setHour(String hour)
   {
      this.hour = hour;
      childNode.getOrCreate("hour").text(hour);
      return this;
   }

   public String getHour()
   {
      return hour;
   }



   public TimerScheduleType<T> setDayOfMonth(String dayOfMonth)
   {
      this.dayOfMonth = dayOfMonth;
      childNode.getOrCreate("day-of-month").text(dayOfMonth);
      return this;
   }

   public String getDayOfMonth()
   {
      return dayOfMonth;
   }



   public TimerScheduleType<T> setMonth(String month)
   {
      this.month = month;
      childNode.getOrCreate("month").text(month);
      return this;
   }

   public String getMonth()
   {
      return month;
   }



   public TimerScheduleType<T> setDayOfWeek(String dayOfWeek)
   {
      this.dayOfWeek = dayOfWeek;
      childNode.getOrCreate("day-of-week").text(dayOfWeek);
      return this;
   }

   public String getDayOfWeek()
   {
      return dayOfWeek;
   }



   public TimerScheduleType<T> setYear(String year)
   {
      this.year = year;
      childNode.getOrCreate("year").text(year);
      return this;
   }

   public String getYear()
   {
      return year;
   }

}
