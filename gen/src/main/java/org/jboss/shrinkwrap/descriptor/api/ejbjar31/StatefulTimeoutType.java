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
 * Generation date :2011-07-05T19:45:07.621+02:00
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
   public String  getUnitAsString();

}
