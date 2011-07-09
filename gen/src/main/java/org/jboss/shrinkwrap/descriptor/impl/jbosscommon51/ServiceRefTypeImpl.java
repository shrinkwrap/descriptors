package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * Runtime settings for a web service reference. In the simplest case,
 * there is no runtime information required for a service ref. Runtime info
 * is only needed in the following cases :
 *
 * * to define the port that should be used to resolve a container-managed port
 * * to define default Stub property settings for Stub objects
 * * to define the URL of a final WSDL document to be used
 *
 * Example:
 *
 * <service-ref>
 * <service-ref-name>OrganizationService</service-ref-name>
 * <wsdl-override>file:/wsdlRepository/organization-service.wsdl</wsdl-override>
 * </service-ref>
 *
 * <service-ref>
 * <service-ref-name>OrganizationService</service-ref-name>
 * <config-name>Secure Client Config</config-name>
 * <config-file>META-INF/jbossws-client-config.xml</config-file>
 * <handler-chain>META-INF/jbossws-client-handlers.xml</handler-chain>
 * </service-ref>
 *
 * <service-ref>
 * <service-ref-name>SecureService</service-ref-name>
 * <service-impl-class>org.jboss.tests.ws.jaxws.webserviceref.SecureEndpointService</service-impl-class>
 * <service-qname>{http://org.jboss.ws/wsref}SecureEndpointService</service-qname>
 * <port-component-ref>
 * <service-endpoint-interface>org.jboss.tests.ws.jaxws.webserviceref.SecureEndpoint</service-endpoint-interface>
 * <port-qname>{http://org.jboss.ws/wsref}SecureEndpointPort</port-qname>
 * <stub-property>
 * <name>javax.xml.ws.security.auth.username</name>
 * <value>kermit</value>
 * </stub-property>
 * <stub-property>
 * <name>javax.xml.ws.security.auth.password</name>
 * <value>thefrog</value>
 * </stub-property>
 * </port-component-ref>
 * </service-ref>
 *
 *
 *
 */
public class ServiceRefTypeImpl<T> implements Child<T>, ServiceRefType<T>
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

   public ServiceRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ServiceRefTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : service-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefType<T> setServiceRefName(String serviceRefName)
   {
      childNode.getOrCreate("service-ref-name").text(serviceRefName);
      return this;
   }

   public ServiceRefType<T> removeServiceRefName()
   {
      childNode.remove("service-ref-name");
      return this;
   }

   public String getServiceRefName()
   {
      return childNode.textValue("service-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-impl-class
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefType<T> setServiceImplClass(String serviceImplClass)
   {
      childNode.getOrCreate("service-impl-class").text(serviceImplClass);
      return this;
   }

   public ServiceRefType<T> removeServiceImplClass()
   {
      childNode.remove("service-impl-class");
      return this;
   }

   public String getServiceImplClass()
   {
      return childNode.textValue("service-impl-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-qname
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefType<T> setServiceQname(String serviceQname)
   {
      childNode.getOrCreate("service-qname").text(serviceQname);
      return this;
   }

   public ServiceRefType<T> removeServiceQname()
   {
      childNode.remove("service-qname");
      return this;
   }

   public String getServiceQname()
   {
      return childNode.textValue("service-qname");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : config-name
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefType<T> setConfigName(String configName)
   {
      childNode.getOrCreate("config-name").text(configName);
      return this;
   }

   public ServiceRefType<T> removeConfigName()
   {
      childNode.remove("config-name");
      return this;
   }

   public String getConfigName()
   {
      return childNode.textValue("config-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : config-file
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefType<T> setConfigFile(String configFile)
   {
      childNode.getOrCreate("config-file").text(configFile);
      return this;
   }

   public ServiceRefType<T> removeConfigFile()
   {
      childNode.remove("config-file");
      return this;
   }

   public String getConfigFile()
   {
      return childNode.textValue("config-file");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler-chain
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefType<T> setHandlerChain(String handlerChain)
   {
      childNode.getOrCreate("handler-chain").text(handlerChain);
      return this;
   }

   public ServiceRefType<T> removeHandlerChain()
   {
      childNode.remove("handler-chain");
      return this;
   }

   public String getHandlerChain()
   {
      return childNode.textValue("handler-chain");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefType<T> removeAllPortComponentRef()
   {
      childNode.remove("port-component-ref");
      return this;
   }

   public PortComponentRefType<ServiceRefType<T>> portComponentRef()
   {
      return new PortComponentRefTypeImpl<ServiceRefType<T>>(this, "port-component-ref", childNode);
   }

   public List<PortComponentRefType<ServiceRefType<T>>> getPortComponentRefList()
   {
      List<PortComponentRefType<ServiceRefType<T>>> list = new ArrayList<PortComponentRefType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("port-component-ref");
      for (Node node : nodeList)
      {
         PortComponentRefType<ServiceRefType<T>> type = new PortComponentRefTypeImpl<ServiceRefType<T>>(this,
               "port-component-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : wsdl-override
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefType<T> setWsdlOverride(String wsdlOverride)
   {
      childNode.getOrCreate("wsdl-override").text(wsdlOverride);
      return this;
   }

   public ServiceRefType<T> removeWsdlOverride()
   {
      childNode.remove("wsdl-override");
      return this;
   }

   public String getWsdlOverride()
   {
      return childNode.textValue("wsdl-override");
   }

}
