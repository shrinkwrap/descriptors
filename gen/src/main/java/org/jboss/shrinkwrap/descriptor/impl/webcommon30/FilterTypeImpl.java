package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class FilterTypeImpl<T> implements Child<T>, FilterType<T>
{
   public final static String nodeName = "filter";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String filterName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String filterClass;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean asyncSupported;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ParamValueType<FilterType<T>> initParam;

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private IconType<FilterType<T>> icon;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public FilterTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public FilterTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public FilterType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public FilterType<T> setDescription(String ... values)
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

   public FilterType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public FilterType<T> setDisplayName(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(displayName);
      }
         return this;
   }

   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public FilterType<T> setIcon(IconType<FilterType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<FilterType<T>> getIcon()
   {
      return new IconTypeImpl<FilterType<T>>(this, "", childNode);
   }

   public List<IconType<FilterType<T>>> getIconList()
   {
      List<IconType<FilterType<T>>> list = new ArrayList<IconType<FilterType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<FilterType<T>>  type = new IconTypeImpl<FilterType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public FilterType<T> setFilterName(String filterName)   {
      this.filterName = filterName;
      childNode.getOrCreate("filter-name").text(filterName);
      return this;
   }

   public String getFilterName()
   {
      return childNode.textValue("filter-name");
   }


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public FilterType<T> setFilterClass(String filterClass)   {
      this.filterClass = filterClass;
      childNode.getOrCreate("filter-class").text(filterClass);
      return this;
   }

   public String getFilterClass()
   {
      return childNode.textValue("filter-class");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public FilterType<T> setAsyncSupported(Boolean asyncSupported)   {
      this.asyncSupported = asyncSupported;
      childNode.getOrCreate("async-supported").text(asyncSupported);
      return this;
   }

   public Boolean getAsyncSupported()
   {
      return Strings.isTrue(childNode.textValue("async-supported"));
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public FilterType<T> setInitParam(ParamValueType<FilterType<T>> initParam)
   {
      childNode.create("init-param").text(initParam);
      return this;
   }

   public ParamValueType<FilterType<T>> getInitParam()
   {
      return new ParamValueTypeImpl<FilterType<T>>(this, "", childNode);
   }

   public List<ParamValueType<FilterType<T>>> getInitParamList()
   {
      List<ParamValueType<FilterType<T>>> list = new ArrayList<ParamValueType<FilterType<T>>>();
      List<Node> nodeList = childNode.get(ParamValueTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ParamValueType<FilterType<T>>  type = new ParamValueTypeImpl<FilterType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


}
