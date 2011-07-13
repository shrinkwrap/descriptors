package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The application-exceptionType declares an application exception. The
 * declaration consists of:
 * 
 * - the exception class. When the container receives an exception of this type,
 * it is required to forward this exception as an applcation exception to the
 * client regardless of whether it is a checked or unchecked exception. - an
 * optional rollback element. If this element is set to true, the container must
 * rollback the current transaction before forwarding the exception to the
 * client. If not specified, it defaults to false.
 * 
 * 
 * 
 */
public interface ApplicationExceptionType<T> extends Child<T> {

	public ApplicationExceptionType<T> setExceptionClass(String exceptionClass);

	public ApplicationExceptionType<T> removeExceptionClass();

	public String getExceptionClass();

	public ApplicationExceptionType<T> setRollback(Boolean rollback);

	public ApplicationExceptionType<T> removeRollback();

	public Boolean isRollback();

}
