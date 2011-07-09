package org.jboss.shrinkwrap.descriptor.api.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The method element is used to specify attributes for one method or all
 * those matching a pattern startingstring*.
 *
 */
public interface MethodType<T> extends Child<T>
{

   public MethodType<T> setMethodName(String methodName);

   public MethodType<T> removeMethodName();

   public String getMethodName();

   public MethodType<T> setReadOnly(Boolean readOnly);

   public MethodType<T> removeReadOnly();

   public Boolean isReadOnly();

   public MethodType<T> setIdempotent(Boolean idempotent);

   public MethodType<T> removeIdempotent();

   public Boolean isIdempotent();

   public MethodType<T> setTransactionTimeout(String transactionTimeout);

   public MethodType<T> removeTransactionTimeout();

   public String getTransactionTimeout();

}
