package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationUsageType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public interface MessageDestinationRefType<T> extends Child<T>
{

   public MessageDestinationRefType<T> setJndiName(String jndiName);

   public MessageDestinationRefType<T> removeJndiName();

   public String getJndiName();

   public MessageDestinationRefType<T> setMappedName(String mappedName);

   public MessageDestinationRefType<T> removeMappedName();

   public String getMappedName();

   public MessageDestinationRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget();

   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList();

   public MessageDestinationRefType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

   public MessageDestinationRefType<T> setDescription(String description);

   public MessageDestinationRefType<T> setDescriptionList(String... values);

   public MessageDestinationRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);

   public MessageDestinationRefType<T> removeMessageDestinationRefName();

   public String getMessageDestinationRefName();

   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);

   public MessageDestinationRefType<T> removeMessageDestinationType();

   public String getMessageDestinationType();

   public MessageDestinationRefType<T> setMessageDestinationUsage(MessageDestinationUsageType messageDestinationUsage);

   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage);

   public MessageDestinationUsageType getMessageDestinationUsage();

   public String getMessageDestinationUsageAsString();

   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);

   public MessageDestinationRefType<T> removeMessageDestinationLink();

   public String getMessageDestinationLink();

}
