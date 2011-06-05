package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class ListenerTypeImpl<T> implements Child<T>, ListenerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String listenerClass;

   private String description;
   private String displayName;
   private IconType<ListenerType<T>> icon;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ListenerTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("listener");   }


   public T up()
   {
      return t;
   }



   public ListenerType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public ListenerType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public ListenerType<T> setIcon(IconType<ListenerType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<ListenerType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<ListenerType<T>>(this, "", childNode);
      }
      return icon;
   }



   public ListenerType<T> setListenerClass(String listenerClass)
   {
      this.listenerClass = listenerClass;
      childNode.getOrCreate("listener-class").text(listenerClass);
      return this;
   }

   public String getListenerClass()
   {
      return listenerClass;
   }

}
