package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
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
