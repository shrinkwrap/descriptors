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
 * This interface defines the contract for the <code> webType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The webType defines the web-uri and context-root of <br> 
 * a web application module. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface WebType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : web-uri
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>web-uri</code> element with the given value will be created.
    * Otherwise, the existing <code>web-uri</code> element will be updated with the given value.
    * @return the current instance of {@link WebType<T>} 
    */
   public WebType<T> setWebUri(String webUri);

   /**
    * Removes the <code>web-uri</code> element 
    * @return the current instance of {@link WebType<T>} 
    */
   public WebType<T> removeWebUri();

   /**
    * Returns the <code>web-uri</code> element
    * @return the node defined for the element <code>web-uri</code> 
    */
   public String getWebUri();

   // -------------------------------------------------------------------------------------||
   // Element type : context-root
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-root</code> element with the given value will be created.
    * Otherwise, the existing <code>context-root</code> element will be updated with the given value.
    * @return the current instance of {@link WebType<T>} 
    */
   public WebType<T> setContextRoot(String contextRoot);

   /**
    * Removes the <code>context-root</code> element 
    * @return the current instance of {@link WebType<T>} 
    */
   public WebType<T> removeContextRoot();

   /**
    * Returns the <code>context-root</code> element
    * @return the node defined for the element <code>context-root</code> 
    */
   public String getContextRoot();

}
