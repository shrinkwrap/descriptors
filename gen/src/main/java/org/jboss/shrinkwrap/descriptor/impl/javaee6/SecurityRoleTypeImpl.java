package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class SecurityRoleTypeImpl<T> implements Child<T>, SecurityRoleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String roleName;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SecurityRoleTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("security-role");   }


   public T up()
   {
      return t;
   }



   public SecurityRoleType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public SecurityRoleType<T> setRoleName(String roleName)
   {
      this.roleName = roleName;
      childNode.getOrCreate("role-name").text(roleName);
      return this;
   }

   public String getRoleName()
   {
      return roleName;
   }

}
