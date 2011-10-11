package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.datasources.api.TrackStatementsType;
/**
 * This interface defines the contract for the <code> statementType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
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
