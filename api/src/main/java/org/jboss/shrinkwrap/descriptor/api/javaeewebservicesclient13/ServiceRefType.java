package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ServiceRefType<T> extends Child<T>
{
   public ServiceRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public ServiceRefType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<ServiceRefType<T>> icon();

   public ServiceRefType<T> setLookupName(String lookupName);

   @NodeInfo(xmlName = "lookup-name")
   public String getLookupName();

   public ServiceRefType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<ServiceRefType<T>> injectionTarget();

   public ServiceRefType<T> setServiceRefName(String serviceRefName);

   @NodeInfo(xmlName = "service-ref-name")
   public String getServiceRefName();

   public ServiceRefType<T> setServiceInterface(Class<?> serviceInterface);

   public ServiceRefType<T> setServiceInterface(String serviceInterface);

   @NodeInfo(xmlName = "service-interface")
   public String getServiceInterface();

   public ServiceRefType<T> setServiceRefType(Class<?> serviceRefType);

   public ServiceRefType<T> setServiceRefType(String serviceRefType);

   @NodeInfo(xmlName = "service-ref-type")
   public String getServiceRefType();

   public ServiceRefType<T> setWsdlFile(String wsdlFile);

   @NodeInfo(xmlName = "wsdl-file")
   public String getWsdlFile();

   public ServiceRefType<T> setJaxrpcMappingFile(String jaxrpcMappingFile);

   @NodeInfo(xmlName = "jaxrpc-mapping-file")
   public String getJaxrpcMappingFile();

   public ServiceRefType<T> setServiceQname(String serviceQname);

   @NodeInfo(xmlName = "service-qname")
   public String getServiceQname();

   @NodeInfo(xmlName = "port-component-ref")
   public PortComponentRefType<ServiceRefType<T>> portComponentRef();

   @NodeInfo(xmlName = "handler")
   public HandlerType<ServiceRefType<T>> handler();

   @NodeInfo(xmlName = "handler-chains")
   public HandlerChainsType<ServiceRefType<T>> handlerChains();
}
