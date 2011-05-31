package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface PortComponentRefType<T> extends Child<T>
{
   public PortComponentRefType<T> setServiceEndpointInterface(String serviceEndpointInterface);
   public String getServiceEndpointInterface();

   public PortComponentRefType<T> setEnableMtom(Boolean enableMtom);
   public Boolean getEnableMtom();

   public PortComponentRefType<T> setMtomThreshold(Integer mtomThreshold);
   public Integer getMtomThreshold();

   public PortComponentRefType<T> setAddressing(AddressingType<T> addressing);
   public AddressingType<T> getAddressing();

   public PortComponentRefType<T> setRespectBinding(RespectBindingType<T> respectBinding);
   public RespectBindingType<T> getRespectBinding();

   public PortComponentRefType<T> setPortComponentLink(String portComponentLink);
   public String getPortComponentLink();
}
