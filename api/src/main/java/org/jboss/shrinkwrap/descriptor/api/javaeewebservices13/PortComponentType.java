package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.RespectBindingType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface PortComponentType<T> extends Child<T>
{
   public PortComponentType<T> setDescription(String description);
   public String getDescription();

   public PortComponentType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public PortComponentType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

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

   public PortComponentType<T> setAddressing(AddressingType<T> addressing);
   public AddressingType<T> getAddressing();

   public PortComponentType<T> setRespectBinding(RespectBindingType<T> respectBinding);
   public RespectBindingType<T> getRespectBinding();

   public PortComponentType<T> setProtocolBinding(String protocolBinding);
   public String getProtocolBinding();

   public PortComponentType<T> setServiceEndpointInterface(String serviceEndpointInterface);
   public String getServiceEndpointInterface();

   public PortComponentType<T> setServiceImplBean(ServiceImplBeanType<T> serviceImplBean);
   public ServiceImplBeanType<T> getServiceImplBean();
}
