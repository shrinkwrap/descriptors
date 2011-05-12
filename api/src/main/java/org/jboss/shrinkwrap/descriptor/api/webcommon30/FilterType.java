package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.javaee6.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

/**
 * The filterType is used to declare a filter in the web
 * application. The filter is mapped to either a servlet or a
 * URL pattern in he filter-mapping element, using the
 * filter-name value to reference. Filters can access the
 * initialization parameters declared in the deployment
 * descriptor at runtime via the FilterConfig interface.
 *       
 * Used in: web-app
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
*/
public interface FilterType<T> extends DescriptionGroup, Child<T>
{ // TODO

   public FilterType<T> filterName(String filterName);

   /**
    * The fully qualified classname of the filter.
    */
   //	FilterDef filterClass(Class<? extends javax.servlet.Filter> clazz); TODO
   public FilterType<T> filterClass(Class clazz);

   public FilterType<T> filterClass(String clazz);

   public FilterType<T> asyncSupported(boolean isAsyncSupported);

   public FilterType<T> initParam(String description, String paramName, Object paramValue);
}