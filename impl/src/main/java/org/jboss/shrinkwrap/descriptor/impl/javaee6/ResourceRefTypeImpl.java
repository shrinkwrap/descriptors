package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
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



   // -------------------------------------------------------------------------------------||
   // Element type : lookup-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> setLookupName(String lookupName)   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public ResourceRefType<T> removeLookupName()
   {
      childNode.remove("lookup-name");
      return this;
   }

   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }


   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> setMappedName(String mappedName)   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public ResourceRefType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }


   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<ResourceRefType<T>> injectionTarget()
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



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ResourceRefType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
         return this;
   }

   public ResourceRefType<T> removeAllDescription()
   {
      childNode.remove("description");
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



   // -------------------------------------------------------------------------------------||
   // Element type : res-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> setResRefName(String resRefName)   {
      childNode.getOrCreate("res-ref-name").text(resRefName);
      return this;
   }

   public ResourceRefType<T> removeResRefName()
   {
      childNode.remove("res-ref-name");
      return this;
   }

   public String getResRefName()
   {
      return childNode.textValue("res-ref-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : res-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> setResType(String resType)   {
      childNode.getOrCreate("res-type").text(resType);
      return this;
   }

   public ResourceRefType<T> removeResType()
   {
      childNode.remove("res-type");
      return this;
   }

   public String getResType()
   {
      return childNode.textValue("res-type");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : res-auth
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> setResAuth(String resAuth)   {
      childNode.getOrCreate("res-auth").text(resAuth);
      return this;
   }

   public ResourceRefType<T> removeResAuth()
   {
      childNode.remove("res-auth");
      return this;
   }

   public String getResAuth()
   {
      return childNode.textValue("res-auth");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : res-sharing-scope
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> setResSharingScope(String resSharingScope)   {
      childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
      return this;
   }

   public ResourceRefType<T> removeResSharingScope()
   {
      childNode.remove("res-sharing-scope");
      return this;
   }

   public String getResSharingScope()
   {
      return childNode.textValue("res-sharing-scope");
   }

}
