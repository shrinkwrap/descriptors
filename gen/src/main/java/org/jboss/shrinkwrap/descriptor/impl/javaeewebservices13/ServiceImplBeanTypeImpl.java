package org.jboss.shrinkwrap.descriptor.impl.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservices13.ServiceImplBeanType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class ServiceImplBeanTypeImpl<T> implements Child<T>, ServiceImplBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String ejbLink;
   private String servletLink;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ServiceImplBeanTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("service-impl-bean");   }


   public T up()
   {
      return t;
   }



   public ServiceImplBeanType<T> setEjbLink(String ejbLink)
   {
      this.ejbLink = ejbLink;
      childNode.getOrCreate("ejb-link").text(ejbLink);
      return this;
   }

   public String getEjbLink()
   {
      return ejbLink;
   }



   public ServiceImplBeanType<T> setServletLink(String servletLink)
   {
      this.servletLink = servletLink;
      childNode.getOrCreate("servlet-link").text(servletLink);
      return this;
   }

   public String getServletLink()
   {
      return servletLink;
   }

}
