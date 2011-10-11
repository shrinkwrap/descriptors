package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.datasources.api.ExtensionType;
/**
 * This interface defines the contract for the <code> dsSecurityType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public interface DsSecurityType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : user-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user-name</code> element
    * @param userName the value for the element <code>user-name</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> userName(String userName);

   /**
    * Returns the <code>user-name</code> element
    * @return the node defined for the element <code>user-name</code> 
    */
   public String getUserName();

   /**
    * Removes the <code>user-name</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeUserName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> password(String password);

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword();

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removePassword();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : security-domain
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain</code> element
    * @param securityDomain the value for the element <code>security-domain</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> securityDomain(String securityDomain);

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain();

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeSecurityDomain();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: datasources:extensionType ElementType : reauth-plugin
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reauth-plugin</code> element with the given value will be created.
    * Otherwise, the existing <code>reauth-plugin</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<DsSecurityType<T>></code> 
    */
   public ExtensionType<DsSecurityType<T>> getOrCreateReauthPlugin();

   /**
    * Removes the <code>reauth-plugin</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeReauthPlugin();
}
