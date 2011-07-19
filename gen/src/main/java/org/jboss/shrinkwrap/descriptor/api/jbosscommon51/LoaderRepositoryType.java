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

/**
 * This interface defines the contract for the <code> loader-repositoryType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The loader-repository specifies the name of the UnifiedLoaderRepository <br> 
 * MBean to use for the ear to provide ear level scoping of classes deployed <br> 
 * in the ear. It is a unique JMX ObjectName string. It may also specify <br> 
 * an arbitrary configuration by including a loader-repository-config element. <br> 
 *<br>
 * Examples: <br> 
 * <loader-repository>jboss.test:loader=cts-cmp2v1-sar.ear</loader-repository> <br> 
 *<br>
 * <loader-repository loaderRepositoryClass='dot.com.LoaderRepository'> <br> 
 * dot.com:loader=unique-archive-name <br> 
 * <loader-repository-config configParserClass='dot.com.LoaderParser'> <br> 
 * java2ParentDelegaton=true <br> 
 * </loader-repository-config> <br> 
 * </loader-repository> <br> 
 * </loader-repository> <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface LoaderRepositoryType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : loader-repository-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>loader-repository-config</code> elements 
    * @return the current instance of {@link LoaderRepositoryType<T>} 
    */
   public LoaderRepositoryType<T> removeAllLoaderRepositoryConfig();

   /**
    * Returns the <code>loader-repository-config</code> element
    * @return the node defined for the element <code>loader-repository-config</code> 
    */
   public LoaderRepositoryConfigType<LoaderRepositoryType<T>> loaderRepositoryConfig();

   /**
    * Returns all <code>loader-repository-config</code> elements
    * @return list of <code>loader-repository-config</code> 
    */
   public List<LoaderRepositoryConfigType<LoaderRepositoryType<T>>> getLoaderRepositoryConfigList();

   // -------------------------------------------------------------------------------------||
   // Element type : loaderRepositoryClass
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>loaderRepositoryClass</code> attribute
    * @param loaderRepositoryClass the value for the attribute <code>loaderRepositoryClass</code> 
    * @return the current instance of {@link LoaderRepositoryType<T>} 
    */
   public LoaderRepositoryType<T> setLoaderRepositoryClass(String loaderRepositoryClass);

   /**
    * Removes the <code>loaderRepositoryClass</code> attribute 
    * @return the current instance of {@link LoaderRepositoryType<T>} 
    */
   public LoaderRepositoryType<T> removeLoaderRepositoryClass();

   /**
    * Returns the <code>loaderRepositoryClass</code> element
    * @return the node defined for the element <code>loaderRepositoryClass</code> 
    */
   public String getLoaderRepositoryClass();

}
