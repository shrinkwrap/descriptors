package org.jboss.shrinkwrap.descriptor.api.javaee6;


/**
 * DescriptionGroup
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface DescriptionGroup<T> 
{
   public T description(String description);

   public T displayName(String displayName);
   
   public IconType<T> icon();
}
