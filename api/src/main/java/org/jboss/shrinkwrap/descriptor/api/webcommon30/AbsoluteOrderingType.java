package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface AbsoluteOrderingType<T> extends Child<T>
{
   public AbsoluteOrderingType<T> setName(String name);

   @NodeInfo(xmlName = "name")
   public String getName();

   @NodeInfo(xmlName = "others")
   public AbsoluteOrderingType<T> others();
}
