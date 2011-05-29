package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface FilterType<T> extends Child<T>, DescriptionGroup<T>

{
   public FilterType<T> setFilterName(String filterName);

   public String getFilterName();

   public FilterType<T> setFilterClass(String filterClass);

   public String getFilterClass();

   public FilterType<T> setAsyncSupported(Boolean asyncSupported);

   public Boolean getAsyncSupported();

   public ParamValueType<FilterType<T>> setInitParam(ParamValueType<T> initParam);

   public ParamValueType<FilterType<T>> getInitParam();
}
