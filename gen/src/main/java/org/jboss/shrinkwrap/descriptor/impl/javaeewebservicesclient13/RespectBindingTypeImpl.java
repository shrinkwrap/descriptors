package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.RespectBindingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class RespectBindingTypeImpl<T> implements Child<T>, RespectBindingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private Boolean enabled;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public RespectBindingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("respect-binding");   }


   public T up()
   {
      return t;
   }



   public RespectBindingType<T> setEnabled(Boolean enabled)
   {
      this.enabled = enabled;
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   public Boolean getEnabled()
   {
      return enabled;
   }

}
