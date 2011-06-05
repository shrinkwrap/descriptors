package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class SecurityRoleRefTypeImpl<T> implements Child<T>, SecurityRoleRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String roleName;
   private String roleLink;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SecurityRoleRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("security-role-ref");   }


   public T up()
   {
      return t;
   }



   public SecurityRoleRefType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public SecurityRoleRefType<T> setRoleName(String roleName)
   {
      this.roleName = roleName;
      childNode.getOrCreate("role-name").text(roleName);
      return this;
   }

   public String getRoleName()
   {
      return roleName;
   }



   public SecurityRoleRefType<T> setRoleLink(String roleLink)
   {
      this.roleLink = roleLink;
      childNode.getOrCreate("role-link").text(roleLink);
      return this;
   }

   public String getRoleLink()
   {
      return roleLink;
   }

}
