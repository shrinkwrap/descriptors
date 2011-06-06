package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.RunAsTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class SecurityIdentityTypeImpl<T> implements Child<T>, SecurityIdentityType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private Boolean useCallerIdentity;
   private RunAsType<SecurityIdentityType<T>> runAs;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SecurityIdentityTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("security-identity");   }


   public T up()
   {
      return t;
   }



   public SecurityIdentityType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public SecurityIdentityType<T> setUseCallerIdentity(Boolean useCallerIdentity)
   {
      this.useCallerIdentity = useCallerIdentity;
      childNode.getOrCreate("use-caller-identity").text(useCallerIdentity);
      return this;
   }

   public Boolean getUseCallerIdentity()
   {
      return useCallerIdentity;
   }



   public SecurityIdentityType<T> setRunAs(RunAsType<SecurityIdentityType<T>> runAs)
   {
      this.runAs = runAs;
      childNode.getOrCreate("run-as").text(runAs);
      return this;
   }

   public RunAsType<SecurityIdentityType<T>> getRunAs()
   {
      if( runAs == null)
      {
          runAs = new RunAsTypeImpl<SecurityIdentityType<T>>(this, "", childNode);
      }
      return runAs;
   }


}
