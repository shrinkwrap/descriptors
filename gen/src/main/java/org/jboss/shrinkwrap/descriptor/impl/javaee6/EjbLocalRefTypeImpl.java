package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class EjbLocalRefTypeImpl<T> implements Child<T>, EjbLocalRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String ejbRefName;
   private String ejbRefType;
   private String localHome;
   private String local;
   private String ejbLink;

   private String lookupName;
   private String mappedName;
   private InjectionTargetType<EjbLocalRefType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EjbLocalRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("ejb-local-ref");   }


   public T up()
   {
      return t;
   }



   public EjbLocalRefType<T> setLookupName(String lookupName)
   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return lookupName;
   }


   public EjbLocalRefType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public EjbLocalRefType<T> setInjectionTarget(InjectionTargetType<EjbLocalRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<EjbLocalRefType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<EjbLocalRefType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public EjbLocalRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public EjbLocalRefType<T> setEjbRefName(String ejbRefName)
   {
      this.ejbRefName = ejbRefName;
      childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
      return this;
   }

   public String getEjbRefName()
   {
      return ejbRefName;
   }



   public EjbLocalRefType<T> setEjbRefType(String ejbRefType)
   {
      this.ejbRefType = ejbRefType;
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   public String getEjbRefType()
   {
      return ejbRefType;
   }



   public EjbLocalRefType<T> setLocalHome(String localHome)
   {
      this.localHome = localHome;
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   public String getLocalHome()
   {
      return localHome;
   }



   public EjbLocalRefType<T> setLocal(String local)
   {
      this.local = local;
      childNode.getOrCreate("local").text(local);
      return this;
   }

   public String getLocal()
   {
      return local;
   }



   public EjbLocalRefType<T> setEjbLink(String ejbLink)
   {
      this.ejbLink = ejbLink;
      childNode.getOrCreate("ejb-link").text(ejbLink);
      return this;
   }

   public String getEjbLink()
   {
      return ejbLink;
   }

}
