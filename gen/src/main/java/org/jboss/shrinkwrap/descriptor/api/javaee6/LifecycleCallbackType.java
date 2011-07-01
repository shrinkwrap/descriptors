package org.jboss.shrinkwrap.descriptor.api.javaee6; 

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
 * The lifecycle-callback type specifies a method on a
 * class to be called when a lifecycle event occurs.
 * Note that each class may have only one lifecycle callback
 * method for any given event and that the method may not
 * be overloaded.
 *
 * If the lifefycle-callback-class element is missing then
 * the class defining the callback is assumed to be the
 * component class in scope at the place in the descriptor
 * in which the callback definition appears.
 *
 *
 *
 */
public interface LifecycleCallbackType<T> extends Child<T>
{

   public LifecycleCallbackType<T> setLifecycleCallbackClass(String lifecycleCallbackClass);
   public LifecycleCallbackType<T> removeLifecycleCallbackClass();

   public String getLifecycleCallbackClass();



   public LifecycleCallbackType<T> setLifecycleCallbackMethod(String lifecycleCallbackMethod);
   public LifecycleCallbackType<T> removeLifecycleCallbackMethod();

   public String getLifecycleCallbackMethod();

}
