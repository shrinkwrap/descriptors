package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface PersistenceUnitRefType<T> extends Child<T>
{
   public PersistenceUnitRefType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget();

   public PersistenceUnitRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);

   @NodeInfo(xmlName = "persistence-unit-ref-name")
   public String getPersistenceUnitRefName();

   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);

   @NodeInfo(xmlName = "persistence-unit-name")
   public String getPersistenceUnitName();
}
