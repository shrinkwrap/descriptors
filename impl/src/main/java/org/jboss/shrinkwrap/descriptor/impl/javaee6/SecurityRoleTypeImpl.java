package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 * [
 * The security-roleType contains the definition of a security
 * role. The definition consists of an optional description of
 * the security role, and the security role name.
 *
 * Example:
 *
 * <security-role>
 * <description>
 * This role includes all employees who are authorized
 * to access the employee service application.
 * </description>
 * <role-name>employee</role-name>
 * </security-role>
 *
 *
 *
 *
 */
public class SecurityRoleTypeImpl<T> implements Child<T>, SecurityRoleType<T>
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

   public SecurityRoleTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SecurityRoleTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   public SecurityRoleType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public SecurityRoleType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public SecurityRoleType<T> removeAllDescription()
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
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityRoleType<T> setRoleName(String roleName)
   {
      childNode.getOrCreate("role-name").text(roleName);
      return this;
   }

   public SecurityRoleType<T> removeRoleName()
   {
      childNode.remove("role-name");
      return this;
   }

   public String getRoleName()
   {
      return childNode.textValue("role-name");
   }

}
