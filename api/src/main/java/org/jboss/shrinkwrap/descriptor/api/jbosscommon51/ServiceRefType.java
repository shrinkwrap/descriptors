package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Runtime settings for a web service reference. In the simplest case, there is
 * no runtime information required for a service ref. Runtime info is only
 * needed in the following cases :
 * 
 * * to define the port that should be used to resolve a container-managed port
 * * to define default Stub property settings for Stub objects * to define the
 * URL of a final WSDL document to be used
 * 
 * Example:
 * 
 * <service-ref> <service-ref-name>OrganizationService</service-ref-name>
 * <wsdl-override>file:/wsdlRepository/organization-service.wsdl</wsdl-override>
 * </service-ref>
 * 
 * <service-ref> <service-ref-name>OrganizationService</service-ref-name>
 * <config-name>Secure Client Config</config-name>
 * <config-file>META-INF/jbossws-client-config.xml</config-file>
 * <handler-chain>META-INF/jbossws-client-handlers.xml</handler-chain>
 * </service-ref>
 * 
 * <service-ref> <service-ref-name>SecureService</service-ref-name>
 * <service-impl
 * -class>org.jboss.tests.ws.jaxws.webserviceref.SecureEndpointService
 * </service-impl-class>
 * <service-qname>{http://org.jboss.ws/wsref}SecureEndpointService
 * </service-qname> <port-component-ref>
 * <service-endpoint-interface>org.jboss.tests
 * .ws.jaxws.webserviceref.SecureEndpoint</service-endpoint-interface>
 * <port-qname>{http://org.jboss.ws/wsref}SecureEndpointPort</port-qname>
 * <stub-property> <name>javax.xml.ws.security.auth.username</name>
 * <value>kermit</value> </stub-property> <stub-property>
 * <name>javax.xml.ws.security.auth.password</name> <value>thefrog</value>
 * </stub-property> </port-component-ref> </service-ref>
 * 
 * 
 * 
 */
public interface ServiceRefType<T> extends Child<T> {

	public ServiceRefType<T> setServiceRefName(String serviceRefName);

	public ServiceRefType<T> removeServiceRefName();

	public String getServiceRefName();

	public ServiceRefType<T> setServiceImplClass(String serviceImplClass);

	public ServiceRefType<T> removeServiceImplClass();

	public String getServiceImplClass();

	public ServiceRefType<T> setServiceQname(String serviceQname);

	public ServiceRefType<T> removeServiceQname();

	public String getServiceQname();

	public ServiceRefType<T> setConfigName(String configName);

	public ServiceRefType<T> removeConfigName();

	public String getConfigName();

	public ServiceRefType<T> setConfigFile(String configFile);

	public ServiceRefType<T> removeConfigFile();

	public String getConfigFile();

	public ServiceRefType<T> setHandlerChain(String handlerChain);

	public ServiceRefType<T> removeHandlerChain();

	public String getHandlerChain();

	public ServiceRefType<T> removeAllPortComponentRef();

	public PortComponentRefType<ServiceRefType<T>> portComponentRef();

	public List<PortComponentRefType<ServiceRefType<T>>> getPortComponentRefList();

	public ServiceRefType<T> setWsdlOverride(String wsdlOverride);

	public ServiceRefType<T> removeWsdlOverride();

	public String getWsdlOverride();

}
