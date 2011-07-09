package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Property;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 * A name-value pair.
 *
 *
 */
public class PropertyImpl<T> implements Child<T>, Property<T>
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

   public PropertyImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public PropertyImpl(T t, String nodeName, Node node, Node childNode)
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
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public Property<T> setName(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   public Property<T> removeName()
   {
      childNode.attributes().remove("name");
      return this;
   }

   public String getName()
   {
      return childNode.attributes().get("name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : value
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public Property<T> setValue(String value)
   {
      childNode.attribute("value", value);
      return this;
   }

   public Property<T> removeValue()
   {
      childNode.attributes().remove("value");
      return this;
   }

   public String getValue()
   {
      return childNode.attributes().get("value");
   }

}
