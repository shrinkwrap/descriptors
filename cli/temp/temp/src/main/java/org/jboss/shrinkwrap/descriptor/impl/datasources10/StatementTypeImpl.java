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
package org.jboss.shrinkwrap.descriptor.impl.datasources10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.datasources10.StatementType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.datasources10.TrackStatementsType;

/**
 * This class implements the <code> statementType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class StatementTypeImpl<T> implements Child<T>, StatementType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public StatementTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public StatementTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatementType ElementName: datasources:track-statementsType ElementType : track-statements
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>track-statements</code> element
    * @param trackStatements the value for the element <code>track-statements</code> 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> trackStatements(TrackStatementsType trackStatements)
   {
      childNode.getOrCreate("track-statements").text(trackStatements);
      return this;
   }
   /**
    * Sets the <code>track-statements</code> element
    * @param trackStatements the value for the element <code>track-statements</code> 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> trackStatements(String trackStatements)
   {
      childNode.getOrCreate("track-statements").text(trackStatements);
      return this;
   }

   /**
    * Returns the <code>track-statements</code> element
    * @return the value found for the element <code>track-statements</code> 
    */
   public TrackStatementsType getTrackStatements()
   {
      return TrackStatementsType.getFromStringValue(childNode.getTextValueForPatternName("track-statements"));
   }

   /**
    * Returns the <code>track-statements</code> element
    * @return the value found for the element <code>track-statements</code> 
    */
   public String  getTrackStatementsAsString()
   {
      return childNode.getTextValueForPatternName("track-statements");
   }

   /**
    * Removes the <code>track-statements</code> attribute 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> removeTrackStatements()
   {
      childNode.removeAttribute("track-statements");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatementType ElementName: xsd:nonNegativeInteger ElementType : prepared-statement-cache-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>prepared-statement-cache-size</code> element
    * @param preparedStatementCacheSize the value for the element <code>prepared-statement-cache-size</code> 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> preparedStatementCacheSize(Integer preparedStatementCacheSize)
   {
      childNode.getOrCreate("prepared-statement-cache-size").text(preparedStatementCacheSize);
      return this;
   }

   /**
    * Returns the <code>prepared-statement-cache-size</code> element
    * @return the node defined for the element <code>prepared-statement-cache-size</code> 
    */
   public Integer getPreparedStatementCacheSize()
   {
      if (childNode.getTextValueForPatternName("prepared-statement-cache-size") != null && !childNode.getTextValueForPatternName("prepared-statement-cache-size").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("prepared-statement-cache-size"));
      }
      return null;
   }

   /**
    * Removes the <code>prepared-statement-cache-size</code> element 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> removePreparedStatementCacheSize()
   {
      childNode.removeChildren("prepared-statement-cache-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatementType ElementName: javaee:emptyType ElementType : share-prepared-statements
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>share-prepared-statements</code> element 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> sharePreparedStatements()
   {
      childNode.getOrCreate("share-prepared-statements");
      return this;
   }

   /**
    * Removes the <code>share-prepared-statements</code> element 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public Boolean isSharePreparedStatements()
   {
      return childNode.getSingle("share-prepared-statements") != null;
   }

   /**
    * Removes the <code>share-prepared-statements</code> element 
    * @return the current instance of <code>StatementType<T></code> 
    */
   public StatementType<T> removeSharePreparedStatements()
   {
      childNode.removeChild("share-prepared-statements");
      return this;
   }
}
