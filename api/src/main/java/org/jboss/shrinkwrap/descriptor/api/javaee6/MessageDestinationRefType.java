package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MessageDestinationRefType<T> extends Child<T>, ResourceGroup<T>
{
   public MessageDestinationRefType<T> setDescription(String description);

   public String getDescription();

   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);

   public String getMessageDestinationRefName();

   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);

   public String getMessageDestinationType();

   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage);

   public String getMessageDestinationUsage();

   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);

   public String getMessageDestinationLink();
}
