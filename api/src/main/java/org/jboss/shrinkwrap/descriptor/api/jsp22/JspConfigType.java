package org.jboss.shrinkwrap.descriptor.api.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface JspConfigType<T> extends Child<T>
{
   @NodeInfo(xmlName = "taglib")
   public TaglibType<JspConfigType<T>> taglib();

   @NodeInfo(xmlName = "jsp-property-group")
   public JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup();
}
