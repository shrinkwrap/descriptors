package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface MessageDestinationType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public MessageDestinationType<T> setDescription(String description);
   public MessageDestinationType<T> setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public MessageDestinationType<T> setDisplayName(String displayName);
   public MessageDestinationType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public MessageDestinationType<T> setIcon(IconType<MessageDestinationType<T>> icon);

   public IconType<MessageDestinationType<T>> getIcon();
   public List<IconType<MessageDestinationType<T>>> getIconList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName);

   public String getMessageDestinationName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationType<T> setMappedName(String mappedName);

   public String getMappedName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationType<T> setLookupName(String lookupName);

   public String getLookupName();

}
