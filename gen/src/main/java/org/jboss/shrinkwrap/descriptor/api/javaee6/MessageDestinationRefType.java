package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface MessageDestinationRefType<T> extends Child<T>
{

   public MessageDestinationRefType<T> setLookupName(String lookupName);
   public MessageDestinationRefType<T> removeLookupName();

   public String getLookupName();


   public MessageDestinationRefType<T> setMappedName(String mappedName);
   public MessageDestinationRefType<T> removeMappedName();

   public String getMappedName();


   public MessageDestinationRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget();
   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList();



   public MessageDestinationRefType<T> setDescription(String description);
   public MessageDestinationRefType<T> setDescriptionList(String ... values);
   public MessageDestinationRefType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);
   public MessageDestinationRefType<T> removeMessageDestinationRefName();

   public String getMessageDestinationRefName();



   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);
   public MessageDestinationRefType<T> removeMessageDestinationType();

   public String getMessageDestinationType();



   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage);
   public MessageDestinationRefType<T> removeMessageDestinationUsage();

   public String getMessageDestinationUsage();



   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);
   public MessageDestinationRefType<T> removeMessageDestinationLink();

   public String getMessageDestinationLink();

}
