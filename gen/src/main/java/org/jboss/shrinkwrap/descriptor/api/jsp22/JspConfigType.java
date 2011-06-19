package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
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
