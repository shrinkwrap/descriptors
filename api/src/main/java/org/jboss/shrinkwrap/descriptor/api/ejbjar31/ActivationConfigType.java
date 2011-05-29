package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface ActivationConfigType<T> extends Child<T>
{
   public ActivationConfigType<T> setDescription(String description);

   public String getDescription();

   public ActivationConfigPropertyType<ActivationConfigType<T>> setActivationConfigProperty(
         ActivationConfigPropertyType<T> activationConfigProperty);

   public ActivationConfigPropertyType<ActivationConfigType<T>> getActivationConfigProperty();
}
