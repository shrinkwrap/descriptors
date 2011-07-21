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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> queryType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The queryType defines a finder or select <br> 
 * query. It contains <br> 
 * - an optional description of the query <br> 
 * - the specification of the finder or select <br> 
 * method it is used by <br> 
 * - an optional specification of the result type <br> 
 * mapping, if the query is for a select method <br> 
 * and entity objects are returned. <br> 
 * - the EJB QL query string that defines the query. <br> 
 *<br>
 * Queries that are expressible in EJB QL must use the ejb-ql <br> 
 * element to specify the query. If a query is not expressible <br> 
 * in EJB QL, the description element should be used to <br> 
 * describe the semantics of the query and the ejb-ql element <br> 
 * should be empty. <br> 
 *<br>
 * The result-type-mapping is an optional element. It can only <br> 
 * be present if the query-method specifies a select method <br> 
 * that returns entity objects. The default value for the <br> 
 * result-type-mapping element is "Local". <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface QueryType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>description</code> element with the given value will be created.
    * Otherwise, the existing <code>description</code> element will be updated with the given value.
    * @return the current instance of {@link QueryType<T>} 
    */
   public QueryType<T> setDescription(String description);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link QueryType<T>} 
    */
   public QueryType<T> removeDescription();

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   // -------------------------------------------------------------------------------------||
   // Element type : query-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>query-method</code> element 
    * @return the current instance of {@link QueryType<T>} 
    */
   public QueryType<T> removeQueryMethod();

   /**
    * If not already created, a new <code>query-method</code> element will be created and returned.
    * Otherwise, the existing <code>query-method</code> element will be returned.
    * @return the node defined for the element <code>query-method</code> 
    */
   public QueryMethodType<QueryType<T>> queryMethod();

   // -------------------------------------------------------------------------------------||
   // Element type : result-type-mapping
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>result-type-mapping</code> element with the given value will be created.
    * Otherwise, the existing <code>result-type-mapping</code> element will be updated with the given value.
    * @return the current instance of {@link QueryType<T>} 
    */
   public QueryType<T> setResultTypeMapping(ResultTypeMappingType resultTypeMapping);

   /**
    * If not already created, a new <code>result-type-mapping</code> element with the given value will be created.
    * Otherwise, the existing <code>result-type-mapping</code> element will be updated with the given value.
    * @return the current instance of {@link QueryType<T>} 
    */
   public QueryType<T> setResultTypeMapping(String resultTypeMapping);

   /**
    * Returns the <code>result-type-mapping</code> element
    * @return the node defined for the element <code>result-type-mapping</code> 
    */
   public ResultTypeMappingType getResultTypeMapping();

   /**
    * Returns the <code>result-type-mapping</code> element
    * @return the node defined for the element <code>result-type-mapping</code> 
    */
   public String getResultTypeMappingAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ql
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ql</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-ql</code> element will be updated with the given value.
    * @return the current instance of {@link QueryType<T>} 
    */
   public QueryType<T> setEjbQl(String ejbQl);

   /**
    * Removes the <code>ejb-ql</code> element 
    * @return the current instance of {@link QueryType<T>} 
    */
   public QueryType<T> removeEjbQl();

   /**
    * Returns the <code>ejb-ql</code> element
    * @return the node defined for the element <code>ejb-ql</code> 
    */
   public String getEjbQl();

}