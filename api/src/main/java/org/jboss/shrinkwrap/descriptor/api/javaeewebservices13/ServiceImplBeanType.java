package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ServiceImplBeanType<T> extends Child<T>
{
   public ServiceImplBeanType<T> setEjbLink(String ejbLink);

   @NodeInfo(xmlName = "ejb-link")
   public String getEjbLink();

   public ServiceImplBeanType<T> setServletLink(String servletLink);

   @NodeInfo(xmlName = "servlet-link")
   public String getServletLink();
}
