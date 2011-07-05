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
 * The interceptorsType element declares one or more interceptor
 * classes used by components within this ejb-jar or .war. The declaration
 * consists of :
 *
 * - An optional description.
 * - One or more interceptor elements.
 *
 *
 *
 */
public interface InterceptorsType<T> extends Child<T>
{

   public InterceptorsType<T> setDescription(String description);
   public InterceptorsType<T> setDescriptionList(String ... values);
   public InterceptorsType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public InterceptorsType<T> removeAllInterceptor();

   public InterceptorType<InterceptorsType<T>> interceptor();
   public List<InterceptorType<InterceptorsType<T>>> getInterceptorList();


}
