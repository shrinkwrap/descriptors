package org.jboss.shrinkwrap.descriptor.impl.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservices13.PortComponentType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservices13.WebserviceDescriptionType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class WebserviceDescriptionTypeImpl<T> implements Child<T>, WebserviceDescriptionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String displayName;
   private IconType<WebserviceDescriptionType<T>> icon;
   private String webserviceDescriptionName;
   private String wsdlFile;
   private String jaxrpcMappingFile;
   private PortComponentType<WebserviceDescriptionType<T>> portComponent;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebserviceDescriptionTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("webservice-description");   }


   public T up()
   {
      return t;
   }



   public WebserviceDescriptionType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public WebserviceDescriptionType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }



   public WebserviceDescriptionType<T> setIcon(IconType<WebserviceDescriptionType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<WebserviceDescriptionType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<WebserviceDescriptionType<T>>(this, "", childNode);
      }
      return icon;
   }




   public WebserviceDescriptionType<T> setWebserviceDescriptionName(String webserviceDescriptionName)
   {
      this.webserviceDescriptionName = webserviceDescriptionName;
      childNode.getOrCreate("webservice-description-name").text(webserviceDescriptionName);
      return this;
   }

   public String getWebserviceDescriptionName()
   {
      return webserviceDescriptionName;
   }



   public WebserviceDescriptionType<T> setWsdlFile(String wsdlFile)
   {
      this.wsdlFile = wsdlFile;
      childNode.getOrCreate("wsdl-file").text(wsdlFile);
      return this;
   }

   public String getWsdlFile()
   {
      return wsdlFile;
   }



   public WebserviceDescriptionType<T> setJaxrpcMappingFile(String jaxrpcMappingFile)
   {
      this.jaxrpcMappingFile = jaxrpcMappingFile;
      childNode.getOrCreate("jaxrpc-mapping-file").text(jaxrpcMappingFile);
      return this;
   }

   public String getJaxrpcMappingFile()
   {
      return jaxrpcMappingFile;
   }



   public WebserviceDescriptionType<T> setPortComponent(PortComponentType<WebserviceDescriptionType<T>> portComponent)
   {
      this.portComponent = portComponent;
      childNode.getOrCreate("port-component").text(portComponent);
      return this;
   }

   public PortComponentType<WebserviceDescriptionType<T>> getPortComponent()
   {
      if( portComponent == null)
      {
          portComponent = new PortComponentTypeImpl<WebserviceDescriptionType<T>>(this, "", childNode);
      }
      return portComponent;
   }


}
