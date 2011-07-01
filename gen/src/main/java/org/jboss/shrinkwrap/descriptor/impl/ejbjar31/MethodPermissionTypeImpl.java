package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The method-permissionType specifies that one or more
 * security roles are allowed to invoke one or more enterprise
 * bean methods. The method-permissionType consists of an
 * optional description, a list of security role names or an
 * indicator to state that the method is unchecked for
 * authorization, and a list of method elements.
 *
 * The security roles used in the method-permissionType
 * must be defined in the security-role elements of the
 * deployment descriptor, and the methods must be methods
 * defined in the enterprise bean's business, home, component
 * and/or web service endpoint interfaces.
 *
 *
 *
 */
public class MethodPermissionTypeImpl<T> implements Child<T>, MethodPermissionType<T>
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

   public MethodPermissionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MethodPermissionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
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
   public MethodPermissionType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public MethodPermissionType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public MethodPermissionType<T> removeAllDescription()
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
   // Element type : method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodPermissionType<T> removeAllMethod()
   {
      childNode.remove("method");
      return this;
   }

   public MethodType<MethodPermissionType<T>> method()
   {
      return new MethodTypeImpl<MethodPermissionType<T>>(this, "method", childNode);
   }

   public List<MethodType<MethodPermissionType<T>>> getMethodList()
   {
      List<MethodType<MethodPermissionType<T>>> list = new ArrayList<MethodType<MethodPermissionType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for(Node node: nodeList)
      {
         MethodType<MethodPermissionType<T>>  type = new MethodTypeImpl<MethodPermissionType<T>>(this, "method", childNode, node);
         list.add(type);
      }
      return list;
   }




   // -------------------------------------------------------------------------------------||
   // Element type : role-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodPermissionType<T> setRoleName(String roleName)
   {
      childNode.create("role-name").text(roleName);
      return this;
   }
   public MethodPermissionType<T> setRoleNameList(String ... values)
   {
      for(String name: values)
      {
         setRoleName(name);
      }
      return this;
   }
   public MethodPermissionType<T> removeAllRoleName()
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


   // -------------------------------------------------------------------------------------||
   // Element type : unchecked
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodPermissionType<T> unchecked()
   {
      childNode.getOrCreate("unchecked");
      return this;
   }

   public Boolean isUnchecked()
   {
      return childNode.getSingle("unchecked") != null;
   }

}
