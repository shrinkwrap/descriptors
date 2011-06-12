package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface FilterType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public FilterType<T> setDescription(String description);
   public FilterType<T> setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public FilterType<T> setDisplayName(String displayName);
   public FilterType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public FilterType<T> setIcon(IconType<FilterType<T>> icon);

   public IconType<FilterType<T>> getIcon();
   public List<IconType<FilterType<T>>> getIconList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public FilterType<T> setFilterName(String filterName);

   public String getFilterName();


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public FilterType<T> setFilterClass(String filterClass);

   public String getFilterClass();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public FilterType<T> setAsyncSupported(Boolean asyncSupported);

   public Boolean getAsyncSupported();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public FilterType<T> setInitParam(ParamValueType<FilterType<T>> initParam);

   public ParamValueType<FilterType<T>> getInitParam();
   public List<ParamValueType<FilterType<T>>> getInitParamList();


}
