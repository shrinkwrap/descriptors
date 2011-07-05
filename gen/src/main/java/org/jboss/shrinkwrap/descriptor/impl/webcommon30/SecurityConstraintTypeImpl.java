package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

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
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The security-constraintType is used to associate
 * security constraints with one or more web resource
 * collections
 *
 * Used in: web-app
 *
 *
 *
 */
public class SecurityConstraintTypeImpl<T> implements Child<T>, SecurityConstraintType<T>
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

   public SecurityConstraintTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SecurityConstraintTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityConstraintType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }
   public SecurityConstraintType<T> setDisplayNameList(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(name);
      }
      return this;
   }
   public SecurityConstraintType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : web-resource-collection
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityConstraintType<T> removeAllWebResourceCollection()
   {
      childNode.remove("web-resource-collection");
      return this;
   }

   public WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection()
   {
      return new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(this, "web-resource-collection", childNode);
   }

   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getWebResourceCollectionList()
   {
      List<WebResourceCollectionType<SecurityConstraintType<T>>> list = new ArrayList<WebResourceCollectionType<SecurityConstraintType<T>>>();
      List<Node> nodeList = childNode.get("web-resource-collection");
      for(Node node: nodeList)
      {
         WebResourceCollectionType<SecurityConstraintType<T>>  type = new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(this, "web-resource-collection", childNode, node);
         list.add(type);
      }
      return list;
   }




   // -------------------------------------------------------------------------------------||
   // Element type : auth-constraint
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityConstraintType<T> removeAuthConstraint()
   {
      childNode.remove("auth-constraint");
      return this;
   }

   public AuthConstraintType<SecurityConstraintType<T>> authConstraint()
   {
      Node node = childNode.getOrCreate("auth-constraint");
      AuthConstraintType<SecurityConstraintType<T>> authConstraint = new AuthConstraintTypeImpl<SecurityConstraintType<T>>(this, "auth-constraint", childNode, node);
      return authConstraint;
   }




   // -------------------------------------------------------------------------------------||
   // Element type : user-data-constraint
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityConstraintType<T> removeUserDataConstraint()
   {
      childNode.remove("user-data-constraint");
      return this;
   }

   public UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint()
   {
      Node node = childNode.getOrCreate("user-data-constraint");
      UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint = new UserDataConstraintTypeImpl<SecurityConstraintType<T>>(this, "user-data-constraint", childNode, node);
      return userDataConstraint;
   }


}
