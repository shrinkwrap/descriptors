package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The locale-encoding-mapping contains locale name and
 * encoding name. The locale name must be either "Language-code",
 * such as "ja", defined by ISO-639 or "Language-code_Country-code",
 * such as "ja_JP". "Country code" is defined by ISO-3166.
 *
 *
 *
 */
public class LocaleEncodingMappingTypeImpl<T> implements Child<T>, LocaleEncodingMappingType<T>
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

   public LocaleEncodingMappingTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public LocaleEncodingMappingTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : locale
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public LocaleEncodingMappingType<T> setLocale(String locale)
   {
      childNode.getOrCreate("locale").text(locale);
      return this;
   }

   public LocaleEncodingMappingType<T> removeLocale()
   {
      childNode.remove("locale");
      return this;
   }

   public String getLocale()
   {
      return childNode.textValue("locale");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : encoding
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public LocaleEncodingMappingType<T> setEncoding(String encoding)
   {
      childNode.getOrCreate("encoding").text(encoding);
      return this;
   }

   public LocaleEncodingMappingType<T> removeEncoding()
   {
      childNode.remove("encoding");
      return this;
   }

   public String getEncoding()
   {
      return childNode.textValue("encoding");
   }

}
