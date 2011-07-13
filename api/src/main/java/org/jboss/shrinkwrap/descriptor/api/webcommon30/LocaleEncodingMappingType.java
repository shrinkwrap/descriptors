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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> locale-encoding-mappingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The locale-encoding-mapping contains locale name and <br> 
 * encoding name. The locale name must be either "Language-code", <br> 
 * such as "ja", defined by ISO-639 or "Language-code_Country-code", <br> 
 * such as "ja_JP". "Country code" is defined by ISO-3166. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface LocaleEncodingMappingType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : locale
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale</code> element with the given value will be created.
    * Otherwise, the existing <code>locale</code> element will be updated with the given value.
    * @return the current instance of {@link LocaleEncodingMappingType<T>} 
    */
   public LocaleEncodingMappingType<T> setLocale(String locale);

   /**
    * Removes the <code>locale</code> element 
    * @return the current instance of {@link LocaleEncodingMappingType<T>} 
    */
   public LocaleEncodingMappingType<T> removeLocale();

   /**
    * Returns the <code>locale</code> element
    * @return the node defined for the element <code>locale</code> 
    */
   public String getLocale();

   // -------------------------------------------------------------------------------------||
   // Element type : encoding
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>encoding</code> element with the given value will be created.
    * Otherwise, the existing <code>encoding</code> element will be updated with the given value.
    * @return the current instance of {@link LocaleEncodingMappingType<T>} 
    */
   public LocaleEncodingMappingType<T> setEncoding(String encoding);

   /**
    * Removes the <code>encoding</code> element 
    * @return the current instance of {@link LocaleEncodingMappingType<T>} 
    */
   public LocaleEncodingMappingType<T> removeEncoding();

   /**
    * Returns the <code>encoding</code> element
    * @return the node defined for the element <code>encoding</code> 
    */
   public String getEncoding();

}
