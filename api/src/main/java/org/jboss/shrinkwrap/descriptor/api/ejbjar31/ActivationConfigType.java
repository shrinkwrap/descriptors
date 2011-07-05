package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The activation-configType defines information about the
 * expected configuration properties of the message-driven bean
 * in its operational environment. This may include information
 * about message acknowledgement, message selector, expected
 * destination type, etc.
 *
 * The configuration information is expressed in terms of
 * name/value configuration properties.
 *
 * The properties that are recognized for a particular
 * message-driven bean are determined by the messaging type.
 *
 *
 *
 */
public interface ActivationConfigType<T> extends Child<T>
{

   public ActivationConfigType<T> setDescription(String description);

   public ActivationConfigType<T> setDescriptionList(String... values);

   public ActivationConfigType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public ActivationConfigType<T> removeAllActivationConfigProperty();

   public ActivationConfigPropertyType<ActivationConfigType<T>> activationConfigProperty();

   public List<ActivationConfigPropertyType<ActivationConfigType<T>>> getActivationConfigPropertyList();

}
