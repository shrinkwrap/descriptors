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
/**
 * This class is a generated class.
 * Generation date :2011-06-26T17:25:18.735-04:00
 *
 * Original Documentation:
 *
 *
 * Specifies a name/value pair.
 *
 *
 *
 */
public interface PropertyType<T> extends Child<T>
{

   public PropertyType<T> setName(String name);
   public PropertyType<T> removeName();

   public String getName();



   public PropertyType<T> setValue(String value);
   public PropertyType<T> removeValue();

   public String getValue();

}
