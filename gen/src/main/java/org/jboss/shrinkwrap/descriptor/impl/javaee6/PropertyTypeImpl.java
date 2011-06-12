package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class PropertyTypeImpl<T> implements Child<T>, PropertyType<T>
{
   public final static String nodeName = "property";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String name;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String value;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PropertyTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public PropertyTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public PropertyType<T> setName(String name)   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return childNode.textValue("name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public PropertyType<T> setValue(String value)   {
      this.value = value;
      childNode.getOrCreate("value").text(value);
      return this;
   }

   public String getValue()
   {
      return childNode.textValue("value");
   }

}
