package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FilterMappingType<T> extends Child<T>
{
   public FilterMappingType<T> setFilterName(String filterName);

   public String getFilterName();

   public FilterMappingType<T> setDispatcher(String dispatcher);

   public String getDispatcher();
}
