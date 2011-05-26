package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface LocaleEncodingMappingListType<T> extends Child<T>
{
   public LocaleEncodingMappingListType<T> setLocaleEncodingMapping(LocaleEncodingMappingType<T> localeEncodingMapping);

   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> getLocaleEncodingMapping();
}
