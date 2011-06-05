package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface FilterType<T> extends Child<T>
{

   public FilterType<T> setDescription(String description);
   public String getDescription();

   public FilterType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public FilterType<T> setIcon(IconType<FilterType<T>> icon);
   public IconType<FilterType<T>> getIcon();


   public FilterType<T> setFilterName(String filterName);
   public String getFilterName();


   public FilterType<T> setFilterClass(String filterClass);
   public String getFilterClass();


   public FilterType<T> setAsyncSupported(Boolean asyncSupported);
   public Boolean getAsyncSupported();


   public FilterType<T> setInitParam(ParamValueType<FilterType<T>> initParam);
   public ParamValueType<FilterType<T>> getInitParam();

}
