package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface MultipartConfigType<T> extends Child<T>
{

   public MultipartConfigType<T> setLocation(String location);
   public String getLocation();


   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize);
   public Long getMaxFileSize();


   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize);
   public Long getMaxRequestSize();


   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold);
   public Integer getFileSizeThreshold();
}
