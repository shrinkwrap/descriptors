package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigOrderingType<T> extends Child<T>
{
   public FacesConfigOrderingType<T> setAfter(FacesConfigOrderingOrderingType<T> after);

   public FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>> getAfter();

   public FacesConfigOrderingType<T> setBefore(FacesConfigOrderingOrderingType<T> before);

   public FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>> getBefore();
}
