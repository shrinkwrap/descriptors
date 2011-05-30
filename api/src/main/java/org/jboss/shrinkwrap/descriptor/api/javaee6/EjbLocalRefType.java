package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface EjbLocalRefType<T> extends Child<T>, ResourceGroup<T>
{
   public EjbLocalRefType<T> setDescription(String description);
   public String getDescription();

   public EjbLocalRefType<T> setEjbRefName(String ejbRefName);
   public String getEjbRefName();

   public EjbLocalRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);
   public EjbRefTypeType getEjbRefType();

   public EjbLocalRefType<T> setLocalHome(String localHome);
   public String getLocalHome();

   public EjbLocalRefType<T> setLocal(String local);
   public String getLocal();

   public EjbLocalRefType<T> setEjbLink(String ejbLink);
   public String getEjbLink();
}
