package org.jboss.shrinkwrap.descriptor.api.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface TaglibType<T> extends Child<T>
{
   public TaglibType<T> setTaglibUri(String taglibUri);

   @NodeInfo(xmlName = "taglib-uri")
   public String getTaglibUri();

   public TaglibType<T> setTaglibLocation(String taglibLocation);

   @NodeInfo(xmlName = "taglib-location")
   public String getTaglibLocation();
}
