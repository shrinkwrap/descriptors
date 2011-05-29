package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.RespectBindingType;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface PortComponentType<T> extends Child<T>
{
   public PortComponentType<T> setDescription(String description);

   public String getDescription();

   public PortComponentType<T> setDisplayName(String displayName);

   public String getDisplayName();

   public IconType<PortComponentType<T>> setIcon(IconType<T> icon);

   public IconType<PortComponentType<T>> getIcon();

   public PortComponentType<T> setPortComponentName(String portComponentName);

   public String getPortComponentName();

   public PortComponentType<T> setWsdlService(String wsdlService);

   public String getWsdlService();

   public PortComponentType<T> setWsdlPort(String wsdlPort);

   public String getWsdlPort();

   public PortComponentType<T> setEnableMtom(Boolean enableMtom);

   public Boolean getEnableMtom();

   public PortComponentType<T> setMtomThreshold(Integer mtomThreshold);

   public Integer getMtomThreshold();

   public AddressingType<PortComponentType<T>> setAddressing(AddressingType<T> addressing);

   public AddressingType<PortComponentType<T>> getAddressing();

   public RespectBindingType<PortComponentType<T>> setRespectBinding(RespectBindingType<T> respectBinding);

   public RespectBindingType<PortComponentType<T>> getRespectBinding();

   public PortComponentType<T> setProtocolBinding(String protocolBinding);

   public String getProtocolBinding();

   public PortComponentType<T> setServiceEndpointInterface(String serviceEndpointInterface);

   public String getServiceEndpointInterface();

   public ServiceImplBeanType<PortComponentType<T>> setServiceImplBean(ServiceImplBeanType<T> serviceImplBean);

   public ServiceImplBeanType<PortComponentType<T>> getServiceImplBean();
}
