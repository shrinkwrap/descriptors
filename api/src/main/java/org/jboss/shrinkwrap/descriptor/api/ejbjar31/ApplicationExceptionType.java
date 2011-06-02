package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ApplicationExceptionType<T> extends Child<T>
{
   public ApplicationExceptionType<T> setExceptionClass(Class<?> exceptionClass);

   public ApplicationExceptionType<T> setExceptionClass(String exceptionClass);

   @NodeInfo(xmlName = "exception-class")
   public String getExceptionClass();

   public ApplicationExceptionType<T> setRollback(Boolean rollback);

   @NodeInfo(xmlName = "rollback")
   public Boolean getRollback();

   public ApplicationExceptionType<T> setInherited(Boolean inherited);

   @NodeInfo(xmlName = "inherited")
   public Boolean getInherited();
}
