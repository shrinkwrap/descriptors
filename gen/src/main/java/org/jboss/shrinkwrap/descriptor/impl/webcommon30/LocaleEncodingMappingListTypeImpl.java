package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class LocaleEncodingMappingListTypeImpl<T> implements Child<T>, LocaleEncodingMappingListType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> localeEncodingMapping;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LocaleEncodingMappingListTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("locale-encoding-mapping-list");   }


   public T up()
   {
      return t;
   }



   public LocaleEncodingMappingListType<T> setLocaleEncodingMapping(LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> localeEncodingMapping)
   {
      this.localeEncodingMapping = localeEncodingMapping;
      childNode.getOrCreate("locale-encoding-mapping").text(localeEncodingMapping);
      return this;
   }

   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> getLocaleEncodingMapping()
   {
      if( localeEncodingMapping == null)
      {
          localeEncodingMapping = new LocaleEncodingMappingTypeImpl<LocaleEncodingMappingListType<T>>(this, "", childNode);
      }
      return localeEncodingMapping;
   }


}
