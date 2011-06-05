package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface FilterMappingType<T> extends Child<T>
{

   public FilterMappingType<T> setFilterName(String filterName);
   public String getFilterName();


   public FilterMappingType<T> setDispatcher(String dispatcher);
   public String getDispatcher();


   public FilterMappingType<T> setUrlPattern(String urlPattern);
   public String getUrlPattern();


   public FilterMappingType<T> setServletName(String servletName);
   public String getServletName();
}
