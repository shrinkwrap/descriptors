package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigClientBehaviorRendererType<T> extends Child<T>
{
   public FacesConfigClientBehaviorRendererType<T> setClientBehaviorRendererType(String clientBehaviorRendererType);

   public String getClientBehaviorRendererType();

   public FacesConfigClientBehaviorRendererType<T> setClientBehaviorRendererClazz(String clientBehaviorRendererClass);

   public String getClientBehaviorRendererClazz();
}
