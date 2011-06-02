package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface MessageDestinationType<T> extends Child<T>
{
   public MessageDestinationType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public MessageDestinationType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<MessageDestinationType<T>> icon();

   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName);

   @NodeInfo(xmlName = "message-destination-name")
   public String getMessageDestinationName();

   public MessageDestinationType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   public MessageDestinationType<T> setLookupName(String lookupName);

   @NodeInfo(xmlName = "lookup-name")
   public String getLookupName();
}
