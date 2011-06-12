package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public class SecurityRoleRefTypeImpl<T> implements Child<T>, SecurityRoleRefType<T>
{
   public final static String nodeName = "security-role-ref";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SecurityRoleRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SecurityRoleRefTypeImpl(T t, String descriptorName, Node node, Node childNode)
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

   public SecurityRoleRefType<T> setDescription(String... values)
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
   // Element type : role-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityRoleRefType<T> setRoleName(String roleName)
   {
      childNode.getOrCreate("role-name").text(roleName);
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

   public String getRoleLink()
   {
      return childNode.textValue("role-link");
   }

}
