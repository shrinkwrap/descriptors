package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> securityType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public interface SecurityType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: javaee:emptyType ElementType : application
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> application();

   /**
    * Removes the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public Boolean isApplication();

   /**
    * Removes the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeApplication();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: xsd:token ElementType : security-domain
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain</code> element
    * @param securityDomain the value for the element <code>security-domain</code> 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> securityDomain(String securityDomain);

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain();

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeSecurityDomain();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: xsd:token ElementType : security-domain-and-application
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain-and-application</code> element
    * @param securityDomainAndApplication the value for the element <code>security-domain-and-application</code> 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> securityDomainAndApplication(String securityDomainAndApplication);

   /**
    * Returns the <code>security-domain-and-application</code> element
    * @return the node defined for the element <code>security-domain-and-application</code> 
    */
   public String getSecurityDomainAndApplication();

   /**
    * Removes the <code>security-domain-and-application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeSecurityDomainAndApplication();
}
