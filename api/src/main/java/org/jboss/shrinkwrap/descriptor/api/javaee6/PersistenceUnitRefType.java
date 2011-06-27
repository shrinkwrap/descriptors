package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:26:42.686-04:00
 *
 * Original Documentation:
 *
 * [
 * The persistence-unit-ref element contains a declaration
 * of Deployment Component's reference to a persistence unit
 * associated within a Deployment Component's
 * environment. It consists of:
 *
 * - an optional description
 * - the persistence unit reference name
 * - an optional persistence unit name. If not specified,
 * the default persistence unit is assumed.
 * - optional injection targets
 *
 * Examples:
 *
 * <persistence-unit-ref>
 * <persistence-unit-ref-name>myPersistenceUnit
 * </persistence-unit-ref-name>
 * </persistence-unit-ref>
 *
 * <persistence-unit-ref>
 * <persistence-unit-ref-name>myPersistenceUnit
 * </persistence-unit-ref-name>
 * <persistence-unit-name>PersistenceUnit1
 * </persistence-unit-name>
 * </persistence-unit-ref>
 *
 *
 *
 *
 */
public interface PersistenceUnitRefType<T> extends Child<T>
{

   public PersistenceUnitRefType<T> setMappedName(String mappedName);

   public PersistenceUnitRefType<T> removeMappedName();

   public String getMappedName();

   public PersistenceUnitRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget();

   public List<InjectionTargetType<PersistenceUnitRefType<T>>> getInjectionTargetList();

   public PersistenceUnitRefType<T> setDescription(String description);

   public PersistenceUnitRefType<T> setDescriptionList(String... values);

   public PersistenceUnitRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);

   public PersistenceUnitRefType<T> removePersistenceUnitRefName();

   public String getPersistenceUnitRefName();

   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public PersistenceUnitRefType<T> removePersistenceUnitName();

   public String getPersistenceUnitName();

}
