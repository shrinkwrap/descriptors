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
 * The mime-mappingType defines a mapping between an extension
 * and a mime type.
 *
 * Used in: web-app
 *
 *
 *
 */
public class MimeMappingTypeImpl<T> implements Child<T>, MimeMappingType<T>
{
   public final static String nodeName = "mime-mapping";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MimeMappingTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MimeMappingTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : extension
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MimeMappingType<T> setExtension(String extension)
   {
      childNode.getOrCreate("extension").text(extension);
      return this;
   }
   public MimeMappingType<T> removeExtension()
   {
      childNode.remove("extension");
      return this;
   }

   public String getExtension()
   {
      return childNode.textValue("extension");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : mime-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MimeMappingType<T> setMimeType(String mimeType)
   {
      childNode.getOrCreate("mime-type").text(mimeType);
      return this;
   }
   public MimeMappingType<T> removeMimeType()
   {
      childNode.remove("mime-type");
      return this;
   }

   public String getMimeType()
   {
      return childNode.textValue("mime-type");
   }

}
