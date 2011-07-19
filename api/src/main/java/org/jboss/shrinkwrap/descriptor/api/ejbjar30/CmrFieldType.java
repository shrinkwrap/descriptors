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
package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> cmr-fieldType </code> xsd type 
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
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface CmrFieldType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : cmr-field-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmr-field-name</code> element with the given value will be created.
    * Otherwise, the existing <code>cmr-field-name</code> element will be updated with the given value.
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setCmrFieldName(String cmrFieldName);

   /**
    * Removes the <code>cmr-field-name</code> element 
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> removeCmrFieldName();

   /**
    * Returns the <code>cmr-field-name</code> element
    * @return the node defined for the element <code>cmr-field-name</code> 
    */
   public String getCmrFieldName();

   // -------------------------------------------------------------------------------------||
   // Element type : cmr-field-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmr-field-type</code> element with the given value will be created.
    * Otherwise, the existing <code>cmr-field-type</code> element will be updated with the given value.
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setCmrFieldType(CmrFieldTypeType cmrFieldType);

   /**
    * If not already created, a new <code>cmr-field-type</code> element with the given value will be created.
    * Otherwise, the existing <code>cmr-field-type</code> element will be updated with the given value.
    * @return the current instance of {@link CmrFieldType<T>} 
    */
   public CmrFieldType<T> setCmrFieldType(String cmrFieldType);

   /**
    * Returns the <code>cmr-field-type</code> element
    * @return the node defined for the element <code>cmr-field-type</code> 
    */
   public CmrFieldTypeType getCmrFieldType();

   /**
    * Returns the <code>cmr-field-type</code> element
    * @return the node defined for the element <code>cmr-field-type</code> 
    */
   public String getCmrFieldTypeAsString();

}
