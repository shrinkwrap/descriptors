package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * The security-role-refType contains the declaration of a
 * security role reference in a component's or a
 * Deployment Component's code. The declaration consists of an
 * optional description, the security role name used in the
 * code, and an optional link to a security role. If the
 * security role is not specified, the Deployer must choose an
 * appropriate security role.
 *
 *
 *
 */
public class SecurityRoleRefTypeImpl<T> implements Child<T>, SecurityRoleRefType<T>
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

   public SecurityRoleRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SecurityRoleRefTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   public SecurityRoleRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public SecurityRoleRefType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public SecurityRoleRefType<T> removeAllDescription()
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
   public SecurityRoleRefType<T> setRoleName(String roleName)
   {
      childNode.getOrCreate("role-name").text(roleName);
      return this;
   }

   public SecurityRoleRefType<T> removeRoleName()
   {
      childNode.remove("role-name");
      return this;
   }

   public String getRoleName()
   {
      return childNode.textValue("role-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : role-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityRoleRefType<T> setRoleLink(String roleLink)
   {
      childNode.getOrCreate("role-link").text(roleLink);
      return this;
   }

   public SecurityRoleRefType<T> removeRoleLink()
   {
      childNode.remove("role-link");
      return this;
   }

   public String getRoleLink()
   {
      return childNode.textValue("role-link");
   }

}
