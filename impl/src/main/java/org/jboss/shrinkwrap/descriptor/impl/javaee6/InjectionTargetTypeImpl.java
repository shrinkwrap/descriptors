package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public class InjectionTargetTypeImpl<T> implements Child<T>, InjectionTargetType<T>
{
   public final static String nodeName = "injection-target";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public InjectionTargetTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public InjectionTargetTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : injection-target-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass)   {
      childNode.getOrCreate("injection-target-class").text(injectionTargetClass);
      return this;
   }

   public InjectionTargetType<T> removeInjectionTargetClass()
   {
      childNode.remove("injection-target-class");
      return this;
   }

   public String getInjectionTargetClass()
   {
      return childNode.textValue("injection-target-class");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : injection-target-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName)   {
      childNode.getOrCreate("injection-target-name").text(injectionTargetName);
      return this;
   }

   public InjectionTargetType<T> removeInjectionTargetName()
   {
      childNode.remove("injection-target-name");
      return this;
   }

   public String getInjectionTargetName()
   {
      return childNode.textValue("injection-target-name");
   }

}
