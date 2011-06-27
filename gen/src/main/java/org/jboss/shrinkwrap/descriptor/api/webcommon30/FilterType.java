package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 *
 * The filterType is used to declare a filter in the web
 * application. The filter is mapped to either a servlet or a
 * URL pattern in the filter-mapping element, using the
 * filter-name value to reference. Filters can access the
 * initialization parameters declared in the deployment
 * descriptor at runtime via the FilterConfig interface.
 *
 * Used in: web-app
 *
 *
 *
 */
public interface FilterType<T> extends Child<T>
{

   public FilterType<T> setDescription(String description);
   public FilterType<T> setDescriptionList(String ... values);
   public FilterType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public FilterType<T> setDisplayName(String displayName);
   public FilterType<T> setDisplayNameList(String ... values);
   public FilterType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public FilterType<T> removeAllIcon();

   public IconType<FilterType<T>> icon();
   public List<IconType<FilterType<T>>> getIconList();



   public FilterType<T> setFilterName(String filterName);
   public FilterType<T> removeFilterName();

   public String getFilterName();



   public FilterType<T> setFilterClass(String filterClass);
   public FilterType<T> removeFilterClass();

   public String getFilterClass();



   public FilterType<T> setAsyncSupported(Boolean asyncSupported);
   public FilterType<T> removeAsyncSupported();

   public Boolean isAsyncSupported();



   public FilterType<T> removeAllInitParam();

   public ParamValueType<FilterType<T>> initParam();
   public List<ParamValueType<FilterType<T>>> getInitParamList();


}
