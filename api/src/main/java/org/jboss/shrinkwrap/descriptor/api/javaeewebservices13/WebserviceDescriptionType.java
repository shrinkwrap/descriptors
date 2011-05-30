package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface WebserviceDescriptionType<T> extends Child<T>
{
   public WebserviceDescriptionType<T> setDescription(String description);
   public String getDescription();

   public WebserviceDescriptionType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public WebserviceDescriptionType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public WebserviceDescriptionType<T> setWebserviceDescriptionName(String webserviceDescriptionName);
   public String getWebserviceDescriptionName();

   public WebserviceDescriptionType<T> setWsdlFile(String wsdlFile);
   public String getWsdlFile();

   public WebserviceDescriptionType<T> setJaxrpcMappingFile(String jaxrpcMappingFile);
   public String getJaxrpcMappingFile();

   public WebserviceDescriptionType<T> setPortComponent(PortComponentType<T> portComponent);
   public PortComponentType<T> getPortComponent();
}
