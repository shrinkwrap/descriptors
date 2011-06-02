package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface PersistenceContextRefType<T> extends Child<T>
{
   public PersistenceContextRefType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<PersistenceContextRefType<T>> injectionTarget();

   public PersistenceContextRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);

   @NodeInfo(xmlName = "persistence-context-ref-name")
   public String getPersistenceContextRefName();

   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);

   @NodeInfo(xmlName = "persistence-unit-name")
   public String getPersistenceUnitName();

   public PersistenceContextRefType<T> setPersistenceContextType(PersistenceContextTypeType persistenceContextType);

   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);

   @NodeInfo(xmlName = "persistence-context-type")
   public String getPersistenceContextType();

   @NodeInfo(xmlName = "persistence-property")
   public PropertyType<PersistenceContextRefType<T>> persistenceProperty();
}
