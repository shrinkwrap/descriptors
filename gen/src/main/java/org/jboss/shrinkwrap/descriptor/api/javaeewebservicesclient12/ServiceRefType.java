package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The service-ref element declares a reference to a Web service. It contains
 * optional description, display name and icons, a declaration of the required
 * Service interface, an optional WSDL document location, an optional set of
 * JAX-RPC mappings, an optional QName for the service element, an optional set
 * of Service Endpoint Interfaces to be resolved by the container to a WSDL
 * port, and an optional set of handlers.
 * 
 * 
 * 
 */
public interface ServiceRefType<T> extends Child<T> {

	public ServiceRefType<T> setDescription(String description);

	public ServiceRefType<T> setDescriptionList(String... values);

	public ServiceRefType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ServiceRefType<T> setDisplayName(String displayName);

	public ServiceRefType<T> setDisplayNameList(String... values);

	public ServiceRefType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public ServiceRefType<T> removeAllIcon();

	public IconType<ServiceRefType<T>> icon();

	public List<IconType<ServiceRefType<T>>> getIconList();

	public ServiceRefType<T> setMappedName(String mappedName);

	public ServiceRefType<T> removeMappedName();

	public String getMappedName();

	public ServiceRefType<T> removeAllInjectionTarget();

	public InjectionTargetType<ServiceRefType<T>> injectionTarget();

	public List<InjectionTargetType<ServiceRefType<T>>> getInjectionTargetList();

	public ServiceRefType<T> setServiceRefName(String serviceRefName);

	public ServiceRefType<T> removeServiceRefName();

	public String getServiceRefName();

	public ServiceRefType<T> setServiceInterface(String serviceInterface);

	public ServiceRefType<T> removeServiceInterface();

	public String getServiceInterface();

	public ServiceRefType<T> setServiceRefType(String serviceRefType);

	public ServiceRefType<T> removeServiceRefType();

	public String getServiceRefType();

	public ServiceRefType<T> setWsdlFile(String wsdlFile);

	public ServiceRefType<T> removeWsdlFile();

	public String getWsdlFile();

	public ServiceRefType<T> setJaxrpcMappingFile(String jaxrpcMappingFile);

	public ServiceRefType<T> removeJaxrpcMappingFile();

	public String getJaxrpcMappingFile();

	public ServiceRefType<T> setServiceQname(String serviceQname);

	public ServiceRefType<T> removeServiceQname();

	public String getServiceQname();

	public ServiceRefType<T> removeAllPortComponentRef();

	public PortComponentRefType<ServiceRefType<T>> portComponentRef();

	public List<PortComponentRefType<ServiceRefType<T>>> getPortComponentRefList();

	public ServiceRefType<T> removeAllHandler();

	public ServiceRefHandlerType<ServiceRefType<T>> handler();

	public List<ServiceRefHandlerType<ServiceRefType<T>>> getHandlerList();

	public ServiceRefType<T> removeHandlerChains();

	public ServiceRefHandlerChainsType<ServiceRefType<T>> handlerChains();

}
