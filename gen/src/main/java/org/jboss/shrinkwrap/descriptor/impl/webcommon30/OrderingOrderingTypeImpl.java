package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-29T17:02:36.405-04:00
 *
 * Original Documentation:
 *
 *
 * This element contains a sequence of "name" elements, each of
 * which
 * refers to an application configuration resource by the "name"
 * declared on its web.xml fragment. This element can also contain
 * a single "others" element which specifies that this document
 * comes
 * before or after other documents within the application.
 * See section 8.2.2 of the specification for details.
 *
 *
 *
 */
public class OrderingOrderingTypeImpl<T> implements Child<T>, OrderingOrderingType<T>
{
   public final static String nodeName = "after";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public OrderingOrderingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public OrderingOrderingTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   // Element type : name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public OrderingOrderingType<T> setName(String name)
   {
      childNode.create("name").text(name);
      return this;
   }

   public OrderingOrderingType<T> setNameList(String... values)
   {
      for (String name : values)
      {
         setName(name);
      }
      return this;
   }

   public OrderingOrderingType<T> removeAllName()
   {
      childNode.remove("name");
      return this;
   }

   public List<String> getNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : others
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public OrderingOrderingType<T> others()
   {
      childNode.getOrCreate("others");
      return this;
   }

   public Boolean isOthers()
   {
      return childNode.getSingle("others") != null;
   }

}
