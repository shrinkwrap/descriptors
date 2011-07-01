package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

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
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 * [
 * The resource-env-refType is used to define
 * resource-env-ref elements. It contains a declaration of a
 * Deployment Component's reference to an administered object
 * associated with a resource in the Deployment Component's
 * environment. It consists of an optional description, the
 * resource environment reference name, and an optional
 * indication of the resource environment reference type
 * expected by the Deployment Component code.
 *
 * It also includes optional elements to define injection of
 * the named resource into fields or JavaBeans properties.
 *
 * The resource environment type must be supplied unless an
 * injection target is specified, in which case the type
 * of the target is used. If both are specified, the type
 * must be assignment compatible with the type of the injection
 * target.
 *
 * Example:
 *
 * <resource-env-ref>
 * <resource-env-ref-name>jms/StockQueue
 * </resource-env-ref-name>
 * <resource-env-ref-type>javax.jms.Queue
 * </resource-env-ref-type>
 * </resource-env-ref>
 *
 *
 *
 *
 */
public class ResourceEnvRefTypeImpl<T> implements Child<T>, ResourceEnvRefType<T>
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

   public ResourceEnvRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ResourceEnvRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
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
   public ResourceEnvRefType<T> setLookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }
   public ResourceEnvRefType<T> removeLookupName()
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
   public ResourceEnvRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }
   public ResourceEnvRefType<T> removeMappedName()
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
   public ResourceEnvRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<ResourceEnvRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this, "injection-target", childNode);
   }

   public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<ResourceEnvRefType<T>>> list = new ArrayList<InjectionTargetType<ResourceEnvRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for(Node node: nodeList)
      {
         InjectionTargetType<ResourceEnvRefType<T>>  type = new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public ResourceEnvRefType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public ResourceEnvRefType<T> removeAllDescription()
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
   // Element type : resource-env-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName)
   {
      childNode.getOrCreate("resource-env-ref-name").text(resourceEnvRefName);
      return this;
   }
   public ResourceEnvRefType<T> removeResourceEnvRefName()
   {
      childNode.remove("resource-env-ref-name");
      return this;
   }

   public String getResourceEnvRefName()
   {
      return childNode.textValue("resource-env-ref-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType)
   {
      childNode.getOrCreate("resource-env-ref-type").text(resourceEnvRefType);
      return this;
   }
   public ResourceEnvRefType<T> removeResourceEnvRefType()
   {
      childNode.remove("resource-env-ref-type");
      return this;
   }

   public String getResourceEnvRefType()
   {
      return childNode.textValue("resource-env-ref-type");
   }

}
