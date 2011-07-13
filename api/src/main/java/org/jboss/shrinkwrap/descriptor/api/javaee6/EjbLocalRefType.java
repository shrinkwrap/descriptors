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
package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> ejb-local-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The ejb-local-refType is used by ejb-local-ref elements for <br> 
 * the declaration of a reference to an enterprise bean's local <br> 
 * home or to the local business interface of a 3.0 bean. <br> 
 * The declaration consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - the EJB reference name used in the code of the Deployment <br> 
 * Component that's referencing the enterprise bean. <br> 
 * - the optional expected type of the referenced enterprise bean <br> 
 * - the optional expected local interface of the referenced <br> 
 * enterprise bean or the local business interface of the <br> 
 * referenced enterprise bean. <br> 
 * - the optional expected local home interface of the referenced <br> 
 * enterprise bean. Not applicable if this ejb-local-ref refers <br> 
 * to the local business interface of a 3.0 bean. <br> 
 * - optional ejb-link information, used to specify the <br> 
 * referenced enterprise bean <br> 
 * - optional elements to define injection of the named enterprise <br> 
 * bean into a component field or property. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface EjbLocalRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : lookup-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lookup-name</code> element with the given value will be created.
    * Otherwise, the existing <code>lookup-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setLookupName(String lookupName);

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeLookupName();

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName();

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeAllInjectionTarget();

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<EjbLocalRefType<T>> injectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setEjbRefName(String ejbRefName);

   /**
    * Removes the <code>ejb-ref-name</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeEjbRefName();

   /**
    * Returns the <code>ejb-ref-name</code> element
    * @return the node defined for the element <code>ejb-ref-name</code> 
    */
   public String getEjbRefName();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref-type</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-ref-type</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);

   /**
    * If not already created, a new <code>ejb-ref-type</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-ref-type</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setEjbRefType(String ejbRefType);

   /**
    * Returns the <code>ejb-ref-type</code> element
    * @return the node defined for the element <code>ejb-ref-type</code> 
    */
   public EjbRefTypeType getEjbRefType();

   /**
    * Returns the <code>ejb-ref-type</code> element
    * @return the node defined for the element <code>ejb-ref-type</code> 
    */
   public String getEjbRefTypeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : local-home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local-home</code> element with the given value will be created.
    * Otherwise, the existing <code>local-home</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setLocalHome(String localHome);

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeLocalHome();

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome();

   // -------------------------------------------------------------------------------------||
   // Element type : local
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local</code> element with the given value will be created.
    * Otherwise, the existing <code>local</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setLocal(String local);

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeLocal();

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-link</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-link</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setEjbLink(String ejbLink);

   /**
    * Removes the <code>ejb-link</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeEjbLink();

   /**
    * Returns the <code>ejb-link</code> element
    * @return the node defined for the element <code>ejb-link</code> 
    */
   public String getEjbLink();

}
