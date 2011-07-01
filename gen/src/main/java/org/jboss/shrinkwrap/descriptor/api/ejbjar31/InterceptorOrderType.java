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
 * The interceptor-orderType element describes a total ordering
 * of interceptor classes.
 *
 *
 *
 */
public interface InterceptorOrderType<T> extends Child<T>
{

   public InterceptorOrderType<T> setInterceptorClass(String interceptorClass);
   public InterceptorOrderType<T> setInterceptorClassList(String ... values);
   public InterceptorOrderType<T> removeAllInterceptorClass();

   public List<String> getInterceptorClassList();

}
