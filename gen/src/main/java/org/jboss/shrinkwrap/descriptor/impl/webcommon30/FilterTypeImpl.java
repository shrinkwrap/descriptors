package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class FilterTypeImpl<T> implements Child<T>, FilterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String filterName;
   private String filterClass;
   private Boolean asyncSupported;
   private ParamValueType<FilterType<T>> initParam;

   private String description;
   private String displayName;
   private IconType<FilterType<T>> icon;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public FilterTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("filter");   }


   public T up()
   {
      return t;
   }



   public FilterType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public FilterType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public FilterType<T> setIcon(IconType<FilterType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<FilterType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<FilterType<T>>(this, "", childNode);
      }
      return icon;
   }



   public FilterType<T> setFilterName(String filterName)
   {
      this.filterName = filterName;
      childNode.getOrCreate("filter-name").text(filterName);
      return this;
   }

   public String getFilterName()
   {
      return filterName;
   }



   public FilterType<T> setFilterClass(String filterClass)
   {
      this.filterClass = filterClass;
      childNode.getOrCreate("filter-class").text(filterClass);
      return this;
   }

   public String getFilterClass()
   {
      return filterClass;
   }



   public FilterType<T> setAsyncSupported(Boolean asyncSupported)
   {
      this.asyncSupported = asyncSupported;
      childNode.getOrCreate("async-supported").text(asyncSupported);
      return this;
   }

   public Boolean getAsyncSupported()
   {
      return asyncSupported;
   }



   public FilterType<T> setInitParam(ParamValueType<FilterType<T>> initParam)
   {
      this.initParam = initParam;
      childNode.getOrCreate("init-param").text(initParam);
      return this;
   }

   public ParamValueType<FilterType<T>> getInitParam()
   {
      if( initParam == null)
      {
          initParam = new ParamValueTypeImpl<FilterType<T>>(this, "", childNode);
      }
      return initParam;
   }


}
