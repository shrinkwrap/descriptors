package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class LocaleEncodingMappingTypeImpl<T> implements Child<T>, LocaleEncodingMappingType<T>
{
   public final static String nodeName = "locale-encoding-mapping";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String locale;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String encoding;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LocaleEncodingMappingTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public LocaleEncodingMappingTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public LocaleEncodingMappingType<T> setLocale(String locale)   {
      this.locale = locale;
      childNode.getOrCreate("locale").text(locale);
      return this;
   }

   public String getLocale()
   {
      return childNode.textValue("locale");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public LocaleEncodingMappingType<T> setEncoding(String encoding)   {
      this.encoding = encoding;
      childNode.getOrCreate("encoding").text(encoding);
      return this;
   }

   public String getEncoding()
   {
      return childNode.textValue("encoding");
   }

}
