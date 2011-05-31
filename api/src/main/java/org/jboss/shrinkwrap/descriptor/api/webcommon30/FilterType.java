package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface FilterType<T> extends Child<T>
{
   public FilterType<T> setDescription(String description);
   public String getDescription();

   public FilterType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public FilterType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public FilterType<T> setFilterName(String filterName);
   public String getFilterName();

   public FilterType<T> setFilterClass(String filterClass);
   public String getFilterClass();

   public FilterType<T> setAsyncSupported(Boolean asyncSupported);
   public Boolean getAsyncSupported();

   public FilterType<T> setInitParam(ParamValueType<T> initParam);
   public ParamValueType<T> getInitParam();
}
