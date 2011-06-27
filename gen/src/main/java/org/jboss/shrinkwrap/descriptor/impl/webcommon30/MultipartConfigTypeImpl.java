package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 *
 * This element specifies configuration information related to the
 * handling of multipart/form-data requests.
 *
 *
 *
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



   // -------------------------------------------------------------------------------------||
   // Element type : location
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MultipartConfigType<T> setLocation(String location)
   {
      childNode.getOrCreate("location").text(location);
      return this;
   }
   public MultipartConfigType<T> removeLocation()
   {
      childNode.remove("location");
      return this;
   }

   public String getLocation()
   {
      return childNode.textValue("location");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : max-file-size
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize)
   {
      childNode.getOrCreate("max-file-size").text(maxFileSize);
      return this;
   }
   public MultipartConfigType<T> removeMaxFileSize()
   {
      childNode.remove("max-file-size");
      return this;
   }

   public Long getMaxFileSize()
   {
      return Long.valueOf(childNode.textValue("max-file-size"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : max-request-size
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize)
   {
      childNode.getOrCreate("max-request-size").text(maxRequestSize);
      return this;
   }
   public MultipartConfigType<T> removeMaxRequestSize()
   {
      childNode.remove("max-request-size");
      return this;
   }

   public Long getMaxRequestSize()
   {
      return Long.valueOf(childNode.textValue("max-request-size"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : file-size-threshold
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold)
   {
      childNode.getOrCreate("file-size-threshold").text(fileSizeThreshold);
      return this;
   }
   public MultipartConfigType<T> removeFileSizeThreshold()
   {
      childNode.remove("file-size-threshold");
      return this;
   }

   public Integer getFileSizeThreshold()
   {
      return Integer.valueOf(childNode.textValue("file-size-threshold"));
   }

}
