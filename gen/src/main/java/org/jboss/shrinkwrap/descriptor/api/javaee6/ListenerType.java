package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface ListenerType<T> extends Child<T>
{

   public ListenerType<T> setDescription(String description);

   public ListenerType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public ListenerType<T> setDisplayName(String displayName);

   public ListenerType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public ListenerType<T> removeAllIcon();

   public IconType<ListenerType<T>> getIcon();

   public List<IconType<ListenerType<T>>> getIconList();

   public ListenerType<T> setListenerClass(String listenerClass);

   public String getListenerClass();

}
