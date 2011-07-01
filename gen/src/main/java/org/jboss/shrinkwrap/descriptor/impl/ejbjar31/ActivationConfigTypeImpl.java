package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * The activation-configType defines information about the
 * expected configuration properties of the message-driven bean
 * in its operational environment. This may include information
 * about message acknowledgement, message selector, expected
 * destination type, etc.
 *
 * The configuration information is expressed in terms of
 * name/value configuration properties.
 *
 * The properties that are recognized for a particular
 * message-driven bean are determined by the messaging type.
 *
 *
 *
 */
public class ActivationConfigTypeImpl<T> implements Child<T>, ActivationConfigType<T>
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

   public ActivationConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ActivationConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ActivationConfigType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ActivationConfigType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ActivationConfigType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ActivationConfigType<T> removeAllActivationConfigProperty()
   {
      childNode.remove("activation-config-property");
      return this;
   }

   public ActivationConfigPropertyType<ActivationConfigType<T>> activationConfigProperty()
   {
      return new ActivationConfigPropertyTypeImpl<ActivationConfigType<T>>(this, "activation-config-property",
            childNode);
   }

   public List<ActivationConfigPropertyType<ActivationConfigType<T>>> getActivationConfigPropertyList()
   {
      List<ActivationConfigPropertyType<ActivationConfigType<T>>> list = new ArrayList<ActivationConfigPropertyType<ActivationConfigType<T>>>();
      List<Node> nodeList = childNode.get("activation-config-property");
      for (Node node : nodeList)
      {
         ActivationConfigPropertyType<ActivationConfigType<T>> type = new ActivationConfigPropertyTypeImpl<ActivationConfigType<T>>(
               this, "activation-config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

}
