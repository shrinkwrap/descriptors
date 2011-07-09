package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The handler-chains element defines the handlerchains associated with this
 * service or service endpoint.
 *
 *
 *
 */
public interface ServiceRefHandlerChainsType<T> extends Child<T>
{

   public ServiceRefHandlerChainsType<T> removeAllHandlerChain();

   public ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> handlerChain();

   public List<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>> getHandlerChainList();

}
