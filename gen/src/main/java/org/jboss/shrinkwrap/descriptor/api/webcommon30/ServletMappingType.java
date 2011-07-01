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
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The servlet-mappingType defines a mapping between a
 * servlet and a url pattern.
 *
 * Used in: web-app
 *
 *
 *
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
