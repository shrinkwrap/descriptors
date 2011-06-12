package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface LocaleEncodingMappingListType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public LocaleEncodingMappingListType<T> setLocaleEncodingMapping(LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> localeEncodingMapping);

   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> getLocaleEncodingMapping();
   public List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> getLocaleEncodingMappingList();


}
