package org.jboss.shrinkwrap.descriptor.api.jsp22;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The jsp-configType is used to provide global configuration
 * information for the JSP files in a web application. It has
 * two subelements, taglib and jsp-property-group.
 *
 *
 *
 */
public interface JspConfigType<T> extends Child<T>
{

   public JspConfigType<T> removeAllTaglib();

   public TaglibType<JspConfigType<T>> taglib();

   public List<TaglibType<JspConfigType<T>>> getTaglibList();

   public JspConfigType<T> removeAllJspPropertyGroup();

   public JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup();

   public List<JspPropertyGroupType<JspConfigType<T>>> getJspPropertyGroupList();

}
