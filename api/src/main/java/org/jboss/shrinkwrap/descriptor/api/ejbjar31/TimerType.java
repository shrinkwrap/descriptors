package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface TimerType<T> extends Child<T>
{
   public TimerType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   @NodeInfo(xmlName = "schedule")
   public TimerScheduleType<TimerType<T>> schedule();

   public TimerType<T> setStart(java.util.Date start);

   @NodeInfo(xmlName = "start")
   public java.util.Date getStart();

   public TimerType<T> setEnd(java.util.Date end);

   @NodeInfo(xmlName = "end")
   public java.util.Date getEnd();

   @NodeInfo(xmlName = "timeout-method")
   public NamedMethodType<TimerType<T>> timeoutMethod();

   public TimerType<T> setPersistent(Boolean persistent);

   @NodeInfo(xmlName = "persistent")
   public Boolean getPersistent();

   public TimerType<T> setTimezone(String timezone);

   @NodeInfo(xmlName = "timezone")
   public String getTimezone();

   public TimerType<T> setInfo(String info);

   @NodeInfo(xmlName = "info")
   public String getInfo();
}
