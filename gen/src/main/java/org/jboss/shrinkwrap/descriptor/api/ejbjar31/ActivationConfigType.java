package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface ActivationConfigType<T> extends Child<T>
{

   public ActivationConfigType<T> setDescription(String description);
   public String getDescription();


   public ActivationConfigType<T> setActivationConfigProperty(ActivationConfigPropertyType<ActivationConfigType<T>> activationConfigProperty);
   public ActivationConfigPropertyType<ActivationConfigType<T>> getActivationConfigProperty();

}