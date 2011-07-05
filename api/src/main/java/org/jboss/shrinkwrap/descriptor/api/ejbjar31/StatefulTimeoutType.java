package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The stateful-timeoutType represents the amount of time
 * a stateful session bean can be idle(not receive any client
 * invocations) before it is eligible for removal by the container.
 *
 * A timeout value of 0 means the bean is immediately eligible for removal.
 *
 * A timeout value of -1 means the bean will never be removed due to timeout.
 *
 *
 *
 */
public interface StatefulTimeoutType<T> extends Child<T>
{

   public StatefulTimeoutType<T> setTimeout(Integer timeout);

   public StatefulTimeoutType<T> removeTimeout();

   public Integer getTimeout();

   public StatefulTimeoutType<T> setUnit(TimeUnitTypeType unit);

   public StatefulTimeoutType<T> setUnit(String unit);

   public TimeUnitTypeType getUnit();

   public String getUnitAsString();

}
