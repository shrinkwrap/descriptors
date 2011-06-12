package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String name;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean others;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public OrderingOrderingTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public OrderingOrderingTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public OrderingOrderingType<T> setName(String name)
   {
      childNode.create("name").text(name);
      return this;
   }

   public OrderingOrderingType<T> setName(String ... values)
   {
      for(String name: values)
      {
         setName(name);
      }
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


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public OrderingOrderingType<T> setOthers(Boolean others)   {
      this.others = others;
      childNode.getOrCreate("others").text(others);
      return this;
   }

   public Boolean getOthers()
   {
      return Strings.isTrue(childNode.textValue("others"));
   }

}
