package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface ServiceRefType<T> extends Child<T>
{

   public ServiceRefType<T> setDescription(String description);
   public String getDescription();

   public ServiceRefType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public ServiceRefType<T> setIcon(IconType<ServiceRefType<T>> icon);
   public IconType<ServiceRefType<T>> getIcon();


   public ServiceRefType<T> setLookupName(String lookupName);
   public String getLookupName();

   public ServiceRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public ServiceRefType<T> setInjectionTarget(InjectionTargetType<ServiceRefType<T>> injectionTarget);
   public InjectionTargetType<ServiceRefType<T>> getInjectionTarget();


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


   public ServiceRefType<T> setPortComponentRef(PortComponentRefType<ServiceRefType<T>> portComponentRef);
   public PortComponentRefType<ServiceRefType<T>> getPortComponentRef();



   public ServiceRefType<T> setHandler(HandlerType<ServiceRefType<T>> handler);
   public HandlerType<ServiceRefType<T>> getHandler();



   public ServiceRefType<T> setHandlerChains(HandlerChainsType<ServiceRefType<T>> handlerChains);
   public HandlerChainsType<ServiceRefType<T>> getHandlerChains();

}
