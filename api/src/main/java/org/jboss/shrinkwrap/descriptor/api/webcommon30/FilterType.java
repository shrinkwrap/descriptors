package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * FilterType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface FilterType<T> extends Child<T>, DescriptionGroup<FilterType<T>>
{
   public FilterType<T> filterName(String filterName);

   public FilterType<T> filterClass(String filterClass);

   public FilterType<T> asyncSupported(boolean asyncSupported);

   public ParamValueType<FilterType<T>> initParam();
}