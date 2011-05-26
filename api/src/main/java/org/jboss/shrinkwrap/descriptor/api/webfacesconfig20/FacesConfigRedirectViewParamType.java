package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigRedirectViewParamType<T> extends Child<T>
{
   public FacesConfigRedirectViewParamType<T> setName(String name);

   public String getName();

   public FacesConfigRedirectViewParamType<T> setValue(String value);

   public String getValue();
}
