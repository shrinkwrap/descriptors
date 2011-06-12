package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class ListenerTypeImpl<T> implements Child<T>, ListenerType<T>
{
   public final static String nodeName = "listener";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String listenerClass;

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private IconType<ListenerType<T>> icon;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ListenerTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ListenerTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ListenerType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ListenerType<T> setDescription(String ... values)
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

   public ListenerType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public ListenerType<T> setDisplayName(String ... values)
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

   public ListenerType<T> setIcon(IconType<ListenerType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<ListenerType<T>> getIcon()
   {
      return new IconTypeImpl<ListenerType<T>>(this, "", childNode);
   }

   public List<IconType<ListenerType<T>>> getIconList()
   {
      List<IconType<ListenerType<T>>> list = new ArrayList<IconType<ListenerType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<ListenerType<T>>  type = new IconTypeImpl<ListenerType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ListenerType<T> setListenerClass(String listenerClass)   {
      this.listenerClass = listenerClass;
      childNode.getOrCreate("listener-class").text(listenerClass);
      return this;
   }

   public String getListenerClass()
   {
      return childNode.textValue("listener-class");
   }

}
