package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MessageDestinationRefType<T> extends Child<T>, ResourceGroup<T>
{
   public MessageDestinationRefType<T> Description(String Description);

   public MessageDestinationRefType<T> MessageDestinationRefName(String MessageDestinationRefName);

   public MessageDestinationRefType<T> MessageDestinationType(String MessageDestinationType);

   public MessageDestinationRefType<T> MessageDestinationUsage(MessageDestinationUsageType MessageDestinationUsage);

   public MessageDestinationRefType<T> MessageDestinationLink(String MessageDestinationLink);
}
