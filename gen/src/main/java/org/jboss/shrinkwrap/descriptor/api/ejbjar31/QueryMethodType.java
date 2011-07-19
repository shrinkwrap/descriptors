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
package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> query-methodType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * [ <br> 
 * The query-method specifies the method for a finder or select <br> 
 * query. <br> 
 *<br>
 * The method-name element specifies the name of a finder or select <br> 
 * method in the entity bean's implementation class. <br> 
 *<br>
 * Each method-param must be defined for a query-method using the <br> 
 * method-params element. <br> 
 *<br>
 * It is used by the query-method element. <br> 
 *<br>
 * Example: <br> 
 *<br>
 * <query> <br> 
 * <description>Method finds large orders</description> <br> 
 * <query-method> <br> 
 * <method-name>findLargeOrders</method-name> <br> 
 * <method-params></method-params> <br> 
 * </query-method> <br> 
 * <ejb-ql> <br> 
 * SELECT OBJECT(o) FROM Order o <br> 
 * WHERE o.amount &gt; 1000 <br> 
 * </ejb-ql> <br> 
 * </query> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface QueryMethodType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-name</code> element with the given value will be created.
    * Otherwise, the existing <code>method-name</code> element will be updated with the given value.
    * @return the current instance of {@link QueryMethodType<T>} 
    */
   public QueryMethodType<T> setMethodName(String methodName);

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of {@link QueryMethodType<T>} 
    */
   public QueryMethodType<T> removeMethodName();

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName();

   // -------------------------------------------------------------------------------------||
   // Element type : method-params
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method-params</code> element 
    * @return the current instance of {@link QueryMethodType<T>} 
    */
   public QueryMethodType<T> removeMethodParams();

   /**
    * If not already created, a new <code>method-params</code> element will be created and returned.
    * Otherwise, the existing <code>method-params</code> element will be returned.
    * @return the node defined for the element <code>method-params</code> 
    */
   public MethodParamsType<QueryMethodType<T>> methodParams();

}
