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
package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> moduleType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The moduleType defines a single Java EE module and contains a <br> 
 * connector, ejb, java, or web element, which indicates the <br> 
 * module type and contains a path to the module file, and an <br> 
 * optional alt-dd element, which specifies an optional URI to <br> 
 * the post-assembly version of the deployment descriptor. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface ModuleType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : alt-dd
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alt-dd</code> element with the given value will be created.
    * Otherwise, the existing <code>alt-dd</code> element will be updated with the given value.
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> setAltDd(String altDd);

   /**
    * Removes the <code>alt-dd</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeAltDd();

   /**
    * Returns the <code>alt-dd</code> element
    * @return the node defined for the element <code>alt-dd</code> 
    */
   public String getAltDd();

   // -------------------------------------------------------------------------------------||
   // Element type : connector
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connector</code> element with the given value will be created.
    * Otherwise, the existing <code>connector</code> element will be updated with the given value.
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> setConnector(String connector);

   /**
    * Removes the <code>connector</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeConnector();

   /**
    * Returns the <code>connector</code> element
    * @return the node defined for the element <code>connector</code> 
    */
   public String getConnector();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb</code> element will be updated with the given value.
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> setEjb(String ejb);

   /**
    * Removes the <code>ejb</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeEjb();

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public String getEjb();

   // -------------------------------------------------------------------------------------||
   // Element type : java
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>java</code> element with the given value will be created.
    * Otherwise, the existing <code>java</code> element will be updated with the given value.
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> setJava(String java);

   /**
    * Removes the <code>java</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeJava();

   /**
    * Returns the <code>java</code> element
    * @return the node defined for the element <code>java</code> 
    */
   public String getJava();

   // -------------------------------------------------------------------------------------||
   // Element type : web
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>web</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeWeb();

   /**
    * If not already created, a new <code>web</code> element will be created and returned.
    * Otherwise, the existing <code>web</code> element will be returned.
    * @return the node defined for the element <code>web</code> 
    */
   public WebType<ModuleType<T>> web();

}
