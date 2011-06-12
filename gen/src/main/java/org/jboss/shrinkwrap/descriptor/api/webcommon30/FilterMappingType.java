package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface FilterMappingType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public FilterMappingType<T> setFilterName(String filterName);

   public String getFilterName();


   // maxOccurs = -5   // isGeneric = true   // isAttribute = false

// otherwise;
   public FilterMappingType<T> setDispatcher(String dispatcher);

   public String getDispatcher();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public FilterMappingType<T> setUrlPattern(String urlPattern);

   public String getUrlPattern();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public FilterMappingType<T> setServletName(String servletName);

   public String getServletName();

}
