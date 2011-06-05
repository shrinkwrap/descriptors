package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class ActivationConfigPropertyTypeImpl<T> implements Child<T>, ActivationConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String activationConfigPropertyName;
   private String activationConfigPropertyValue;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ActivationConfigPropertyTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("activation-config-property");   }


   public T up()
   {
      return t;
   }



   public ActivationConfigPropertyType<T> setActivationConfigPropertyName(String activationConfigPropertyName)
   {
      this.activationConfigPropertyName = activationConfigPropertyName;
      childNode.getOrCreate("activation-config-property-name").text(activationConfigPropertyName);
      return this;
   }

   public String getActivationConfigPropertyName()
   {
      return activationConfigPropertyName;
   }



   public ActivationConfigPropertyType<T> setActivationConfigPropertyValue(String activationConfigPropertyValue)
   {
      this.activationConfigPropertyValue = activationConfigPropertyValue;
      childNode.getOrCreate("activation-config-property-value").text(activationConfigPropertyValue);
      return this;
   }

   public String getActivationConfigPropertyValue()
   {
      return activationConfigPropertyValue;
   }

}
