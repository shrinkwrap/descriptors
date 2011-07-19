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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> loader-repository-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The loader-repository-config element specifies any arbitrary configuration <br> 
 * fragment for use in configuring the loader-repository instance. The actual content of this <br> 
 * element is specific to the loaderRepositoryClass and the code parsing the element. <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface LoaderRepositoryConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : configParserClass
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>configParserClass</code> attribute
    * @param configParserClass the value for the attribute <code>configParserClass</code> 
    * @return the current instance of {@link LoaderRepositoryConfigType<T>} 
    */
   public LoaderRepositoryConfigType<T> setConfigParserClass(String configParserClass);

   /**
    * Removes the <code>configParserClass</code> attribute 
    * @return the current instance of {@link LoaderRepositoryConfigType<T>} 
    */
   public LoaderRepositoryConfigType<T> removeConfigParserClass();

   /**
    * Returns the <code>configParserClass</code> element
    * @return the node defined for the element <code>configParserClass</code> 
    */
   public String getConfigParserClass();

}
