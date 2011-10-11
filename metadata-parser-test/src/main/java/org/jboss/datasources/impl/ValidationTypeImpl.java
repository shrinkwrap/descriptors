package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.datasources.api.ValidationType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.ExtensionType;
import org.jboss.datasources.impl.ExtensionTypeImpl;
import org.jboss.datasources.api.ExtensionType;
import org.jboss.datasources.impl.ExtensionTypeImpl;
import org.jboss.datasources.api.ExtensionType;
import org.jboss.datasources.impl.ExtensionTypeImpl;

/**
 * This class implements the <code> validationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public class ValidationTypeImpl<T> implements Child<T>, ValidationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ValidationTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ValidationTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: datasources:extensionType ElementType : valid-connection-checker
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>valid-connection-checker</code> element with the given value will be created.
    * Otherwise, the existing <code>valid-connection-checker</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<ValidationType<T>></code> 
    */
   public ExtensionType<ValidationType<T>> getOrCreateValidConnectionChecker()
   {
      Node node = childNode.getOrCreate("valid-connection-checker");
      ExtensionType<ValidationType<T>> validConnectionChecker = new ExtensionTypeImpl<ValidationType<T>>(this, "valid-connection-checker", childNode, node);
      return validConnectionChecker;
   }

   /**
    * Removes the <code>valid-connection-checker</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeValidConnectionChecker()
   {
      childNode.removeChildren("valid-connection-checker");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xsd:string ElementType : check-valid-connection-sql
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>check-valid-connection-sql</code> element
    * @param checkValidConnectionSql the value for the element <code>check-valid-connection-sql</code> 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> checkValidConnectionSql(String checkValidConnectionSql)
   {
      childNode.getOrCreate("check-valid-connection-sql").text(checkValidConnectionSql);
      return this;
   }

   /**
    * Returns the <code>check-valid-connection-sql</code> element
    * @return the node defined for the element <code>check-valid-connection-sql</code> 
    */
   public String getCheckValidConnectionSql()
   {
      return childNode.getTextValueForPatternName("check-valid-connection-sql");
   }

   /**
    * Removes the <code>check-valid-connection-sql</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeCheckValidConnectionSql()
   {
      childNode.removeChildren("check-valid-connection-sql");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xsd:boolean ElementType : validate-on-match
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validate-on-match</code> element
    * @param validateOnMatch the value for the element <code>validate-on-match</code> 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> validateOnMatch(Boolean validateOnMatch)
   {
      childNode.getOrCreate("validate-on-match").text(validateOnMatch);
      return this;
   }

   /**
    * Returns the <code>validate-on-match</code> element
    * @return the node defined for the element <code>validate-on-match</code> 
    */
   public Boolean isValidateOnMatch()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("validate-on-match"));
   }

   /**
    * Removes the <code>validate-on-match</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeValidateOnMatch()
   {
      childNode.removeChildren("validate-on-match");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xsd:boolean ElementType : background-validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>background-validation</code> element
    * @param backgroundValidation the value for the element <code>background-validation</code> 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> backgroundValidation(Boolean backgroundValidation)
   {
      childNode.getOrCreate("background-validation").text(backgroundValidation);
      return this;
   }

   /**
    * Returns the <code>background-validation</code> element
    * @return the node defined for the element <code>background-validation</code> 
    */
   public Boolean isBackgroundValidation()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("background-validation"));
   }

   /**
    * Removes the <code>background-validation</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeBackgroundValidation()
   {
      childNode.removeChildren("background-validation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xsd:nonNegativeInteger ElementType : background-validation-millis
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>background-validation-millis</code> element
    * @param backgroundValidationMillis the value for the element <code>background-validation-millis</code> 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> backgroundValidationMillis(Integer backgroundValidationMillis)
   {
      childNode.getOrCreate("background-validation-millis").text(backgroundValidationMillis);
      return this;
   }

   /**
    * Returns the <code>background-validation-millis</code> element
    * @return the node defined for the element <code>background-validation-millis</code> 
    */
   public Integer getBackgroundValidationMillis()
   {
      if (childNode.getTextValueForPatternName("background-validation-millis") != null && !childNode.getTextValueForPatternName("background-validation-millis").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("background-validation-millis"));
      }
      return null;
   }

   /**
    * Removes the <code>background-validation-millis</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeBackgroundValidationMillis()
   {
      childNode.removeChildren("background-validation-millis");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: xsd:boolean ElementType : use-fast-fail
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-fast-fail</code> element
    * @param useFastFail the value for the element <code>use-fast-fail</code> 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> useFastFail(Boolean useFastFail)
   {
      childNode.getOrCreate("use-fast-fail").text(useFastFail);
      return this;
   }

   /**
    * Returns the <code>use-fast-fail</code> element
    * @return the node defined for the element <code>use-fast-fail</code> 
    */
   public Boolean isUseFastFail()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("use-fast-fail"));
   }

   /**
    * Removes the <code>use-fast-fail</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeUseFastFail()
   {
      childNode.removeChildren("use-fast-fail");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: datasources:extensionType ElementType : stale-connection-checker
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>stale-connection-checker</code> element with the given value will be created.
    * Otherwise, the existing <code>stale-connection-checker</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<ValidationType<T>></code> 
    */
   public ExtensionType<ValidationType<T>> getOrCreateStaleConnectionChecker()
   {
      Node node = childNode.getOrCreate("stale-connection-checker");
      ExtensionType<ValidationType<T>> staleConnectionChecker = new ExtensionTypeImpl<ValidationType<T>>(this, "stale-connection-checker", childNode, node);
      return staleConnectionChecker;
   }

   /**
    * Removes the <code>stale-connection-checker</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeStaleConnectionChecker()
   {
      childNode.removeChildren("stale-connection-checker");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationType ElementName: datasources:extensionType ElementType : exception-sorter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exception-sorter</code> element with the given value will be created.
    * Otherwise, the existing <code>exception-sorter</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<ValidationType<T>></code> 
    */
   public ExtensionType<ValidationType<T>> getOrCreateExceptionSorter()
   {
      Node node = childNode.getOrCreate("exception-sorter");
      ExtensionType<ValidationType<T>> exceptionSorter = new ExtensionTypeImpl<ValidationType<T>>(this, "exception-sorter", childNode, node);
      return exceptionSorter;
   }

   /**
    * Removes the <code>exception-sorter</code> element 
    * @return the current instance of <code>ValidationType<T></code> 
    */
   public ValidationType<T> removeExceptionSorter()
   {
      childNode.removeChildren("exception-sorter");
      return this;
   }
}
