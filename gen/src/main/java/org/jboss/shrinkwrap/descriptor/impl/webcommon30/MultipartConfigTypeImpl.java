package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class MultipartConfigTypeImpl<T> implements Child<T>, MultipartConfigType<T>
{
   public final static String nodeName = "multipart-config";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String location;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Long maxFileSize;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Long maxRequestSize;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer fileSizeThreshold;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MultipartConfigTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MultipartConfigTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public MultipartConfigType<T> setLocation(String location)   {
      this.location = location;
      childNode.getOrCreate("location").text(location);
      return this;
   }

   public String getLocation()
   {
      return childNode.textValue("location");
   }


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize)   {
      this.maxFileSize = maxFileSize;
      childNode.getOrCreate("max-file-size").text(maxFileSize);
      return this;
   }

   public Long getMaxFileSize()
   {
      return Long.valueOf(childNode.textValue("max-file-size"));
   }


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize)   {
      this.maxRequestSize = maxRequestSize;
      childNode.getOrCreate("max-request-size").text(maxRequestSize);
      return this;
   }

   public Long getMaxRequestSize()
   {
      return Long.valueOf(childNode.textValue("max-request-size"));
   }


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold)   {
      this.fileSizeThreshold = fileSizeThreshold;
      childNode.getOrCreate("file-size-threshold").text(fileSizeThreshold);
      return this;
   }

   public Integer getFileSizeThreshold()
   {
      return Integer.valueOf(childNode.textValue("file-size-threshold"));
   }

}
