package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AuthConstraintType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
 */
public class AuthConstraintTypeImpl<T> implements Child<T>, AuthConstraintType<T>
{
   public final static String nodeName = "auth-constraint";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public AuthConstraintTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public AuthConstraintTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   public AuthConstraintType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public AuthConstraintType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public AuthConstraintType<T> removeAllDescription()
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
   // Element type : role-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public AuthConstraintType<T> setRoleName(String roleName)
   {
      childNode.create("role-name").text(roleName);
      return this;
   }

   public AuthConstraintType<T> setRoleNameList(String... values)
   {
      for (String name : values)
      {
         setRoleName(name);
      }
      return this;
   }

   public AuthConstraintType<T> removeAllRoleName()
   {
      childNode.remove("role-name");
      return this;
   }

   public List<String> getRoleNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("role-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
