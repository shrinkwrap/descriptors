package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * DescriptionGroup
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface DescriptionGroup<T>
{
   public DescriptionGroup<T> description(String[] descriptions);

   public DescriptionGroup<T> displayName(String[] displayNames);
   
   public DescriptionGroup<T> icon(IconType[] icons);
}
