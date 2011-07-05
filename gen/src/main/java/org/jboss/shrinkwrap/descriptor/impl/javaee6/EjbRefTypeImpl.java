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
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The ejb-refType is used by ejb-ref elements for the
 * declaration of a reference to an enterprise bean's home or
 * to the remote business interface of a 3.0 bean.
 * The declaration consists of:
 *
 * - an optional description
 * - the EJB reference name used in the code of
 * the Deployment Component that's referencing the enterprise
 * bean.
 * - the optional expected type of the referenced enterprise bean
 * - the optional remote interface of the referenced enterprise bean
 * or the remote business interface of the referenced enterprise
 * bean
 * - the optional expected home interface of the referenced
 * enterprise bean. Not applicable if this ejb-ref
 * refers to the remote business interface of a 3.0 bean.
 * - optional ejb-link information, used to specify the
 * referenced enterprise bean
 * - optional elements to define injection of the named enterprise
 * bean into a component field or property
 *
 *
 *
 */
public class EjbRefTypeImpl<T> implements Child<T>, EjbRefType<T>
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

   public EjbRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EjbRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
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
   public EjbRefType<T> setLookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }
   public EjbRefType<T> removeLookupName()
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
   public EjbRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }
   public EjbRefType<T> removeMappedName()
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
   public EjbRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<EjbRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<EjbRefType<T>>(this, "injection-target", childNode);
   }

   public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<EjbRefType<T>>> list = new ArrayList<InjectionTargetType<EjbRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for(Node node: nodeList)
      {
         InjectionTargetType<EjbRefType<T>>  type = new InjectionTargetTypeImpl<EjbRefType<T>>(this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public EjbRefType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public EjbRefType<T> removeAllDescription()
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
   public EjbRefType<T> setEjbRefName(String ejbRefName)
   {
      childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
      return this;
   }
   public EjbRefType<T> removeEjbRefName()
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
   public EjbRefType<T> setEjbRefType(EjbRefTypeType ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }
   public EjbRefType<T> setEjbRefType(String ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   public EjbRefTypeType getEjbRefType()
   {
      return EjbRefTypeType.getFromStringValue(childNode.textValue("ejb-ref-type"));
   }

   public String  getEjbRefTypeAsString()
   {
      return childNode.textValue("ejb-ref-type");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRefType<T> setHome(String home)
   {
      childNode.getOrCreate("home").text(home);
      return this;
   }
   public EjbRefType<T> removeHome()
   {
      childNode.remove("home");
      return this;
   }

   public String getHome()
   {
      return childNode.textValue("home");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : remote
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRefType<T> setRemote(String remote)
   {
      childNode.getOrCreate("remote").text(remote);
      return this;
   }
   public EjbRefType<T> removeRemote()
   {
      childNode.remove("remote");
      return this;
   }

   public String getRemote()
   {
      return childNode.textValue("remote");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : ejb-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRefType<T> setEjbLink(String ejbLink)
   {
      childNode.getOrCreate("ejb-link").text(ejbLink);
      return this;
   }
   public EjbRefType<T> removeEjbLink()
   {
      childNode.remove("ejb-link");
      return this;
   }

   public String getEjbLink()
   {
      return childNode.textValue("ejb-link");
   }

}
