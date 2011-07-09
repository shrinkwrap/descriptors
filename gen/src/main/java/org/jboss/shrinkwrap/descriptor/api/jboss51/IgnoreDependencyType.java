package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The ignore-dependency element removes an injection dependency
 *
 */
public interface IgnoreDependencyType<T> extends Child<T>
{

   public IgnoreDependencyType<T> setDescription(String description);

   public IgnoreDependencyType<T> setDescriptionList(String... values);

   public IgnoreDependencyType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public IgnoreDependencyType<T> removeAllInjectionTarget();

   public InjectionTargetType<IgnoreDependencyType<T>> injectionTarget();

   public List<InjectionTargetType<IgnoreDependencyType<T>>> getInjectionTargetList();

}
