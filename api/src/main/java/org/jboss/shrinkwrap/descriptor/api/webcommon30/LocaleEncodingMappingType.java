package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface LocaleEncodingMappingType<T> extends Child<T>
{
   public LocaleEncodingMappingType<T> setLocale(String locale);

   @NodeInfo(xmlName = "locale")
   public String getLocale();

   public LocaleEncodingMappingType<T> setEncoding(String encoding);

   @NodeInfo(xmlName = "encoding")
   public String getEncoding();
}
