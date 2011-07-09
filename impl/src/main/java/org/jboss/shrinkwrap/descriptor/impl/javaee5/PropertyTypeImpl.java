package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * Specifies a name/value pair.
 *
 *
 *
 */
public class PropertyTypeImpl<T> implements Child<T>, PropertyType<T>
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

   public PropertyTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public PropertyTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PropertyType<T> setName(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public PropertyType<T> removeName()
   {
      childNode.remove("name");
      return this;
   }

   public String getName()
   {
      return childNode.textValue("name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PropertyType<T> setValue(String value)
   {
      childNode.getOrCreate("value").text(value);
      return this;
   }

   public PropertyType<T> removeValue()
   {
      childNode.remove("value");
      return this;
   }

   public String getValue()
   {
      return childNode.textValue("value");
   }

}
