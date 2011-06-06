package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class TaglibTypeImpl<T> implements Child<T>, TaglibType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String taglibUri;
   private String taglibLocation;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public TaglibTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("taglib");   }


   public T up()
   {
      return t;
   }



   public TaglibType<T> setTaglibUri(String taglibUri)
   {
      this.taglibUri = taglibUri;
      childNode.getOrCreate("taglib-uri").text(taglibUri);
      return this;
   }

   public String getTaglibUri()
   {
      return taglibUri;
   }



   public TaglibType<T> setTaglibLocation(String taglibLocation)
   {
      this.taglibLocation = taglibLocation;
      childNode.getOrCreate("taglib-location").text(taglibLocation);
      return this;
   }

   public String getTaglibLocation()
   {
      return taglibLocation;
   }

}
