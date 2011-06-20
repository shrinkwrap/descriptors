package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
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

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MessageDestinationRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MessageDestinationRefTypeImpl(T t, String descriptorName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : lookup-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> setLookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public MessageDestinationRefType<T> removeLookupName()
   {
      childNode.remove("lookup-name");
      return this;
   }

   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public MessageDestinationRefType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this, "", childNode);
   }

   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<MessageDestinationRefType<T>>> list = new ArrayList<InjectionTargetType<MessageDestinationRefType<T>>>();
      List<Node> nodeList = childNode.get(InjectionTargetTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         InjectionTargetType<MessageDestinationRefType<T>> type = new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(
               this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public MessageDestinationRefType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public MessageDestinationRefType<T> removeAllDescription()
   {
      childNode.remove("description");
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

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName)
   {
      childNode.getOrCreate("message-destination-ref-name").text(messageDestinationRefName);
      return this;
   }

   public MessageDestinationRefType<T> removeMessageDestinationRefName()
   {
      childNode.remove("message-destination-ref-name");
      return this;
   }

   public String getMessageDestinationRefName()
   {
      return childNode.textValue("message-destination-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType)
   {
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   public MessageDestinationRefType<T> removeMessageDestinationType()
   {
      childNode.remove("message-destination-type");
      return this;
   }

   public String getMessageDestinationType()
   {
      return childNode.textValue("message-destination-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-usage
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage)
   {
      childNode.getOrCreate("message-destination-usage").text(messageDestinationUsage);
      return this;
   }

   public MessageDestinationRefType<T> removeMessageDestinationUsage()
   {
      childNode.remove("message-destination-usage");
      return this;
   }

   public String getMessageDestinationUsage()
   {
      return childNode.textValue("message-destination-usage");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink)
   {
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   public MessageDestinationRefType<T> removeMessageDestinationLink()
   {
      childNode.remove("message-destination-link");
      return this;
   }

   public String getMessageDestinationLink()
   {
      return childNode.textValue("message-destination-link");
   }

}
