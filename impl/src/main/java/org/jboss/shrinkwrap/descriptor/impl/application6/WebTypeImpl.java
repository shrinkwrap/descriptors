package org.jboss.shrinkwrap.descriptor.impl.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.WebType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
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

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public WebTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   // Element type : web-uri
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebType<T> setWebUri(String webUri)
   {
      childNode.getOrCreate("web-uri").text(webUri);
      return this;
   }

   public WebType<T> removeWebUri()
   {
      childNode.remove("web-uri");
      return this;
   }

   public String getWebUri()
   {
      return childNode.textValue("web-uri");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : context-root
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebType<T> setContextRoot(String contextRoot)
   {
      childNode.getOrCreate("context-root").text(contextRoot);
      return this;
   }

   public WebType<T> removeContextRoot()
   {
      childNode.remove("context-root");
      return this;
   }

   public String getContextRoot()
   {
      return childNode.textValue("context-root");
   }

}
