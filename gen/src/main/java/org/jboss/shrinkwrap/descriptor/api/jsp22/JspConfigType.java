package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface JspConfigType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public JspConfigType<T> setTaglib(TaglibType<JspConfigType<T>> taglib);

   public TaglibType<JspConfigType<T>> getTaglib();
   public List<TaglibType<JspConfigType<T>>> getTaglibList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public JspConfigType<T> setJspPropertyGroup(JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup);

   public JspPropertyGroupType<JspConfigType<T>> getJspPropertyGroup();
   public List<JspPropertyGroupType<JspConfigType<T>>> getJspPropertyGroupList();


}
