package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.RecoverType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ExtensionType;
import org.jboss.ironjacamar.impl.ExtensionTypeImpl;

/**
 * This class implements the <code> recoverType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
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
   // ClassName: RecoverType ElementName: ironjacamar:credentialType ElementType : recover-credential
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
   // ClassName: RecoverType ElementName: ironjacamar:extensionType ElementType : recover-plugin
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
   // ClassName: RecoverType ElementName: xs:boolean ElementType : no-recovery
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>no-recovery</code> element with the given value will be created.
    * Otherwise, the existing <code>no-recovery</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<RecoverType<T>></code> 
    */
   public Boolean<RecoverType<T>> getOrCreateNoRecovery()
   {
      Node node = childNode.getOrCreate("no-recovery");
      Boolean<RecoverType<T>> noRecovery = new BooleanImpl<RecoverType<T>>(this, "no-recovery", childNode, node);
      return noRecovery;
   }

   /**
    * Removes the <code>no-recovery</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeNoRecovery()
   {
      childNode.removeChildren("no-recovery");
      return this;
   }
}
