package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ActivationConfigType<T> extends Child<T>
{
   public ActivationConfigType<T> setDescription(String description);

   public String getDescription();

   public ActivationConfigType<T> setActivationConfigProperty(ActivationConfigPropertyType<T> activationConfigProperty);

   public ActivationConfigPropertyType<ActivationConfigType<T>> getActivationConfigProperty();
}
