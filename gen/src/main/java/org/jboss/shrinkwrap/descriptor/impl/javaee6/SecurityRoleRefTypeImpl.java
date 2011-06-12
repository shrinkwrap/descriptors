package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String roleName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String roleLink;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SecurityRoleRefTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SecurityRoleRefTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public SecurityRoleRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public SecurityRoleRefType<T> setDescription(String ... values)
   {
      for(String name: values)
      {
         setDescription(description);
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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public SecurityRoleRefType<T> setRoleName(String roleName)   {
      this.roleName = roleName;
      childNode.getOrCreate("role-name").text(roleName);
      return this;
   }

   public String getRoleName()
   {
      return childNode.textValue("role-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public SecurityRoleRefType<T> setRoleLink(String roleLink)   {
      this.roleLink = roleLink;
      childNode.getOrCreate("role-link").text(roleLink);
      return this;
   }

   public String getRoleLink()
   {
      return childNode.textValue("role-link");
   }

}
