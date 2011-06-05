package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class FilterMappingTypeImpl<T> implements Child<T>, FilterMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String filterName;
   private String dispatcher;
   private String urlPattern;
   private String servletName;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public FilterMappingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("filter-mapping");   }


   public T up()
   {
      return t;
   }



   public FilterMappingType<T> setFilterName(String filterName)
   {
      this.filterName = filterName;
      childNode.getOrCreate("filter-name").text(filterName);
      return this;
   }

   public String getFilterName()
   {
      return filterName;
   }



   public FilterMappingType<T> setDispatcher(String dispatcher)
   {
      this.dispatcher = dispatcher;
      childNode.getOrCreate("dispatcher").text(dispatcher);
      return this;
   }

   public String getDispatcher()
   {
      return dispatcher;
   }



   public FilterMappingType<T> setUrlPattern(String urlPattern)
   {
      this.urlPattern = urlPattern;
      childNode.getOrCreate("url-pattern").text(urlPattern);
      return this;
   }

   public String getUrlPattern()
   {
      return urlPattern;
   }



   public FilterMappingType<T> setServletName(String servletName)
   {
      this.servletName = servletName;
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   public String getServletName()
   {
      return servletName;
   }

}
