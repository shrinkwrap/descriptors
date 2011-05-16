package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;


/**
 * LocaleEncodingMappingType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface LocaleEncodingMappingType<T> extends Child<T>
{
   public LocaleEncodingMappingType<T> locale(String locale);

   public LocaleEncodingMappingType<T> encoding(String encoding);
}