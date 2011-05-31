package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface HandlerType<T> extends Child<T>
{
   public HandlerType<T> setDescription(String description);
   public String getDescription();

   public HandlerType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public HandlerType<T> setIcon(IconType<HandlerType<T>> icon);
   public IconType<HandlerType<T>> getIcon();

   public HandlerType<T> setHandlerName(String handlerName);
   public String getHandlerName();

   public HandlerType<T> setHandlerClass(String handlerClass);
   public String getHandlerClass();

   public HandlerType<T> setInitParam(ParamValueType<HandlerType<T>> initParam);
   public ParamValueType<HandlerType<T>> getInitParam();

   public HandlerType<T> setSoapHeader(String soapHeader);
   public String getSoapHeader();

   public HandlerType<T> setSoapRole(String soapRole);
   public String getSoapRole();

   public HandlerType<T> setPortName(String portName);
   public String getPortName();
}
