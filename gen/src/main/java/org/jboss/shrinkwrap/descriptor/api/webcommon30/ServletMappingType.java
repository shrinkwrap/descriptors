package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface ServletMappingType<T> extends Child<T>
{

   public ServletMappingType<T> setServletName(String servletName);
   public ServletMappingType<T> removeServletName();

   public String getServletName();



   public ServletMappingType<T> setUrlPattern(String urlPattern);
   public ServletMappingType<T> setUrlPatternList(String ... values);
   public ServletMappingType<T> removeAllUrlPattern();

   public List<String> getUrlPatternList();

}
