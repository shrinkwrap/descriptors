package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface EjbRefType<T> extends Child<T>, ResourceGroup<T>
{
   public EjbRefType<T> setDescription(String description);

   public String getDescription();

   public EjbRefType<T> setEjbRefName(String ejbRefName);

   public String getEjbRefName();

   public EjbRefType<T> setEjbRefType(String ejbRefType);

   public String getEjbRefType();

   public EjbRefType<T> setHome(String home);

   public String getHome();

   public EjbRefType<T> setRemote(String remote);

   public String getRemote();

   public EjbRefType<T> setEjbLink(String ejbLink);

   public String getEjbLink();
}
