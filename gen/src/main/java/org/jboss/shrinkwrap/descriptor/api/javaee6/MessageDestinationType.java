package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface MessageDestinationType<T> extends Child<T>
{

   public MessageDestinationType<T> setDescription(String description);

   public MessageDestinationType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public MessageDestinationType<T> setDisplayName(String displayName);

   public MessageDestinationType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public MessageDestinationType<T> removeAllIcon();

   public IconType<MessageDestinationType<T>> getIcon();

   public List<IconType<MessageDestinationType<T>>> getIconList();

   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName);

   public String getMessageDestinationName();

   public MessageDestinationType<T> setMappedName(String mappedName);

   public String getMappedName();

   public MessageDestinationType<T> setLookupName(String lookupName);

   public String getLookupName();

}
