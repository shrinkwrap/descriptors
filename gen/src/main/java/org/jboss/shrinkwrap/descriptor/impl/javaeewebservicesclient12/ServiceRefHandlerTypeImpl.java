package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * Declares the handler for a port-component. Handlers can access the
 * init-param name/value pairs using the HandlerInfo interface. If
 * port-name is not specified, the handler is assumed to be associated
 * with all ports of the service.
 *
 * Used in: service-ref
 *
 *
 *
 */
public class ServiceRefHandlerTypeImpl<T> implements Child<T>, ServiceRefHandlerType<T>
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

   public ServiceRefHandlerTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ServiceRefHandlerTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefHandlerType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ServiceRefHandlerType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ServiceRefHandlerType<T> removeAllDescription()
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
   public ServiceRefHandlerType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public ServiceRefHandlerType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public ServiceRefHandlerType<T> removeAllDisplayName()
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
   public ServiceRefHandlerType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<ServiceRefHandlerType<T>> icon()
   {
      return new IconTypeImpl<ServiceRefHandlerType<T>>(this, "icon", childNode);
   }

   public List<IconType<ServiceRefHandlerType<T>>> getIconList()
   {
      List<IconType<ServiceRefHandlerType<T>>> list = new ArrayList<IconType<ServiceRefHandlerType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<ServiceRefHandlerType<T>> type = new IconTypeImpl<ServiceRefHandlerType<T>>(this, "icon", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefHandlerType<T> setHandlerName(String handlerName)
   {
      childNode.getOrCreate("handler-name").text(handlerName);
      return this;
   }

   public ServiceRefHandlerType<T> removeHandlerName()
   {
      childNode.remove("handler-name");
      return this;
   }

   public String getHandlerName()
   {
      return childNode.textValue("handler-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefHandlerType<T> setHandlerClass(String handlerClass)
   {
      childNode.getOrCreate("handler-class").text(handlerClass);
      return this;
   }

   public ServiceRefHandlerType<T> removeHandlerClass()
   {
      childNode.remove("handler-class");
      return this;
   }

   public String getHandlerClass()
   {
      return childNode.textValue("handler-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : init-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefHandlerType<T> removeAllInitParam()
   {
      childNode.remove("init-param");
      return this;
   }

   public ParamValueType<ServiceRefHandlerType<T>> initParam()
   {
      return new ParamValueTypeImpl<ServiceRefHandlerType<T>>(this, "init-param", childNode);
   }

   public List<ParamValueType<ServiceRefHandlerType<T>>> getInitParamList()
   {
      List<ParamValueType<ServiceRefHandlerType<T>>> list = new ArrayList<ParamValueType<ServiceRefHandlerType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for (Node node : nodeList)
      {
         ParamValueType<ServiceRefHandlerType<T>> type = new ParamValueTypeImpl<ServiceRefHandlerType<T>>(this,
               "init-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : soap-header
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefHandlerType<T> setSoapHeader(String soapHeader)
   {
      childNode.create("soap-header").text(soapHeader);
      return this;
   }

   public ServiceRefHandlerType<T> setSoapHeaderList(String... values)
   {
      for (String name : values)
      {
         setSoapHeader(name);
      }
      return this;
   }

   public ServiceRefHandlerType<T> removeAllSoapHeader()
   {
      childNode.remove("soap-header");
      return this;
   }

   public List<String> getSoapHeaderList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("soap-header");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : soap-role
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefHandlerType<T> setSoapRole(String soapRole)
   {
      childNode.create("soap-role").text(soapRole);
      return this;
   }

   public ServiceRefHandlerType<T> setSoapRoleList(String... values)
   {
      for (String name : values)
      {
         setSoapRole(name);
      }
      return this;
   }

   public ServiceRefHandlerType<T> removeAllSoapRole()
   {
      childNode.remove("soap-role");
      return this;
   }

   public List<String> getSoapRoleList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("soap-role");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefHandlerType<T> setPortName(String portName)
   {
      childNode.create("port-name").text(portName);
      return this;
   }

   public ServiceRefHandlerType<T> setPortNameList(String... values)
   {
      for (String name : values)
      {
         setPortName(name);
      }
      return this;
   }

   public ServiceRefHandlerType<T> removeAllPortName()
   {
      childNode.remove("port-name");
      return this;
   }

   public List<String> getPortNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("port-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
