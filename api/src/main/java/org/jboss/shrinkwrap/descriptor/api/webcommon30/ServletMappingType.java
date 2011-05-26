package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ServletMappingType<T> extends Child<T>
{
   public ServletMappingType<T> setServletName(String servletName);

   public String getServletName();

   public ServletMappingType<T> setUrlPattern(String urlPattern);

   public String getUrlPattern();
}
