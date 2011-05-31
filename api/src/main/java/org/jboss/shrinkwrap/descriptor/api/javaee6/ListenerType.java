package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface ListenerType<T> extends Child<T>
{
   public ListenerType<T> setDescription(String description);
   public String getDescription();

   public ListenerType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public ListenerType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public ListenerType<T> setListenerClass(String listenerClass);
   public String getListenerClass();
}
