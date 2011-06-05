package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class CmrFieldTypeImpl<T> implements Child<T>, CmrFieldType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String cmrFieldName;
   private String cmrFieldType;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public CmrFieldTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("cmr-field");   }


   public T up()
   {
      return t;
   }



   public CmrFieldType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public CmrFieldType<T> setCmrFieldName(String cmrFieldName)
   {
      this.cmrFieldName = cmrFieldName;
      childNode.getOrCreate("cmr-field-name").text(cmrFieldName);
      return this;
   }

   public String getCmrFieldName()
   {
      return cmrFieldName;
   }



   public CmrFieldType<T> setCmrFieldType(String cmrFieldType)
   {
      this.cmrFieldType = cmrFieldType;
      childNode.getOrCreate("cmr-field-type").text(cmrFieldType);
      return this;
   }

   public String getCmrFieldType()
   {
      return cmrFieldType;
   }

}
