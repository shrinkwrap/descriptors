package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.hibernate.type.LocaleType;
import org.jboss.shrinkwrap.descriptor.api.Child;

public interface LocaleEncodingMappingType<T> extends Child<T>
{
   public LocaleEncodingMappingType<T> setLocale(LocaleType<T> locale);

   public LocaleType<LocaleEncodingMappingType<T>> getLocale();

   public LocaleEncodingMappingType<T> setEncoding(EncodingType<T> encoding);

   public EncodingType<LocaleEncodingMappingType<T>> getEncoding();
}
