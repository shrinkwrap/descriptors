package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface InitMethodType<T> extends Child<T>
{
   @NodeInfo(xmlName = "create-method")
   public NamedMethodType<InitMethodType<T>> createMethod();

   @NodeInfo(xmlName = "bean-method")
   public NamedMethodType<InitMethodType<T>> beanMethod();
}
