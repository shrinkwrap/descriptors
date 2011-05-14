package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * WebCommonAttributes
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebCommonAttributes<T>
{
   public WebCommonAttributes version(String version);

   public WebCommonAttributes metadataComplete(boolean isMetaDataComplete);
}
