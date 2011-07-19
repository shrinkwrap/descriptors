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
package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResAuthType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResSharingScopeType;

/**
 * This interface defines the contract for the <code> resource-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The resource-ref element gives a mapping between the "code name" of a <br> 
 * resource (res-ref-name, provided by the Bean Developer) and its "xml name" (resource-name, <br> 
 * provided by the Application Assembler). If no resource-ref is provided, jboss will assume <br> 
 * that "xml-name" = "code name" See resource-managers. <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ResourceRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : res-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>res-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResRefName(String resRefName);

   /**
    * Removes the <code>res-ref-name</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeResRefName();

   /**
    * Returns the <code>res-ref-name</code> element
    * @return the node defined for the element <code>res-ref-name</code> 
    */
   public String getResRefName();

   // -------------------------------------------------------------------------------------||
   // Element type : res-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-type</code> element with the given value will be created.
    * Otherwise, the existing <code>res-type</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResType(String resType);

   /**
    * Removes the <code>res-type</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeResType();

   /**
    * Returns the <code>res-type</code> element
    * @return the node defined for the element <code>res-type</code> 
    */
   public String getResType();

   // -------------------------------------------------------------------------------------||
   // Element type : res-auth
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-auth</code> element with the given value will be created.
    * Otherwise, the existing <code>res-auth</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResAuth(ResAuthType resAuth);

   /**
    * If not already created, a new <code>res-auth</code> element with the given value will be created.
    * Otherwise, the existing <code>res-auth</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResAuth(String resAuth);

   /**
    * Returns the <code>res-auth</code> element
    * @return the node defined for the element <code>res-auth</code> 
    */
   public ResAuthType getResAuth();

   /**
    * Returns the <code>res-auth</code> element
    * @return the node defined for the element <code>res-auth</code> 
    */
   public String getResAuthAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : res-sharing-scope
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-sharing-scope</code> element with the given value will be created.
    * Otherwise, the existing <code>res-sharing-scope</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResSharingScope(ResSharingScopeType resSharingScope);

   /**
    * If not already created, a new <code>res-sharing-scope</code> element with the given value will be created.
    * Otherwise, the existing <code>res-sharing-scope</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResSharingScope(String resSharingScope);

   /**
    * Returns the <code>res-sharing-scope</code> element
    * @return the node defined for the element <code>res-sharing-scope</code> 
    */
   public ResSharingScopeType getResSharingScope();

   /**
    * Returns the <code>res-sharing-scope</code> element
    * @return the node defined for the element <code>res-sharing-scope</code> 
    */
   public String getResSharingScopeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeAllInjectionTarget();

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ResourceRefType<T>> injectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList();

   public ResourceRefType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-name</code> element with the given value will be created.
    * Otherwise, the existing <code>resource-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResourceName(String resourceName);

   /**
    * Removes the <code>resource-name</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeResourceName();

   /**
    * Returns the <code>resource-name</code> element
    * @return the node defined for the element <code>resource-name</code> 
    */
   public String getResourceName();

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setJndiName(String jndiName);

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeJndiName();

   /**
    * Returns the <code>jndi-name</code> element
    * @return the node defined for the element <code>jndi-name</code> 
    */
   public String getJndiName();

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : res-url
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-url</code> element with the given value will be created.
    * Otherwise, the existing <code>res-url</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResUrl(String resUrl);

   /**
    * Removes the <code>res-url</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeResUrl();

   /**
    * Returns the <code>res-url</code> element
    * @return the node defined for the element <code>res-url</code> 
    */
   public String getResUrl();

}
