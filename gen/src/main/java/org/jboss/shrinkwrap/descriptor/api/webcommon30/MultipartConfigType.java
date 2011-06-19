package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface MultipartConfigType<T> extends Child<T>
{

   public MultipartConfigType<T> setLocation(String location);
   public MultipartConfigType<T> removeLocation();

   public String getLocation();



   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize);
   public MultipartConfigType<T> removeMaxFileSize();

   public Long getMaxFileSize();



   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize);
   public MultipartConfigType<T> removeMaxRequestSize();

   public Long getMaxRequestSize();



   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold);
   public MultipartConfigType<T> removeFileSizeThreshold();

   public Integer getFileSizeThreshold();

}
