package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.WebType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class WebTypeImpl<T> implements Child<T>, WebType<T>
{
   public final static String nodeName = "web";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String webUri;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String contextRoot;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public WebTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebType<T> setWebUri(String webUri)   {
      this.webUri = webUri;
      childNode.getOrCreate("web-uri").text(webUri);
      return this;
   }

   public String getWebUri()
   {
      return childNode.textValue("web-uri");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebType<T> setContextRoot(String contextRoot)   {
      this.contextRoot = contextRoot;
      childNode.getOrCreate("context-root").text(contextRoot);
      return this;
   }

   public String getContextRoot()
   {
      return childNode.textValue("context-root");
   }

}
