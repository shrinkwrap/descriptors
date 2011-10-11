package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.datasources.api.DsSecurityType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.ExtensionType;
import org.jboss.datasources.impl.ExtensionTypeImpl;

/**
 * This class implements the <code> dsSecurityType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public class DsSecurityTypeImpl<T> implements Child<T>, DsSecurityType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DsSecurityTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DsSecurityTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : user-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user-name</code> element
    * @param userName the value for the element <code>user-name</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> userName(String userName)
   {
      childNode.getOrCreate("user-name").text(userName);
      return this;
   }

   /**
    * Returns the <code>user-name</code> element
    * @return the node defined for the element <code>user-name</code> 
    */
   public String getUserName()
   {
      return childNode.getTextValueForPatternName("user-name");
   }

   /**
    * Removes the <code>user-name</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeUserName()
   {
      childNode.removeChildren("user-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> password(String password)
   {
      childNode.getOrCreate("password").text(password);
      return this;
   }

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword()
   {
      return childNode.getTextValueForPatternName("password");
   }

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removePassword()
   {
      childNode.removeChildren("password");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : security-domain
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain</code> element
    * @param securityDomain the value for the element <code>security-domain</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> securityDomain(String securityDomain)
   {
      childNode.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain()
   {
      return childNode.getTextValueForPatternName("security-domain");
   }

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeSecurityDomain()
   {
      childNode.removeChildren("security-domain");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: datasources:extensionType ElementType : reauth-plugin
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reauth-plugin</code> element with the given value will be created.
    * Otherwise, the existing <code>reauth-plugin</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<DsSecurityType<T>></code> 
    */
   public ExtensionType<DsSecurityType<T>> getOrCreateReauthPlugin()
   {
      Node node = childNode.getOrCreate("reauth-plugin");
      ExtensionType<DsSecurityType<T>> reauthPlugin = new ExtensionTypeImpl<DsSecurityType<T>>(this, "reauth-plugin", childNode, node);
      return reauthPlugin;
   }

   /**
    * Removes the <code>reauth-plugin</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeReauthPlugin()
   {
      childNode.removeChildren("reauth-plugin");
      return this;
   }
}
