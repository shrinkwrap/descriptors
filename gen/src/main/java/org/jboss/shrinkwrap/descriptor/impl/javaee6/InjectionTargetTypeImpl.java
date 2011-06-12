package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String injectionTargetClass;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String injectionTargetName;

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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass)   {
      this.injectionTargetClass = injectionTargetClass;
      childNode.getOrCreate("injection-target-class").text(injectionTargetClass);
      return this;
   }

   public String getInjectionTargetClass()
   {
      return childNode.textValue("injection-target-class");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName)   {
      this.injectionTargetName = injectionTargetName;
      childNode.getOrCreate("injection-target-name").text(injectionTargetName);
      return this;
   }

   public String getInjectionTargetName()
   {
      return childNode.textValue("injection-target-name");
   }

}
