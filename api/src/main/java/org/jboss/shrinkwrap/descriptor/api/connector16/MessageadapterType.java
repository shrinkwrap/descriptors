package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MessageadapterType<T> extends Child<T>
{
   public MessageadapterType<T> setMessagelistener(MessagelistenerType<T> messagelistener);

   public MessagelistenerType<MessageadapterType<T>> getMessagelistener();
}
