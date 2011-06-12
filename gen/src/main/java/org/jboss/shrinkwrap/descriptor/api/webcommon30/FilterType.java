package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface FilterType<T> extends Child<T>
{

   public FilterType<T> setDescription(String description);

   public FilterType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public FilterType<T> setDisplayName(String displayName);

   public FilterType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public FilterType<T> removeAllIcon();

   public IconType<FilterType<T>> getIcon();

   public List<IconType<FilterType<T>>> getIconList();

   public FilterType<T> setFilterName(String filterName);

   public String getFilterName();

   public FilterType<T> setFilterClass(String filterClass);

   public String getFilterClass();

   public FilterType<T> setAsyncSupported(Boolean asyncSupported);

   public Boolean isAsyncSupported();

   public FilterType<T> removeAllInitParam();

   public ParamValueType<FilterType<T>> getInitParam();

   public List<ParamValueType<FilterType<T>>> getInitParamList();

}
