package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface AccessTimeoutType<T> extends Child<T>
{

   public AccessTimeoutType<T> setTimeout(Integer timeout);
   public Integer getTimeout();


   public AccessTimeoutType<T> setUnit(String unit);
   public String getUnit();
}