package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface ServiceRefType<T> extends Child<T>
{
   public ServiceRefType<T> setDescription(String description);
   public String getDescription();

   public ServiceRefType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public ServiceRefType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public ServiceRefType<T> setLookupName(String lookupName);
   public String getLookupName();

   public ServiceRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public ServiceRefType<T> setInjectionTarget(InjectionTargetType<T> injectionTarget);
   public InjectionTargetType<T> getInjectionTarget();

   public ServiceRefType<T> setServiceRefName(String serviceRefName);
   public String getServiceRefName();

   public ServiceRefType<T> setServiceInterface(String serviceInterface);
   public String getServiceInterface();

   public ServiceRefType<T> setServiceRefType(String serviceRefType);
   public String getServiceRefType();

   public ServiceRefType<T> setWsdlFile(String wsdlFile);
   public String getWsdlFile();

   public ServiceRefType<T> setJaxrpcMappingFile(String jaxrpcMappingFile);
   public String getJaxrpcMappingFile();

   public ServiceRefType<T> setServiceQname(String serviceQname);
   public String getServiceQname();

   public ServiceRefType<T> setPortComponentRef(PortComponentRefType<T> portComponentRef);
   public PortComponentRefType<T> getPortComponentRef();
}
