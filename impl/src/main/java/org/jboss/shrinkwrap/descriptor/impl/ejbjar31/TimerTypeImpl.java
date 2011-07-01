package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The timerType specifies an enterprise bean timer. Each
 * timer is automatically created by the container upon
 * deployment. Timer callbacks occur based on the
 * schedule attributes. All callbacks are made to the
 * timeout-method associated with the timer.
 *
 * A timer can have an optional start and/or end date. If
 * a start date is specified, it takes precedence over the
 * associated timer schedule such that any matching
 * expirations prior to the start time will not occur.
 * Likewise, no matching expirations will occur after any
 * end date. Start/End dates are specified using the
 * XML Schema dateTime type, which follows the ISO-8601
 * standard for date(and optional time-within-the-day)
 * representation.
 *
 * An optional flag can be used to control whether
 * this timer has persistent(true) delivery semantics or
 * non-persistent(false) delivery semantics. If not specified,
 * the value defaults to persistent(true).
 *
 * A time zone can optionally be associated with a timer.
 * If specified, the timer's schedule is evaluated in the context
 * of that time zone, regardless of the default time zone in which
 * the container is executing. Time zones are specified as an
 * ID string. The set of required time zone IDs is defined by
 * the Zone Name(TZ) column of the public domain zoneinfo database.
 *
 * An optional info string can be assigned to the timer and
 * retrieved at runtime through the Timer.getInfo() method.
 *
 * The timerType can only be specified on stateless session
 * beans, singleton session beans, and message-driven beans.
 *
 *
 *
 */
public class TimerTypeImpl<T> implements Child<T>, TimerType<T>
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

   public TimerTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public TimerTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public TimerType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public TimerType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : schedule
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerType<T> removeSchedule()
   {
      childNode.remove("schedule");
      return this;
   }

   public TimerScheduleType<TimerType<T>> schedule()
   {
      Node node = childNode.getOrCreate("schedule");
      TimerScheduleType<TimerType<T>> schedule = new TimerScheduleTypeImpl<TimerType<T>>(this, "schedule", childNode,
            node);
      return schedule;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : start
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerType<T> setStart(java.util.Date start)
   {
      childNode.getOrCreate("start").text(XMLDate.toXMLFormat(start));
      return this;
   }

   public TimerType<T> removeStart()
   {
      childNode.remove("start");
      return this;
   }

   public java.util.Date getStart()
   {
      return XMLDate.toDate(childNode.textValue("start"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : end
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerType<T> setEnd(java.util.Date end)
   {
      childNode.getOrCreate("end").text(XMLDate.toXMLFormat(end));
      return this;
   }

   public TimerType<T> removeEnd()
   {
      childNode.remove("end");
      return this;
   }

   public java.util.Date getEnd()
   {
      return XMLDate.toDate(childNode.textValue("end"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : timeout-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerType<T> removeTimeoutMethod()
   {
      childNode.remove("timeout-method");
      return this;
   }

   public NamedMethodType<TimerType<T>> timeoutMethod()
   {
      Node node = childNode.getOrCreate("timeout-method");
      NamedMethodType<TimerType<T>> timeoutMethod = new NamedMethodTypeImpl<TimerType<T>>(this, "timeout-method",
            childNode, node);
      return timeoutMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistent
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerType<T> setPersistent(Boolean persistent)
   {
      childNode.getOrCreate("persistent").text(persistent);
      return this;
   }

   public TimerType<T> removePersistent()
   {
      childNode.remove("persistent");
      return this;
   }

   public Boolean isPersistent()
   {
      return Strings.isTrue(childNode.textValue("persistent"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : timezone
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerType<T> setTimezone(String timezone)
   {
      childNode.getOrCreate("timezone").text(timezone);
      return this;
   }

   public TimerType<T> removeTimezone()
   {
      childNode.remove("timezone");
      return this;
   }

   public String getTimezone()
   {
      return childNode.textValue("timezone");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : info
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TimerType<T> setInfo(String info)
   {
      childNode.getOrCreate("info").text(info);
      return this;
   }

   public TimerType<T> removeInfo()
   {
      childNode.remove("info");
      return this;
   }

   public String getInfo()
   {
      return childNode.textValue("info");
   }

}
