package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ServiceImplBeanType<T> extends Child<T>
{
   public ServiceImplBeanType<T> setEjbLink(String ejbLink);

   public String getEjbLink();

   public ServiceImplBeanType<T> setServletLink(String servletLink);

   public String getServletLink();
}
