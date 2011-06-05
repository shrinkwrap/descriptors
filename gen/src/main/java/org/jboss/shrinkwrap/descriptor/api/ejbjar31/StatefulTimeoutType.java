package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface StatefulTimeoutType<T> extends Child<T>
{

   public StatefulTimeoutType<T> setTimeout(Integer timeout);
   public Integer getTimeout();


   public StatefulTimeoutType<T> setUnit(String unit);
   public String getUnit();
}
