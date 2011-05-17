package org.jboss.shrinkwrap.descriptor.api.javaee6;

<<<<<<< HEAD
=======
import org.jboss.shrinkwrap.descriptor.api.Child;
>>>>>>> e4629a578f380f7ca6c99776ed6c045adfb8b746

/**
 * DescriptionGroup
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
<<<<<<< HEAD
public interface DescriptionGroup<T> 
{
   public T description(String description);

   public T displayName(String displayName);
   
   public IconType<T> icon();
=======
public interface DescriptionGroup<T> extends Child<T>
{
   public DescriptionGroup<T> description(String description);

   public DescriptionGroup<T> displayName(String displayName);
   
   public IconType<DescriptionGroup<T>> icon();
>>>>>>> e4629a578f380f7ca6c99776ed6c045adfb8b746
}
