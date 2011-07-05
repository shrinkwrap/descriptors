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
 * The depends-onType is used to express initialization
 * ordering dependencies between Singleton components.
 * The depends-onType specifies the names of one or more
 * Singleton beans in the same application as the referring
 * Singleton, each of which must be initialized before
 * the referring bean.
 *
 * Each dependent bean is expressed using ejb-link syntax.
 * The order in which dependent beans are initialized at
 * runtime is not guaranteed to match the order in which
 * they are listed.
 *
 *
 *
 */
public interface DependsOnType<T> extends Child<T>
{

   public DependsOnType<T> setEjbName(String ejbName);
   public DependsOnType<T> setEjbNameList(String ... values);
   public DependsOnType<T> removeAllEjbName();

   public List<String> getEjbNameList();

}
