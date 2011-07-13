package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public interface PortComponentRefType<T> extends Child<T> {

	public PortComponentRefType<T> setServiceEndpointInterface(
			String serviceEndpointInterface);

	public PortComponentRefType<T> removeServiceEndpointInterface();

	public String getServiceEndpointInterface();

	public PortComponentRefType<T> setPortQname(String portQname);

	public PortComponentRefType<T> removePortQname();

	public String getPortQname();

	public PortComponentRefType<T> setConfigName(String configName);

	public PortComponentRefType<T> removeConfigName();

	public String getConfigName();

	public PortComponentRefType<T> setConfigFile(String configFile);

	public PortComponentRefType<T> removeConfigFile();

	public String getConfigFile();

	public PortComponentRefType<T> removeAllStubProperty();

	public StubPropertyType<PortComponentRefType<T>> stubProperty();

	public List<StubPropertyType<PortComponentRefType<T>>> getStubPropertyList();

	public PortComponentRefType<T> removeAllCallProperty();

	public CallPropertyType<PortComponentRefType<T>> callProperty();

	public List<CallPropertyType<PortComponentRefType<T>>> getCallPropertyList();

}
