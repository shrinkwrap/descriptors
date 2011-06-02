package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface AccessTimeoutType<T> extends Child<T>
{
   public AccessTimeoutType<T> setTimeout(Integer timeout);

   @NodeInfo(xmlName = "timeout")
   public Integer getTimeout();

   public AccessTimeoutType<T> setUnit(TimeUnitTypeType unit);

   public AccessTimeoutType<T> setUnit(String unit);

   @NodeInfo(xmlName = "unit")
   public String getUnit();
}
