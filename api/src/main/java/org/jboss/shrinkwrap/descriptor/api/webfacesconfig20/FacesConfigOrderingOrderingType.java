package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigOrderingOrderingType<T> extends Child<T>
{
   public FacesConfigOrderingOrderingType<T> setName(String name);

   public String getName();

   public FacesConfigOrderingOrderingType<T> setOthers(FacesConfigOrderingOthersType<T> others);

   public FacesConfigOrderingOthersType<FacesConfigOrderingOrderingType<T>> getOthers();
}
