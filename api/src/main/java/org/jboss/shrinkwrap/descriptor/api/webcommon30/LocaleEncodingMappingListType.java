package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * LocaleEncodingMappingListType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface LocaleEncodingMappingListType<T> extends Child<T>
{
   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> localeEncodingMapping();
}
