package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface InboundResourceadapterType<T> extends Child<T>
{
   public InboundResourceadapterType<T> setMessageadapter(MessageadapterType<T> messageadapter);

   public MessageadapterType<InboundResourceadapterType<T>> getMessageadapter();
}
