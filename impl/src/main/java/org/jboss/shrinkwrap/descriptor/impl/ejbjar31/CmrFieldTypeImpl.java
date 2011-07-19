/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldTypeType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> cmr-fieldType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The cmr-fieldType describes the bean provider's view of <br> 
 * a relationship. It consists of an optional description, and <br> 
 * the name and the class type of a field in the source of a <br> 
 * role of a relationship. The cmr-field-name element <br> 
 * corresponds to the name used for the get and set accessor <br> 
 * methods for the relationship. The cmr-field-type element is <br> 
 * used only for collection-valued cmr-fields. It specifies the <br> 
 * type of the collection that is used. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class CmrFieldTypeImpl<T> implements Child<T>, CmrFieldType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CmrFieldTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public CmrFieldTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
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

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
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

   /**
    * If not already created, a new <code>cmr-field-name</code> element with the given value will be created.
    * Otherwise, the existing <code>cmr-field-name</code> element will be updated with the given value.
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setCmrFieldName(String cmrFieldName)
   {
      childNode.getOrCreate("cmr-field-name").text(cmrFieldName);
      return this;
   }

   /**
    * Removes the <code>cmr-field-name</code> element 
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> removeCmrFieldName()
   {
      childNode.remove("cmr-field-name");
      return this;
   }

   /**
    * Returns the <code>cmr-field-name</code> element
    * @return the node defined for the element <code>cmr-field-name</code> 
    */
   public String getCmrFieldName()
   {
      return childNode.textValue("cmr-field-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cmr-field-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmr-field-type</code> element with the given value will be created.
    * Otherwise, the existing <code>cmr-field-type</code> element will be updated with the given value.
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setCmrFieldType(CmrFieldTypeType cmrFieldType)
   {
      childNode.getOrCreate("cmr-field-type").text(cmrFieldType);
      return this;
   }

   /**
    * If not already created, a new <code>cmr-field-type</code> element with the given value will be created.
    * Otherwise, the existing <code>cmr-field-type</code> element will be updated with the given value.
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setCmrFieldType(String cmrFieldType)
   {
      childNode.getOrCreate("cmr-field-type").text(cmrFieldType);
      return this;
   }

   /**
    * Returns the <code>cmr-field-type</code> element
    * @return the node defined for the element <code>cmr-field-type</code> 
    */
   public CmrFieldTypeType getCmrFieldType()
   {
      return CmrFieldTypeType.getFromStringValue(childNode.textValue("cmr-field-type"));
   }

   /**
    * Returns the <code>cmr-field-type</code> element
    * @return the node defined for the element <code>cmr-field-type</code> 
    */
   public String getCmrFieldTypeAsString()
   {
      return childNode.textValue("cmr-field-type");
   }

}
