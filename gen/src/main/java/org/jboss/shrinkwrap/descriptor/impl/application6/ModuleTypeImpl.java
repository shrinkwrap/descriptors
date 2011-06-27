package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 *
 * The moduleType defines a single Java EE module and contains a
 * connector, ejb, java, or web element, which indicates the
 * module type and contains a path to the module file, and an
 * optional alt-dd element, which specifies an optional URI to
 * the post-assembly version of the deployment descriptor.
 *
 *
 *
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



   // -------------------------------------------------------------------------------------||
   // Element type : alt-dd
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ModuleType<T> setAltDd(String altDd)
   {
      childNode.getOrCreate("alt-dd").text(altDd);
      return this;
   }
   public ModuleType<T> removeAltDd()
   {
      childNode.remove("alt-dd");
      return this;
   }

   public String getAltDd()
   {
      return childNode.textValue("alt-dd");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : connector
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ModuleType<T> setConnector(String connector)
   {
      childNode.getOrCreate("connector").text(connector);
      return this;
   }
   public ModuleType<T> removeConnector()
   {
      childNode.remove("connector");
      return this;
   }

   public String getConnector()
   {
      return childNode.textValue("connector");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : ejb
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ModuleType<T> setEjb(String ejb)
   {
      childNode.getOrCreate("ejb").text(ejb);
      return this;
   }
   public ModuleType<T> removeEjb()
   {
      childNode.remove("ejb");
      return this;
   }

   public String getEjb()
   {
      return childNode.textValue("ejb");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : java
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ModuleType<T> setJava(String java)
   {
      childNode.getOrCreate("java").text(java);
      return this;
   }
   public ModuleType<T> removeJava()
   {
      childNode.remove("java");
      return this;
   }

   public String getJava()
   {
      return childNode.textValue("java");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : web
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ModuleType<T> removeWeb()
   {
      childNode.remove("web");
      return this;
   }

   public WebType<ModuleType<T>> web()
   {
      Node node = childNode.getOrCreate(WebTypeImpl.nodeName);
      WebType<ModuleType<T>> web = new WebTypeImpl<ModuleType<T>>(this, "", childNode, node);
      return web;
   }


}
