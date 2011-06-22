package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

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
public interface FilterMappingType<T> extends Child<T>
{

   public FilterMappingType<T> setFilterName(String filterName);

   public FilterMappingType<T> removeFilterName();

   public String getFilterName();

   public FilterMappingType<T> setDispatcher(String dispatcher);

   public FilterMappingType<T> removeDispatcher();

   public String getDispatcher();

   public FilterMappingType<T> setUrlPattern(String urlPattern);

   public FilterMappingType<T> removeUrlPattern();

   public String getUrlPattern();

   public FilterMappingType<T> setServletName(String servletName);

   public FilterMappingType<T> removeServletName();

   public String getServletName();

}
