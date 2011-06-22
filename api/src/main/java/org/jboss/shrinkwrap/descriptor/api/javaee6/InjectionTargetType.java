package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T12:04:36.305-04:00
 *
 * Original Documentation:
 *
 *
 * An injection target specifies a class and a name within
 * that class into which a resource should be injected.
 *
 * The injection target class specifies the fully qualified
 * class name that is the target of the injection. The
 * Java EE specifications describe which classes can be an
 * injection target.
 *
 * The injection target name specifies the target within
 * the specified class. The target is first looked for as a
 * JavaBeans property name. If not found, the target is
 * looked for as a field name.
 *
 * The specified resource will be injected into the target
 * during initialization of the class by either calling the
 * set method for the target property or by setting a value
 * into the named field.
 *
 *
 *
 */
public interface InjectionTargetType<T> extends Child<T>
{

   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass);

   public InjectionTargetType<T> removeInjectionTargetClass();

   public String getInjectionTargetClass();

   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName);

   public InjectionTargetType<T> removeInjectionTargetName();

   public String getInjectionTargetName();

}
