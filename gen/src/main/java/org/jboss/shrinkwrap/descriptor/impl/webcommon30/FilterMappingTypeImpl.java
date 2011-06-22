package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T14:39:12.971-04:00
 *
 * Original Documentation:
 *
 *
 * Declaration of the filter mappings in this web
 * application is done by using filter-mappingType.
 * The container uses the filter-mapping
 * declarations to decide which filters to apply to a request,
 * and in what order. The container matches the request URI to
 * a Servlet in the normal way. To determine which filters to
 * apply it matches filter-mapping declarations either on
 * servlet-name, or on url-pattern for each filter-mapping
 * element, depending on which style is used. The order in
 * which filters are invoked is the order in which
 * filter-mapping declarations that match a request URI for a
 * servlet appear in the list of filter-mapping elements.The
 * filter-name value must be the value of the filter-name
 * sub-elements of one of the filter declarations in the
 * deployment descriptor.
 *
 *
 *
 */
public class FilterMappingTypeImpl<T> implements Child<T>, FilterMappingType<T>
{
   public final static String nodeName = "filter-mapping";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public FilterMappingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public FilterMappingTypeImpl(T t, String descriptorName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public FilterMappingType<T> setFilterName(String filterName)
   {
      childNode.getOrCreate("filter-name").text(filterName);
      return this;
   }

   public FilterMappingType<T> removeFilterName()
   {
      childNode.remove("filter-name");
      return this;
   }

   public String getFilterName()
   {
      return childNode.textValue("filter-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : dispatcher
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public FilterMappingType<T> setDispatcher(String dispatcher)
   {
      childNode.getOrCreate("dispatcher").text(dispatcher);
      return this;
   }

   public FilterMappingType<T> removeDispatcher()
   {
      childNode.remove("dispatcher");
      return this;
   }

   public String getDispatcher()
   {
      return childNode.textValue("dispatcher");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public FilterMappingType<T> setUrlPattern(String urlPattern)
   {
      childNode.getOrCreate("url-pattern").text(urlPattern);
      return this;
   }

   public FilterMappingType<T> removeUrlPattern()
   {
      childNode.remove("url-pattern");
      return this;
   }

   public String getUrlPattern()
   {
      return childNode.textValue("url-pattern");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public FilterMappingType<T> setServletName(String servletName)
   {
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   public FilterMappingType<T> removeServletName()
   {
      childNode.remove("servlet-name");
      return this;
   }

   public String getServletName()
   {
      return childNode.textValue("servlet-name");
   }

}
