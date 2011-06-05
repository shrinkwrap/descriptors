package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class MessageDestinationRefTypeImpl<T> implements Child<T>, MessageDestinationRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String messageDestinationRefName;
   private String messageDestinationType;
   private String messageDestinationUsage;
   private String messageDestinationLink;

   private String lookupName;
   private String mappedName;
   private InjectionTargetType<MessageDestinationRefType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MessageDestinationRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("message-destination-ref");   }


   public T up()
   {
      return t;
   }



   public MessageDestinationRefType<T> setLookupName(String lookupName)
   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return lookupName;
   }


   public MessageDestinationRefType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public MessageDestinationRefType<T> setInjectionTarget(InjectionTargetType<MessageDestinationRefType<T>> injectionTarget)
   {
      this.injectionTarget = injectionTarget;
      childNode.getOrCreate("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<MessageDestinationRefType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public MessageDestinationRefType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName)
   {
      this.messageDestinationRefName = messageDestinationRefName;
      childNode.getOrCreate("message-destination-ref-name").text(messageDestinationRefName);
      return this;
   }

   public String getMessageDestinationRefName()
   {
      return messageDestinationRefName;
   }



   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType)
   {
      this.messageDestinationType = messageDestinationType;
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   public String getMessageDestinationType()
   {
      return messageDestinationType;
   }



   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage)
   {
      this.messageDestinationUsage = messageDestinationUsage;
      childNode.getOrCreate("message-destination-usage").text(messageDestinationUsage);
      return this;
   }

   public String getMessageDestinationUsage()
   {
      return messageDestinationUsage;
   }



   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink)
   {
      this.messageDestinationLink = messageDestinationLink;
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   public String getMessageDestinationLink()
   {
      return messageDestinationLink;
   }

}
