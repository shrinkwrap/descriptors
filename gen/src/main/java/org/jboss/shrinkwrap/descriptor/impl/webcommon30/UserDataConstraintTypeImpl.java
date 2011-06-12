package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public class UserDataConstraintTypeImpl<T> implements Child<T>, UserDataConstraintType<T>
{
   public final static String nodeName = "user-data-constraint";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public UserDataConstraintTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public UserDataConstraintTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   public UserDataConstraintType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public UserDataConstraintType<T> setDescription(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
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
   // Element type : transport-guarantee
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee)
   {
      childNode.getOrCreate("transport-guarantee").text(transportGuarantee);
      return this;
   }

   public String getTransportGuarantee()
   {
      return childNode.textValue("transport-guarantee");
   }

}
