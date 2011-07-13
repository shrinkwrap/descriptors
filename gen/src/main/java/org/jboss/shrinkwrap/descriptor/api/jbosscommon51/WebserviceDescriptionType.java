package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Runtime information about a web service. wsdl-publish-location is optionally
 * used to specify where the final wsdl and any dependent files should be
 * stored. This location resides on the file system from which deployment is
 * initiated.
 * 
 * 
 * 
 */
public interface WebserviceDescriptionType<T> extends Child<T> {

	public WebserviceDescriptionType<T> setWebserviceDescriptionName(
			String webserviceDescriptionName);

	public WebserviceDescriptionType<T> removeWebserviceDescriptionName();

	public String getWebserviceDescriptionName();

	public WebserviceDescriptionType<T> setConfigName(String configName);

	public WebserviceDescriptionType<T> removeConfigName();

	public String getConfigName();

	public WebserviceDescriptionType<T> setConfigFile(String configFile);

	public WebserviceDescriptionType<T> removeConfigFile();

	public String getConfigFile();

	public WebserviceDescriptionType<T> setWsdlPublishLocation(
			String wsdlPublishLocation);

	public WebserviceDescriptionType<T> removeWsdlPublishLocation();

	public String getWsdlPublishLocation();

}
