package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class PropertyTypeImpl<T> implements Child<T>, PropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String name;
   private String value;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PropertyTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("property");   }


   public T up()
   {
      return t;
   }



   public PropertyType<T> setName(String name)
   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return name;
   }



   public PropertyType<T> setValue(String value)
   {
      this.value = value;
      childNode.getOrCreate("value").text(value);
      return this;
   }

   public String getValue()
   {
      return value;
   }

}
