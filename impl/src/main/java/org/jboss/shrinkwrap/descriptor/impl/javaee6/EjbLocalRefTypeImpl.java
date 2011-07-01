package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The ejb-local-refType is used by ejb-local-ref elements for
 * the declaration of a reference to an enterprise bean's local
 * home or to the local business interface of a 3.0 bean.
 * The declaration consists of:
 *
 * - an optional description
 * - the EJB reference name used in the code of the Deployment
 * Component that's referencing the enterprise bean.
 * - the optional expected type of the referenced enterprise bean
 * - the optional expected local interface of the referenced
 * enterprise bean or the local business interface of the
 * referenced enterprise bean.
 * - the optional expected local home interface of the referenced
 * enterprise bean. Not applicable if this ejb-local-ref refers
 * to the local business interface of a 3.0 bean.
 * - optional ejb-link information, used to specify the
 * referenced enterprise bean
 * - optional elements to define injection of the named enterprise
 * bean into a component field or property.
 *
 *
 *
 */
public class EjbLocalRefTypeImpl<T> implements Child<T>, EjbLocalRefType<T>
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

   public EjbLocalRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EjbLocalRefTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : lookup-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbLocalRefType<T> setLookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public EjbLocalRefType<T> removeLookupName()
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
   public EjbLocalRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public EjbLocalRefType<T> removeMappedName()
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
   public EjbLocalRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<EjbLocalRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<EjbLocalRefType<T>>(this, "injection-target", childNode);
   }

   public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<EjbLocalRefType<T>>> list = new ArrayList<InjectionTargetType<EjbLocalRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<EjbLocalRefType<T>> type = new InjectionTargetTypeImpl<EjbLocalRefType<T>>(this,
               "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbLocalRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public EjbLocalRefType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public EjbLocalRefType<T> removeAllDescription()
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
   // Element type : ejb-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbLocalRefType<T> setEjbRefName(String ejbRefName)
   {
      childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
      return this;
   }

   public EjbLocalRefType<T> removeEjbRefName()
   {
      childNode.remove("ejb-ref-name");
      return this;
   }

   public String getEjbRefName()
   {
      return childNode.textValue("ejb-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbLocalRefType<T> setEjbRefType(EjbRefTypeType ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   public EjbLocalRefType<T> setEjbRefType(String ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   public EjbRefTypeType getEjbRefType()
   {
      return EjbRefTypeType.getFromStringValue(childNode.textValue("ejb-ref-type"));
   }

   public String getEjbRefTypeAsString()
   {
      return childNode.textValue("ejb-ref-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbLocalRefType<T> setLocalHome(String localHome)
   {
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   public EjbLocalRefType<T> removeLocalHome()
   {
      childNode.remove("local-home");
      return this;
   }

   public String getLocalHome()
   {
      return childNode.textValue("local-home");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbLocalRefType<T> setLocal(String local)
   {
      childNode.getOrCreate("local").text(local);
      return this;
   }

   public EjbLocalRefType<T> removeLocal()
   {
      childNode.remove("local");
      return this;
   }

   public String getLocal()
   {
      return childNode.textValue("local");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbLocalRefType<T> setEjbLink(String ejbLink)
   {
      childNode.getOrCreate("ejb-link").text(ejbLink);
      return this;
   }

   public EjbLocalRefType<T> removeEjbLink()
   {
      childNode.remove("ejb-link");
      return this;
   }

   public String getEjbLink()
   {
      return childNode.textValue("ejb-link");
   }

}
