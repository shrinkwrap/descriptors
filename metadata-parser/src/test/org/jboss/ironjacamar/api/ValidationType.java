package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> validationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
 */
public interface ValidationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xs:boolean ElementType : background-validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>background-validation</code> element with the given value will be created.
    * Otherwise, the existing <code>background-validation</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<ValidationType<T>></code> 
    */
   public Boolean<ValidationType<T>> getOrCreateBackgroundValidation();

   /**
    * Removes the <code>background-validation</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeBackgroundValidation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xs:boolean ElementType : use-fast-fail
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>use-fast-fail</code> element with the given value will be created.
    * Otherwise, the existing <code>use-fast-fail</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<ValidationType<T>></code> 
    */
   public Boolean<ValidationType<T>> getOrCreateUseFastFail();

   /**
    * Removes the <code>use-fast-fail</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeUseFastFail();
}
