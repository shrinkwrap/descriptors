package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface PropertyType<T> extends Child<T>
{
   public PropertyType<T> setName(String name);

   @NodeInfo(xmlName = "name")
   public String getName();

   public PropertyType<T> setValue(String value);

   @NodeInfo(xmlName = "value")
   public String getValue();
}
