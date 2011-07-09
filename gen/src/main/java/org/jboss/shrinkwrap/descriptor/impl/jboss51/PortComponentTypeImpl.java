package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PortComponentType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The port-component element specifies a mapping from a webservice
 * port-component whose service-impl-bean/ejb-link value maps to an ejb.
 * Used in: session
 *
 *
 *
 *
 */
public class PortComponentTypeImpl<T> implements Child<T>, PortComponentType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PortComponentTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public PortComponentTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PortComponentType<T> setPortComponentName(String portComponentName)
   {
      childNode.getOrCreate("port-component-name").text(portComponentName);
      return this;
   }

   public PortComponentType<T> removePortComponentName()
   {
      childNode.remove("port-component-name");
      return this;
   }

   public String getPortComponentName()
   {
      return childNode.textValue("port-component-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-uri
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PortComponentType<T> setPortComponentUri(String portComponentUri)
   {
      childNode.getOrCreate("port-component-uri").text(portComponentUri);
      return this;
   }

   public PortComponentType<T> removePortComponentUri()
   {
      childNode.remove("port-component-uri");
      return this;
   }

   public String getPortComponentUri()
   {
      return childNode.textValue("port-component-uri");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : auth-method
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PortComponentType<T> setAuthMethod(String authMethod)
   {
      childNode.getOrCreate("auth-method").text(authMethod);
      return this;
   }

   public PortComponentType<T> removeAuthMethod()
   {
      childNode.remove("auth-method");
      return this;
   }

   public String getAuthMethod()
   {
      return childNode.textValue("auth-method");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : transport-guarantee
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PortComponentType<T> setTransportGuarantee(String transportGuarantee)
   {
      childNode.getOrCreate("transport-guarantee").text(transportGuarantee);
      return this;
   }

   public PortComponentType<T> removeTransportGuarantee()
   {
      childNode.remove("transport-guarantee");
      return this;
   }

   public String getTransportGuarantee()
   {
      return childNode.textValue("transport-guarantee");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : secure-wsdl-access
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PortComponentType<T> setSecureWsdlAccess(Boolean secureWsdlAccess)
   {
      childNode.getOrCreate("secure-wsdl-access").text(secureWsdlAccess);
      return this;
   }

   public PortComponentType<T> removeSecureWsdlAccess()
   {
      childNode.remove("secure-wsdl-access");
      return this;
   }

   public Boolean isSecureWsdlAccess()
   {
      return Strings.isTrue(childNode.textValue("secure-wsdl-access"));
   }

}
