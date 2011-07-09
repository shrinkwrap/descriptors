package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The icon type contains small-icon and large-icon elements
 * that specify the file names for small and large GIF, JPEG,
 * or PNG icon images used to represent the parent element in a
 * GUI tool.
 *
 * The xml:lang attribute defines the language that the
 * icon file names are provided in. Its value is "en" (English)
 * by default.
 *
 *
 *
 */
public class IconTypeImpl<T> implements Child<T>, IconType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public IconTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public IconTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : small-icon
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public IconType<T> setSmallIcon(String smallIcon)
   {
      childNode.getOrCreate("small-icon").text(smallIcon);
      return this;
   }

   public IconType<T> removeSmallIcon()
   {
      childNode.remove("small-icon");
      return this;
   }

   public String getSmallIcon()
   {
      return childNode.textValue("small-icon");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : large-icon
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public IconType<T> setLargeIcon(String largeIcon)
   {
      childNode.getOrCreate("large-icon").text(largeIcon);
      return this;
   }

   public IconType<T> removeLargeIcon()
   {
      childNode.remove("large-icon");
      return this;
   }

   public String getLargeIcon()
   {
      return childNode.textValue("large-icon");
   }

}
