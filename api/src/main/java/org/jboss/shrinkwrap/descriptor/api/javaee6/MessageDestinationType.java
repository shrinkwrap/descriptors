package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface MessageDestinationType<T> extends Child<T>, DescriptionGroup<T>
{
   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName);
   public String getMessageDestinationName();

   public MessageDestinationType<T> setMappedName(String mappedName);
   public String getMappedName();

   public MessageDestinationType<T> setLookupName(String lookupName);
   public String getLookupName();
}
