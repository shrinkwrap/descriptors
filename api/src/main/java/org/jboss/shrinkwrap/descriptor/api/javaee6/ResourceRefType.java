package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ResourceRefType<T> extends Child<T>
{
   public ResourceRefType<T> setLookupName(String lookupName);

   @NodeInfo(xmlName = "lookup-name")
   public String getLookupName();

   public ResourceRefType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<ResourceRefType<T>> injectionTarget();

   public ResourceRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public ResourceRefType<T> setResRefName(String resRefName);

   @NodeInfo(xmlName = "res-ref-name")
   public String getResRefName();

   public ResourceRefType<T> setResType(Class<?> resType);

   public ResourceRefType<T> setResType(String resType);

   @NodeInfo(xmlName = "res-type")
   public String getResType();

   public ResourceRefType<T> setResAuth(ResAuthType resAuth);

   public ResourceRefType<T> setResAuth(String resAuth);

   @NodeInfo(xmlName = "res-auth")
   public String getResAuth();

   public ResourceRefType<T> setResSharingScope(ResSharingScopeType resSharingScope);

   public ResourceRefType<T> setResSharingScope(String resSharingScope);

   @NodeInfo(xmlName = "res-sharing-scope")
   public String getResSharingScope();
}
