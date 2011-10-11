package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> validationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public interface ValidationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xsd:boolean ElementType : background-validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>background-validation</code> element
    * @param backgroundValidation the value for the element <code>background-validation</code> 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> backgroundValidation(Boolean backgroundValidation);

   /**
    * Returns the <code>background-validation</code> element
    * @return the node defined for the element <code>background-validation</code> 
    */
   public Boolean isBackgroundValidation();

   /**
    * Removes the <code>background-validation</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeBackgroundValidation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xsd:nonNegativeInteger ElementType : background-validation-millis
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>background-validation-millis</code> element
    * @param backgroundValidationMillis the value for the element <code>background-validation-millis</code> 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> backgroundValidationMillis(Integer backgroundValidationMillis);

   /**
    * Returns the <code>background-validation-millis</code> element
    * @return the node defined for the element <code>background-validation-millis</code> 
    */
   public Integer getBackgroundValidationMillis();

   /**
    * Removes the <code>background-validation-millis</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeBackgroundValidationMillis();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xsd:boolean ElementType : use-fast-fail
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-fast-fail</code> element
    * @param useFastFail the value for the element <code>use-fast-fail</code> 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> useFastFail(Boolean useFastFail);

   /**
    * Returns the <code>use-fast-fail</code> element
    * @return the node defined for the element <code>use-fast-fail</code> 
    */
   public Boolean isUseFastFail();

   /**
    * Removes the <code>use-fast-fail</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeUseFastFail();
}
