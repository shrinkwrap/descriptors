package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ServiceRefGroup<T> extends Child<T>
{
   public ServiceRefGroup<T> setServiceRef(ServiceRefType<T> serviceRef);

   public ServiceRefType<ServiceRefGroup<T>> getServiceRef();
}
