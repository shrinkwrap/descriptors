package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface StatefulTimeoutType<T> extends Child<T>
{
   public StatefulTimeoutType<T> setTimeout(Integer timeout);

   @NodeInfo(xmlName = "timeout")
   public Integer getTimeout();

   public StatefulTimeoutType<T> setUnit(TimeUnitTypeType unit);

   public StatefulTimeoutType<T> setUnit(String unit);

   @NodeInfo(xmlName = "unit")
   public String getUnit();
}
