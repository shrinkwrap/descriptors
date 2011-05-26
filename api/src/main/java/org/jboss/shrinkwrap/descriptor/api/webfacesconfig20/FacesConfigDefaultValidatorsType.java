package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigDefaultValidatorsType<T> extends Child<T>
{
   public FacesConfigDefaultValidatorsType<T> setValidatorId(String validatorId);

   public String getValidatorId();
}
