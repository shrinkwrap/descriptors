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
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private AuthConstraintType<SecurityConstraintType<T>> authConstraint;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SecurityConstraintTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SecurityConstraintTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public SecurityConstraintType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public SecurityConstraintType<T> setDisplayName(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(displayName);
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public SecurityConstraintType<T> setWebResourceCollection(WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection)
   {
      childNode.create("web-resource-collection").text(webResourceCollection);
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
      for(Node node: nodeList)
      {
         WebResourceCollectionType<SecurityConstraintType<T>>  type = new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public SecurityConstraintType<T> setAuthConstraint(AuthConstraintType<SecurityConstraintType<T>> authConstraint)   {
      this.authConstraint = authConstraint;
      childNode.getOrCreate("auth-constraint").text(authConstraint);
      return this;
   }

   public AuthConstraintType<SecurityConstraintType<T>> getAuthConstraint()
   {
      if( authConstraint == null)
      {
          authConstraint = new AuthConstraintTypeImpl<SecurityConstraintType<T>>(this, "", childNode);
      }
      return authConstraint;
   }



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public SecurityConstraintType<T> setUserDataConstraint(UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint)   {
      this.userDataConstraint = userDataConstraint;
      childNode.getOrCreate("user-data-constraint").text(userDataConstraint);
      return this;
   }

   public UserDataConstraintType<SecurityConstraintType<T>> getUserDataConstraint()
   {
      if( userDataConstraint == null)
      {
          userDataConstraint = new UserDataConstraintTypeImpl<SecurityConstraintType<T>>(this, "", childNode);
      }
      return userDataConstraint;
   }


}
