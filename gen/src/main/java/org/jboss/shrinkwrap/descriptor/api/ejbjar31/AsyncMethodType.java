package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * The async-methodType element specifies that a session
 * bean method has asynchronous invocation semantics.
 *
 *
 *
 */
public interface AsyncMethodType<T> extends Child<T>
{

   public AsyncMethodType<T> setMethodName(String methodName);

   public AsyncMethodType<T> removeMethodName();

   public String getMethodName();

   public AsyncMethodType<T> removeMethodParams();

   public MethodParamsType<AsyncMethodType<T>> methodParams();

}
