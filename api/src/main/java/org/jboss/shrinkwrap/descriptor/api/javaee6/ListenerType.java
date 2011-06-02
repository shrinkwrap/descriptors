package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ListenerType<T> extends Child<T>
{
   public ListenerType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public ListenerType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<ListenerType<T>> icon();

   public ListenerType<T> setListenerClass(Class<?> listenerClass);

   public ListenerType<T> setListenerClass(String listenerClass);

   @NodeInfo(xmlName = "listener-class")
   public String getListenerClass();
}
