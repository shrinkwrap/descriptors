package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface MessageDestinationRefType<T> extends Child<T>, ResourceGroup<T>

{
   public MessageDestinationRefType<T> setDescription(String description);

   public String getDescription();

   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);

   public String getMessageDestinationRefName();

   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);

   public String getMessageDestinationType();

   public MessageDestinationRefType<T> setMessageDestinationUsage(MessageDestinationUsageType messageDestinationUsage);

   public MessageDestinationUsageType getMessageDestinationUsage();

   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);

   public String getMessageDestinationLink();
}
