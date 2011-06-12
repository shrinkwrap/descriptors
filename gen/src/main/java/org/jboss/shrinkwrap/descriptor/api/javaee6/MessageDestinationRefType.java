package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface MessageDestinationRefType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public MessageDestinationRefType<T> setInjectionTarget(InjectionTargetType<MessageDestinationRefType<T>> injectionTarget);

   public InjectionTargetType<MessageDestinationRefType<T>> getInjectionTarget();
   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setDescription(String description);
   public MessageDestinationRefType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);

   public String getMessageDestinationRefName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);

   public String getMessageDestinationType();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage);

   public String getMessageDestinationUsage();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);

   public String getMessageDestinationLink();

}
