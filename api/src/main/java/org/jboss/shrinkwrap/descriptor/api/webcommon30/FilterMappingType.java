package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * FilterMappingType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface FilterMappingType<T> extends Child<T>
{
   public FilterMappingType<T> filterName(String filterName);

   public FilterMappingType<T> urlPattern(String urlPattern);

   public FilterMappingType<T> servletName(String servletName);

   public FilterMappingType<T> Dispatcher(DispatcherType Dispatcher);
}
