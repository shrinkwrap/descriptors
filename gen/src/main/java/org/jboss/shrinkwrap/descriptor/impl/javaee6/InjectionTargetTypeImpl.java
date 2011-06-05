package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class InjectionTargetTypeImpl<T> implements Child<T>, InjectionTargetType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String injectionTargetClass;
   private String injectionTargetName;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public InjectionTargetTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("injection-target");   }


   public T up()
   {
      return t;
   }



   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass)
   {
      this.injectionTargetClass = injectionTargetClass;
      childNode.getOrCreate("injection-target-class").text(injectionTargetClass);
      return this;
   }

   public String getInjectionTargetClass()
   {
      return injectionTargetClass;
   }



   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName)
   {
      this.injectionTargetName = injectionTargetName;
      childNode.getOrCreate("injection-target-name").text(injectionTargetName);
      return this;
   }

   public String getInjectionTargetName()
   {
      return injectionTargetName;
   }

}
