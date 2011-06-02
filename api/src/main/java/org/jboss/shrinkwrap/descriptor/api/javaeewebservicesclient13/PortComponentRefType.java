package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface PortComponentRefType<T> extends Child<T>
{
   public PortComponentRefType<T> setServiceEndpointInterface(Class<?> serviceEndpointInterface);

   public PortComponentRefType<T> setServiceEndpointInterface(String serviceEndpointInterface);

   @NodeInfo(xmlName = "service-endpoint-interface")
   public String getServiceEndpointInterface();

   public PortComponentRefType<T> setEnableMtom(Boolean enableMtom);

   @NodeInfo(xmlName = "enable-mtom")
   public Boolean getEnableMtom();

   public PortComponentRefType<T> setMtomThreshold(Integer mtomThreshold);

   @NodeInfo(xmlName = "mtom-threshold")
   public Integer getMtomThreshold();

   @NodeInfo(xmlName = "addressing")
   public AddressingType<PortComponentRefType<T>> addressing();

   @NodeInfo(xmlName = "respect-binding")
   public RespectBindingType<PortComponentRefType<T>> respectBinding();

   public PortComponentRefType<T> setPortComponentLink(String portComponentLink);

   @NodeInfo(xmlName = "port-component-link")
   public String getPortComponentLink();
}
