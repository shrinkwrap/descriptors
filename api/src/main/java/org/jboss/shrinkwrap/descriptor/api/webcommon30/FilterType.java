package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface FilterType<T> extends Child<T>
{
   public FilterType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public FilterType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<FilterType<T>> icon();

   public FilterType<T> setFilterName(String filterName);

   @NodeInfo(xmlName = "filter-name")
   public String getFilterName();

   public FilterType<T> setFilterClass(Class<?> filterClass);

   public FilterType<T> setFilterClass(String filterClass);

   @NodeInfo(xmlName = "filter-class")
   public String getFilterClass();

   public FilterType<T> setAsyncSupported(Boolean asyncSupported);

   @NodeInfo(xmlName = "async-supported")
   public Boolean getAsyncSupported();

   @NodeInfo(xmlName = "init-param")
   public ParamValueType<FilterType<T>> initParam();
}
