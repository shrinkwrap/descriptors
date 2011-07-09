package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The depends-onType is used to express initialization
 * ordering dependencies between Singleton components.
 * The depends-onType specifies the names of one or more
 * Singleton beans in the same application as the referring
 * Singleton, each of which must be initialized before
 * the referring bean.
 *
 * Each dependent bean is expressed using ejb-link syntax.
 * The order in which dependent beans are initialized at
 * runtime is not guaranteed to match the order in which
 * they are listed.
 *
 *
 *
 */
public interface DependsOnType<T> extends Child<T>
{

   public DependsOnType<T> setEjbName(String ejbName);

   public DependsOnType<T> setEjbNameList(String... values);

   public DependsOnType<T> removeAllEjbName();

   public List<String> getEjbNameList();

}
