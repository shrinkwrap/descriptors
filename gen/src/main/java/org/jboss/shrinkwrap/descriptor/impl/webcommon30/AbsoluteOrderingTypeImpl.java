package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class AbsoluteOrderingTypeImpl<T> implements Child<T>, AbsoluteOrderingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String name;
   private Boolean others;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public AbsoluteOrderingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("absolute-ordering");   }


   public T up()
   {
      return t;
   }



   public AbsoluteOrderingType<T> setName(String name)
   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return name;
   }



   public AbsoluteOrderingType<T> setOthers(Boolean others)
   {
      this.others = others;
      childNode.getOrCreate("others").text(others);
      return this;
   }

   public Boolean getOthers()
   {
      return others;
   }

}
