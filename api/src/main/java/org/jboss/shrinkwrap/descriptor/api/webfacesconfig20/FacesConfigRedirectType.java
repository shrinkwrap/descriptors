package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigRedirectType<T> extends Child<T>
{
   public FacesConfigRedirectType<T> setViewParam(FacesConfigRedirectViewParamType<T> viewParam);

   public FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>> getViewParam();
}
