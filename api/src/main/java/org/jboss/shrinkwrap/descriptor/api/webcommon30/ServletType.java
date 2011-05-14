package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * ServletType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface ServletType<T> extends Child<T>, DescriptionGroup
{
   public ServletType<T> servletName(String servletName);

   public ServletType<T> servletClass(String servletClass);

   public ServletType<T> jspFile(String jspFile);

   public ParamValueType<ServletType<T>> initParam();

   public ServletType<T> loadOnStartup(boolean loadOnStartup);

   public ServletType<T> enabled(boolean enabled);

   public ServletType<T> asyncSupported(boolean asyncSupported);

   public ServletType<T> runAs(String runAs);

   public SecurityRoleRefType<ServletType<T>> securityRoleRef();

   public MultipartConfigType<ServletType<T>> multipartConfig();
}
