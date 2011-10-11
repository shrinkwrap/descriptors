package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.resourceadapters.api.RecoverType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.CredentialType;
import org.jboss.resourceadapters.impl.CredentialTypeImpl;
import org.jboss.resourceadapters.api.ExtensionType;
import org.jboss.resourceadapters.impl.ExtensionTypeImpl;

/**
 * This class implements the <code> recoverType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public class RecoverTypeImpl<T> implements Child<T>, RecoverType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public RecoverTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public RecoverTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: resourceadapters:credentialType ElementType : recover-credential
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recover-credential</code> element with the given value will be created.
    * Otherwise, the existing <code>recover-credential</code> element will be returned.
    * @return  a new or existing instance of <code>CredentialType<RecoverType<T>></code> 
    */
   public CredentialType<RecoverType<T>> getOrCreateRecoverCredential()
   {
      Node node = childNode.getOrCreate("recover-credential");
      CredentialType<RecoverType<T>> recoverCredential = new CredentialTypeImpl<RecoverType<T>>(this, "recover-credential", childNode, node);
      return recoverCredential;
   }

   /**
    * Removes the <code>recover-credential</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeRecoverCredential()
   {
      childNode.removeChildren("recover-credential");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: resourceadapters:extensionType ElementType : recover-plugin
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recover-plugin</code> element with the given value will be created.
    * Otherwise, the existing <code>recover-plugin</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<RecoverType<T>></code> 
    */
   public ExtensionType<RecoverType<T>> getOrCreateRecoverPlugin()
   {
      Node node = childNode.getOrCreate("recover-plugin");
      ExtensionType<RecoverType<T>> recoverPlugin = new ExtensionTypeImpl<RecoverType<T>>(this, "recover-plugin", childNode, node);
      return recoverPlugin;
   }

   /**
    * Removes the <code>recover-plugin</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeRecoverPlugin()
   {
      childNode.removeChildren("recover-plugin");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: xsd:boolean ElementType : no-recovery
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>no-recovery</code> attribute
    * @param noRecovery the value for the attribute <code>no-recovery</code> 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> noRecovery(Boolean noRecovery)
   {
      childNode.attribute("no-recovery", noRecovery);
      return this;
   }

   /**
    * Returns the <code>no-recovery</code> attribute
    * @return the value defined for the attribute <code>no-recovery</code> 
    */
   public Boolean isNoRecovery()
   {
      return Strings.isTrue(childNode.getAttribute("no-recovery"));
   }

   /**
    * Removes the <code>no-recovery</code> attribute 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeNoRecovery()
   {
      childNode.removeAttribute("no-recovery");
      return this;
   }
}
