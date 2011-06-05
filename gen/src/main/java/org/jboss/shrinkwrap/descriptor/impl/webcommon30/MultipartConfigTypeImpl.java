package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class MultipartConfigTypeImpl<T> implements Child<T>, MultipartConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String location;
   private Long maxFileSize;
   private Long maxRequestSize;
   private Integer fileSizeThreshold;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MultipartConfigTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("multipart-config");   }


   public T up()
   {
      return t;
   }



   public MultipartConfigType<T> setLocation(String location)
   {
      this.location = location;
      childNode.getOrCreate("location").text(location);
      return this;
   }

   public String getLocation()
   {
      return location;
   }



   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize)
   {
      this.maxFileSize = maxFileSize;
      childNode.getOrCreate("max-file-size").text(maxFileSize);
      return this;
   }

   public Long getMaxFileSize()
   {
      return maxFileSize;
   }



   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize)
   {
      this.maxRequestSize = maxRequestSize;
      childNode.getOrCreate("max-request-size").text(maxRequestSize);
      return this;
   }

   public Long getMaxRequestSize()
   {
      return maxRequestSize;
   }



   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold)
   {
      this.fileSizeThreshold = fileSizeThreshold;
      childNode.getOrCreate("file-size-threshold").text(fileSizeThreshold);
      return this;
   }

   public Integer getFileSizeThreshold()
   {
      return fileSizeThreshold;
   }

}
