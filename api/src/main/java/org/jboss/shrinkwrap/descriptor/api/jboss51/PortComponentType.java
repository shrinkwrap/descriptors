package org.jboss.shrinkwrap.descriptor.api.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The port-component element specifies a mapping from a webservice
 * port-component whose service-impl-bean/ejb-link value maps to an ejb. Used
 * in: session
 * 
 * 
 * 
 * 
 */
public interface PortComponentType<T> extends Child<T> {

	public PortComponentType<T> setPortComponentName(String portComponentName);

	public PortComponentType<T> removePortComponentName();

	public String getPortComponentName();

	public PortComponentType<T> setPortComponentUri(String portComponentUri);

	public PortComponentType<T> removePortComponentUri();

	public String getPortComponentUri();

	public PortComponentType<T> setAuthMethod(String authMethod);

	public PortComponentType<T> removeAuthMethod();

	public String getAuthMethod();

	public PortComponentType<T> setTransportGuarantee(String transportGuarantee);

	public PortComponentType<T> removeTransportGuarantee();

	public String getTransportGuarantee();

	public PortComponentType<T> setSecureWsdlAccess(Boolean secureWsdlAccess);

	public PortComponentType<T> removeSecureWsdlAccess();

	public Boolean isSecureWsdlAccess();

}
