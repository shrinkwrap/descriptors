package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class JspConfigTypeImpl<T> implements Child<T>, JspConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private TaglibType<JspConfigType<T>> taglib;
   private JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public JspConfigTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("jsp-config");   }


   public T up()
   {
      return t;
   }



   public JspConfigType<T> setTaglib(TaglibType<JspConfigType<T>> taglib)
   {
      this.taglib = taglib;
      childNode.getOrCreate("taglib").text(taglib);
      return this;
   }

   public TaglibType<JspConfigType<T>> getTaglib()
   {
      if( taglib == null)
      {
          taglib = new TaglibTypeImpl<JspConfigType<T>>(this, "", childNode);
      }
      return taglib;
   }




   public JspConfigType<T> setJspPropertyGroup(JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup)
   {
      this.jspPropertyGroup = jspPropertyGroup;
      childNode.getOrCreate("jsp-property-group").text(jspPropertyGroup);
      return this;
   }

   public JspPropertyGroupType<JspConfigType<T>> getJspPropertyGroup()
   {
      if( jspPropertyGroup == null)
      {
          jspPropertyGroup = new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "", childNode);
      }
      return jspPropertyGroup;
   }


}
