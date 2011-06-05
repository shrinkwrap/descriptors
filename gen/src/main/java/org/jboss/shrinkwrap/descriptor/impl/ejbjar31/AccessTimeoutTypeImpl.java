package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AccessTimeoutType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class AccessTimeoutTypeImpl<T> implements Child<T>, AccessTimeoutType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private Integer timeout;
   private String unit;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public AccessTimeoutTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("access-timeout");   }


   public T up()
   {
      return t;
   }



   public AccessTimeoutType<T> setTimeout(Integer timeout)
   {
      this.timeout = timeout;
      childNode.getOrCreate("timeout").text(timeout);
      return this;
   }

   public Integer getTimeout()
   {
      return timeout;
   }



   public AccessTimeoutType<T> setUnit(String unit)
   {
      this.unit = unit;
      childNode.getOrCreate("unit").text(unit);
      return this;
   }

   public String getUnit()
   {
      return unit;
   }

}
