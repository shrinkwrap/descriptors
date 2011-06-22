package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T12:04:36.305-04:00
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
public interface LocaleEncodingMappingType<T> extends Child<T>
{

   public LocaleEncodingMappingType<T> setLocale(String locale);

   public LocaleEncodingMappingType<T> removeLocale();

   public String getLocale();

   public LocaleEncodingMappingType<T> setEncoding(String encoding);

   public LocaleEncodingMappingType<T> removeEncoding();

   public String getEncoding();

}
