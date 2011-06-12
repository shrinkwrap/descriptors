package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class MimeMappingTypeImpl<T> implements Child<T>, MimeMappingType<T>
{
   public final static String nodeName = "mime-mapping";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String extension;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mimeType;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MimeMappingTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MimeMappingTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MimeMappingType<T> setExtension(String extension)   {
      this.extension = extension;
      childNode.getOrCreate("extension").text(extension);
      return this;
   }

   public String getExtension()
   {
      return childNode.textValue("extension");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MimeMappingType<T> setMimeType(String mimeType)   {
      this.mimeType = mimeType;
      childNode.getOrCreate("mime-type").text(mimeType);
      return this;
   }

   public String getMimeType()
   {
      return childNode.textValue("mime-type");
   }

}
