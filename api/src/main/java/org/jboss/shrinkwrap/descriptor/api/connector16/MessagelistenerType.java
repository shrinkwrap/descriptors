package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MessagelistenerType<T> extends Child<T>
{
   public MessagelistenerType<T> setMessagelistenerType(String messagelistenerType);

   public String getMessagelistenerType();

   public MessagelistenerType<T> setActivationspec(ActivationspecType<T> activationspec);

   public ActivationspecType<MessagelistenerType<T>> getActivationspec();
}
