package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface FilterMappingType<T> extends Child<T>
{
   public FilterMappingType<T> setFilterName(String filterName);
   public String getFilterName();

   public FilterMappingType<T> setDispatcher(DispatcherType dispatcher);
   public DispatcherType getDispatcher();
}
