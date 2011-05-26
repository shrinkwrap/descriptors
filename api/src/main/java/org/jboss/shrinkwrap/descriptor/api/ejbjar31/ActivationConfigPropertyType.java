package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ActivationConfigPropertyType<T> extends Child<T>
{
   public ActivationConfigPropertyType<T> setActivationConfigPropertyName(String activationConfigPropertyName);

   public String getActivationConfigPropertyName();

   public ActivationConfigPropertyType<T> setActivationConfigPropertyValue(String activationConfigPropertyValue);

   public String getActivationConfigPropertyValue();
}
