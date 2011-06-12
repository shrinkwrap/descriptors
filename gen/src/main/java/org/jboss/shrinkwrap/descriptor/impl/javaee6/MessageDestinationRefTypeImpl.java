package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class MessageDestinationRefTypeImpl<T> implements Child<T>, MessageDestinationRefType<T>
{
   public final static String nodeName = "message-destination-ref";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String messageDestinationRefName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String messageDestinationType;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String messageDestinationUsage;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String messageDestinationLink;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String lookupName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mappedName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private InjectionTargetType<MessageDestinationRefType<T>> injectionTarget;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MessageDestinationRefTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MessageDestinationRefTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setLookupName(String lookupName)   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setMappedName(String mappedName)   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setInjectionTarget(InjectionTargetType<MessageDestinationRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<MessageDestinationRefType<T>> getInjectionTarget()
   {
      return new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this, "", childNode);
   }

   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<MessageDestinationRefType<T>>> list = new ArrayList<InjectionTargetType<MessageDestinationRefType<T>>>();
      List<Node> nodeList = childNode.get(InjectionTargetTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         InjectionTargetType<MessageDestinationRefType<T>>  type = new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public MessageDestinationRefType<T> setDescription(String ... values)
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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName)   {
      this.messageDestinationRefName = messageDestinationRefName;
      childNode.getOrCreate("message-destination-ref-name").text(messageDestinationRefName);
      return this;
   }

   public String getMessageDestinationRefName()
   {
      return childNode.textValue("message-destination-ref-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType)   {
      this.messageDestinationType = messageDestinationType;
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   public String getMessageDestinationType()
   {
      return childNode.textValue("message-destination-type");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage)   {
      this.messageDestinationUsage = messageDestinationUsage;
      childNode.getOrCreate("message-destination-usage").text(messageDestinationUsage);
      return this;
   }

   public String getMessageDestinationUsage()
   {
      return childNode.textValue("message-destination-usage");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink)   {
      this.messageDestinationLink = messageDestinationLink;
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   public String getMessageDestinationLink()
   {
      return childNode.textValue("message-destination-link");
   }

}
