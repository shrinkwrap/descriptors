package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerChainsType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.RespectBindingType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface PortComponentType<T> extends Child<T>
{
   public PortComponentType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public PortComponentType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<PortComponentType<T>> icon();

   public PortComponentType<T> setPortComponentName(String portComponentName);

   @NodeInfo(xmlName = "port-component-name")
   public String getPortComponentName();

   public PortComponentType<T> setWsdlService(String wsdlService);

   @NodeInfo(xmlName = "wsdl-service")
   public String getWsdlService();

   public PortComponentType<T> setWsdlPort(String wsdlPort);

   @NodeInfo(xmlName = "wsdl-port")
   public String getWsdlPort();

   public PortComponentType<T> setEnableMtom(Boolean enableMtom);

   @NodeInfo(xmlName = "enable-mtom")
   public Boolean getEnableMtom();

   public PortComponentType<T> setMtomThreshold(Integer mtomThreshold);

   @NodeInfo(xmlName = "mtom-threshold")
   public Integer getMtomThreshold();

   @NodeInfo(xmlName = "addressing")
   public AddressingType<PortComponentType<T>> addressing();

   @NodeInfo(xmlName = "respect-binding")
   public RespectBindingType<PortComponentType<T>> respectBinding();

   public PortComponentType<T> setProtocolBinding(String protocolBinding);

   @NodeInfo(xmlName = "protocol-binding")
   public String getProtocolBinding();

   public PortComponentType<T> setServiceEndpointInterface(Class<?> serviceEndpointInterface);

   public PortComponentType<T> setServiceEndpointInterface(String serviceEndpointInterface);

   @NodeInfo(xmlName = "service-endpoint-interface")
   public String getServiceEndpointInterface();

   @NodeInfo(xmlName = "service-impl-bean")
   public ServiceImplBeanType<PortComponentType<T>> serviceImplBean();

   @NodeInfo(xmlName = "handler")
   public HandlerType<PortComponentType<T>> handler();

   @NodeInfo(xmlName = "handler-chains")
   public HandlerChainsType<PortComponentType<T>> handlerChains();
}
