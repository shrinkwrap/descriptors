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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> locale-encoding-mapping-listType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The locale-encoding-mapping-list contains one or more <br> 
 * locale-encoding-mapping(s). <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface LocaleEncodingMappingListType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>locale-encoding-mapping</code> elements 
    * @return the current instance of {@link LocaleEncodingMappingListType<T>} 
    */
   public LocaleEncodingMappingListType<T> removeAllLocaleEncodingMapping();

   /**
    * Returns the <code>locale-encoding-mapping</code> element
    * @return the node defined for the element <code>locale-encoding-mapping</code> 
    */
   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> localeEncodingMapping();

   /**
    * Returns all <code>locale-encoding-mapping</code> elements
    * @return list of <code>locale-encoding-mapping</code> 
    */
   public List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> getLocaleEncodingMappingList();

}