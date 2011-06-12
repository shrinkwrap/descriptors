package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class ResourceRefTypeImpl<T> implements Child<T>, ResourceRefType<T>
{
   public final static String nodeName = "resource-ref";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String resRefName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String resType;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String resAuth;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String resSharingScope;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String lookupName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mappedName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private InjectionTargetType<ResourceRefType<T>> injectionTarget;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ResourceRefTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ResourceRefTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceRefType<T> setLookupName(String lookupName)   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceRefType<T> setMappedName(String mappedName)   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ResourceRefType<T> setInjectionTarget(InjectionTargetType<ResourceRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<ResourceRefType<T>> getInjectionTarget()
   {
      return new InjectionTargetTypeImpl<ResourceRefType<T>>(this, "", childNode);
   }

   public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<ResourceRefType<T>>> list = new ArrayList<InjectionTargetType<ResourceRefType<T>>>();
      List<Node> nodeList = childNode.get(InjectionTargetTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         InjectionTargetType<ResourceRefType<T>>  type = new InjectionTargetTypeImpl<ResourceRefType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ResourceRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ResourceRefType<T> setDescription(String ... values)
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

   public ResourceRefType<T> setResRefName(String resRefName)   {
      this.resRefName = resRefName;
      childNode.getOrCreate("res-ref-name").text(resRefName);
      return this;
   }

   public String getResRefName()
   {
      return childNode.textValue("res-ref-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceRefType<T> setResType(String resType)   {
      this.resType = resType;
      childNode.getOrCreate("res-type").text(resType);
      return this;
   }

   public String getResType()
   {
      return childNode.textValue("res-type");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceRefType<T> setResAuth(String resAuth)   {
      this.resAuth = resAuth;
      childNode.getOrCreate("res-auth").text(resAuth);
      return this;
   }

   public String getResAuth()
   {
      return childNode.textValue("res-auth");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceRefType<T> setResSharingScope(String resSharingScope)   {
      this.resSharingScope = resSharingScope;
      childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
      return this;
   }

   public String getResSharingScope()
   {
      return childNode.textValue("res-sharing-scope");
   }

}
