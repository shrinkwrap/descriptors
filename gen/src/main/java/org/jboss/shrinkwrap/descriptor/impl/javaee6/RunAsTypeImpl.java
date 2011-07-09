package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The run-asType specifies the run-as identity to be
 * used for the execution of a component. It contains an
 * optional description, and the name of a security role.
 *
 *
 *
 */
public class RunAsTypeImpl<T> implements Child<T>, RunAsType<T>
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

   public RunAsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public RunAsTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   public RunAsType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public RunAsType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public RunAsType<T> removeAllDescription()
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
   public RunAsType<T> setRoleName(String roleName)
   {
      childNode.getOrCreate("role-name").text(roleName);
      return this;
   }

   public RunAsType<T> removeRoleName()
   {
      childNode.remove("role-name");
      return this;
   }

   public String getRoleName()
   {
      return childNode.textValue("role-name");
   }

}
