package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface MessageDestinationType<T> extends Child<T>
{

   public MessageDestinationType<T> setDescription(String description);
   public MessageDestinationType<T> setDescriptionList(String ... values);
   public MessageDestinationType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public MessageDestinationType<T> setDisplayName(String displayName);
   public MessageDestinationType<T> setDisplayNameList(String ... values);
   public MessageDestinationType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public MessageDestinationType<T> removeAllIcon();

   public IconType<MessageDestinationType<T>> icon();
   public List<IconType<MessageDestinationType<T>>> getIconList();



   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName);
   public MessageDestinationType<T> removeMessageDestinationName();

   public String getMessageDestinationName();



   public MessageDestinationType<T> setMappedName(String mappedName);
   public MessageDestinationType<T> removeMappedName();

   public String getMappedName();



   public MessageDestinationType<T> setLookupName(String lookupName);
   public MessageDestinationType<T> removeLookupName();

   public String getLookupName();

}
