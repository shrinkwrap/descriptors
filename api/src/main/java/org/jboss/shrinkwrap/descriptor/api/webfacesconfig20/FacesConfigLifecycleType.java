package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigLifecycleType<T> extends Child<T>
{
   public FacesConfigLifecycleType<T> setPhaseListener(String phaseListener);

   public String getPhaseListener();

   public FacesConfigLifecycleType<T> setLifecycleExtension(FacesConfigLifecycleExtensionType<T> lifecycleExtension);

   public FacesConfigLifecycleExtensionType<FacesConfigLifecycleType<T>> getLifecycleExtension();
}
