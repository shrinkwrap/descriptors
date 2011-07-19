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
package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> resource-managersType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The resource-managers element is used to declare resource managers. A <br> 
 * resource has 3 names: - the "code name" is the name used in the code of the bean, supplied <br> 
 * by the Bean Developer in the resource-ref section of the ejb-jar.xml file - the "xml name" <br> 
 * is an intermediary name used by the Application Assembler to identify resources in the XML <br> 
 * file. - the "runtime jndi name" is the actual jndi-name or url of the deployed resource, it <br> 
 * is supplied by the Deployer. The mapping between the "code name" and the "xml name" is given <br> 
 * in the resource-ref section for the bean. If not, jboss will assume that "xml name" = "code <br> 
 * name". The mapping between the "xml name" and the "runtime jndi name" is given in a <br> 
 * resource-manager section. If not, and if the datasource is of type javax.sql.DataSource, <br> 
 * jboss will look for a javax.sql.DataSource in the jndi tree. Used in: jboss <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ResourceManagersType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ResourceManagersType<T>} 
    */
   public ResourceManagersType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ResourceManagersType<T>} 
    */
   public ResourceManagersType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ResourceManagersType<T>} 
    */
   public ResourceManagersType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-manager
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-manager</code> elements 
    * @return the current instance of {@link ResourceManagersType<T>} 
    */
   public ResourceManagersType<T> removeAllResourceManager();

   /**
    * Returns the <code>resource-manager</code> element
    * @return the node defined for the element <code>resource-manager</code> 
    */
   public ResourceManagerType<ResourceManagersType<T>> resourceManager();

   /**
    * Returns all <code>resource-manager</code> elements
    * @return list of <code>resource-manager</code> 
    */
   public List<ResourceManagerType<ResourceManagersType<T>>> getResourceManagerList();

}
