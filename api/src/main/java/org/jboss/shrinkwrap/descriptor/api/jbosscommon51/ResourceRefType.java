package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResAuthType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResSharingScopeType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The resource-ref element gives a mapping between the "code name" of a
 * resource (res-ref-name, provided by the Bean Developer) and its "xml name" (resource-name,
 * provided by the Application Assembler). If no resource-ref is provided, jboss will assume
 * that "xml-name" = "code name" See resource-managers.
 *
 */
public interface ResourceRefType<T> extends Child<T>
{

   public ResourceRefType<T> setDescription(String description);

   public ResourceRefType<T> setDescriptionList(String... values);

   public ResourceRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public ResourceRefType<T> setResRefName(String resRefName);

   public ResourceRefType<T> removeResRefName();

   public String getResRefName();

   public ResourceRefType<T> setResType(String resType);

   public ResourceRefType<T> removeResType();

   public String getResType();

   public ResourceRefType<T> setResAuth(ResAuthType resAuth);

   public ResourceRefType<T> setResAuth(String resAuth);

   public ResAuthType getResAuth();

   public String getResAuthAsString();

   public ResourceRefType<T> setResSharingScope(ResSharingScopeType resSharingScope);

   public ResourceRefType<T> setResSharingScope(String resSharingScope);

   public ResSharingScopeType getResSharingScope();

   public String getResSharingScopeAsString();

   public ResourceRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<ResourceRefType<T>> injectionTarget();

   public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList();

   public ResourceRefType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

   public ResourceRefType<T> setResourceName(String resourceName);

   public ResourceRefType<T> removeResourceName();

   public String getResourceName();

   public ResourceRefType<T> setJndiName(String jndiName);

   public ResourceRefType<T> removeJndiName();

   public String getJndiName();

   public ResourceRefType<T> setMappedName(String mappedName);

   public ResourceRefType<T> removeMappedName();

   public String getMappedName();

   public ResourceRefType<T> setResUrl(String resUrl);

   public ResourceRefType<T> removeResUrl();

   public String getResUrl();

}
