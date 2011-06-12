package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public class IconTypeImpl<T> implements Child<T>, IconType<T>
{
   public final static String nodeName = "icon";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public IconTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public IconTypeImpl(T t, String descriptorName, Node node, Node childNode)
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

   public String getLargeIcon()
   {
      return childNode.textValue("large-icon");
   }

}
