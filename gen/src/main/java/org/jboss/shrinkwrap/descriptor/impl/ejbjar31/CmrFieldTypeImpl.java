package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

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
 * The cmr-fieldType describes the bean provider's view of
 * a relationship. It consists of an optional description, and
 * the name and the class type of a field in the source of a
 * role of a relationship. The cmr-field-name element
 * corresponds to the name used for the get and set accessor
 * methods for the relationship. The cmr-field-type element is
 * used only for collection-valued cmr-fields. It specifies the
 * type of the collection that is used.
 *
 *
 *
 */
public class CmrFieldTypeImpl<T> implements Child<T>, CmrFieldType<T>
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

   public CmrFieldTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public CmrFieldTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CmrFieldType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public CmrFieldType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public CmrFieldType<T> removeAllDescription()
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
   // Element type : cmr-field-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CmrFieldType<T> setCmrFieldName(String cmrFieldName)
   {
      childNode.getOrCreate("cmr-field-name").text(cmrFieldName);
      return this;
   }
   public CmrFieldType<T> removeCmrFieldName()
   {
      childNode.remove("cmr-field-name");
      return this;
   }

   public String getCmrFieldName()
   {
      return childNode.textValue("cmr-field-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : cmr-field-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CmrFieldType<T> setCmrFieldType(CmrFieldTypeType cmrFieldType)
   {
      childNode.getOrCreate("cmr-field-type").text(cmrFieldType);
      return this;
   }
   public CmrFieldType<T> setCmrFieldType(String cmrFieldType)
   {
      childNode.getOrCreate("cmr-field-type").text(cmrFieldType);
      return this;
   }

   public CmrFieldTypeType getCmrFieldType()
   {
      return CmrFieldTypeType.getFromStringValue(childNode.textValue("cmr-field-type"));
   }

   public String  getCmrFieldTypeAsString()
   {
      return childNode.textValue("cmr-field-type");
   }

}
