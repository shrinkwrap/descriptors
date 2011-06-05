package org.jboss.shrinkwrap.descriptor.impl.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservices13.PortComponentType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservices13.ServiceImplBeanType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerChainsType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.RespectBindingType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.AddressingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.HandlerChainsTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.HandlerTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.RespectBindingTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class PortComponentTypeImpl<T> implements Child<T>, PortComponentType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String displayName;
   private IconType<PortComponentType<T>> icon;
   private String portComponentName;
   private String wsdlService;
   private String wsdlPort;
   private Boolean enableMtom;
   private Integer mtomThreshold;
   private AddressingType<PortComponentType<T>> addressing;
   private RespectBindingType<PortComponentType<T>> respectBinding;
   private String protocolBinding;
   private String serviceEndpointInterface;
   private ServiceImplBeanType<PortComponentType<T>> serviceImplBean;
   private HandlerType<PortComponentType<T>> handler;
   private HandlerChainsType<PortComponentType<T>> handlerChains;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PortComponentTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("port-component");   }


   public T up()
   {
      return t;
   }



   public PortComponentType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public PortComponentType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }



   public PortComponentType<T> setIcon(IconType<PortComponentType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<PortComponentType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<PortComponentType<T>>(this, "", childNode);
      }
      return icon;
   }




   public PortComponentType<T> setPortComponentName(String portComponentName)
   {
      this.portComponentName = portComponentName;
      childNode.getOrCreate("port-component-name").text(portComponentName);
      return this;
   }

   public String getPortComponentName()
   {
      return portComponentName;
   }



   public PortComponentType<T> setWsdlService(String wsdlService)
   {
      this.wsdlService = wsdlService;
      childNode.getOrCreate("wsdl-service").text(wsdlService);
      return this;
   }

   public String getWsdlService()
   {
      return wsdlService;
   }



   public PortComponentType<T> setWsdlPort(String wsdlPort)
   {
      this.wsdlPort = wsdlPort;
      childNode.getOrCreate("wsdl-port").text(wsdlPort);
      return this;
   }

   public String getWsdlPort()
   {
      return wsdlPort;
   }



   public PortComponentType<T> setEnableMtom(Boolean enableMtom)
   {
      this.enableMtom = enableMtom;
      childNode.getOrCreate("enable-mtom").text(enableMtom);
      return this;
   }

   public Boolean getEnableMtom()
   {
      return enableMtom;
   }



   public PortComponentType<T> setMtomThreshold(Integer mtomThreshold)
   {
      this.mtomThreshold = mtomThreshold;
      childNode.getOrCreate("mtom-threshold").text(mtomThreshold);
      return this;
   }

   public Integer getMtomThreshold()
   {
      return mtomThreshold;
   }



   public PortComponentType<T> setAddressing(AddressingType<PortComponentType<T>> addressing)
   {
      this.addressing = addressing;
      childNode.getOrCreate("addressing").text(addressing);
      return this;
   }

   public AddressingType<PortComponentType<T>> getAddressing()
   {
      if( addressing == null)
      {
          addressing = new AddressingTypeImpl<PortComponentType<T>>(this, "", childNode);
      }
      return addressing;
   }




   public PortComponentType<T> setRespectBinding(RespectBindingType<PortComponentType<T>> respectBinding)
   {
      this.respectBinding = respectBinding;
      childNode.getOrCreate("respect-binding").text(respectBinding);
      return this;
   }

   public RespectBindingType<PortComponentType<T>> getRespectBinding()
   {
      if( respectBinding == null)
      {
          respectBinding = new RespectBindingTypeImpl<PortComponentType<T>>(this, "", childNode);
      }
      return respectBinding;
   }




   public PortComponentType<T> setProtocolBinding(String protocolBinding)
   {
      this.protocolBinding = protocolBinding;
      childNode.getOrCreate("protocol-binding").text(protocolBinding);
      return this;
   }

   public String getProtocolBinding()
   {
      return protocolBinding;
   }



   public PortComponentType<T> setServiceEndpointInterface(String serviceEndpointInterface)
   {
      this.serviceEndpointInterface = serviceEndpointInterface;
      childNode.getOrCreate("service-endpoint-interface").text(serviceEndpointInterface);
      return this;
   }

   public String getServiceEndpointInterface()
   {
      return serviceEndpointInterface;
   }



   public PortComponentType<T> setServiceImplBean(ServiceImplBeanType<PortComponentType<T>> serviceImplBean)
   {
      this.serviceImplBean = serviceImplBean;
      childNode.getOrCreate("service-impl-bean").text(serviceImplBean);
      return this;
   }

   public ServiceImplBeanType<PortComponentType<T>> getServiceImplBean()
   {
      if( serviceImplBean == null)
      {
          serviceImplBean = new ServiceImplBeanTypeImpl<PortComponentType<T>>(this, "", childNode);
      }
      return serviceImplBean;
   }




   public PortComponentType<T> setHandler(HandlerType<PortComponentType<T>> handler)
   {
      this.handler = handler;
      childNode.getOrCreate("handler").text(handler);
      return this;
   }

   public HandlerType<PortComponentType<T>> getHandler()
   {
      if( handler == null)
      {
          handler = new HandlerTypeImpl<PortComponentType<T>>(this, "", childNode);
      }
      return handler;
   }




   public PortComponentType<T> setHandlerChains(HandlerChainsType<PortComponentType<T>> handlerChains)
   {
      this.handlerChains = handlerChains;
      childNode.getOrCreate("handler-chains").text(handlerChains);
      return this;
   }

   public HandlerChainsType<PortComponentType<T>> getHandlerChains()
   {
      if( handlerChains == null)
      {
          handlerChains = new HandlerChainsTypeImpl<PortComponentType<T>>(this, "", childNode);
      }
      return handlerChains;
   }


}
