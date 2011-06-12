package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface ListenerType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ListenerType<T> setDescription(String description);
   public ListenerType<T> setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ListenerType<T> setDisplayName(String displayName);
   public ListenerType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ListenerType<T> setIcon(IconType<ListenerType<T>> icon);

   public IconType<ListenerType<T>> getIcon();
   public List<IconType<ListenerType<T>>> getIconList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ListenerType<T> setListenerClass(String listenerClass);

   public String getListenerClass();

}
