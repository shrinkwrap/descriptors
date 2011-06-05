package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class PersistenceUnitRefTypeImpl<T> implements Child<T>, PersistenceUnitRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String persistenceUnitRefName;
   private String persistenceUnitName;

   private String mappedName;
   private InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PersistenceUnitRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("persistence-unit-ref");   }


   public T up()
   {
      return t;
   }



   public PersistenceUnitRefType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public PersistenceUnitRefType<T> setInjectionTarget(InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget)
   {
      this.injectionTarget = injectionTarget;
      childNode.getOrCreate("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<PersistenceUnitRefType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<PersistenceUnitRefType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public PersistenceUnitRefType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName)
   {
      this.persistenceUnitRefName = persistenceUnitRefName;
      childNode.getOrCreate("persistence-unit-ref-name").text(persistenceUnitRefName);
      return this;
   }

   public String getPersistenceUnitRefName()
   {
      return persistenceUnitRefName;
   }



   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName)
   {
      this.persistenceUnitName = persistenceUnitName;
      childNode.getOrCreate("persistence-unit-name").text(persistenceUnitName);
      return this;
   }

   public String getPersistenceUnitName()
   {
      return persistenceUnitName;
   }

}
