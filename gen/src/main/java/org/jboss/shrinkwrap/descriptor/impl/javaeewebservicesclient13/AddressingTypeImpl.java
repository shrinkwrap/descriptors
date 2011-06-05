package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class AddressingTypeImpl<T> implements Child<T>, AddressingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private Boolean enabled;
   private Boolean required;
   private String responses;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public AddressingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("addressing");   }


   public T up()
   {
      return t;
   }



   public AddressingType<T> setEnabled(Boolean enabled)
   {
      this.enabled = enabled;
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   public Boolean getEnabled()
   {
      return enabled;
   }



   public AddressingType<T> setRequired(Boolean required)
   {
      this.required = required;
      childNode.getOrCreate("required").text(required);
      return this;
   }

   public Boolean getRequired()
   {
      return required;
   }



   public AddressingType<T> setResponses(String responses)
   {
      this.responses = responses;
      childNode.getOrCreate("responses").text(responses);
      return this;
   }

   public String getResponses()
   {
      return responses;
   }

}
