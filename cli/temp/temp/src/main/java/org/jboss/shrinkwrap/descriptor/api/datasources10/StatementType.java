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
package org.jboss.shrinkwrap.descriptor.api.datasources10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.datasources10.TrackStatementsType;
/**
 * This interface defines the contract for the <code> statementType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface StatementType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatementType ElementName: datasources:track-statementsType ElementType : track-statements
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>track-statements</code> element
    * @param trackStatements the value for the element <code>track-statements</code> 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> trackStatements(TrackStatementsType trackStatements);
   /**
    * Sets the <code>track-statements</code> element
    * @param trackStatements the value for the element <code>track-statements</code> 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> trackStatements(String trackStatements);

   /**
    * Returns the <code>track-statements</code> element
    * @return the value found for the element <code>track-statements</code> 
    */
   public TrackStatementsType getTrackStatements();

   /**
    * Returns the <code>track-statements</code> element
    * @return the value found for the element <code>track-statements</code> 
    */
   public String  getTrackStatementsAsString();

   /**
    * Removes the <code>track-statements</code> attribute 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> removeTrackStatements();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatementType ElementName: xsd:nonNegativeInteger ElementType : prepared-statement-cache-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>prepared-statement-cache-size</code> element
    * @param preparedStatementCacheSize the value for the element <code>prepared-statement-cache-size</code> 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> preparedStatementCacheSize(Integer preparedStatementCacheSize);

   /**
    * Returns the <code>prepared-statement-cache-size</code> element
    * @return the node defined for the element <code>prepared-statement-cache-size</code> 
    */
   public Integer getPreparedStatementCacheSize();

   /**
    * Removes the <code>prepared-statement-cache-size</code> element 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> removePreparedStatementCacheSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatementType ElementName: javaee:emptyType ElementType : share-prepared-statements
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>share-prepared-statements</code> element 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> sharePreparedStatements();

   /**
    * Removes the <code>share-prepared-statements</code> element 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public Boolean isSharePreparedStatements();

   /**
    * Removes the <code>share-prepared-statements</code> element 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> removeSharePreparedStatements();
}
