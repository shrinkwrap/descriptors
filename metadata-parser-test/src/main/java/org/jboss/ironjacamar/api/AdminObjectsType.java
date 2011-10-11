package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.ironjacamar.api.AdminObjectType;
/**
 * This interface defines the contract for the <code> admin-objectsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public interface AdminObjectsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectsType ElementName: ironjacamar:admin-objectType ElementType : admin-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>admin-object</code> element will be created and returned.
    * Otherwise, the first existing <code>admin-object</code> element will be returned.
    * @return the instance defined for the element <code>admin-object</code> 
    */
   public AdminObjectType<AdminObjectsType<T>> getOrCreateAdminObject();

   /**
    * Creates a new <code>admin-object</code> element 
    * @return the new created instance of <code>AdminObjectType<AdminObjectsType<T>></code> 
    */
   public AdminObjectType<AdminObjectsType<T>> createAdminObject();

   /**
    * Returns all <code>admin-object</code> elements
    * @return list of <code>admin-object</code> 
    */
   public List<AdminObjectType<AdminObjectsType<T>>> getAllAdminObject();

   /**
    * Removes all <code>admin-object</code> elements 
    * @return the current instance of <code>AdminObjectType<AdminObjectsType<T>></code> 
    */
   public AdminObjectsType<T> removeAllAdminObject();
}
