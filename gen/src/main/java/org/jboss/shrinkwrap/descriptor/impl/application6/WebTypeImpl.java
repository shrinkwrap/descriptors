package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.WebType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class WebTypeImpl<T> implements Child<T>, WebType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String webUri;
   private String contextRoot;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("web");   }


   public T up()
   {
      return t;
   }



   public WebType<T> setWebUri(String webUri)
   {
      this.webUri = webUri;
      childNode.getOrCreate("web-uri").text(webUri);
      return this;
   }

   public String getWebUri()
   {
      return webUri;
   }



   public WebType<T> setContextRoot(String contextRoot)
   {
      this.contextRoot = contextRoot;
      childNode.getOrCreate("context-root").text(contextRoot);
      return this;
   }

   public String getContextRoot()
   {
      return contextRoot;
   }

}
