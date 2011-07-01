package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.TransportGuaranteeType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The user-data-constraintType is used to indicate how
 * data communicated between the client and container should be
 * protected.
 *
 * Used in: security-constraint
 *
 *
 *
 */
public class UserDataConstraintTypeImpl<T> implements Child<T>, UserDataConstraintType<T>
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

   public UserDataConstraintTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public UserDataConstraintTypeImpl(T t, String nodeName, Node node, Node childNode)
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

   public UserDataConstraintType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public UserDataConstraintType<T> removeAllDescription()
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
   // Element type : transport-guarantee
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public UserDataConstraintType<T> setTransportGuarantee(TransportGuaranteeType transportGuarantee)
   {
      childNode.getOrCreate("transport-guarantee").text(transportGuarantee);
      return this;
   }

   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee)
   {
      childNode.getOrCreate("transport-guarantee").text(transportGuarantee);
      return this;
   }

   public TransportGuaranteeType getTransportGuarantee()
   {
      return TransportGuaranteeType.getFromStringValue(childNode.textValue("transport-guarantee"));
   }

   public String getTransportGuaranteeAsString()
   {
      return childNode.textValue("transport-guarantee");
   }

}
