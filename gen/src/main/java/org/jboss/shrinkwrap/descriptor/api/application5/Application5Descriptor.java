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
package org.jboss.shrinkwrap.descriptor.api.application5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the application_5.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     Application5Descriptor descriptor = Descriptors.create(Application5Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface Application5Descriptor extends Descriptor, DescriptorNamespace<Application5Descriptor>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllDescription();

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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllDisplayName();

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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<Application5Descriptor> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<Application5Descriptor>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : module
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllModule();

   /**
    * Returns the <code>module</code> element
    * @return the node defined for the element <code>module</code> 
    */
   public ModuleType<Application5Descriptor> module();

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<Application5Descriptor>> getModuleList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllSecurityRole();

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<Application5Descriptor> securityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<Application5Descriptor>> getSecurityRoleList();

   // -------------------------------------------------------------------------------------||
   // Element type : library-directory
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>library-directory</code> element with the given value will be created.
    * Otherwise, the existing <code>library-directory</code> element will be updated with the given value.
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setLibraryDirectory(String libraryDirectory);

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeLibraryDirectory();

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory();

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>version</code> element with the given value will be created.
    * Otherwise, the existing <code>version</code> element will be updated with the given value.
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setVersion(String version);

   /**
    * Removes the <code>version</code> element 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeVersion();

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion();

}
