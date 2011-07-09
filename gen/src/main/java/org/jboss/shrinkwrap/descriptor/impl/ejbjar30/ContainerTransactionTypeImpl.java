package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ContainerTransactionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.TransAttributeType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The container-transactionType specifies how the container
 * must manage transaction scopes for the enterprise bean's
 * method invocations. It defines an optional description, a
 * list of method elements, and a transaction attribute. The
 * transaction attribute is to be applied to all the specified
 * methods.
 *
 *
 *
 */
public class ContainerTransactionTypeImpl<T> implements Child<T>, ContainerTransactionType<T>
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

   public ContainerTransactionTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ContainerTransactionTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   public ContainerTransactionType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ContainerTransactionType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ContainerTransactionType<T> removeAllDescription()
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
   // Element type : method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ContainerTransactionType<T> removeAllMethod()
   {
      childNode.remove("method");
      return this;
   }

   public MethodType<ContainerTransactionType<T>> method()
   {
      return new MethodTypeImpl<ContainerTransactionType<T>>(this, "method", childNode);
   }

   public List<MethodType<ContainerTransactionType<T>>> getMethodList()
   {
      List<MethodType<ContainerTransactionType<T>>> list = new ArrayList<MethodType<ContainerTransactionType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for (Node node : nodeList)
      {
         MethodType<ContainerTransactionType<T>> type = new MethodTypeImpl<ContainerTransactionType<T>>(this, "method",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : trans-attribute
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ContainerTransactionType<T> setTransAttribute(TransAttributeType transAttribute)
   {
      childNode.getOrCreate("trans-attribute").text(transAttribute);
      return this;
   }

   public ContainerTransactionType<T> setTransAttribute(String transAttribute)
   {
      childNode.getOrCreate("trans-attribute").text(transAttribute);
      return this;
   }

   public TransAttributeType getTransAttribute()
   {
      return TransAttributeType.getFromStringValue(childNode.textValue("trans-attribute"));
   }

   public String getTransAttributeAsString()
   {
      return childNode.textValue("trans-attribute");
   }

}
