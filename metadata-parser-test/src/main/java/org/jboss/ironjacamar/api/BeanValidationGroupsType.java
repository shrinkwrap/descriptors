package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> bean-validation-groupsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public interface BeanValidationGroupsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanValidationGroupsType ElementName: xsd:token ElementType : bean-validation-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>bean-validation-group</code> elements, 
    * a new <code>bean-validation-group</code> element 
    * @param values list of <code>bean-validation-group</code> objects 
    * @return the current instance of <code>BeanValidationGroupsType<T></code> 
    */
   public BeanValidationGroupsType<T> beanValidationGroup(String ... values);

   /**
    * Returns all <code>bean-validation-group</code> elements
    * @return list of <code>bean-validation-group</code> 
    */
   public List<String> getAllBeanValidationGroup();

   /**
    * Removes the <code>bean-validation-group</code> element 
    * @return the current instance of <code>BeanValidationGroupsType<T></code> 
    */
   public BeanValidationGroupsType<T> removeAllBeanValidationGroup();
}
