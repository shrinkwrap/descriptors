package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The handler-chain element defines the handlerchain. Handlerchain can be
 * defined such that the handlers in the handlerchain operate,all ports of a
 * service, on a specific port or on a list of protocol-bindings. The choice of
 * elements service-name-pattern, port-name-pattern and protocol-bindings are
 * used to specify whether the handlers in handler-chain are for a service, port
 * or protocol binding. If none of these choices are specified with the
 * handler-chain element then the handlers specified in the handler-chain will
 * be applied on everything.
 * 
 * 
 * 
 */
public interface ServiceRefHandlerChainType<T> extends Child<T> {

	public ServiceRefHandlerChainType<T> removeAllHandler();

	public ServiceRefHandlerType<ServiceRefHandlerChainType<T>> handler();

	public List<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>> getHandlerList();

	public ServiceRefHandlerChainType<T> setServiceNamePattern(
			String serviceNamePattern);

	public ServiceRefHandlerChainType<T> removeServiceNamePattern();

	public String getServiceNamePattern();

	public ServiceRefHandlerChainType<T> setPortNamePattern(
			String portNamePattern);

	public ServiceRefHandlerChainType<T> removePortNamePattern();

	public String getPortNamePattern();

	public ServiceRefHandlerChainType<T> removeProtocolBindings();

	public ServiceRefProtocolBindingListType<ServiceRefHandlerChainType<T>> protocolBindings();

}
