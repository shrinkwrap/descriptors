package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.ironjacamar.api.ConnectionDefintionType;
/**
 * This interface defines the contract for the <code> connection-definitionsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public interface ConnectionDefinitionsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionsType ElementName: ironjacamar:connection-defintionType ElementType : connection-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-definition</code> element will be returned.
    * @return the instance defined for the element <code>connection-definition</code> 
    */
   public ConnectionDefintionType<ConnectionDefinitionsType<T>> getOrCreateConnectionDefinition();

   /**
    * Creates a new <code>connection-definition</code> element 
    * @return the new created instance of <code>ConnectionDefintionType<ConnectionDefinitionsType<T>></code> 
    */
   public ConnectionDefintionType<ConnectionDefinitionsType<T>> createConnectionDefinition();

   /**
    * Returns all <code>connection-definition</code> elements
    * @return list of <code>connection-definition</code> 
    */
   public List<ConnectionDefintionType<ConnectionDefinitionsType<T>>> getAllConnectionDefinition();

   /**
    * Removes all <code>connection-definition</code> elements 
    * @return the current instance of <code>ConnectionDefintionType<ConnectionDefinitionsType<T>></code> 
    */
   public ConnectionDefinitionsType<T> removeAllConnectionDefinition();
}
