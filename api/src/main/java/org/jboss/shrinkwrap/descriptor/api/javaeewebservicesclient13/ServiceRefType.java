package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceGroup;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface ServiceRefType<T> extends Child<T>, DescriptionGroup<T>, ResourceGroup<T>

{
   public ServiceRefType<T> setServiceRefName(String serviceRefName);

   public String getServiceRefName();

   public ServiceRefType<T> setServiceInterface(String serviceInterface);

   public String getServiceInterface();

   public ServiceRefType<T> setServiceRefType(String serviceRefType);

   public String getServiceRefType();

   public ServiceRefType<T> setWsdlFile(String wsdlFile);

   public String getWsdlFile();

   public ServiceRefType<T> setJaxrpcMappingFile(String jaxrpcMappingFile);

   public String getJaxrpcMappingFile();

   public ServiceRefType<T> setServiceQname(String serviceQname);

   public String getServiceQname();

   public PortComponentRefType<ServiceRefType<T>> setPortComponentRef(PortComponentRefType<T> portComponentRef);

   public PortComponentRefType<ServiceRefType<T>> getPortComponentRef();
}
