package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ServletMappingType<T> extends Child<T>
{
   public ServletMappingType<T> setServletName(String servletName);

   @NodeInfo(xmlName = "servlet-name")
   public String getServletName();

   public ServletMappingType<T> setUrlPattern(String urlPattern);

   @NodeInfo(xmlName = "url-pattern")
   public String getUrlPattern();
}