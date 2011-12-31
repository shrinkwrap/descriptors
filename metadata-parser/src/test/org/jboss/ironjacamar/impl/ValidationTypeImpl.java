package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.ValidationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> validationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
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
   // ClassName: ValidationType ElementName: xs:boolean ElementType : background-validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>background-validation</code> element with the given value will be created.
    * Otherwise, the existing <code>background-validation</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<ValidationType<T>></code> 
    */
   public Boolean<ValidationType<T>> getOrCreateBackgroundValidation()
   {
      Node node = childNode.getOrCreate("background-validation");
      Boolean<ValidationType<T>> backgroundValidation = new BooleanImpl<ValidationType<T>>(this, "background-validation", childNode, node);
      return backgroundValidation;
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
   // ClassName: ValidationType ElementName: xs:boolean ElementType : use-fast-fail
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>use-fast-fail</code> element with the given value will be created.
    * Otherwise, the existing <code>use-fast-fail</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<ValidationType<T>></code> 
    */
   public Boolean<ValidationType<T>> getOrCreateUseFastFail()
   {
      Node node = childNode.getOrCreate("use-fast-fail");
      Boolean<ValidationType<T>> useFastFail = new BooleanImpl<ValidationType<T>>(this, "use-fast-fail", childNode, node);
      return useFastFail;
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
}
