package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

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
 * Generation date :2011-06-26T17:25:18.735-04:00
 *
 * Original Documentation:
 *
 *
 * The web-resource-collectionType is used to identify the
 * resources and HTTP methods on those resources to which a
 * security constraint applies. If no HTTP methods are specified,
 * then the security constraint applies to all HTTP methods.
 * If HTTP methods are specified by http-method-omission
 * elements, the security constraint applies to all methods
 * except those identified in the collection.
 * http-method-omission and http-method elements are never
 * mixed in the same collection.
 *
 * Used in: security-constraint
 *
 *
 *
 */
public class WebResourceCollectionTypeImpl<T> implements Child<T>, WebResourceCollectionType<T>
{
   public final static String nodeName = "web-resource-collection";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebResourceCollectionTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public WebResourceCollectionTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : web-resource-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebResourceCollectionType<T> setWebResourceName(String webResourceName)
   {
      childNode.getOrCreate("web-resource-name").text(webResourceName);
      return this;
   }
   public WebResourceCollectionType<T> removeWebResourceName()
   {
      childNode.remove("web-resource-name");
      return this;
   }

   public String getWebResourceName()
   {
      return childNode.textValue("web-resource-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebResourceCollectionType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public WebResourceCollectionType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public WebResourceCollectionType<T> removeAllDescription()
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
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebResourceCollectionType<T> setUrlPattern(String urlPattern)
   {
      childNode.create("url-pattern").text(urlPattern);
      return this;
   }
   public WebResourceCollectionType<T> setUrlPatternList(String ... values)
   {
      for(String name: values)
      {
         setUrlPattern(name);
      }
      return this;
   }
   public WebResourceCollectionType<T> removeAllUrlPattern()
   {
      childNode.remove("url-pattern");
      return this;
   }

public List<String> getUrlPatternList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("url-pattern");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : http-method
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebResourceCollectionType<T> setHttpMethod(String httpMethod)
   {
      childNode.create("http-method").text(httpMethod);
      return this;
   }
   public WebResourceCollectionType<T> setHttpMethodList(String ... values)
   {
      for(String name: values)
      {
         setHttpMethod(name);
      }
      return this;
   }
   public WebResourceCollectionType<T> removeAllHttpMethod()
   {
      childNode.remove("http-method");
      return this;
   }

public List<String> getHttpMethodList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("http-method");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : http-method-omission
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission)
   {
      childNode.create("http-method-omission").text(httpMethodOmission);
      return this;
   }
   public WebResourceCollectionType<T> setHttpMethodOmissionList(String ... values)
   {
      for(String name: values)
      {
         setHttpMethodOmission(name);
      }
      return this;
   }
   public WebResourceCollectionType<T> removeAllHttpMethodOmission()
   {
      childNode.remove("http-method-omission");
      return this;
   }

public List<String> getHttpMethodOmissionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("http-method-omission");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
