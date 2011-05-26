package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigAbsoluteOrderingType<T> extends Child<T>
{
   public FacesConfigAbsoluteOrderingType<T> setName(String name);

   public String getName();

   public FacesConfigAbsoluteOrderingType<T> setOthers(FacesConfigOrderingOthersType<T> others);

   public FacesConfigOrderingOthersType<FacesConfigAbsoluteOrderingType<T>> getOthers();
}
