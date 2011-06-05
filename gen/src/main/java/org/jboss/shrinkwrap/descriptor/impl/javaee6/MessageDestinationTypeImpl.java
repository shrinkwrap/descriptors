package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class MessageDestinationTypeImpl<T> implements Child<T>, MessageDestinationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String messageDestinationName;
   private String mappedName;
   private String lookupName;

   private String description;
   private String displayName;
   private IconType<MessageDestinationType<T>> icon;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MessageDestinationTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("message-destination");   }


   public T up()
   {
      return t;
   }



   public MessageDestinationType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public MessageDestinationType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public MessageDestinationType<T> setIcon(IconType<MessageDestinationType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<MessageDestinationType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<MessageDestinationType<T>>(this, "", childNode);
      }
      return icon;
   }



   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName)
   {
      this.messageDestinationName = messageDestinationName;
      childNode.getOrCreate("message-destination-name").text(messageDestinationName);
      return this;
   }

   public String getMessageDestinationName()
   {
      return messageDestinationName;
   }



   public MessageDestinationType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }



   public MessageDestinationType<T> setLookupName(String lookupName)
   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return lookupName;
   }

}
