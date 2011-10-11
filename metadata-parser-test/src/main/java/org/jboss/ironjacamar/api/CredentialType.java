package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> credentialType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public interface CredentialType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CredentialType ElementName: xsd:token ElementType : user-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user-name</code> element
    * @param userName the value for the element <code>user-name</code> 
    * @return the current instance of <code>CredentialType<T></code> 
    */
   public CredentialType<T> userName(String userName);

   /**
    * Returns the <code>user-name</code> element
    * @return the node defined for the element <code>user-name</code> 
    */
   public String getUserName();

   /**
    * Removes the <code>user-name</code> element 
    * @return the current instance of <code>CredentialType<T></code> 
    */
   public CredentialType<T> removeUserName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CredentialType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>CredentialType<T></code> 
    */
   public CredentialType<T> password(String password);

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword();

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of <code>CredentialType<T></code> 
    */
   public CredentialType<T> removePassword();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CredentialType ElementName: xsd:token ElementType : security-domain
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain</code> element
    * @param securityDomain the value for the element <code>security-domain</code> 
    * @return the current instance of <code>CredentialType<T></code> 
    */
   public CredentialType<T> securityDomain(String securityDomain);

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain();

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of <code>CredentialType<T></code> 
    */
   public CredentialType<T> removeSecurityDomain();
}
