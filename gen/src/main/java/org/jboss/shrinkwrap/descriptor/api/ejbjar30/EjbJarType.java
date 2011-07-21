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
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;

/**
 * This interface defines the contract for the <code> ejb-jarType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The ejb-jarType defines the root element of the EJB <br> 
 * deployment descriptor. It contains <br> 
 *<br>
 * - an optional description of the ejb-jar file <br> 
 * - an optional display name <br> 
 * - an optional icon that contains a small and a large <br> 
 * icon file name <br> 
 * - structural information about all included <br> 
 * enterprise beans that is not specified through <br> 
 * annotations <br> 
 * - structural information about interceptor classes <br> 
 * - a descriptor for container managed relationships, <br> 
 * if any. <br> 
 * - an optional application-assembly descriptor <br> 
 * - an optional name of an ejb-client-jar file for the <br> 
 * ejb-jar. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface EjbJarType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeAllDisplayName();

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList();

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<EjbJarType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EjbJarType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : enterprise-beans
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeEnterpriseBeans();

   /**
    * If not already created, a new <code>enterprise-beans</code> element will be created and returned.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return the node defined for the element <code>enterprise-beans</code> 
    */
   public EnterpriseBeansType<EjbJarType<T>> enterpriseBeans();

   // -------------------------------------------------------------------------------------||
   // Element type : interceptors
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeInterceptors();

   /**
    * If not already created, a new <code>interceptors</code> element will be created and returned.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return the node defined for the element <code>interceptors</code> 
    */
   public InterceptorsType<EjbJarType<T>> interceptors();

   // -------------------------------------------------------------------------------------||
   // Element type : relationships
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>relationships</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeRelationships();

   /**
    * If not already created, a new <code>relationships</code> element will be created and returned.
    * Otherwise, the existing <code>relationships</code> element will be returned.
    * @return the node defined for the element <code>relationships</code> 
    */
   public RelationshipsType<EjbJarType<T>> relationships();

   // -------------------------------------------------------------------------------------||
   // Element type : assembly-descriptor
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeAssemblyDescriptor();

   /**
    * If not already created, a new <code>assembly-descriptor</code> element will be created and returned.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return the node defined for the element <code>assembly-descriptor</code> 
    */
   public AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-client-jar
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-client-jar</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-client-jar</code> element will be updated with the given value.
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setEjbClientJar(String ejbClientJar);

   /**
    * Removes the <code>ejb-client-jar</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeEjbClientJar();

   /**
    * Returns the <code>ejb-client-jar</code> element
    * @return the node defined for the element <code>ejb-client-jar</code> 
    */
   public String getEjbClientJar();

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setVersion(String version);

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeVersion();

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion();

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setMetadataComplete(Boolean metadataComplete);

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeMetadataComplete();

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete();

}
