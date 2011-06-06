package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class EnvEntryTypeImpl<T> implements Child<T>, EnvEntryType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String envEntryName;
   private String envEntryType;
   private String envEntryValue;

   private String lookupName;
   private String mappedName;
   private InjectionTargetType<EnvEntryType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EnvEntryTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("env-entry");   }


   public T up()
   {
      return t;
   }



   public EnvEntryType<T> setLookupName(String lookupName)
   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return lookupName;
   }


   public EnvEntryType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public EnvEntryType<T> setInjectionTarget(InjectionTargetType<EnvEntryType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<EnvEntryType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<EnvEntryType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public EnvEntryType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public EnvEntryType<T> setEnvEntryName(String envEntryName)
   {
      this.envEntryName = envEntryName;
      childNode.getOrCreate("env-entry-name").text(envEntryName);
      return this;
   }

   public String getEnvEntryName()
   {
      return envEntryName;
   }



   public EnvEntryType<T> setEnvEntryType(String envEntryType)
   {
      this.envEntryType = envEntryType;
      childNode.getOrCreate("env-entry-type").text(envEntryType);
      return this;
   }

   public String getEnvEntryType()
   {
      return envEntryType;
   }



   public EnvEntryType<T> setEnvEntryValue(String envEntryValue)
   {
      this.envEntryValue = envEntryValue;
      childNode.getOrCreate("env-entry-value").text(envEntryValue);
      return this;
   }

   public String getEnvEntryValue()
   {
      return envEntryValue;
   }

}
