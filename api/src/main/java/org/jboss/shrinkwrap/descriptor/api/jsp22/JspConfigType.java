package org.jboss.shrinkwrap.descriptor.api.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * JspConfigType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface JspConfigType<T> extends Child<T>
{
   public TaglibType<JspConfigType<T>> taglib();

   public JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup();
}
