package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 */
public interface TimerScheduleType<T> extends Child<T>
{

   public TimerScheduleType<T> setSecond(String second);
   public TimerScheduleType<T> removeSecond();

   public String getSecond();



   public TimerScheduleType<T> setMinute(String minute);
   public TimerScheduleType<T> removeMinute();

   public String getMinute();



   public TimerScheduleType<T> setHour(String hour);
   public TimerScheduleType<T> removeHour();

   public String getHour();



   public TimerScheduleType<T> setDayOfMonth(String dayOfMonth);
   public TimerScheduleType<T> removeDayOfMonth();

   public String getDayOfMonth();



   public TimerScheduleType<T> setMonth(String month);
   public TimerScheduleType<T> removeMonth();

   public String getMonth();



   public TimerScheduleType<T> setDayOfWeek(String dayOfWeek);
   public TimerScheduleType<T> removeDayOfWeek();

   public String getDayOfWeek();



   public TimerScheduleType<T> setYear(String year);
   public TimerScheduleType<T> removeYear();

   public String getYear();

}
