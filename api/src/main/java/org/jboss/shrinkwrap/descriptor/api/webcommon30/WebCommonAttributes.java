package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * WebCommonAttributes
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebCommonAttributes<T>
{
   public T version(String version);

   public T metadataComplete(Boolean isMetaDataComplete);
}
