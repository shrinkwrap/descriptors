package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class MessageDestinationTypeImpl<T> implements Child<T>, MessageDestinationType<T>
{
   public final static String nodeName = "message-destination";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String messageDestinationName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mappedName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String lookupName;

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private IconType<MessageDestinationType<T>> icon;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MessageDestinationTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MessageDestinationTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public MessageDestinationType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public MessageDestinationType<T> setDescription(String ... values)
   {
      for(String name: values)
      {
         setDescription(description);
      }
         return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public MessageDestinationType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public MessageDestinationType<T> setDisplayName(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(displayName);
      }
         return this;
   }

   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public MessageDestinationType<T> setIcon(IconType<MessageDestinationType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<MessageDestinationType<T>> getIcon()
   {
      return new IconTypeImpl<MessageDestinationType<T>>(this, "", childNode);
   }

   public List<IconType<MessageDestinationType<T>>> getIconList()
   {
      List<IconType<MessageDestinationType<T>>> list = new ArrayList<IconType<MessageDestinationType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<MessageDestinationType<T>>  type = new IconTypeImpl<MessageDestinationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName)   {
      this.messageDestinationName = messageDestinationName;
      childNode.getOrCreate("message-destination-name").text(messageDestinationName);
      return this;
   }

   public String getMessageDestinationName()
   {
      return childNode.textValue("message-destination-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationType<T> setMappedName(String mappedName)   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationType<T> setLookupName(String lookupName)   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

}
