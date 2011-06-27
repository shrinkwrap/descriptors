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
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 *
 * The taglibType defines the syntax for declaring in
 * the deployment descriptor that a tag library is
 * available to the application. This can be done
 * to override implicit map entries from TLD files and
 * from the container.
 *
 *
 *
 */
public class TaglibTypeImpl<T> implements Child<T>, TaglibType<T>
{
   public final static String nodeName = "taglib";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public TaglibTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public TaglibTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : taglib-uri
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TaglibType<T> setTaglibUri(String taglibUri)
   {
      childNode.getOrCreate("taglib-uri").text(taglibUri);
      return this;
   }
   public TaglibType<T> removeTaglibUri()
   {
      childNode.remove("taglib-uri");
      return this;
   }

   public String getTaglibUri()
   {
      return childNode.textValue("taglib-uri");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : taglib-location
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public TaglibType<T> setTaglibLocation(String taglibLocation)
   {
      childNode.getOrCreate("taglib-location").text(taglibLocation);
      return this;
   }
   public TaglibType<T> removeTaglibLocation()
   {
      childNode.remove("taglib-location");
      return this;
   }

   public String getTaglibLocation()
   {
      return childNode.textValue("taglib-location");
   }

}
