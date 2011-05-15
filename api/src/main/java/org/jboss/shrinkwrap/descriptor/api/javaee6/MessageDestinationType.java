package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MessageDestinationType<T> extends Child<T>, DescriptionGroup<T>
{
   public MessageDestinationType<T> messageDestinationName(String messageDestinationName);

   public MessageDestinationType<T> mappedName(String mappedName);

   public MessageDestinationType<T> lookupName(String lookupName);
}