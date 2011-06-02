package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface MessageDestinationRefType<T> extends Child<T>
{
   public MessageDestinationRefType<T> setLookupName(String lookupName);

   @NodeInfo(xmlName = "lookup-name")
   public String getLookupName();

   public MessageDestinationRefType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget();

   public MessageDestinationRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);

   @NodeInfo(xmlName = "message-destination-ref-name")
   public String getMessageDestinationRefName();

   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);

   @NodeInfo(xmlName = "message-destination-type")
   public String getMessageDestinationType();

   public MessageDestinationRefType<T> setMessageDestinationUsage(MessageDestinationUsageType messageDestinationUsage);

   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage);

   @NodeInfo(xmlName = "message-destination-usage")
   public String getMessageDestinationUsage();

   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);

   @NodeInfo(xmlName = "message-destination-link")
   public String getMessageDestinationLink();
}
