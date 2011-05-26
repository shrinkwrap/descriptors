package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigManagedBeanType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigManagedBeanType<T> setManagedBeanName(String managedBeanName);

   public String getManagedBeanName();

   public FacesConfigManagedBeanType<T> setManagedBeanClazz(String managedBeanClass);

   public String getManagedBeanClazz();

   public FacesConfigManagedBeanType<T> setManagedBeanScope(String managedBeanScope);

   public String getManagedBeanScope();

   public FacesConfigManagedBeanType<T> setManagedBeanExtension(
         FacesConfigManagedBeanExtensionType<T> managedBeanExtension);

   public FacesConfigManagedBeanExtensionType<FacesConfigManagedBeanType<T>> getManagedBeanExtension();
}
