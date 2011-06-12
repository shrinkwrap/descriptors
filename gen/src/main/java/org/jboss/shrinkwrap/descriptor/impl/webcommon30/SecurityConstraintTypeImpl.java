package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AuthConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public class SecurityConstraintTypeImpl<T> implements Child<T>, SecurityConstraintType<T>
{
   public final static String nodeName = "security-constraint";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SecurityConstraintTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SecurityConstraintTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityConstraintType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public SecurityConstraintType<T> setDisplayName(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
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

   public WebResourceCollectionType<SecurityConstraintType<T>> getWebResourceCollection()
   {
      return new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(this, "", childNode);
   }

   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getWebResourceCollectionList()
   {
      List<WebResourceCollectionType<SecurityConstraintType<T>>> list = new ArrayList<WebResourceCollectionType<SecurityConstraintType<T>>>();
      List<Node> nodeList = childNode.get(WebResourceCollectionTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         WebResourceCollectionType<SecurityConstraintType<T>> type = new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(
               this, "", childNode, node);
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

   public AuthConstraintType<SecurityConstraintType<T>> getAuthConstraint()
   {
      Node node = childNode.getOrCreate(AuthConstraintTypeImpl.nodeName);
      AuthConstraintType<SecurityConstraintType<T>> authConstraint = new AuthConstraintTypeImpl<SecurityConstraintType<T>>(
            this, "", childNode, node);
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

   public UserDataConstraintType<SecurityConstraintType<T>> getUserDataConstraint()
   {
      Node node = childNode.getOrCreate(UserDataConstraintTypeImpl.nodeName);
      UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint = new UserDataConstraintTypeImpl<SecurityConstraintType<T>>(
            this, "", childNode, node);
      return userDataConstraint;
   }

}
