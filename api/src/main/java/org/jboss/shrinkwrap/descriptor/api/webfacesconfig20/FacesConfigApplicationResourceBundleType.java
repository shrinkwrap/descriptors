package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigApplicationResourceBundleType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigApplicationResourceBundleType<T> setBaseName(String baseName);

   public String getBaseName();

   public FacesConfigApplicationResourceBundleType<T> setVar(String var);

   public String getVar();
}
