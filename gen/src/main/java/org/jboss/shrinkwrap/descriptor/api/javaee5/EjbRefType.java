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
package org.jboss.shrinkwrap.descriptor.api.javaee5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> ejb-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The ejb-refType is used by ejb-ref elements for the <br> 
 * declaration of a reference to an enterprise bean's home or <br> 
 * to the remote business interface of a 3.0 bean. <br> 
 * The declaration consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - the EJB reference name used in the code of <br> 
 * the Deployment Component that's referencing the enterprise <br> 
 * bean. <br> 
 * - the optional expected type of the referenced enterprise bean <br> 
 * - the optional remote interface of the referenced enterprise bean <br> 
 * or the remote business interface of the referenced enterprise <br> 
 * bean <br> 
 * - the optional expected home interface of the referenced <br> 
 * enterprise bean. Not applicable if this ejb-ref <br> 
 * refers to the remote business interface of a 3.0 bean. <br> 
 * - optional ejb-link information, used to specify the <br> 
 * referenced enterprise bean <br> 
 * - optional elements to define injection of the named enterprise <br> 
 * bean into a component field or property <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface EjbRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> removeMappedName();

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
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> removeAllInjectionTarget();

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<EjbRefType<T>> injectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> removeAllDescription();

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
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setEjbRefName(String ejbRefName);

   /**
    * Removes the <code>ejb-ref-name</code> element 
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> removeEjbRefName();

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
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);

   /**
    * If not already created, a new <code>ejb-ref-type</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-ref-type</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setEjbRefType(String ejbRefType);

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
   // Element type : home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>home</code> element with the given value will be created.
    * Otherwise, the existing <code>home</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setHome(String home);

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> removeHome();

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome();

   // -------------------------------------------------------------------------------------||
   // Element type : remote
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>remote</code> element with the given value will be created.
    * Otherwise, the existing <code>remote</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setRemote(String remote);

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> removeRemote();

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-link</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-link</code> element will be updated with the given value.
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> setEjbLink(String ejbLink);

   /**
    * Removes the <code>ejb-link</code> element 
    * @return the current instance of {@link EjbRefType<T>} 
    */
   public EjbRefType<T> removeEjbLink();

   /**
    * Returns the <code>ejb-link</code> element
    * @return the node defined for the element <code>ejb-link</code> 
    */
   public String getEjbLink();

}
