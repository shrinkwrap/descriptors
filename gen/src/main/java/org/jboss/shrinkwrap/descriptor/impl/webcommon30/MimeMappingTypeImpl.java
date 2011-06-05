package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class MimeMappingTypeImpl<T> implements Child<T>, MimeMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String extension;
   private String mimeType;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MimeMappingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("mime-mapping");   }


   public T up()
   {
      return t;
   }



   public MimeMappingType<T> setExtension(String extension)
   {
      this.extension = extension;
      childNode.getOrCreate("extension").text(extension);
      return this;
   }

   public String getExtension()
   {
      return extension;
   }



   public MimeMappingType<T> setMimeType(String mimeType)
   {
      this.mimeType = mimeType;
      childNode.getOrCreate("mime-type").text(mimeType);
      return this;
   }

   public String getMimeType()
   {
      return mimeType;
   }

}
