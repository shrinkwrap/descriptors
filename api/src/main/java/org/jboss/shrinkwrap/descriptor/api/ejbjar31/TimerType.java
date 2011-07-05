package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
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
public interface TimerType<T> extends Child<T>
{

   public TimerType<T> setDescription(String description);

   public TimerType<T> setDescriptionList(String... values);

   public TimerType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public TimerType<T> removeSchedule();

   public TimerScheduleType<TimerType<T>> schedule();

   public TimerType<T> setStart(java.util.Date start);

   public TimerType<T> removeStart();

   public java.util.Date getStart();

   public TimerType<T> setEnd(java.util.Date end);

   public TimerType<T> removeEnd();

   public java.util.Date getEnd();

   public TimerType<T> removeTimeoutMethod();

   public NamedMethodType<TimerType<T>> timeoutMethod();

   public TimerType<T> setPersistent(Boolean persistent);

   public TimerType<T> removePersistent();

   public Boolean isPersistent();

   public TimerType<T> setTimezone(String timezone);

   public TimerType<T> removeTimezone();

   public String getTimezone();

   public TimerType<T> setInfo(String info);

   public TimerType<T> removeInfo();

   public String getInfo();

}
