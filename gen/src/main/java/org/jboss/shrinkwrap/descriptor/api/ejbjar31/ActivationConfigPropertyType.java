package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The activation-config-propertyType contains a name/value
 * configuration property pair for a message-driven bean.
 *
 * The properties that are recognized for a particular
 * message-driven bean are determined by the messaging type.
 *
 *
 *
 */
public interface ActivationConfigPropertyType<T> extends Child<T>
{

   public ActivationConfigPropertyType<T> setActivationConfigPropertyName(String activationConfigPropertyName);

   public ActivationConfigPropertyType<T> removeActivationConfigPropertyName();

   public String getActivationConfigPropertyName();

   public ActivationConfigPropertyType<T> setActivationConfigPropertyValue(String activationConfigPropertyValue);

   public ActivationConfigPropertyType<T> removeActivationConfigPropertyValue();

   public String getActivationConfigPropertyValue();

}
