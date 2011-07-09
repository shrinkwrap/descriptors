package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The port-component-ref element declares a client dependency
 * on the container for resolving a Service Endpoint Interface
 * to a WSDL port. It optionally associates the Service Endpoint
 * Interface with a particular port-component. This is only used
 * by the container for a Service.getPort(Class) method call.
 *
 *
 *
 */
public interface PortComponentRefType<T> extends Child<T>
{

   public PortComponentRefType<T> setServiceEndpointInterface(String serviceEndpointInterface);

   public PortComponentRefType<T> removeServiceEndpointInterface();

   public String getServiceEndpointInterface();

   public PortComponentRefType<T> setEnableMtom(Boolean enableMtom);

   public PortComponentRefType<T> removeEnableMtom();

   public Boolean isEnableMtom();

   public PortComponentRefType<T> setPortComponentLink(String portComponentLink);

   public PortComponentRefType<T> removePortComponentLink();

   public String getPortComponentLink();

}
