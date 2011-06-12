package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface MultipartConfigType<T> extends Child<T>
{
   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public MultipartConfigType<T> setLocation(String location);

   public String getLocation();


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize);

   public Long getMaxFileSize();


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize);

   public Long getMaxRequestSize();


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold);

   public Integer getFileSizeThreshold();

}
