package org.jboss.shrinkwrap.descriptor.impl.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The taglibType defines the syntax for declaring in
 * the deployment descriptor that a tag library is
 * available to the application. This can be done
 * to override implicit map entries from TLD files and
 * from the container.
 *
 *
 *
 */
public class TaglibTypeImpl<T> implements Child<T>, TaglibType<T>
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

   public TaglibTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public TaglibTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : taglib-uri
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TaglibType<T> setTaglibUri(String taglibUri)
   {
      childNode.getOrCreate("taglib-uri").text(taglibUri);
      return this;
   }

   public TaglibType<T> removeTaglibUri()
   {
      childNode.remove("taglib-uri");
      return this;
   }

   public String getTaglibUri()
   {
      return childNode.textValue("taglib-uri");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : taglib-location
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TaglibType<T> setTaglibLocation(String taglibLocation)
   {
      childNode.getOrCreate("taglib-location").text(taglibLocation);
      return this;
   }

   public TaglibType<T> removeTaglibLocation()
   {
      childNode.remove("taglib-location");
      return this;
   }

   public String getTaglibLocation()
   {
      return childNode.textValue("taglib-location");
   }

}
