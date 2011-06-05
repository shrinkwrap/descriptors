package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface MessageDestinationRefType<T> extends Child<T>
{

   public MessageDestinationRefType<T> setLookupName(String lookupName);
   public String getLookupName();

   public MessageDestinationRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public MessageDestinationRefType<T> setInjectionTarget(InjectionTargetType<MessageDestinationRefType<T>> injectionTarget);
   public InjectionTargetType<MessageDestinationRefType<T>> getInjectionTarget();


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
