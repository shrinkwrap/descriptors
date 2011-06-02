package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface FilterMappingType<T> extends Child<T>
{
   public FilterMappingType<T> setFilterName(String filterName);

   @NodeInfo(xmlName = "filter-name")
   public String getFilterName();

   public FilterMappingType<T> setDispatcher(DispatcherType dispatcher);

   public FilterMappingType<T> setDispatcher(String dispatcher);

   @NodeInfo(xmlName = "dispatcher")
   public String getDispatcher();

   public FilterMappingType<T> setUrlPattern(String urlPattern);

   @NodeInfo(xmlName = "url-pattern")
   public String getUrlPattern();

   public FilterMappingType<T> setServletName(String servletName);

   @NodeInfo(xmlName = "servlet-name")
   public String getServletName();
}
