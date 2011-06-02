package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface RemoveMethodType<T> extends Child<T>
{
   @NodeInfo(xmlName = "bean-method")
   public NamedMethodType<RemoveMethodType<T>> beanMethod();

   public RemoveMethodType<T> setRetainIfException(Boolean retainIfException);

   @NodeInfo(xmlName = "retain-if-exception")
   public Boolean getRetainIfException();
}
