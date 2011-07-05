package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The locale-encoding-mapping-list contains one or more
 * locale-encoding-mapping(s).
 *
 *
 *
 */
public interface LocaleEncodingMappingListType<T> extends Child<T>
{

   public LocaleEncodingMappingListType<T> removeAllLocaleEncodingMapping();

   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> localeEncodingMapping();

   public List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> getLocaleEncodingMappingList();

}