package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class HandlerTypeImpl<T> implements Child<T>, HandlerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String handlerName;
   private String handlerClass;
   private ParamValueType<HandlerType<T>> initParam;
   private String soapHeader;
   private String soapRole;
   private String portName;

   private String description;
   private String displayName;
   private IconType<HandlerType<T>> icon;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public HandlerTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("handler");   }


   public T up()
   {
      return t;
   }



   public HandlerType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public HandlerType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public HandlerType<T> setIcon(IconType<HandlerType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<HandlerType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<HandlerType<T>>(this, "", childNode);
      }
      return icon;
   }



   public HandlerType<T> setHandlerName(String handlerName)
   {
      this.handlerName = handlerName;
      childNode.getOrCreate("handler-name").text(handlerName);
      return this;
   }

   public String getHandlerName()
   {
      return handlerName;
   }



   public HandlerType<T> setHandlerClass(String handlerClass)
   {
      this.handlerClass = handlerClass;
      childNode.getOrCreate("handler-class").text(handlerClass);
      return this;
   }

   public String getHandlerClass()
   {
      return handlerClass;
   }



   public HandlerType<T> setInitParam(ParamValueType<HandlerType<T>> initParam)
   {
      this.initParam = initParam;
      childNode.getOrCreate("init-param").text(initParam);
      return this;
   }

   public ParamValueType<HandlerType<T>> getInitParam()
   {
      if( initParam == null)
      {
          initParam = new ParamValueTypeImpl<HandlerType<T>>(this, "", childNode);
      }
      return initParam;
   }




   public HandlerType<T> setSoapHeader(String soapHeader)
   {
      this.soapHeader = soapHeader;
      childNode.getOrCreate("soap-header").text(soapHeader);
      return this;
   }

   public String getSoapHeader()
   {
      return soapHeader;
   }



   public HandlerType<T> setSoapRole(String soapRole)
   {
      this.soapRole = soapRole;
      childNode.getOrCreate("soap-role").text(soapRole);
      return this;
   }

   public String getSoapRole()
   {
      return soapRole;
   }



   public HandlerType<T> setPortName(String portName)
   {
      this.portName = portName;
      childNode.getOrCreate("port-name").text(portName);
      return this;
   }

   public String getPortName()
   {
      return portName;
   }

}
