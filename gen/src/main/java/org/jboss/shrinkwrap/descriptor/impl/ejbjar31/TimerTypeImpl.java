package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class TimerTypeImpl<T> implements Child<T>, TimerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private TimerScheduleType<TimerType<T>> schedule;
   private java.util.Date start;
   private java.util.Date end;
   private NamedMethodType<TimerType<T>> timeoutMethod;
   private Boolean persistent;
   private String timezone;
   private String info;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public TimerTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("timer");   }


   public T up()
   {
      return t;
   }



   public TimerType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public TimerType<T> setSchedule(TimerScheduleType<TimerType<T>> schedule)
   {
      this.schedule = schedule;
      childNode.getOrCreate("schedule").text(schedule);
      return this;
   }

   public TimerScheduleType<TimerType<T>> getSchedule()
   {
      if( schedule == null)
      {
          schedule = new TimerScheduleTypeImpl<TimerType<T>>(this, "", childNode);
      }
      return schedule;
   }




   public TimerType<T> setStart(java.util.Date start)
   {
      this.start = start;
      childNode.getOrCreate("start").text(start);
      return this;
   }

   public java.util.Date getStart()
   {
      return start;
   }



   public TimerType<T> setEnd(java.util.Date end)
   {
      this.end = end;
      childNode.getOrCreate("end").text(end);
      return this;
   }

   public java.util.Date getEnd()
   {
      return end;
   }



   public TimerType<T> setTimeoutMethod(NamedMethodType<TimerType<T>> timeoutMethod)
   {
      this.timeoutMethod = timeoutMethod;
      childNode.getOrCreate("timeout-method").text(timeoutMethod);
      return this;
   }

   public NamedMethodType<TimerType<T>> getTimeoutMethod()
   {
      if( timeoutMethod == null)
      {
          timeoutMethod = new NamedMethodTypeImpl<TimerType<T>>(this, "", childNode);
      }
      return timeoutMethod;
   }




   public TimerType<T> setPersistent(Boolean persistent)
   {
      this.persistent = persistent;
      childNode.getOrCreate("persistent").text(persistent);
      return this;
   }

   public Boolean getPersistent()
   {
      return persistent;
   }



   public TimerType<T> setTimezone(String timezone)
   {
      this.timezone = timezone;
      childNode.getOrCreate("timezone").text(timezone);
      return this;
   }

   public String getTimezone()
   {
      return timezone;
   }



   public TimerType<T> setInfo(String info)
   {
      this.info = info;
      childNode.getOrCreate("info").text(info);
      return this;
   }

   public String getInfo()
   {
      return info;
   }

}
