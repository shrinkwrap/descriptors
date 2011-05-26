package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PortComponentRefType<T> extends Child<T>
{
   public PortComponentRefType<T> setServiceEndpointInterface(String serviceEndpointInterface);

   public String getServiceEndpointInterface();

   public PortComponentRefType<T> setEnableMtom(Boolean enableMtom);

   public Boolean getEnableMtom();

   public PortComponentRefType<T> setMtomThreshold(Integer mtomThreshold);

   public Integer getMtomThreshold();

   public PortComponentRefType<T> setAddressing(AddressingType<T> addressing);

   public AddressingType<PortComponentRefType<T>> getAddressing();

   public PortComponentRefType<T> setRespectBinding(RespectBindingType<T> respectBinding);

   public RespectBindingType<PortComponentRefType<T>> getRespectBinding();

   public PortComponentRefType<T> setPortComponentLink(String portComponentLink);

   public String getPortComponentLink();
}
