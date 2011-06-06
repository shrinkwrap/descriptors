package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class EjbRefTypeImpl<T> implements Child<T>, EjbRefType<T>
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
   private String home;
   private String remote;
   private String ejbLink;

   private String lookupName;
   private String mappedName;
   private InjectionTargetType<EjbRefType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EjbRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("ejb-ref");   }


   public T up()
   {
      return t;
   }



   public EjbRefType<T> setLookupName(String lookupName)
   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return lookupName;
   }


   public EjbRefType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public EjbRefType<T> setInjectionTarget(InjectionTargetType<EjbRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<EjbRefType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<EjbRefType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public EjbRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public EjbRefType<T> setEjbRefName(String ejbRefName)
   {
      this.ejbRefName = ejbRefName;
      childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
      return this;
   }

   public String getEjbRefName()
   {
      return ejbRefName;
   }



   public EjbRefType<T> setEjbRefType(String ejbRefType)
   {
      this.ejbRefType = ejbRefType;
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   public String getEjbRefType()
   {
      return ejbRefType;
   }



   public EjbRefType<T> setHome(String home)
   {
      this.home = home;
      childNode.getOrCreate("home").text(home);
      return this;
   }

   public String getHome()
   {
      return home;
   }



   public EjbRefType<T> setRemote(String remote)
   {
      this.remote = remote;
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   public String getRemote()
   {
      return remote;
   }



   public EjbRefType<T> setEjbLink(String ejbLink)
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
