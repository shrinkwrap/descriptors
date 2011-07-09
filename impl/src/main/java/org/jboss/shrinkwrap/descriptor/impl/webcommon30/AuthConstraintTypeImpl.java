package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AuthConstraintType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The auth-constraintType indicates the user roles that
 * should be permitted access to this resource
 * collection. The role-name used here must either correspond
 * to the role-name of one of the security-role elements
 * defined for this web application, or be the specially
 * reserved role-name "*" that is a compact syntax for
 * indicating all roles in the web application. If both "*"
 * and rolenames appear, the container interprets this as all
 * roles. If no roles are defined, no user is allowed access
 * to the portion of the web application described by the
 * containing security-constraint. The container matches
 * role names case sensitively when determining access.
 *
 *
 *
 */
public class AuthConstraintTypeImpl<T> implements Child<T>, AuthConstraintType<T>
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

   public AuthConstraintTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public AuthConstraintTypeImpl(T t, String nodeName, Node node, Node childNode)
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
