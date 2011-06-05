package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class IconTypeImpl<T> implements Child<T>, IconType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String smallIcon;
   private String largeIcon;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public IconTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("icon");   }


   public T up()
   {
      return t;
   }



   public IconType<T> setSmallIcon(String smallIcon)
   {
      this.smallIcon = smallIcon;
      childNode.getOrCreate("small-icon").text(smallIcon);
      return this;
   }

   public String getSmallIcon()
   {
      return smallIcon;
   }



   public IconType<T> setLargeIcon(String largeIcon)
   {
      this.largeIcon = largeIcon;
      childNode.getOrCreate("large-icon").text(largeIcon);
      return this;
   }

   public String getLargeIcon()
   {
      return largeIcon;
   }

}
