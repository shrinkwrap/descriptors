package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

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
 * The jsp-configType is used to provide global configuration
 * information for the JSP files in a web application. It has
 * two subelements, taglib and jsp-property-group.
 *
 *
 *
 */
public class JspConfigTypeImpl<T> implements Child<T>, JspConfigType<T>
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

   public JspConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public JspConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : taglib
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspConfigType<T> removeAllTaglib()
   {
      childNode.remove("taglib");
      return this;
   }

   public TaglibType<JspConfigType<T>> taglib()
   {
      return new TaglibTypeImpl<JspConfigType<T>>(this, "taglib", childNode);
   }

   public List<TaglibType<JspConfigType<T>>> getTaglibList()
   {
      List<TaglibType<JspConfigType<T>>> list = new ArrayList<TaglibType<JspConfigType<T>>>();
      List<Node> nodeList = childNode.get("taglib");
      for(Node node: nodeList)
      {
         TaglibType<JspConfigType<T>>  type = new TaglibTypeImpl<JspConfigType<T>>(this, "taglib", childNode, node);
         list.add(type);
      }
      return list;
   }




   // -------------------------------------------------------------------------------------||
   // Element type : jsp-property-group
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspConfigType<T> removeAllJspPropertyGroup()
   {
      childNode.remove("jsp-property-group");
      return this;
   }

   public JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup()
   {
      return new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "jsp-property-group", childNode);
   }

   public List<JspPropertyGroupType<JspConfigType<T>>> getJspPropertyGroupList()
   {
      List<JspPropertyGroupType<JspConfigType<T>>> list = new ArrayList<JspPropertyGroupType<JspConfigType<T>>>();
      List<Node> nodeList = childNode.get("jsp-property-group");
      for(Node node: nodeList)
      {
         JspPropertyGroupType<JspConfigType<T>>  type = new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "jsp-property-group", childNode, node);
         list.add(type);
      }
      return list;
   }


}
