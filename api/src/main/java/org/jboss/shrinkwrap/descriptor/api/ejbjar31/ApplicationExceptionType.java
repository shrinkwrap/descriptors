package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ApplicationExceptionType<T> extends Child<T>
{
   public ApplicationExceptionType<T> setExceptionClazz(String exceptionClass);

   public String getExceptionClazz();

   public ApplicationExceptionType<T> setRollback(Boolean rollback);

   public Boolean getRollback();

   public ApplicationExceptionType<T> setInherited(Boolean inherited);

   public Boolean getInherited();
}
