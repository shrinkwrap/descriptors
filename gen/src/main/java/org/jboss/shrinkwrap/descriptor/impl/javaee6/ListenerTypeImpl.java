package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The listenerType indicates the deployment properties for a web
 * application listener bean.
 *
 *
 *
 */
public class ListenerTypeImpl<T> implements Child<T>, ListenerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ListenerTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ListenerTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ListenerType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public ListenerType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public ListenerType<T> removeAllDescription()
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
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ListenerType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }
   public ListenerType<T> setDisplayNameList(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(name);
      }
      return this;
   }
   public ListenerType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
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


   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ListenerType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<ListenerType<T>> icon()
   {
      return new IconTypeImpl<ListenerType<T>>(this, "icon", childNode);
   }

   public List<IconType<ListenerType<T>>> getIconList()
   {
      List<IconType<ListenerType<T>>> list = new ArrayList<IconType<ListenerType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<ListenerType<T>>  type = new IconTypeImpl<ListenerType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : listener-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ListenerType<T> setListenerClass(String listenerClass)
   {
      childNode.getOrCreate("listener-class").text(listenerClass);
      return this;
   }
   public ListenerType<T> removeListenerClass()
   {
      childNode.remove("listener-class");
      return this;
   }

   public String getListenerClass()
   {
      return childNode.textValue("listener-class");
   }

}