package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AccessTimeoutType<T> extends Child<T>
{
   public AccessTimeoutType<T> setTimeout(Integer timeout);

   public Integer getTimeout();

   public AccessTimeoutType<T> setUnit(String unit);

   public String getUnit();
}
