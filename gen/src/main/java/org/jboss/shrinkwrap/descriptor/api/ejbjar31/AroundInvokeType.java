package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The around-invoke type specifies a method on a
 * class to be called during the around invoke portion of an
 * ejb invocation. Note that each class may have only one
 * around invoke method and that the method may not be
 * overloaded.
 *
 * If the class element is missing then
 * the class defining the callback is assumed to be the
 * interceptor class or component class in scope at the
 * location in the descriptor in which the around invoke
 * definition appears.
 *
 *
 *
 */
public interface AroundInvokeType<T> extends Child<T>
{

   public AroundInvokeType<T> setClazz(String clazz);

   public AroundInvokeType<T> removeClazz();

   public String getClazz();

   public AroundInvokeType<T> setMethodName(String methodName);

   public AroundInvokeType<T> removeMethodName();

   public String getMethodName();

}
