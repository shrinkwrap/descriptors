package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * Defines the type used for specifying a list of protocol-bindingType(s). For
 * e.g.
 * 
 * ##SOAP11_HTTP ##SOAP12_HTTP ##XML_HTTP
 * 
 * 
 * 
 */
public interface ServiceRefProtocolBindingListType<T> extends Child<T> {

	public ServiceRefProtocolBindingListType<T> setProtocolBindingType(
			String protocolBindingType);

	public ServiceRefProtocolBindingListType<T> setProtocolBindingTypeList(
			String... values);

	public ServiceRefProtocolBindingListType<T> removeAllProtocolBindingType();

	public List<String> getProtocolBindingTypeList();

}
