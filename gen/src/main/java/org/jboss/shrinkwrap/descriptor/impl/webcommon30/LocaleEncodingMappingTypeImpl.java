package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class LocaleEncodingMappingTypeImpl<T> implements Child<T>, LocaleEncodingMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String locale;
   private String encoding;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LocaleEncodingMappingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("locale-encoding-mapping");   }


   public T up()
   {
      return t;
   }



   public LocaleEncodingMappingType<T> setLocale(String locale)
   {
      this.locale = locale;
      childNode.getOrCreate("locale").text(locale);
      return this;
   }

   public String getLocale()
   {
      return locale;
   }



   public LocaleEncodingMappingType<T> setEncoding(String encoding)
   {
      this.encoding = encoding;
      childNode.getOrCreate("encoding").text(encoding);
      return this;
   }

   public String getEncoding()
   {
      return encoding;
   }

}
