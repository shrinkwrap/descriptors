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

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the ejb-jar_3_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     EjbJar30Descriptor descriptor = Descriptors.create(EjbJar30Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface EjbJar30Descriptor extends Descriptor, DescriptorNamespace<EjbJar30Descriptor>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeAllDescription();

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
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeAllDisplayName();

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
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<EjbJar30Descriptor> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EjbJar30Descriptor>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : enterprise-beans
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeEnterpriseBeans();

   /**
    * If not already created, a new <code>enterprise-beans</code> element will be created and returned.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return the node defined for the element <code>enterprise-beans</code> 
    */
   public EnterpriseBeansType<EjbJar30Descriptor> enterpriseBeans();

   // -------------------------------------------------------------------------------------||
   // Element type : interceptors
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeInterceptors();

   /**
    * If not already created, a new <code>interceptors</code> element will be created and returned.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return the node defined for the element <code>interceptors</code> 
    */
   public InterceptorsType<EjbJar30Descriptor> interceptors();

   // -------------------------------------------------------------------------------------||
   // Element type : relationships
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>relationships</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeRelationships();

   /**
    * If not already created, a new <code>relationships</code> element will be created and returned.
    * Otherwise, the existing <code>relationships</code> element will be returned.
    * @return the node defined for the element <code>relationships</code> 
    */
   public RelationshipsType<EjbJar30Descriptor> relationships();

   // -------------------------------------------------------------------------------------||
   // Element type : assembly-descriptor
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeAssemblyDescriptor();

   /**
    * If not already created, a new <code>assembly-descriptor</code> element will be created and returned.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return the node defined for the element <code>assembly-descriptor</code> 
    */
   public AssemblyDescriptorType<EjbJar30Descriptor> assemblyDescriptor();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-client-jar
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-client-jar</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-client-jar</code> element will be updated with the given value.
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setEjbClientJar(String ejbClientJar);

   /**
    * Removes the <code>ejb-client-jar</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeEjbClientJar();

   /**
    * Returns the <code>ejb-client-jar</code> element
    * @return the node defined for the element <code>ejb-client-jar</code> 
    */
   public String getEjbClientJar();

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>version</code> element with the given value will be created.
    * Otherwise, the existing <code>version</code> element will be updated with the given value.
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setVersion(String version);

   /**
    * Removes the <code>version</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeVersion();

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion();

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>metadata-complete</code> element with the given value will be created.
    * Otherwise, the existing <code>metadata-complete</code> element will be updated with the given value.
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setMetadataComplete(Boolean metadataComplete);

   /**
    * Removes the <code>metadata-complete</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeMetadataComplete();

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete();

}
