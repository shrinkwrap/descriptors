package org.jboss.shrinkwrap.descriptor.api.javaee6.webcommon;

public interface WebCommonAttributes<T>
{
   public WebCommonAttributes version(String version);

   //	public WebCommonAttributes id(String id);
   public WebCommonAttributes metadataComplete(boolean isMetaDataComplete);
}
