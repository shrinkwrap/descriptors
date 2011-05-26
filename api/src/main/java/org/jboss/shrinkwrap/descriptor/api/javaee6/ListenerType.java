package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ListenerType<T> extends Child<T>, DescriptionGroup<T>
{
   public ListenerType<T> setListenerClazz(String listenerClass);

   public String getListenerClazz();
}
