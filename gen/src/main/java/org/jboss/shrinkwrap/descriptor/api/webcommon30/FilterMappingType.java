package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
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
