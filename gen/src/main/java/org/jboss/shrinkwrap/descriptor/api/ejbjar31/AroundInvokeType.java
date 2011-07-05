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
 * Generation date :2011-07-05T19:45:07.621+02:00
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
