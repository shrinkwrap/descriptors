package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public class ServletMappingTypeImpl<T> implements Child<T>, ServletMappingType<T>
{
   public final static String nodeName = "servlet-mapping";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ServletMappingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ServletMappingTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   // Element type : servlet-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletMappingType<T> setServletName(String servletName)
   {
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   public String getServletName()
   {
      return childNode.textValue("servlet-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletMappingType<T> setUrlPattern(String urlPattern)
   {
      childNode.create("url-pattern").text(urlPattern);
      return this;
   }

   public ServletMappingType<T> setUrlPattern(String... values)
   {
      for (String name : values)
      {
         setUrlPattern(name);
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

}
