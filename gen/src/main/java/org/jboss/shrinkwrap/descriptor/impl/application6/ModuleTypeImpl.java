package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.application6.WebType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class ModuleTypeImpl<T> implements Child<T>, ModuleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String altDd;
   private String connector;
   private String ejb;
   private String java;
   private WebType<ModuleType<T>> web;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ModuleTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("module");   }


   public T up()
   {
      return t;
   }



   public ModuleType<T> setAltDd(String altDd)
   {
      this.altDd = altDd;
      childNode.getOrCreate("alt-dd").text(altDd);
      return this;
   }

   public String getAltDd()
   {
      return altDd;
   }



   public ModuleType<T> setConnector(String connector)
   {
      this.connector = connector;
      childNode.getOrCreate("connector").text(connector);
      return this;
   }

   public String getConnector()
   {
      return connector;
   }



   public ModuleType<T> setEjb(String ejb)
   {
      this.ejb = ejb;
      childNode.getOrCreate("ejb").text(ejb);
      return this;
   }

   public String getEjb()
   {
      return ejb;
   }



   public ModuleType<T> setJava(String java)
   {
      this.java = java;
      childNode.getOrCreate("java").text(java);
      return this;
   }

   public String getJava()
   {
      return java;
   }



   public ModuleType<T> setWeb(WebType<ModuleType<T>> web)
   {
      this.web = web;
      childNode.getOrCreate("web").text(web);
      return this;
   }

   public WebType<ModuleType<T>> getWeb()
   {
      if( web == null)
      {
          web = new WebTypeImpl<ModuleType<T>>(this, "", childNode);
      }
      return web;
   }


}
