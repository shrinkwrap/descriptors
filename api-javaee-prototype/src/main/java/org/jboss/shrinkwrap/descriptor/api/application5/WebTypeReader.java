package org.jboss.shrinkwrap.descriptor.api.application5; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> webType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public interface WebTypeReader<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebTypeReader ElementName: xsd:token ElementType : web-uri
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>web-uri</code> element
    * @return the node defined for the element <code>web-uri</code> 
    */
   public String getWebUri();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebTypeReader ElementName: xsd:token ElementType : context-root
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>context-root</code> element
    * @return the node defined for the element <code>context-root</code> 
    */
   public String getContextRoot();
}
