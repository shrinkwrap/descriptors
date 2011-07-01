package org.jboss.shrinkwrap.descriptor.api.persistence20;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 */
public interface Persistence<T> extends Child<T>
{

   public Persistence<T> removeAllPersistenceUnit();

   public PersistenceUnit<Persistence<T>> persistenceUnit();

   public List<PersistenceUnit<Persistence<T>>> getPersistenceUnitList();

   public Persistence<T> setVersion(String version);

   public Persistence<T> removeVersion();

   public String getVersion();

}
