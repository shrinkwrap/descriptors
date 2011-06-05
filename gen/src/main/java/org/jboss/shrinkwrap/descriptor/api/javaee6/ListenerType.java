package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface ListenerType<T> extends Child<T>
{

   public ListenerType<T> setDescription(String description);
   public String getDescription();

   public ListenerType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public ListenerType<T> setIcon(IconType<ListenerType<T>> icon);
   public IconType<ListenerType<T>> getIcon();


   public ListenerType<T> setListenerClass(String listenerClass);
   public String getListenerClass();
}
