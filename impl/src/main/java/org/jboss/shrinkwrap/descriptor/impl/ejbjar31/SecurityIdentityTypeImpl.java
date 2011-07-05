package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.RunAsTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The security-identityType specifies whether the caller's
 * security identity is to be used for the execution of the
 * methods of the enterprise bean or whether a specific run-as
 * identity is to be used. It contains an optional description
 * and a specification of the security identity to be used.
 *
 *
 *
 */
public class SecurityIdentityTypeImpl<T> implements Child<T>, SecurityIdentityType<T>
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

   public SecurityIdentityTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SecurityIdentityTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   public SecurityIdentityType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public SecurityIdentityType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public SecurityIdentityType<T> removeAllDescription()
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
   // Element type : use-caller-identity
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityIdentityType<T> useCallerIdentity()
   {
      childNode.getOrCreate("use-caller-identity");
      return this;
   }

   public Boolean isUseCallerIdentity()
   {
      return childNode.getSingle("use-caller-identity") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : run-as
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityIdentityType<T> removeRunAs()
   {
      childNode.remove("run-as");
      return this;
   }

   public RunAsType<SecurityIdentityType<T>> runAs()
   {
      Node node = childNode.getOrCreate("run-as");
      RunAsType<SecurityIdentityType<T>> runAs = new RunAsTypeImpl<SecurityIdentityType<T>>(this, "run-as", childNode,
            node);
      return runAs;
   }

}
