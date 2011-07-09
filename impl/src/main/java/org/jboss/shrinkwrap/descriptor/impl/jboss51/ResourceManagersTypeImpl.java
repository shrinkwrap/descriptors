package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagerType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagersType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The resource-managers element is used to declare resource managers. A
 * resource has 3 names: - the "code name" is the name used in the code of the bean, supplied
 * by the Bean Developer in the resource-ref section of the ejb-jar.xml file - the "xml name"
 * is an intermediary name used by the Application Assembler to identify resources in the XML
 * file. - the "runtime jndi name" is the actual jndi-name or url of the deployed resource, it
 * is supplied by the Deployer. The mapping between the "code name" and the "xml name" is given
 * in the resource-ref section for the bean. If not, jboss will assume that "xml name" = "code
 * name". The mapping between the "xml name" and the "runtime jndi name" is given in a
 * resource-manager section. If not, and if the datasource is of type javax.sql.DataSource,
 * jboss will look for a javax.sql.DataSource in the jndi tree. Used in: jboss
 *
 *
 */
public class ResourceManagersTypeImpl<T> implements Child<T>, ResourceManagersType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ResourceManagersTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ResourceManagersTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceManagersType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ResourceManagersType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ResourceManagersType<T> removeAllDescription()
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
   // Element type : resource-manager
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceManagersType<T> removeAllResourceManager()
   {
      childNode.remove("resource-manager");
      return this;
   }

   public ResourceManagerType<ResourceManagersType<T>> resourceManager()
   {
      return new ResourceManagerTypeImpl<ResourceManagersType<T>>(this, "resource-manager", childNode);
   }

   public List<ResourceManagerType<ResourceManagersType<T>>> getResourceManagerList()
   {
      List<ResourceManagerType<ResourceManagersType<T>>> list = new ArrayList<ResourceManagerType<ResourceManagersType<T>>>();
      List<Node> nodeList = childNode.get("resource-manager");
      for (Node node : nodeList)
      {
         ResourceManagerType<ResourceManagersType<T>> type = new ResourceManagerTypeImpl<ResourceManagersType<T>>(this,
               "resource-manager", childNode, node);
         list.add(type);
      }
      return list;
   }

}
