package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The application-exceptionType declares an application
 * exception. The declaration consists of:
 *
 * - the exception class. When the container receives
 * an exception of this type, it is required to
 * forward this exception as an applcation exception
 * to the client regardless of whether it is a checked
 * or unchecked exception.
 * - an optional rollback element. If this element is
 * set to true, the container must rollback the current
 * transaction before forwarding the exception to the
 * client. If not specified, it defaults to false.
 * - an optional inherited element. If this element is
 * set to true, subclasses of the exception class type
 * are also automatically considered application
 * exceptions (unless overriden at a lower level).
 * If set to false, only the exception class type is
 * considered an application-exception, not its
 * exception subclasses. If not specified, this
 * value defaults to true.
 *
 *
 *
 */
public interface ApplicationExceptionType<T> extends Child<T>
{

   public ApplicationExceptionType<T> setExceptionClass(String exceptionClass);
   public ApplicationExceptionType<T> removeExceptionClass();

   public String getExceptionClass();



   public ApplicationExceptionType<T> setRollback(Boolean rollback);
   public ApplicationExceptionType<T> removeRollback();

   public Boolean isRollback();



   public ApplicationExceptionType<T> setInherited(Boolean inherited);
   public ApplicationExceptionType<T> removeInherited();

   public Boolean isInherited();

}
