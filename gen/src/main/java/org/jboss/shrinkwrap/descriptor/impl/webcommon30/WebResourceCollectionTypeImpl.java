package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String webResourceName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String urlPattern;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String httpMethod;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String httpMethodOmission;

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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setWebResourceName(String webResourceName)   {
      this.webResourceName = webResourceName;
      childNode.getOrCreate("web-resource-name").text(webResourceName);
      return this;
   }

   public String getWebResourceName()
   {
      return childNode.textValue("web-resource-name");
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public WebResourceCollectionType<T> setDescription(String ... values)
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setUrlPattern(String urlPattern)
   {
      childNode.create("url-pattern").text(urlPattern);
      return this;
   }

   public WebResourceCollectionType<T> setUrlPattern(String ... values)
   {
      for(String name: values)
      {
         setUrlPattern(urlPattern);
      }
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setHttpMethod(String httpMethod)
   {
      childNode.create("http-method").text(httpMethod);
      return this;
   }

   public WebResourceCollectionType<T> setHttpMethod(String ... values)
   {
      for(String name: values)
      {
         setHttpMethod(httpMethod);
      }
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission)
   {
      childNode.create("http-method-omission").text(httpMethodOmission);
      return this;
   }

   public WebResourceCollectionType<T> setHttpMethodOmission(String ... values)
   {
      for(String name: values)
      {
         setHttpMethodOmission(httpMethodOmission);
      }
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
