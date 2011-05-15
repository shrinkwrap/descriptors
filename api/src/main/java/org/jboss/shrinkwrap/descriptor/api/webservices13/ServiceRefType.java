package org.jboss.shrinkwrap.descriptor.api.webservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceGroup;

public interface ServiceRefType<T> extends Child<T>, DescriptionGroup<T>, ResourceGroup<T>
{
   public ServiceRefType<T> serviceRefName(String serviceRefName);

   public ServiceRefType<T> serviceInterface(String serviceInterface);

   public ServiceRefType<T> serviceRefType(String serviceRefType);

   public ServiceRefType<T> wsdlFile(String wsdlFile);

   public ServiceRefType<T> jaxrpcMappingFile(String jaxrpcMappingFile);

   public ServiceRefType<T> serviceQname(String serviceQname);

   public PortComponentRefType<ServiceRefType<T>> portComponentRef();

   public HandlerType<ServiceRefType<T>> handler();

   public HandlerChainType<ServiceRefType<T>> handlerChains();

}