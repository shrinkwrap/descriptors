package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.RespectBindingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class PortComponentRefTypeImpl<T> implements Child<T>, PortComponentRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String serviceEndpointInterface;
   private Boolean enableMtom;
   private Integer mtomThreshold;
   private AddressingType<PortComponentRefType<T>> addressing;
   private RespectBindingType<PortComponentRefType<T>> respectBinding;
   private String portComponentLink;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PortComponentRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("port-component-ref");   }


   public T up()
   {
      return t;
   }



   public PortComponentRefType<T> setServiceEndpointInterface(String serviceEndpointInterface)
   {
      this.serviceEndpointInterface = serviceEndpointInterface;
      childNode.getOrCreate("service-endpoint-interface").text(serviceEndpointInterface);
      return this;
   }

   public String getServiceEndpointInterface()
   {
      return serviceEndpointInterface;
   }



   public PortComponentRefType<T> setEnableMtom(Boolean enableMtom)
   {
      this.enableMtom = enableMtom;
      childNode.getOrCreate("enable-mtom").text(enableMtom);
      return this;
   }

   public Boolean getEnableMtom()
   {
      return enableMtom;
   }



   public PortComponentRefType<T> setMtomThreshold(Integer mtomThreshold)
   {
      this.mtomThreshold = mtomThreshold;
      childNode.getOrCreate("mtom-threshold").text(mtomThreshold);
      return this;
   }

   public Integer getMtomThreshold()
   {
      return mtomThreshold;
   }



   public PortComponentRefType<T> setAddressing(AddressingType<PortComponentRefType<T>> addressing)
   {
      this.addressing = addressing;
      childNode.getOrCreate("addressing").text(addressing);
      return this;
   }

   public AddressingType<PortComponentRefType<T>> getAddressing()
   {
      if( addressing == null)
      {
          addressing = new AddressingTypeImpl<PortComponentRefType<T>>(this, "", childNode);
      }
      return addressing;
   }




   public PortComponentRefType<T> setRespectBinding(RespectBindingType<PortComponentRefType<T>> respectBinding)
   {
      this.respectBinding = respectBinding;
      childNode.getOrCreate("respect-binding").text(respectBinding);
      return this;
   }

   public RespectBindingType<PortComponentRefType<T>> getRespectBinding()
   {
      if( respectBinding == null)
      {
          respectBinding = new RespectBindingTypeImpl<PortComponentRefType<T>>(this, "", childNode);
      }
      return respectBinding;
   }




   public PortComponentRefType<T> setPortComponentLink(String portComponentLink)
   {
      this.portComponentLink = portComponentLink;
      childNode.getOrCreate("port-component-link").text(portComponentLink);
      return this;
   }

   public String getPortComponentLink()
   {
      return portComponentLink;
   }

}
