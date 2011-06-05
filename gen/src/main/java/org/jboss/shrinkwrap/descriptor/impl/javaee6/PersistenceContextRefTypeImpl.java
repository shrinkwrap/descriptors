package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class PersistenceContextRefTypeImpl<T> implements Child<T>, PersistenceContextRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String persistenceContextRefName;
   private String persistenceUnitName;
   private String persistenceContextType;
   private PropertyType<PersistenceContextRefType<T>> persistenceProperty;

   private String mappedName;
   private InjectionTargetType<PersistenceContextRefType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PersistenceContextRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("persistence-context-ref");   }


   public T up()
   {
      return t;
   }



   public PersistenceContextRefType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public PersistenceContextRefType<T> setInjectionTarget(InjectionTargetType<PersistenceContextRefType<T>> injectionTarget)
   {
      this.injectionTarget = injectionTarget;
      childNode.getOrCreate("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<PersistenceContextRefType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<PersistenceContextRefType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public PersistenceContextRefType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName)
   {
      this.persistenceContextRefName = persistenceContextRefName;
      childNode.getOrCreate("persistence-context-ref-name").text(persistenceContextRefName);
      return this;
   }

   public String getPersistenceContextRefName()
   {
      return persistenceContextRefName;
   }



   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName)
   {
      this.persistenceUnitName = persistenceUnitName;
      childNode.getOrCreate("persistence-unit-name").text(persistenceUnitName);
      return this;
   }

   public String getPersistenceUnitName()
   {
      return persistenceUnitName;
   }



   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType)
   {
      this.persistenceContextType = persistenceContextType;
      childNode.getOrCreate("persistence-context-type").text(persistenceContextType);
      return this;
   }

   public String getPersistenceContextType()
   {
      return persistenceContextType;
   }



   public PersistenceContextRefType<T> setPersistenceProperty(PropertyType<PersistenceContextRefType<T>> persistenceProperty)
   {
      this.persistenceProperty = persistenceProperty;
      childNode.getOrCreate("persistence-property").text(persistenceProperty);
      return this;
   }

   public PropertyType<PersistenceContextRefType<T>> getPersistenceProperty()
   {
      if( persistenceProperty == null)
      {
          persistenceProperty = new PropertyTypeImpl<PersistenceContextRefType<T>>(this, "", childNode);
      }
      return persistenceProperty;
   }


}
