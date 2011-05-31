package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface JspConfigType<T> extends Child<T>
{
   public JspConfigType<T> setTaglib(TaglibType<T> taglib);
   public TaglibType<T> getTaglib();

   public JspConfigType<T> setJspPropertyGroup(JspPropertyGroupType<T> jspPropertyGroup);
   public JspPropertyGroupType<T> getJspPropertyGroup();
}
