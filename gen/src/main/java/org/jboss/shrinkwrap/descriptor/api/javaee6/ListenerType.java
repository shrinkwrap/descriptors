package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * The listenerType indicates the deployment properties for a web
 * application listener bean.
 *
 *
 *
 */
public interface ListenerType<T> extends Child<T>
{

   public ListenerType<T> setDescription(String description);

   public ListenerType<T> setDescriptionList(String... values);

   public ListenerType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public ListenerType<T> setDisplayName(String displayName);

   public ListenerType<T> setDisplayNameList(String... values);

   public ListenerType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();

   public ListenerType<T> removeAllIcon();

   public IconType<ListenerType<T>> icon();

   public List<IconType<ListenerType<T>>> getIconList();

   public ListenerType<T> setListenerClass(String listenerClass);

   public ListenerType<T> removeListenerClass();

   public String getListenerClass();

}
