package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * DescriptionGroup
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface DescriptionGroup<T> extends Child<T>
{
   public DescriptionGroup<T> description(String description);

   public DescriptionGroup<T> displayName(String displayName);
   
   public IconType<DescriptionGroup<T>> icon();
}
