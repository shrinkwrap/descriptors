package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ListenerType<T> extends Child<T>, DescriptionGroup
{
   public ListenerType<T> listenerClass(String listenerClass);
}
