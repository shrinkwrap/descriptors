package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T07:43:58.376-04:00
 *
 * Original Documentation:
 *
 *
 * Please see section 8.2.2 of the specification for details.
 *
 *
 *
 */
public class AbsoluteOrderingTypeImpl<T> implements Child<T>, AbsoluteOrderingType<T>
{
   public final static String nodeName = "absolute-ordering";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public AbsoluteOrderingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public AbsoluteOrderingTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   public AbsoluteOrderingType<T> setName(String name)
   {
      childNode.create("name").text(name);
      return this;
   }

   public AbsoluteOrderingType<T> setNameList(String... values)
   {
      for (String name : values)
      {
         setName(name);
      }
      return this;
   }

   public AbsoluteOrderingType<T> removeAllName()
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
   public AbsoluteOrderingType<T> others()
   {
      childNode.getOrCreate("others");
      return this;
   }

   public Boolean isOthers()
   {
      return childNode.getSingle("others") != null;
   }

}
