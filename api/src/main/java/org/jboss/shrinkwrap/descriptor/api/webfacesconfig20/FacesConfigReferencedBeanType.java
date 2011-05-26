package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigReferencedBeanType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigReferencedBeanType<T> setReferencedBeanName(String referencedBeanName);

   public String getReferencedBeanName();

   public FacesConfigReferencedBeanType<T> setReferencedBeanClazz(String referencedBeanClass);

   public String getReferencedBeanClazz();
}
