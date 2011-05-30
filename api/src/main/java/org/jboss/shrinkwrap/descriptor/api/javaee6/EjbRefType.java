package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface EjbRefType<T> extends Child<T>, ResourceGroup<T>
{
   public EjbRefType<T> setDescription(String description);
   public String getDescription();

   public EjbRefType<T> setEjbRefName(String ejbRefName);
   public String getEjbRefName();

   public EjbRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);
   public EjbRefTypeType getEjbRefType();

   public EjbRefType<T> setHome(String home);
   public String getHome();

   public EjbRefType<T> setRemote(String remote);
   public String getRemote();

   public EjbRefType<T> setEjbLink(String ejbLink);
   public String getEjbLink();
}
