package org.jboss.shrinkwrap.descriptor.api.webcommon30;


/**
 * LocaleEncodingMappingType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface LocaleEncodingMappingType
{
   public LocaleEncodingMappingType locale(String locale);

   public LocaleEncodingMappingType encoding(String encoding);
}