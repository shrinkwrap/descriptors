package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

public interface FilterType<T> extends Child<T>, DescriptionGroup<T>
{
   public FilterType<T> setFilterName(String filterName);

   public String getFilterName();

   public FilterType<T> setFilterClazz(String filterClass);

   public String getFilterClazz();

   public FilterType<T> setAsyncSupported(Boolean asyncSupported);

   public Boolean getAsyncSupported();

   public FilterType<T> setInitParam(ParamValueType<T> initParam);

   public ParamValueType<FilterType<T>> getInitParam();
}
