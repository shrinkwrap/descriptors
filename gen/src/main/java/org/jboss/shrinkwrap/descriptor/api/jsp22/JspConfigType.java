package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface JspConfigType<T> extends Child<T>
{

   public JspConfigType<T> setTaglib(TaglibType<JspConfigType<T>> taglib);
   public TaglibType<JspConfigType<T>> getTaglib();



   public JspConfigType<T> setJspPropertyGroup(JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup);
   public JspPropertyGroupType<JspConfigType<T>> getJspPropertyGroup();

}