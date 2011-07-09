package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 */
public class TimerScheduleTypeImpl<T> implements Child<T>, TimerScheduleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public TimerScheduleTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public TimerScheduleTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : second
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerScheduleType<T> setSecond(String second)
   {
      childNode.getOrCreate("second").text(second);
      return this;
   }

   public TimerScheduleType<T> removeSecond()
   {
      childNode.remove("second");
      return this;
   }

   public String getSecond()
   {
      return childNode.textValue("second");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : minute
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerScheduleType<T> setMinute(String minute)
   {
      childNode.getOrCreate("minute").text(minute);
      return this;
   }

   public TimerScheduleType<T> removeMinute()
   {
      childNode.remove("minute");
      return this;
   }

   public String getMinute()
   {
      return childNode.textValue("minute");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : hour
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerScheduleType<T> setHour(String hour)
   {
      childNode.getOrCreate("hour").text(hour);
      return this;
   }

   public TimerScheduleType<T> removeHour()
   {
      childNode.remove("hour");
      return this;
   }

   public String getHour()
   {
      return childNode.textValue("hour");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : day-of-month
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerScheduleType<T> setDayOfMonth(String dayOfMonth)
   {
      childNode.getOrCreate("day-of-month").text(dayOfMonth);
      return this;
   }

   public TimerScheduleType<T> removeDayOfMonth()
   {
      childNode.remove("day-of-month");
      return this;
   }

   public String getDayOfMonth()
   {
      return childNode.textValue("day-of-month");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : month
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerScheduleType<T> setMonth(String month)
   {
      childNode.getOrCreate("month").text(month);
      return this;
   }

   public TimerScheduleType<T> removeMonth()
   {
      childNode.remove("month");
      return this;
   }

   public String getMonth()
   {
      return childNode.textValue("month");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : day-of-week
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerScheduleType<T> setDayOfWeek(String dayOfWeek)
   {
      childNode.getOrCreate("day-of-week").text(dayOfWeek);
      return this;
   }

   public TimerScheduleType<T> removeDayOfWeek()
   {
      childNode.remove("day-of-week");
      return this;
   }

   public String getDayOfWeek()
   {
      return childNode.textValue("day-of-week");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : year
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerScheduleType<T> setYear(String year)
   {
      childNode.getOrCreate("year").text(year);
      return this;
   }

   public TimerScheduleType<T> removeYear()
   {
      childNode.remove("year");
      return this;
   }

   public String getYear()
   {
      return childNode.textValue("year");
   }

}
