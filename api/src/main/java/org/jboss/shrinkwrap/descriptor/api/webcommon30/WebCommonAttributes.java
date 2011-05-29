package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-29T19:58:11.781+02:00
 */
public interface WebCommonAttributes<T> extends Child<T>
{
   public WebCommonAttributes<T> setVersion(WebAppVersionType version);
   public WebAppVersionType getVersion();

   public WebCommonAttributes<T> setMetadataComplete(Boolean metadataComplete);
   public Boolean getMetadataComplete();
}
