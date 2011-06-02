package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface IconType<T> extends Child<T>
{
   public IconType<T> setSmallIcon(String smallIcon);

   @NodeInfo(xmlName = "small-icon")
   public String getSmallIcon();

   public IconType<T> setLargeIcon(String largeIcon);

   @NodeInfo(xmlName = "large-icon")
   public String getLargeIcon();
}
