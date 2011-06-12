package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class EjbRefTypeImpl<T> implements Child<T>, EjbRefType<T>
{
   public final static String nodeName = "ejb-ref";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String ejbRefName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String ejbRefType;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String home;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String remote;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String ejbLink;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String lookupName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mappedName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private InjectionTargetType<EjbRefType<T>> injectionTarget;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EjbRefTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EjbRefTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setLookupName(String lookupName)   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setMappedName(String mappedName)   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setInjectionTarget(InjectionTargetType<EjbRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<EjbRefType<T>> getInjectionTarget()
   {
      return new InjectionTargetTypeImpl<EjbRefType<T>>(this, "", childNode);
   }

   public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<EjbRefType<T>>> list = new ArrayList<InjectionTargetType<EjbRefType<T>>>();
      List<Node> nodeList = childNode.get(InjectionTargetTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         InjectionTargetType<EjbRefType<T>>  type = new InjectionTargetTypeImpl<EjbRefType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public EjbRefType<T> setDescription(String ... values)
   {
      for(String name: values)
      {
         setDescription(description);
      }
         return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setEjbRefName(String ejbRefName)   {
      this.ejbRefName = ejbRefName;
      childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
      return this;
   }

   public String getEjbRefName()
   {
      return childNode.textValue("ejb-ref-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setEjbRefType(String ejbRefType)   {
      this.ejbRefType = ejbRefType;
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   public String getEjbRefType()
   {
      return childNode.textValue("ejb-ref-type");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setHome(String home)   {
      this.home = home;
      childNode.getOrCreate("home").text(home);
      return this;
   }

   public String getHome()
   {
      return childNode.textValue("home");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setRemote(String remote)   {
      this.remote = remote;
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   public String getRemote()
   {
      return childNode.textValue("remote");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setEjbLink(String ejbLink)   {
      this.ejbLink = ejbLink;
      childNode.getOrCreate("ejb-link").text(ejbLink);
      return this;
   }

   public String getEjbLink()
   {
      return childNode.textValue("ejb-link");
   }

}
