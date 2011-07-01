package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.DependsOnType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The depends-onType is used to express initialization
 * ordering dependencies between Singleton components.
 * The depends-onType specifies the names of one or more
 * Singleton beans in the same application as the referring
 * Singleton, each of which must be initialized before
 * the referring bean.
 *
 * Each dependent bean is expressed using ejb-link syntax.
 * The order in which dependent beans are initialized at
 * runtime is not guaranteed to match the order in which
 * they are listed.
 *
 *
 *
 */
public class DependsOnTypeImpl<T> implements Child<T>, DependsOnType<T>
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

   public DependsOnTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public DependsOnTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DependsOnType<T> setEjbName(String ejbName)
   {
      childNode.create("ejb-name").text(ejbName);
      return this;
   }

   public DependsOnType<T> setEjbNameList(String... values)
   {
      for (String name : values)
      {
         setEjbName(name);
      }
      return this;
   }

   public DependsOnType<T> removeAllEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   public List<String> getEjbNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("ejb-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
