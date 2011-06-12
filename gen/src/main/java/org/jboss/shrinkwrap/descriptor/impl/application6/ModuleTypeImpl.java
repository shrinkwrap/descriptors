package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.application6.WebType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class ModuleTypeImpl<T> implements Child<T>, ModuleType<T>
{
   public final static String nodeName = "module";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String altDd;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String connector;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String ejb;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String java;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private WebType<ModuleType<T>> web;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ModuleTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ModuleTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ModuleType<T> setAltDd(String altDd)   {
      this.altDd = altDd;
      childNode.getOrCreate("alt-dd").text(altDd);
      return this;
   }

   public String getAltDd()
   {
      return childNode.textValue("alt-dd");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ModuleType<T> setConnector(String connector)   {
      this.connector = connector;
      childNode.getOrCreate("connector").text(connector);
      return this;
   }

   public String getConnector()
   {
      return childNode.textValue("connector");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ModuleType<T> setEjb(String ejb)   {
      this.ejb = ejb;
      childNode.getOrCreate("ejb").text(ejb);
      return this;
   }

   public String getEjb()
   {
      return childNode.textValue("ejb");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ModuleType<T> setJava(String java)   {
      this.java = java;
      childNode.getOrCreate("java").text(java);
      return this;
   }

   public String getJava()
   {
      return childNode.textValue("java");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ModuleType<T> setWeb(WebType<ModuleType<T>> web)   {
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
