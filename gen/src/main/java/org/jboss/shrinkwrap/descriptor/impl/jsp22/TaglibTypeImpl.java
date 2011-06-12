package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class TaglibTypeImpl<T> implements Child<T>, TaglibType<T>
{
   public final static String nodeName = "taglib";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String taglibUri;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String taglibLocation;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public TaglibTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public TaglibTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public TaglibType<T> setTaglibUri(String taglibUri)   {
      this.taglibUri = taglibUri;
      childNode.getOrCreate("taglib-uri").text(taglibUri);
      return this;
   }

   public String getTaglibUri()
   {
      return childNode.textValue("taglib-uri");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public TaglibType<T> setTaglibLocation(String taglibLocation)   {
      this.taglibLocation = taglibLocation;
      childNode.getOrCreate("taglib-location").text(taglibLocation);
      return this;
   }

   public String getTaglibLocation()
   {
      return childNode.textValue("taglib-location");
   }

}
