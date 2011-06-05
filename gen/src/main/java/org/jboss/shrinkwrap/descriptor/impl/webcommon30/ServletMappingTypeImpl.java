package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class ServletMappingTypeImpl<T> implements Child<T>, ServletMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String servletName;
   private String urlPattern;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ServletMappingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("servlet-mapping");   }


   public T up()
   {
      return t;
   }



   public ServletMappingType<T> setServletName(String servletName)
   {
      this.servletName = servletName;
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   public String getServletName()
   {
      return servletName;
   }



   public ServletMappingType<T> setUrlPattern(String urlPattern)
   {
      this.urlPattern = urlPattern;
      childNode.getOrCreate("url-pattern").text(urlPattern);
      return this;
   }

   public String getUrlPattern()
   {
      return urlPattern;
   }

}
