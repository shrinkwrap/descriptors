package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface WebserviceDescriptionType<T> extends Child<T>
{
   public WebserviceDescriptionType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public WebserviceDescriptionType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<WebserviceDescriptionType<T>> icon();

   public WebserviceDescriptionType<T> setWebserviceDescriptionName(String webserviceDescriptionName);

   @NodeInfo(xmlName = "webservice-description-name")
   public String getWebserviceDescriptionName();

   public WebserviceDescriptionType<T> setWsdlFile(String wsdlFile);

   @NodeInfo(xmlName = "wsdl-file")
   public String getWsdlFile();

   public WebserviceDescriptionType<T> setJaxrpcMappingFile(String jaxrpcMappingFile);

   @NodeInfo(xmlName = "jaxrpc-mapping-file")
   public String getJaxrpcMappingFile();

   @NodeInfo(xmlName = "port-component")
   public PortComponentType<WebserviceDescriptionType<T>> portComponent();
}
