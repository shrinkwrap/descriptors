package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface MultipartConfigType<T> extends Child<T>
{
   public MultipartConfigType<T> setLocation(String location);

   @NodeInfo(xmlName = "location")
   public String getLocation();

   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize);

   @NodeInfo(xmlName = "max-file-size")
   public Long getMaxFileSize();

   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize);

   @NodeInfo(xmlName = "max-request-size")
   public Long getMaxRequestSize();

   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold);

   @NodeInfo(xmlName = "file-size-threshold")
   public Integer getFileSizeThreshold();
}
