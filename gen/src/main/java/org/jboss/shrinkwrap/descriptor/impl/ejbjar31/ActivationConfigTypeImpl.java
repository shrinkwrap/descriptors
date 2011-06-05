package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class ActivationConfigTypeImpl<T> implements Child<T>, ActivationConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private ActivationConfigPropertyType<ActivationConfigType<T>> activationConfigProperty;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ActivationConfigTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("activation-config");   }


   public T up()
   {
      return t;
   }



   public ActivationConfigType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public ActivationConfigType<T> setActivationConfigProperty(ActivationConfigPropertyType<ActivationConfigType<T>> activationConfigProperty)
   {
      this.activationConfigProperty = activationConfigProperty;
      childNode.getOrCreate("activation-config-property").text(activationConfigProperty);
      return this;
   }

   public ActivationConfigPropertyType<ActivationConfigType<T>> getActivationConfigProperty()
   {
      if( activationConfigProperty == null)
      {
          activationConfigProperty = new ActivationConfigPropertyTypeImpl<ActivationConfigType<T>>(this, "", childNode);
      }
      return activationConfigProperty;
   }


}
