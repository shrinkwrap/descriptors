package org.jboss.shrinkwrap.descriptor.api.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface JspConfigType<T> extends Child<T>
{
   public JspConfigType<T> setTaglib(TaglibType<T> taglib);

   public TaglibType<JspConfigType<T>> getTaglib();

   public JspConfigType<T> setJspPropertyGroup(JspPropertyGroupType<T> jspPropertyGroup);

   public JspPropertyGroupType<JspConfigType<T>> getJspPropertyGroup();
}
