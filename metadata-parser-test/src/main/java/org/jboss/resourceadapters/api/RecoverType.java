package org.jboss.resourceadapters.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.resourceadapters.api.CredentialType;
import org.jboss.resourceadapters.api.ExtensionType;
/**
 * This interface defines the contract for the <code> recoverType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public interface RecoverType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: resourceadapters:credentialType ElementType : recover-credential
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recover-credential</code> element with the given value will be created.
    * Otherwise, the existing <code>recover-credential</code> element will be returned.
    * @return  a new or existing instance of <code>CredentialType<RecoverType<T>></code> 
    */
   public CredentialType<RecoverType<T>> getOrCreateRecoverCredential();

   /**
    * Removes the <code>recover-credential</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeRecoverCredential();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: resourceadapters:extensionType ElementType : recover-plugin
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recover-plugin</code> element with the given value will be created.
    * Otherwise, the existing <code>recover-plugin</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<RecoverType<T>></code> 
    */
   public ExtensionType<RecoverType<T>> getOrCreateRecoverPlugin();

   /**
    * Removes the <code>recover-plugin</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeRecoverPlugin();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: xsd:boolean ElementType : no-recovery
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>no-recovery</code> attribute
    * @param noRecovery the value for the attribute <code>no-recovery</code> 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> noRecovery(Boolean noRecovery);

   /**
    * Returns the <code>no-recovery</code> attribute
    * @return the value defined for the attribute <code>no-recovery</code> 
    */
public Boolean isNoRecovery();

   /**
    * Removes the <code>no-recovery</code> attribute 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeNoRecovery();
}
