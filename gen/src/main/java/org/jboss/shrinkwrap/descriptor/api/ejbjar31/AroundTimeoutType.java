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
 * The around-timeout type specifies a method on a
 * class to be called during the around-timeout portion of
 * a timer timeout callback. Note that each class may have
 * only one around-timeout method and that the method may not
 * be overloaded.
 *
 * If the class element is missing then
 * the class defining the callback is assumed to be the
 * interceptor class or component class in scope at the
 * location in the descriptor in which the around-timeout
 * definition appears.
 *
 *
 *
 */
public interface AroundTimeoutType<T> extends Child<T>
{

   public AroundTimeoutType<T> setClazz(String clazz);
   public AroundTimeoutType<T> removeClazz();

   public String getClazz();



   public AroundTimeoutType<T> setMethodName(String methodName);
   public AroundTimeoutType<T> removeMethodName();

   public String getMethodName();

}
