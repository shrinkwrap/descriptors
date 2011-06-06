package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmpFieldType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class CmpFieldTypeImpl<T> implements Child<T>, CmpFieldType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String fieldName;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public CmpFieldTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("cmp-field");   }


   public T up()
   {
      return t;
   }



   public CmpFieldType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public CmpFieldType<T> setFieldName(String fieldName)
   {
      this.fieldName = fieldName;
      childNode.getOrCreate("field-name").text(fieldName);
      return this;
   }

   public String getFieldName()
   {
      return fieldName;
   }

}
