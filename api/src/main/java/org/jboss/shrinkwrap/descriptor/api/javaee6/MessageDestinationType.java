package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MessageDestinationType<T> extends Child<T>, DescriptionGroup<T>
{
   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName);

   public String getMessageDestinationName();

   public MessageDestinationType<T> setMappedName(String mappedName);

   public String getMappedName();

   public MessageDestinationType<T> setLookupName(String lookupName);

   public String getLookupName();
}
