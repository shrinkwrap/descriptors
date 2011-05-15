package org.jboss.shrinkwrap.descriptor.api.webservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

public interface HandlerType<T> extends Child<T>, DescriptionGroup<T>
{
   public HandlerType<T> handlerName(String handlerName);

   public HandlerType<T> handlerClass(String handlerClass);

   public ParamValueType<HandlerType<T>> initParam();

   public HandlerType<T> soapHeader(String soapHeader);

   public HandlerType<T> soapRole(String soapRole);

   public HandlerType<T> portName(String portName);

}