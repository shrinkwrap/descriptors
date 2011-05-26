package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface StatefulTimeoutType<T> extends Child<T>
{
   public StatefulTimeoutType<T> setTimeout(Integer timeout);

   public Integer getTimeout();

   public StatefulTimeoutType<T> setUnit(String unit);

   public String getUnit();
}
