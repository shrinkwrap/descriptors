package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface MessageDestinationRefType<T> extends Child<T>
{

   public MessageDestinationRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   public MessageDestinationRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   public MessageDestinationRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<MessageDestinationRefType<T>> getInjectionTarget();

   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList();

   public MessageDestinationRefType<T> setDescription(String description);

   public MessageDestinationRefType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);

   public String getMessageDestinationRefName();

   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);

   public String getMessageDestinationType();

   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage);

   public String getMessageDestinationUsage();

   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);

   public String getMessageDestinationLink();

}
