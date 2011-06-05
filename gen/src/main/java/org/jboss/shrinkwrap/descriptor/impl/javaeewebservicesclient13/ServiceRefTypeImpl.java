package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerChainsType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.InjectionTargetTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class ServiceRefTypeImpl<T> implements Child<T>, ServiceRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String serviceRefName;
   private String serviceInterface;
   private String serviceRefType;
   private String wsdlFile;
   private String jaxrpcMappingFile;
   private String serviceQname;
   private PortComponentRefType<ServiceRefType<T>> portComponentRef;
   private HandlerType<ServiceRefType<T>> handler;
   private HandlerChainsType<ServiceRefType<T>> handlerChains;

   private String description;
   private String displayName;
   private IconType<ServiceRefType<T>> icon;
   private String lookupName;
   private String mappedName;
   private InjectionTargetType<ServiceRefType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ServiceRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("service-ref");   }


   public T up()
   {
      return t;
   }



   public ServiceRefType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public ServiceRefType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public ServiceRefType<T> setIcon(IconType<ServiceRefType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<ServiceRefType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<ServiceRefType<T>>(this, "", childNode);
      }
      return icon;
   }



   public ServiceRefType<T> setLookupName(String lookupName)
   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return lookupName;
   }


   public ServiceRefType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public ServiceRefType<T> setInjectionTarget(InjectionTargetType<ServiceRefType<T>> injectionTarget)
   {
      this.injectionTarget = injectionTarget;
      childNode.getOrCreate("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<ServiceRefType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<ServiceRefType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public ServiceRefType<T> setServiceRefName(String serviceRefName)
   {
      this.serviceRefName = serviceRefName;
      childNode.getOrCreate("service-ref-name").text(serviceRefName);
      return this;
   }

   public String getServiceRefName()
   {
      return serviceRefName;
   }



   public ServiceRefType<T> setServiceInterface(String serviceInterface)
   {
      this.serviceInterface = serviceInterface;
      childNode.getOrCreate("service-interface").text(serviceInterface);
      return this;
   }

   public String getServiceInterface()
   {
      return serviceInterface;
   }



   public ServiceRefType<T> setServiceRefType(String serviceRefType)
   {
      this.serviceRefType = serviceRefType;
      childNode.getOrCreate("service-ref-type").text(serviceRefType);
      return this;
   }

   public String getServiceRefType()
   {
      return serviceRefType;
   }



   public ServiceRefType<T> setWsdlFile(String wsdlFile)
   {
      this.wsdlFile = wsdlFile;
      childNode.getOrCreate("wsdl-file").text(wsdlFile);
      return this;
   }

   public String getWsdlFile()
   {
      return wsdlFile;
   }



   public ServiceRefType<T> setJaxrpcMappingFile(String jaxrpcMappingFile)
   {
      this.jaxrpcMappingFile = jaxrpcMappingFile;
      childNode.getOrCreate("jaxrpc-mapping-file").text(jaxrpcMappingFile);
      return this;
   }

   public String getJaxrpcMappingFile()
   {
      return jaxrpcMappingFile;
   }



   public ServiceRefType<T> setServiceQname(String serviceQname)
   {
      this.serviceQname = serviceQname;
      childNode.getOrCreate("service-qname").text(serviceQname);
      return this;
   }

   public String getServiceQname()
   {
      return serviceQname;
   }



   public ServiceRefType<T> setPortComponentRef(PortComponentRefType<ServiceRefType<T>> portComponentRef)
   {
      this.portComponentRef = portComponentRef;
      childNode.getOrCreate("port-component-ref").text(portComponentRef);
      return this;
   }

   public PortComponentRefType<ServiceRefType<T>> getPortComponentRef()
   {
      if( portComponentRef == null)
      {
          portComponentRef = new PortComponentRefTypeImpl<ServiceRefType<T>>(this, "", childNode);
      }
      return portComponentRef;
   }




   public ServiceRefType<T> setHandler(HandlerType<ServiceRefType<T>> handler)
   {
      this.handler = handler;
      childNode.getOrCreate("handler").text(handler);
      return this;
   }

   public HandlerType<ServiceRefType<T>> getHandler()
   {
      if( handler == null)
      {
          handler = new HandlerTypeImpl<ServiceRefType<T>>(this, "", childNode);
      }
      return handler;
   }




   public ServiceRefType<T> setHandlerChains(HandlerChainsType<ServiceRefType<T>> handlerChains)
   {
      this.handlerChains = handlerChains;
      childNode.getOrCreate("handler-chains").text(handlerChains);
      return this;
   }

   public HandlerChainsType<ServiceRefType<T>> getHandlerChains()
   {
      if( handlerChains == null)
      {
          handlerChains = new HandlerChainsTypeImpl<ServiceRefType<T>>(this, "", childNode);
      }
      return handlerChains;
   }


}
